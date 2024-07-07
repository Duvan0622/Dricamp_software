// src/services/ProductoService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/productos';

class ProductoService {
  getAllProductos() {
    return axios.get(API_URL);
  }

  getProductosByCategoria(categoria) {
    return axios.get(`${API_URL}/categoria/${categoria}`);
  }

  getProductosCercanos(lat, lon) {
    return axios.get(`${API_URL}/cercanos?lat=${lat}&lon=${lon}`);
  }
}

export default new ProductoService();
