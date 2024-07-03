create database Dricamp;
use Dricamp;

create table usuario(
id_usuario int auto_increment,
tipodocumento varchar(50) not null,
num_documento bigint not null unique,
nombre varchar(150) not null,
telefono bigint not null unique,
email varchar(150) not null unique,
direccion varchar(100) not null,
contraseña varchar(8) not null,
primary key(id_usuario)
);

create table transportista (
id_transportista int auto_increment,
id_usuario int not null,
catlicencia varchar(100) not null,
num_licencia varchar(30) not null,
primary key (id_transportista),
key fk_user (id_usuario),
constraint fk_user foreign key (id_usuario) references usuario(id_usuario)
);
create table vehiculo(
id_vehiculo int auto_increment,
tipovehiculo varchar(100) not null,
id_transportista int not null,
marca varchar(100) not null,
placa varchar(12) not null,
modelo int not null, 
capacidad_carga int not null,
primary key(id_vehiculo),
key fk_transp (id_transportista),
constraint fk_transp foreign key (id_transportista) references transportista(id_transportista)
);
create table ruta(
id_ruta int auto_increment,
id_transportista int not null,
fecha_salida date not null,
fecha_destino date not null,
primary key (id_ruta),
key fk_transpo (id_transportista),
constraint fk_transpo foreign key (id_transportista) references transportista(id_transportista) on delete cascade
);
create table parada(
id_parada int auto_increment,
ciudad varchar(100) not null,
departamento varchar(100) not null,
paradaEstacion varchar(100) not null,
primary key (id_parada)
);
create table rutaParada(
id_rutaparada int auto_increment,
orden int not null,
id_ruta int not null,
id_parada int not null,
primary key (id_rutaparada),
key fk_ruta (id_ruta),
key fk_parada (id_parada),
constraint fk_ruta foreign key (id_ruta) references ruta(id_ruta),
constraint fk_parada foreign key (id_parada) references parada(id_parada)
);

create table producto(
id_producto int auto_increment,
id_usuario int not null,
estado varchar(100) not null,
categoria varchar(100) not null,
presentacion varchar(100) not null,
foto varchar(300),
nombre varchar(50) not null,
precio double not null,
fecha_produccion date not null,
descripcion varchar(200),
primary key (id_producto),
key fk_use (id_usuario),
constraint fk_use foreign key (id_usuario) references usuario(id_usuario)
);
create table pedido(
id_pedido int auto_increment,
id_usuario int not null,
id_transportista int,
fecha_pedido date not null, 
valor_total double not null,
id_estado varchar(100),
primary key (id_pedido),
key fk_usuari (id_usuario),
key fk_transport (id_transportista),
constraint fk_transport foreign key (id_transportista) references transportista(id_transportista),
constraint fk_usuari foreign key (id_usuario) references usuario(id_usuario)
);

create table pedidoProducto(
id_detalles int auto_increment,
id_pedido int not null,
id_producto int not null, 
cantidad int not null,
valor_productos double not null,
primary key (id_detalles),
key fk_pedido (id_pedido),
key fk_producto (id_producto),
constraint fk_pedido foreign key (id_producto) references pedido(id_pedido),
constraint fk_producto foreign key (id_producto) references producto(id_producto)
);

INSERT INTO usuario (tipodocumento, num_documento, nombre, telefono, email, direccion, contraseña)
VALUES 
('CC', 1234567890, 'Juan Pérez', 3001234567, 'juan.perez@gmail.com', 'Calle 123 #45-67', 'JuanP123'),
('CC', 2345678901, 'Pedro Ramírez', 3023456789, 'pedro.ramirez@outlook.com', 'Avenida Principal #56-78', 'Pedro456'),
('CE', 3456789012, 'Ana Martínez', 3034567890, 'ana.martinez@hotmail.com', 'Calle Secundaria #12-34', 'AnaM7890'),
('CC', 4567890123, 'Carlos Rodríguez', 3045678901, 'carlos.rodriguez@gmail.com', 'Avenida Central #89-01', 'Carl1234'),
('CC', 5678901234, 'Laura Sánchez', 3056789012, 'laura.sanchez@outlook.com', 'Carrera 45 #67-89', 'Laura567'),
('CE', 6789012345, 'Andrés López', 3067890123, 'andres.lopez@hotmail.com', 'Diagonal Principal #23-45', 'Andre890'),
('CC', 7890123456, 'Sofía Díaz', 3078901234, 'sofia.diaz@gmail.com', 'Avenida Secundaria #78-90', 'Sofia123'),
('CC', 8901234567, 'Miguel Torres', 3089012345, 'miguel.torres@outlook.com', 'Calle Principal #56-78', 'Miguel12'),
('CE', 9012345678, 'Elena Gutiérrez', 3090123456, 'elena.gutierrez@hotmail.com', 'Avenida Diagonal #67-89', 'Elena123'),
('CC', 9123456789, 'Ricardo Gómez', 3101234567, 'ricardo.gomez@gmail.com', 'Calle Secundaria #23-45', 'Ricar123');

