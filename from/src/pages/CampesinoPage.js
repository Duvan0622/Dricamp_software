// src/pages/CampesinoPage.js
import React, { useState, useEffect } from 'react';
import CampesinoSearchBar from '../components/CampesinoSearchBar';
import ProductoService from '../services/ProductoService';
import PedidoService from '../services/PedidoService';

const CampesinoPage = () => {
  const [searchQuery, setSearchQuery] = useState('');
  const [entregas, setEntregas] = useState([]);
  const [productosPorVender, setProductosPorVender] = useState([]);
  const [pedidos, setPedidos] = useState([]);
  
  const user = JSON.parse(localStorage.getItem('user'));

  useEffect(() => {
    if (user) {
      // Cargar datos iniciales
      ProductoService.getProductosByUsuario(user.id_usuario).then(response => {
        setProductosPorVender(response.data);
      });
      
      PedidoService.getEntregasPendientes(user.id_usuario).then(response => {
        setEntregas(response.data);
      });

      PedidoService.getPedidosCercanos(user.id_usuario).then(response => {
        setPedidos(response.data);
      });
    }
  }, [user]);

  const handleSearch = (value) => {
    setSearchQuery(value);
  };

  // Filtrar productos y pedidos basados en la búsqueda
  const productosFiltrados = productosPorVender.filter(producto =>
    producto.nombre.toLowerCase().includes(searchQuery.toLowerCase())
  );
  
  const entregasFiltradas = entregas.filter(entrega =>
    entrega.fecha_entrega.toLowerCase().includes(searchQuery.toLowerCase())
  );
  
  const pedidosFiltrados = pedidos.filter(pedido =>
    pedido.id_pedido.toString().includes(searchQuery.toLowerCase())
  );

  return (
    <div>
      <h2>Panel del Campesino</h2>
      <CampesinoSearchBar onSearch={handleSearch} />
      <div>
        <h3>Fechas de Entrega Pendientes</h3>
        <ul>
          {entregasFiltradas.map(entrega => (
            <li key={entrega.id_entrega}>{entrega.fecha_entrega}</li>
          ))}
        </ul>
      </div>
      <div>
        <h3>Productos por Vender</h3>
        <ul>
          {productosFiltrados.map(producto => (
            <li key={producto.id_producto}>
              {producto.nombre} - {producto.categoria} - ${producto.precio}
            </li>
          ))}
        </ul>
      </div>
      <div>
        <h3>Pedidos Cercanos a Caducidad</h3>
        <ul>
          {pedidosFiltrados.map(pedido => (
            <li key={pedido.id_pedido}>
              Pedido ID: {pedido.id_pedido} - Fecha de Entrega: {pedido.fecha_entrega}
            </li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default CampesinoPage;
