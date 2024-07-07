// src/components/ChatComponent.js
import React, { useState, useEffect } from 'react';
import io from 'socket.io-client';

const socket = io('http://localhost:8080');

const ChatComponent = ({ userId }) => {
  const [message, setMessage] = useState('');
  const [messages, setMessages] = useState([]);

  useEffect(() => {
    socket.on('receiveMessage', (message) => {
      setMessages((prevMessages) => [...prevMessages, message]);
    });

    return () => {
      socket.off('receiveMessage');
    };
  }, []);

  const handleSendMessage = () => {
    const chatMessage = { userId, message };
    socket.emit('sendMessage', chatMessage);
    setMessages((prevMessages) => [...prevMessages, chatMessage]);
    setMessage('');
  };

  return (
    <div>
      <h3>Chat con Campesino</h3>
      <div>
        {messages.map((msg, index) => (
          <p key={index}><strong>{msg.userId}</strong>: {msg.message}</p>
        ))}
      </div>
      <input
        type="text"
        value={message}
        onChange={(e) => setMessage(e.target.value)}
      />
      <button onClick={handleSendMessage}>Enviar</button>
    </div>
  );
};

export default ChatComponent;
