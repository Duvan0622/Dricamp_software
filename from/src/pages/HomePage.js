// src/pages/HomePage.js
import React, { useState } from 'react';
import SearchBar from '../components/SearchBar';
import ProductoList from '../components/ProductoList';
import logo from '../assets/dricamp-logo.png'; // Asegúrate de tener un logo en esta ruta
import facebookLogo from '../assets/facebook.png'; // Asegúrate de tener un logo en esta ruta
import instagramLogo from '../assets/instagram.png'; // Asegúrate de tener un logo en esta ruta
import telegramLogo from '../assets/telegram.png'; // Asegúrate de tener un logo en esta ruta
import carritoLogo from '../assets/carrito.png'; // Asegúrate de tener un logo en esta ruta
import loginLogo from '../assets/login.png'; // Asegúrate de tener un logo en esta ruta

const HomePage = () => {
  const [categoria, setCategoria] = useState('');

  const handleSearch = (value) => {
    setCategoria(value);
  };

  return (
    <div>
      <header>
        <img src={logo} alt="Dricamp" className="logo" />
        <SearchBar onSearch={handleSearch} />
        <div className="header-icons">
          <img src={carritoLogo} alt="Carrito" />
          <img src={loginLogo} alt="Iniciar Sesión" />
        </div>
      </header>
      <main>
        <ProductoList categoria={categoria} />
      </main>
      <footer>
        <img src={facebookLogo} alt="Facebook" />
        <img src={instagramLogo} alt="Instagram" />
        <img src={telegramLogo} alt="Telegram" />
      </footer>
    </div>
  );
};

export default HomePage;
