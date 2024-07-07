// src/components/ProductoList.js
import React, { useState, useEffect } from 'react';
import ProductoService from '../services/ProductoService';

const ProductoList = ({ categoria }) => {
  const [productos, setProductos] = useState([]);

  useEffect(() => {
    if (categoria) {
      ProductoService.getProductosByCategoria(categoria).then(response => {
        setProductos(response.data);
      });
    } else {
      navigator.geolocation.getCurrentPosition(position => {
        const { latitude, longitude } = position.coords;
        ProductoService.getProductosCercanos(latitude, longitude).then(response => {
          setProductos(response.data);
        });
      });
    }
  }, [categoria]);

  return (
    <div>
      {productos.map(producto => (
        <div key={producto.id_producto}>
          <h3>{producto.nombre}</h3>
          <p>{producto.descripcion}</p>
          <p>${producto.precio}</p>
        </div>
      ))}
    </div>
  );
};

export default ProductoList;
