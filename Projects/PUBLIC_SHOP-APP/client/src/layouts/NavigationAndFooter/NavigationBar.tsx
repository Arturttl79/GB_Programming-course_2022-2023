import { useOktaAuth } from "@okta/okta-react";
import { Link, NavLink } from "react-router-dom";
import SpinnerLoading from "../Utils/SpinnerLoading";

function NavigationBar() {
    const { oktaAuth, authState } = useOktaAuth();

if (!authState) {
  return <SpinnerLoading />
}

const handleLogout = async () => {
  oktaAuth.revokeAccessToken();
  oktaAuth.closeSession();
}
    return (
      <nav className="navbar navbar-expand-lg navbar-dark main-color py-3">
        <div className="container-fluid">
          <span className="navbar-brand">Books App</span>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNavDropdown"
            aria-controls="navbarNavDropdown"
            aria-expanded="false"
            aria-label="Toggle Navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
  
          <div className="collapse navbar-collapse" id="navbarNavDropdown">
            <ul className="navbar-nav">
              <li className="nav-item">
                <NavLink className="nav-link" to="/home">
                  Домашняя
                </NavLink>
              </li>
              <li className="nav-item">
                <NavLink className="nav-link" to="/search">
                  Поиск
                </NavLink>
              </li>
            </ul>
            <ul className="navbar-nav ms-auto">
              {!authState.isAuthenticated ?
              <li className="nav-item m-1">
                <Link type="button" className="btn btn-outline-light" to="/login">
                  Вход
                </Link>
              </li>
              :
              <li>
                <button
                  className="btn btn-outline-light"
                  onClick={handleLogout}>
                  Выход
                </button>
              </li>
            }
          </ul>
        </div>
      </div>
    </nav>
  );
}
  
export default NavigationBar;