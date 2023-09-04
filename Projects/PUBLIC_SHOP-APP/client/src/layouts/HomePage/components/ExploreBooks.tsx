import Carousel from "./Carousel";

function ExploreBooks() {
    return (
        <div className="p-2 mb-4 bg-dark header">
            <div
                className="container-fluid py-3 text-white d-flex justify-content-center align-items-center">
                <div>
                    <h1 className="display-5">Источник </h1>
                    <p className="display-10">знаний</p>
                    <a
                        type="button"
                        className="btn btn-primary main-color text-white" href="/"
                    >
                        Избранные книги
                    </a>
                </div>    
            </div>
        </div>
    );
}

export default ExploreBooks;