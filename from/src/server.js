// server.js (Ejemplo usando Node.js y Express)
const express = require('express');
const http = require('http');
const socketIo = require('socket.io');

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

io.on('connection', (socket) => {
  console.log('Nuevo cliente conectado');

  socket.on('sendMessage', (message) => {
    io.emit('receiveMessage', message);
  });

  socket.on('disconnect', () => {
    console.log('Cliente desconectado');
  });
});

server.listen(8080, () => {
  console.log('Servidor corriendo en puerto 8080');
});
