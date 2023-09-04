import React from 'react';
import './App.css';
import NavigationBar from './layouts/NavigationAndFooter/NavigationBar';
import HomePage from './layouts/HomePage/HomePage';
import Footer from './layouts/NavigationAndFooter/Footer';

function App() {
  return (
    <div className="App">
      <NavigationBar />
      <HomePage />
      <Footer />
    </div>
  );
}

export default App;