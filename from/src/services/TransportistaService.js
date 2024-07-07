// src/services/TransportistaService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/transportistas';

class TransportistaService {
  getProximaRecogida(idTransportista) {
    return axios.get(`${API_URL}/proximaRecogida/${idTransportista}`);
  }

  getProximaEntrega(idTransportista) {
    return axios.get(`${API_URL}/proximaEntrega/${idTransportista}`);
  }

  getCostoEstimado(idTransportista) {
    return axios.get(`${API_URL}/costoEstimado/${idTransportista}`);
  }
}

export default new TransportistaService();
