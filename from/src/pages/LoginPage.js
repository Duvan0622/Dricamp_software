// src/pages/LoginPage.js
import React, { useState } from 'react';
import UsuarioService from '../services/UsuarioService';
import { useHistory } from 'react-router-dom';

const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [contraseña, setContraseña] = useState('');
  const [error, setError] = useState('');
  const history = useHistory();

  const handleLogin = async () => {
    try {
      const response = await UsuarioService.login({ email, contraseña });
      if (response.data) {
        // Guardar la información del usuario en el estado o en un contexto global
        localStorage.setItem('user', JSON.stringify(response.data));
        history.push('/campesino');
      }
    } catch (error) {
      setError('Credenciales incorrectas.');
    }
  };

  return (
    <div>
      <h2>Iniciar Sesión</h2>
      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <input
        type="password"
        placeholder="Contraseña"
        value={contraseña}
        onChange={(e) => setContraseña(e.target.value)}
      />
      <button onClick={handleLogin}>Iniciar Sesión</button>
      {error && <p>{error}</p>}
    </div>
  );
};

export default LoginPage;
