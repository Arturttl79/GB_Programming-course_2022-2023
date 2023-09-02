import ReturnBookItem from "./ReturnBookItem";

function Carousel() {
  return (
    <div className="container mt-3 carousel-container">
      <div className="homepage-carousel-title">
        <h3>Выберите книгу</h3>
      </div>
      <div
        id="carouselExampleControls"
        className="carousel carousel-dark slide mt-3 d-none d-lg-block"
        data-bs-interval="false"
      >

        <div className="carousel-inner">

          <div className="carousel-item active">
            <div className="row d-flex justify-content-center align-items-center">
              <ReturnBookItem />
            </div>
          </div>

          <div className="carousel-item">
            <div className="row d-flex justify-content-center align-items-center">
              <ReturnBookItem />
            </div>
          </div>

          <div className="carousel-item">
            <div className="row d-flex justify-content-center align-items-center">
              <ReturnBookItem />
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
          <ReturnBookItem />
        </div>
      </div>

      <div className="homepage-carousel-title mt-2">
        <a className="btn btn-outline-secondary btn-lg" href="/">Подробности</a>
      </div>
    </div>
  );
}

export default Carousel;