INSERT INTO transportista (id_usuario, catlicencia, num_licencia)
VALUES 
(1, 'C1', '123456789'),
(2, 'C2', '987654321'),
(3, 'C1', '456789012'),
(4, 'C2', '654321987'),
(5, 'C1', '789012345'),
(6, 'C2', '321987654'),
(7, 'C1', '234567890'),
(8, 'C2', '890123456'),
(9, 'C1', '567890123'),
(10, 'C2', '012345678');

INSERT INTO vehiculo (tipovehiculo, id_transportista, marca, placa, modelo, capacidad_carga)
VALUES 
('Camioneta', 1, 'Toyota', 'ABC123', 2015, 1000),
('Furgon', 2, 'Chevrolet', 'XYZ987', 2018, 1500),
('Camión', 3, 'Ford', 'DEF456', 2016, 2000),
('Camioneta', 4, 'Nissan', 'GHI789', 2017, 1200),
('Furgon', 5, 'Volkswagen', 'JKL012', 2019, 1800),
('Camión', 6, 'Mercedes-Benz', 'MNO345', 2020, 2200),
('Camioneta', 7, 'Honda', 'PQR678', 2014, 1300),
('Furgon', 8, 'Kia', 'STU901', 2013, 1600),
('Camión', 9, 'Hyundai', 'VWX234', 2012, 1900),
('Camioneta', 10, 'Mitsubishi', 'YZA567', 2011, 1400);

INSERT INTO ruta (id_transportista, fecha_salida, fecha_destino)
VALUES 
(1, '2023-06-15', '2023-06-16'),
(2, '2023-06-17', '2023-06-18'),
(3, '2023-06-19', '2023-06-20'),
(4, '2023-06-21', '2023-06-22'),
(5, '2023-06-23', '2023-06-24'),
(6, '2023-06-25', '2023-06-26'),
(7, '2023-06-27', '2023-06-28'),
(8, '2023-06-29', '2023-06-30'),
(9, '2023-07-01', '2023-07-02'),
(10, '2023-07-03', '2023-07-04');

INSERT INTO parada (ciudad, departamento, paradaEstacion)
VALUES 
('Bogotá', 'Cundinamarca', 'Estación 1'),
('Medellín', 'Antioquia', 'Estación 2'),
('Cali', 'Valle del Cauca', 'Estación 3'),
('Barranquilla', 'Atlántico', 'Estación 4'),
('Cartagena', 'Bolívar', 'Estación 5'),
('Pereira', 'Risaralda', 'Estación 6'),
('Bucaramanga', 'Santander', 'Estación 7'),
('Santa Marta', 'Magdalena', 'Estación 8'),
('Villavicencio', 'Meta', 'Estación 9'),
('Neiva', 'Huila', 'Estación 10');

INSERT INTO rutaParada (orden, id_ruta, id_parada)
VALUES 
(1, 1, 1),
(2, 1, 2),
(3, 1, 3),
(4, 1, 4),
(5, 2, 5),
(6, 2, 6),
(7, 2, 7),
(8, 2, 8),
(9, 3, 9),
(10, 3, 10);

