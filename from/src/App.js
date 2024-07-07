// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import HomePage from './pages/HomePage';
import LoginPage from './pages/LoginPage';
import CampesinoPage from './pages/CampesinoPage';
import TransportistaPage from './pages/TransportistaPage';
import './App.css';

// Importa otras páginas y componentes según sea necesario

const App = () => {
  return (
    <Router>
      <Switch>
        <Route exact path="/" component={HomePage} />
        <Route path="/login" component={LoginPage} />
        <Route path="/campesino" component={CampesinoPage} />
        <Route path="/transportista" component={TransportistaPage} />

        {/* Agrega otras rutas aquí */}

      </Switch>
    </Router>
  );
};

export default App;

