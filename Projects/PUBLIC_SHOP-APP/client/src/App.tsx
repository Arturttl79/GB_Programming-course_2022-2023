import React from 'react';
import './App.css';
import NavigationBar from './layouts/NavigationAndFooter/NavigationBar';
import HomePage from './layouts/HomePage/HomePage';
import Footer from './layouts/NavigationAndFooter/Footer';
import SearchBooksPage from './layouts/SearchBookPage/SearchBookPage';
import { Redirect, Route, Switch, useNavigate } from 'react-router-dom';
import BookCheckoutPage from './layouts/BookCheckoutPage/BookCheckoutPage';
import { OktaAuth, toRelativeUrl } from '@okta/okta-auth-js';
import { LoginCallback, Security } from '@okta/okta-react';
import LoginWidget from './Auth/LoginWidget';
import { oktaConfig } from './config/OktaConfig';

const oktaAuth = new OktaAuth(oktaConfig);

function App() {

  const customAuthHandler = () => {
    navigate('/login');
  }

  const navigate = useNavigate();

  const restoreOriginalUri = async (_oktaAuth: any, originalUri: any) => {
    navigate(toRelativeUrl(originalUri || '/', window.location.origin), { replace: true });
  };


  return (
    <div className='d-flex flex-column min-vh-100'>
      <Security
        oktaAuth={oktaAuth}
        restoreOriginalUri={restoreOriginalUri}
        onAuthRequired={customAuthHandler}
      >
        <NavigationBar />
        <div className='flex-grow-1'>
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

            <Route path='/login' render={
              () => <LoginWidget config={oktaConfig} />
            }
            />
            <Route path='/login/callback' component={LoginCallback} />
          </Switch>
        </div>
        <Footer />
      </Security>
    </div>
  );
}

export default App;