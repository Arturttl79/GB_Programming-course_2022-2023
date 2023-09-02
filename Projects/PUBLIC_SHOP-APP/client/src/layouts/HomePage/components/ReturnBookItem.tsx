function ReturnBookItem() {
  return (
    <div className="col-xs-6 col-sm-6 col-md-4 col-lg-3 mb-3">
      <div className="text-center">
        <img
          className="image-carousel carousel-img"
          src={require('./../../../Images/ImagesBooks/book_001.png')}
          alt=""
        />
        <h6>Книга</h6>
        <p>Наименование</p>
        <a className="btn main-color text-white" href="/">Текст 1</a>
      </div>
    </div>
  );
}

export default ReturnBookItem;