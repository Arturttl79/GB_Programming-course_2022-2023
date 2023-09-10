import { Link } from "react-router-dom";
import Book from "../../../models/Book";

interface Props {
    book: Book | undefined;
    mobile: boolean;
}
function CheckoutAndReviewBox(arg: Props) {
    return (
        <div className=
            {arg.mobile
                ? "card d-flex mt-5"
                : "card col-3 container d-flex mb-5"    
            }>

            <div className="card-body container">
                <div className="mt-3">
                    <p>
                        <b>5</b> отзывов
                    </p>
                    <hr />
                    {arg.book && arg.book.copiesAvailable && arg.book.copiesAvailable > 0
                        ? <h4 className="text-success">Доступно</h4>
                        : <h4 className="text-danger">Ожидание поступления</h4>
                    }
                    <div className="row">
                        <p className="col-6 lead">
                            {arg.book?.copiesAvailable} из {arg.book?.copies}
                        </p>
                    </div>
                </div>
                <Link
                    className="btn btn-success btn-lg"
                    to={""}>
                    Войти
                </Link>
                <hr />
                <p className="mt-3">
                    Значение может меняться пока не будет сделан заказ
                </p>
                <Link
                    className="btn btn-success btn-lg"
                    to={""}>
                    Написать отзыв
                </Link>
            </div>
        </div>
    );
}

export default CheckoutAndReviewBox;