// src/components/CampesinoSearchBar.js
import React from 'react';

const CampesinoSearchBar = ({ onSearch }) => {
  const handleSearch = (e) => {
    onSearch(e.target.value);
  };

  return (
    <input
      type="text"
      placeholder="Buscar por fecha o producto..."
      onChange={handleSearch}
    />
  );
};

export default CampesinoSearchBar;