INSERT INTO pedido (id_usuario, id_transportista, fecha_pedido, valor_total, id_estado)
VALUES 
(1, 1, '2023-06-01', 50.0, 'En proceso'),
(2, 2, '2023-06-02', 75.0, 'Completado'),
(3, 3, '2023-06-03', 120.0, 'Cancelado'),
(4, 4, '2023-06-04', 90.0, 'En proceso'),
(5, 5, '2023-06-05', 45.0, 'Completado'),
(6, 6, '2023-06-06', 60.0, 'En proceso'),
(7, 7, '2023-06-07', 110.0, 'Completado'),
(8, 8, '2023-06-08', 30.0, 'Cancelado'),
(9, 9, '2023-06-09', 150.0, 'En proceso'),
(10, 10, '2023-06-10', 80.0, 'Completado');


INSERT INTO producto (id_usuario, estado, categoria, presentacion, foto, nombre, precio, fecha_produccion, descripcion)
VALUES 
(1, 'Disponible', 'Frutas', 'Caja', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/bananas.png', 'Bananas', 10.0, '2023-06-01', 'Bananas frescas'),
(2, 'Disponible', 'Carnes', 'Bandeja', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/carne%20molida.png', 'Carne molida', 20.0, '2023-06-02', 'Carne molida de res'),
(3, 'Disponible', 'Verduras', 'Atado', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/cebolla%20larga.png', 'Cebolla larga', 3.0, '2023-06-03', 'Cebolla larga fresca'),
(4, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/cebollaMorada.png', 'Cebolla morada', 4.0, '2023-06-04', 'Cebolla morada fresca'),
(5, 'Disponible', 'Carnes', 'Bandeja', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/chorizo.png', 'Chorizo', 12.0, '2023-06-05', 'Chorizo ahumado'),
(6, 'Disponible', 'Legumbres', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/frijol.png', 'Frijol', 5.0, '2023-06-06', 'Frijoles frescos'),
(7, 'Disponible', 'Frutas', 'Unidad', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/guanabana.png', 'Guanábana', 11.0, '2023-06-07', 'Guanábana fresca'),
(8, 'Disponible', 'Otros', 'Cartón', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/huevos.png', 'Huevos', 7.0, '2023-06-08', 'Huevos frescos'),
(9, 'Disponible', 'Otros', 'Botella', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/leche.png', 'Leche', 5.0, '2023-06-09', 'Leche descremada'),
(10, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/lechuga.png', 'Lechuga', 2.5, '2023-06-10', 'Lechuga fresca'),
(1, 'Disponible', 'Frutas', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/limon.png', 'Limón', 7.0, '2023-06-11', 'Limones frescos'),
(2, 'Disponible', 'Frutas', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/manzanas.png', 'Manzanas', 8.0, '2023-06-12', 'Manzanas rojas'),
(3, 'Disponible', 'Carnes', 'Bandeja', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/muslos%20de%20pollo.png', 'Muslos de pollo', 14.0, '2023-06-13', 'Muslos de pollo frescos'),
(4, 'Disponible', 'Frutas', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/naranjas.png', 'Naranjas', 6.0, '2023-06-14', 'Naranjas frescas'),
(5, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/papa.png', 'Papa', 3.0, '2023-06-15', 'Papa fresca'),
(6, 'Disponible', 'Carnes', 'Bandeja', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/pechuga.png', 'Pechuga de pollo', 15.0, '2023-06-16', 'Pechuga de pollo sin piel'),
(7, 'Disponible', 'Frutas', 'Unidad', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/pi%C3%B1a.png', 'Piña', 9.0, '2023-06-17', 'Piña fresca'),
(8, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/tomate.png', 'Tomate', 2.5, '2023-06-18', 'Tomate fresco'),
(9, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/yuca.png', 'Yuca', 4.0, '2023-06-19', 'Yuca fresca'),
(10, 'Disponible', 'Verduras', 'Bolsa', 'https://raw.githubusercontent.com/Duvan0622/Dricamp_software/ramaDuvan/imagenes/zanahoria.png', 'Zanahoria', 3.0, '2023-06-20', 'Zanahoria fresca');

INSERT INTO pedidoProducto (id_pedido, id_producto, cantidad, valor_productos)
VALUES 
(1, 1, 5, 50.0),
(2, 2, 3, 60.0),
(3, 3, 10, 200.0),
(4, 4, 2, 45.0),
(5, 5, 4, 60.0),
(6, 6, 1, 15.0),
(7, 7, 6, 90.0),
(8, 8, 3, 27.0),
(9, 9, 5, 75.0),
(10, 10, 2, 30.0);