import React from 'react';
import './App.css';
import NavigationBar from './layouts/NavigationAndFooter/NavigationBar';
import HomePage from './layouts/HomePage/HomePage';
import Footer from './layouts/NavigationAndFooter/Footer';
import SearchBooksPage from './layouts/SearchBookPage/SearchBookPage';
import { Redirect, Route, Switch } from "react-router-dom";
import BookCheckoutPage from './layouts/BookCheckoutPage/BookCheckoutPage';

function App() {
  return (
    <div className='d-flex flex-column min-vh-100'>
      <NavigationBar />

      <Switch>
        <Route path="/" exact>
          <Redirect to="/home" />
        </Route>
        <Route path="/home" exact>
          <HomePage />
        </Route>
        <Route path="/search">
          <SearchBooksPage />
        </Route>
        <Route path="/checkout/:bookId">
          <BookCheckoutPage />
        </Route>
      </Switch>

      <Footer />
    </div>
  );
}

export default App;