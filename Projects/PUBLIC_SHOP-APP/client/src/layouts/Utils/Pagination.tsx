interface Props {
    currentPage: number;
    totalPages: number;
    paginate: any;
  }
  
  function Pagination(arg: Props) {
    const pageNumbers = [];
  
    if (arg.currentPage === 1) {
      pageNumbers.push(arg.currentPage);
      if (arg.totalPages >= arg.currentPage + 1) {
        pageNumbers.push(arg.currentPage + 1);
      }
      if (arg.totalPages >= arg.currentPage + 2) {
        pageNumbers.push(arg.currentPage + 2);
      }
    } else if (arg.currentPage > 1) {
      if (arg.currentPage >= 3) {
        pageNumbers.push(arg.currentPage - 2);
        pageNumbers.push(arg.currentPage - 1);
      } else {
        pageNumbers.push(arg.currentPage - 1);
      }
  
      pageNumbers.push(arg.currentPage);
  
      if (arg.totalPages >= arg.currentPage + 1) {
        pageNumbers.push(arg.currentPage + 1);
      }
      if (arg.totalPages >= arg.currentPage + 2) {
        pageNumbers.push(arg.currentPage + 2);
      }
    }
  
    return (
      <nav aria-label="...">
        <ul className="pagination">
          <li className="page-item" onClick={() => arg.paginate(1)}>
            <button className="page-link">
              В начало
            </button>
          </li>
          {pageNumbers.map(number => (
            <li key={number} onClick={() => arg.paginate(number)}
              className={"page-item " + (arg.currentPage === number ? "active" : "")}>
              <button className="page-link">
                {number}
              </button>
            </li>
          ))}
          <li className="page-item" onClick={() => arg.paginate(arg.totalPages)}>
            <button className="page-link">
              В конец
            </button>
          </li>
        </ul>
      </nav>
    );
  }
  
  export default Pagination;