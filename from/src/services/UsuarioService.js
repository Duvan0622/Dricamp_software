// src/services/UsuarioService.js
import axios from 'axios';

const API_URL = 'http://localhost:8090/api/usuarios';

class UsuarioService {
  getAllUsuarios() {
    return axios.get(API_URL);
  }

  getUsuarioById(id) {
    return axios.get(`${API_URL}/${id}`);
  }

  createUsuario(usuario) {
    return axios.post(API_URL, usuario);
  }

  updateUsuario(id, usuario) {
    return axios.put(`${API_URL}/${id}`, usuario);
  }

  deleteUsuario(id) {
    return axios.delete(`${API_URL}/${id}`);
  }
  login(usuario) {
    return axios.post(`${API_URL}/login`, usuario);
  }
}

export default new UsuarioService();
