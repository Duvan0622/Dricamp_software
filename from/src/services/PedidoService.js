// src/services/PedidoService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/pedidos';

class PedidoService {
  getEntregasPendientes(idUsuario) {
    return axios.get(`${API_URL}/entregasPendientes/${idUsuario}`);
  }

  getPedidosCercanos(idUsuario) {
    return axios.get(`${API_URL}/pedidosCercanos/${idUsuario}`);
  }
}

export default new PedidoService();
