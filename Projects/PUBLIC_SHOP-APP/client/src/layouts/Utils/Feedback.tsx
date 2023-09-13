import Review from "../../models/Review";
import StarsReview from "./StarsReview";

interface Props {
    review: Review;
}
function Feedback(arg: Props) {

    const date = new Date(arg.review.date).toLocaleDateString("ru-ru");

    return (
        <div>
            <div className="col-sm-8 col-md-8">
                <h5>{arg.review.userEmail}</h5>
                <div className="row">
                    <div className="col">
                        {date}
                    </div>
                    <div className="col">
                        <StarsReview rating={arg.review.rating} />
                    </div>
                </div>
                <div className="mt-2">
                    <p>
                        {arg.review.reviewDescription}
                    </p>
                </div>
            </div>
            <hr />
        </div>
    );
}

export default Feedback;