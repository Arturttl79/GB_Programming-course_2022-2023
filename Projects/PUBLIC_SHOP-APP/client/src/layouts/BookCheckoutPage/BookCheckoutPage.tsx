import { useEffect, useState } from "react";
import Book from "../../models/Book";
import SpinnerLoading from "../Utils/SpinnerLoading";
import StarsReview from "../Utils/StarsReview";
import CheckoutAndReviewBox from "./components/CheckoutAndReviewBox";
import Review from "../../models/Review";
import LatestReviews from "./components/LatestReviews";

function BookCheckoutPage() {
    const [book, setBook] = useState<Book>();
    const [isLoading, setIsLoading] = useState<Boolean>(true);
    const [httpError, setHttpError] = useState<any>(null);

    const [reviews, setReviews] = useState<Review[]>([])
    const [totalStars, setTotalStars] = useState<number>(0);
    const [isLoadingReview, setIsLoadingReview] = useState<boolean>(true);

    const productId = (window.location.pathname).split("/")[2];

    useEffect(() => {
        const fetchBook = async () => {
            const url = `${process.env.REACT_APP_API_URL}/products/${productId}`;

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
    }, [productId]);

    useEffect(() => {
        const fetchBookReviews = async () => {
            const reviewUrl: string = `${process.env.REACT_APP_API_URL}/reviews/search/findByProductId?productId=${productId}`;

            const responseReviews = await fetch(reviewUrl);

            if (!responseReviews.ok) {
                throw new Error("Ошибка загрузки");
            }

            const responseJsonReviews = await responseReviews.json();
            const responseData = responseJsonReviews._embedded.reviews;

            const loadedReviews: Review[] = [];
            let weightedStarReviews: number = 0;

            for (const key in responseData) {
                loadedReviews.push({
                    id: responseData[key].id,
                    userEmail: responseData[key].userEmail,
                    date: responseData[key].date,
                    rating: responseData[key].rating,
                    productId: responseData[key].productId,
                    reviewDescription: responseData[key].reviewDescription,
                });
                weightedStarReviews = weightedStarReviews + responseData[key].rating;
            }

            if (loadedReviews) {
                const round = (Math.round((weightedStarReviews / loadedReviews.length) * 2) / 2).toFixed(1);
                setTotalStars(Number(round));
            }

            setReviews(loadedReviews);
            setIsLoadingReview(false);
        };

        fetchBookReviews().catch((error: any) => {
            setIsLoadingReview(false);
            setHttpError(error.message);
        });
    }, [productId]);

    if (isLoading || isLoadingReview) {
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
                                rating={totalStars}
                            />
                        </div>
                    </div>
                    <CheckoutAndReviewBox
                        book={book}
                        mobile={false}
                    />
                </div>
                <hr />
                <LatestReviews
                    productId={book?.id}
                    mobile={false}
                    reviews={reviews}
                    key={book?.id}
                />
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
                            rating={totalStars}
                        />
                    </div>
                </div>
                <CheckoutAndReviewBox
                    book={book}
                    mobile={true}
                />
                <hr />
                <LatestReviews
                    productId={book?.id}
                    mobile={true}
                    reviews={reviews}
                    key={book?.id}
                />
            </div>
        </div>
    );
}

export default BookCheckoutPage;
