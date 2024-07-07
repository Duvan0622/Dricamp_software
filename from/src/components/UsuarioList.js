// src/components/UsuarioList.js
import React, { useState, useEffect } from 'react';
import UsuarioService from '../services/UsuarioService';

const UsuarioList = () => {
  const [usuarios, setUsuarios] = useState([]);

  useEffect(() => {
    UsuarioService.getAllUsuarios().then(response => {
      setUsuarios(response.data);
    });
  }, []);

  return (
    <div>
      <h2>Lista de Usuarios</h2>
      <ul>
        {usuarios.map(usuario => (
          <li key={usuario.id_usuario}>{usuario.nombre}</li>
        ))}
      </ul>
    </div>
  );
};

export default UsuarioList;
