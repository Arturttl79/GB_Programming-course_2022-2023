import { useEffect, useState } from "react";
import Book from "../../../models/Book";
import ReturnBookItem from "./ReturnBookItem";
import SpinnerLoading from "../../Utils/SpinnerLoading";

function Carousel() {

  const [books, setBooks] = useState<Book[]>([]);
  const [loading, setIsLoading] = useState<boolean>(true);
  const [httpError, setHttpError] = useState<any>(null);

  useEffect(() => {
    const fetchBooks = async () => {
      const baseUrl = `${process.env.REACT_APP_API_URL}/products`;
      const url = `${baseUrl}?page=0&size=3`
      const response = await fetch(url);

      if (!response.ok) {
        throw new Error("Ошибка загрузки");
      }

      const responseData = (await response.json())._embedded.products;
      const loadedBooks: Book[] = [];

      for (const key in responseData) {
        loadedBooks.push({
          id: responseData[key].id,
          title: responseData[key].title,
          creator: responseData[key].creator,
          description: responseData[key].description,
          copies: responseData[key].copies,
          copiesAvailable: responseData[key].copiesAvailable,
          category: responseData[key].category,
          img: responseData[key].img,
        });
      }

      setBooks(loadedBooks);
      setIsLoading(false);
    };
    fetchBooks().catch((err: any) => {
      setIsLoading(false);
      setHttpError(err.message)
    })
  }, []);

  if (loading) {
    return (
      <SpinnerLoading />
    );
  }

  if (httpError) {
    return (
      <div className='container m-5'>
        <p>{httpError}</p>
      </div>
    )
  }

  return (
    <div className="container mt-3 carousel-container">
      <div className="homepage-carousel-title">
        <h3>Актуальные предложения</h3>
      </div>
      <div
        id="carouselExampleControls"
        className="carousel carousel-dark slide mt-3 d-none d-lg-block"
        data-bs-interval="false"
      >

        <div className="carousel-inner">

          <div className="carousel-item active">
            <div className="row d-flex justify-content-center align-items-center">
              {books.slice(0, 1).map(item => (
                <ReturnBookItem book={item} key={item.id} />
              ))}
            </div>
          </div>

          <div className="carousel-item">
            <div className="row d-flex justify-content-center align-items-center">
              {books.slice(1, 2).map(item => (
                <ReturnBookItem book={item} key={item.id} />
              ))}
            </div>
          </div>

          <div className="carousel-item">
            <div className="row d-flex justify-content-center align-items-center">
              {books.slice(2, 3).map(item => (
                <ReturnBookItem book={item} key={item.id} />
              ))}
            </div>
          </div>

        </div>

        <button
          className="carousel-control-prev" type="button"
          data-bs-target="#carouselExampleControls"
          data-bs-slide="prev"
        >
          <span
            className="carousel-control-prev-icon"
            aria-hidden="true"></span>
          <span className="visually-hidden">Предыдущий</span>
        </button>

        <button
          className="carousel-control-next"
          type="button"
          data-bs-target="#carouselExampleControls"
          data-bs-slide="next"
        >
          <span
            className="carousel-control-next-icon"
            aria-hidden="true"></span>
          <span className="visually-hidden">Следующий</span>
        </button>
      </div>

      <div className="d-lg-none mt-3">
        <div className="row d-flex justify-content-center align-items-center">
          <ReturnBookItem book={books[0]} key={books[0].id} />
        </div>
      </div>

      <div className="homepage-carousel-title mt-2">
        <a className="btn btn-outline-secondary btn-lg" href="/">Подробности</a>
      </div>
    </div>
  );
}

export default Carousel;