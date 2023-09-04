function LibraryServices() {
    return (
        <div className="container my-5">
            <div className="row p-4 align-items-center border shadow-lg">
                <div className="col-lg-7 p-3">
                    <h1 className="display-4 fw-bold">
                        Не получается что-то отыскать?
                    </h1>
                    <p className="lead">
                        Обратитесь в службу поддержки
                    </p>
                    <div className="d-grid gap-2 justify-content-md-start mb-4 mb-lg-3">
                        <a href="/" type="button" className="btn main-color btn-lg px-4 me-md-2 fw-bold text-white">
                            Техническая поддержка
                        </a>
                    </div>
                </div>
                <div className="col-lg-4 offset-lg-1 shadow-lg lost-image"></div>
            </div>
        </div>
    );
}

export default LibraryServices;