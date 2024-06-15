create database Dricamp;
use Dricamp;

create table usuario(
id_usuario int auto_increment,
tipodocumento varchar(50) not null,
num_documento int not null unique,
nombre varchar(150) not null,
telefono int not null unique,
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