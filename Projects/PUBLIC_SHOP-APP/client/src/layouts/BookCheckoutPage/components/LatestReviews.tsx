
import { Link } from "react-router-dom";
import Review from "../../../models/Review";
import Feedback from "../../Utils/Feedback";

interface Props {
    reviews: Review[];
    productId: number | undefined;
    mobile: boolean;
}
function LatestReviews(agr: Props) {
    return (
        <div className={agr.mobile ? "mt-3" : "row mt-5"}>
            <div className={agr.mobile ? "" : "col-sm-2 col-md-2"}>
                <h2>Последние отзывы: </h2>
            </div>
            <div className="col-sm-10 col-md-10">
                {agr.reviews.length > 0 ?
                    <>
                        {agr.reviews.slice(0, 3).map((review, i) => (
                            <Feedback review={review} />
                        ))}

                        <div className="m-3">
                            <Link
                                type="button"
                                className="btn main-color btn-md text-white"
                                to={`/`}>
                                Все отзывы
                            </Link>
                        </div>
                    </>
                    :
                    <div className="m-3">
                        <p className="lead">
                            Отзывов ещё нет    
                        </p>
                    </div>    
                }
            </div>
        </div>
    );
}

export default LatestReviews;
