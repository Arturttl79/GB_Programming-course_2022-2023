import { useEffect, useState } from "react";
import Book from "../../models/Book";
import SpinnerLoading from "../Utils/SpinnerLoading";
import StarsReview from "../Utils/StarsReview";
import CheckoutAndReviewBox from "./components/CheckoutAndReviewBox";

function BookCheckoutPage() {
    const [book, setBook] = useState<Book>();
    const [isLoading, setIsLoading] = useState<Boolean>(true);
    const [httpError, setHttpError] = useState<any>(null);

    const bookId = (window.location.pathname).split("/")[2];

    let testRating = 3;

    useEffect(() => {
        const fetchBook = async () => {
            const url = `${process.env.REACT_APP_API_URL}/products/${bookId}`;

            const response = await fetch(url);

            if (!response.ok) {
                throw new Error("Ошибка загрузки");
            }

            const responseJson = await response.json();
            const loadedBook: Book = {
                id: responseJson.id,
                title: responseJson.title,
                creator: responseJson.creator,
                description: responseJson.description,
                copies: responseJson.copies,
                copiesAvailable: responseJson.copiesAvailable,
                category: responseJson.category,
                img: responseJson.img,
            };

            setBook(loadedBook);
            setIsLoading(false);
        };
        fetchBook().catch((err: any) => {
            setIsLoading(false);
            setHttpError(err.message)
        })
    }, []);

    if (isLoading) {
        return (
            <SpinnerLoading />
        );
    }

    if (httpError) {
        return (
            <div className="container m-5">
                <p>{httpError}</p>
            </div>
        )
    }

    return (
        <div>
            <div className="container d-none d-lg-block">
                <div className="row mt-5">
                    <div className="col-sm-2 col-md-2">
                        {book?.img ?
                            <img
                                className="image-carousel checkout-img"
                                src={book?.img}
                                alt=""
                            />
                            :
                            <img
                                className="image-carousel checkout-img"
                                src={require("./../../Images/ImagesBooks/book_001.png")}
                                alt=""
                            />        
                        }
                    </div>
                    <div className="col-4 col-md-4 container">
                        <div className="ml-2">
                            <h2>{book?.title}</h2>
                            <h5 className="text-primary">{book?.creator}</h5>
                            <p className="lead">{book?.description}</p>
                            <StarsReview
                                rating={testRating}
                            />
                        </div>
                    </div>
                    <CheckoutAndReviewBox
                        book={book}
                        mobile={false}
                    />
                </div>
            </div>

            <div className="container d-lg-none mt-5">
                <div className="d-flex justify-content-center align-items-center">
                    {book?.img ?
                        <img
                            className="image-carousel checkout-img"
                            src={book?.img}
                            alt=""
                        />
                        :
                        <img
                            className="image-carousel checkout-img"
                            src={require("./../../Images/ImagesBooks/book_001.png")}
                            alt=""
                        />
                    }
                </div>
                <div className="mt-4">
                    <div className="ml-2">
                        <h2>{book?.title}</h2>
                        <h5 className="text-primary">{book?.creator}</h5>
                        <p className="lead">{book?.description}</p>
                        <StarsReview
                            rating={testRating}
                        />
                    </div>
                </div>
                <CheckoutAndReviewBox
                    book={book}
                    mobile={true}
                />
            </div>
            <hr />
        </div>
    );
}

export default BookCheckoutPage;