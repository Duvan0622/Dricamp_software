// src/pages/TransportistaPage.js
import React, { useState, useEffect } from 'react';
import TransportistaService from '../services/TransportistaService';
import ChatComponent from '../components/ChatComponent';

const TransportistaPage = () => {
  const [proximaRecogida, setProximaRecogida] = useState(null);
  const [proximaEntrega, setProximaEntrega] = useState(null);
  const [costoEstimado, setCostoEstimado] = useState(0);
  const user = JSON.parse(localStorage.getItem('user'));

  useEffect(() => {
    if (user) {
      TransportistaService.getProximaRecogida(user.id_transportista).then(response => {
        setProximaRecogida(response.data);
      });

      TransportistaService.getProximaEntrega(user.id_transportista).then(response => {
        setProximaEntrega(response.data);
      });

      TransportistaService.getCostoEstimado(user.id_transportista).then(response => {
        setCostoEstimado(response.data);
      });
    }
  }, [user]);

  return (
    <div>
      <h2>Panel del Transportista</h2>
      {proximaRecogida && (
        <div>
          <h3>Próxima Recogida</h3>
          <p>{proximaRecogida.detalles}</p>
        </div>
      )}
      {proximaEntrega && (
        <div>
          <h3>Próxima Entrega</h3>
          <p>{proximaEntrega.detalles}</p>
        </div>
      )}
      <div>
        <h3>Costo Estimado de la Entrega</h3>
        <p>${costoEstimado}</p>
      </div>
      <ChatComponent userId={user.id_transportista} />
    </div>
  );
};

export default TransportistaPage;
