function CallAction() {
    return (
        <div>
            <div className="d-none d-lg-block">
                <div className="row g-0 mt-5">

                    <div className="col-sm-6 col-md-6">
                        <div className="col-image-left"></div>
                    </div>

                    <div className="col-4 col-md-4 container d-flex justify-content-center align-items-center">
                        <div className="ml-2">
                            <h1>Текст 1</h1>
                            <p className="lead">
                                Ещё текст 1
                            </p>
                            <a type="button" className="btn main-color btn-lg text-white"
                                href="/">Тык 1</a>
                        </div>
                    </div>
                </div>

                <div className="row g-0">
                    <div className="col-4 col-md-4 container d-flex
                                    justify-content-center align-items-center">
                        <div className="ml-2">
                            <h1>Текст 2</h1>
                            <p className="lead">
                                Ещё текст 2
                            </p>
                            <a type="button" className="btn main-color btn-lg text-white"
                                href="/">Тык 2</a>
                        </div>
                    </div>
                    <div className="col-sm-6 col-md-6">
                        <div className="col-image-right"></div>
                    </div>
                </div>

            </div>

            <div className="d-lg-none">
                <div className="container">
                    <div className="m-2">
                        <div className="col-image-left">  </div>
                        <div className="mt-2">
                            <h1>Текст 1</h1>
                            <p className="lead">
                                Ещё текст 1
                            </p>
                            <a type="button" className="btn main-color btn-lg text-white"
                                href="/">Тык 1</a>
                        </div>

                        <div className="mt-2">
                            <div className="col-image-right"></div>
                            <div className="mt-2">
                                <h1>Текст 2</h1>
                                <p className="lead">
                                    Ещё текст 2
                                </p>
                                <a type="button" className="btn main-color btn-lg text-white"
                                    href="/">Тык 2</a>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

        </div>
    );
}

export default CallAction;