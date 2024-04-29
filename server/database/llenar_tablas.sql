insert into proyecto.categorias(nombre) values
('Carnes'),
('Frutas'),
('Lacteos'),
('Verduras');

insert into proyecto.productos(idcategoria, nombre, descripcion, imagen, precio) values
(1, 'Pollo', 'Muy nutritivo y bien conservado', 'https://b2283449.smushcdn.com/2283449/wp-content/uploads/2020/09/maduracion-de-carne-de-pollo.jpg?lossy=1&strip=1&webp=1', 4),
(1, 'Cerdo', 'Muy nutritivo y bien conservado', 'https://www.saborusa.com/wp-content/uploads/2019/10/Sabias-que-la-carne-de-cerdo-es-la-mas-consumida-en-el-mundo-Foto-destacada.png', 6),
(1, 'Pavo', 'Muy nutritivo y bien conservado', 'https://mejorconsalud.as.com/wp-content/uploads/2021/11/pavo-navidad-768x512.jpg?auto=webp&quality=45&width=1920&crop=16:9,smart,safe', 8),
(1, 'Vacuno', 'Muy nutritivo y bien conservado', 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Korean.cuisine-Deungsim.gui-01.jpg/330px-Korean.cuisine-Deungsim.gui-01.jpg', 5),
(2, 'Manzana', 'Muy saludable y beneficioso', 'https://www.lechepuleva.es/documents/13930/203222/manzana_g.jpg/28a2133e-b9be-4ded-997b-cd26e413f7af?t=1424942218000', 6),
(2, 'Pera', 'Muy saludable y beneficioso', 'https://www.herbazest.com/imgs/d/8/7/551784/pera.jpg', 5),
(2, 'Durazno', 'Muy saludable y beneficioso', 'https://www.semana.com/resizer/9DZoZnLR3ArohgVUiQRo2oXyQEI=/1280x720/smart/filters:format(jpg):quality(80)/cloudfront-us-east-1.images.arcpublishing.com/semana/L2UFFCZVTJA4HG563VWXWAEIAE.jpg', 7),
(2, 'Banana', 'Muy saludable y beneficioso', 'https://cdn.shopify.com/s/files/1/0492/2458/1274/products/76b6170a-f1e1-4a92-8622-cee94a659b91_800x800.png?v=1622197616', 5),
(3, 'Queso', 'Muy delicioso y en buen estado', 'https://dismapan.com/wp-content/uploads/2020/12/QUESO-COSTENO-KILO.png', 9),
(3, 'Leche', 'Muy delicioso y en buen estado', 'https://i.blogs.es/f0ed49/leche-sin-lactosa/1366_2000.jpg', 8),
(3, 'Yogurt', 'Muy delicioso y en buen estado', 'https://copservir.vtexassets.com/arquivos/ids/765486-1600-auto?v=637950275523800000&width=1600&height=auto&aspect=true', 6),
(3, 'Crema', 'Muy delicioso y en buen estado', 'https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/a321a2a3-4cd5-4b8c-853c-ade4d6e2a330/Derivates/885d4ee3-4751-4921-a6d5-7f0f0c9638a3.jpg', 7),
(4, 'Zanahoria', 'Muy fresco y saludable', 'https://mercaldas.vtexassets.com/arquivos/ids/230361-800-auto?v=637840679751170000&width=800&height=auto&aspect=true', 5),
(4, 'Apio', 'Muy fresco y saludable', 'https://sobrejugos.com/wp-content/uploads/2022/07/APIO.webp', 6),
(4, 'Lechuga', 'Muy fresco y saludable', 'https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Romaine_lettuce.jpg/375px-Romaine_lettuce.jpg', 4),
(4, 'Cebolla', 'Muy fresco y saludable', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Two_colors_of_onions.jpg/375px-Two_colors_of_onions.jpg', 7);

insert into proyecto.usuarios (usuario,clave,editor) values
('Administrador2023@gmail.com','Administrador2023',true),
('ClienteAntiguo2023@gmail.com','ClienteAntiguo2023',false),
('ClienteNuevo2023@gmail.com','ClienteNuevo2023',false);

insert into proyecto.departamentos (nombre) values
('Amazonas'),
('Antioquia'),
('Arauca'),
('Archipiélago de San Andrés'),
(' Providencia y Santa Catalina'),
('Atlántico'),
('Bogotá D.C.'),
('Bolívar'),
('Boyacá'),
('Caldas'),
('Caquetá'),
('Casanare'),
('Cauca'),
('Cesar'),
('Chocó'),
('Córdoba'),
('Cundinamarca'),
('Guainía'),
('Guaviare'),
('Huila'),
('La Guajira'),
('Magdalena'),
('Meta'),
('Nariño'),
('Norte de Santander'),
('Putumayo'),
('Quindío'),
('Risaralda'),
('Santander'),
('Sucre'),
('Tolima'),
('Valle del Cauca'),
('Vaupés'),
('Vichada');

insert into proyecto.municipios (iddepartamento,nombre) values
(1,'El Encanto'),
(1,'La Chorrera'),
(1,'La Pedrera'),
(1,'La Victoria'),
(1,'Leticia'),
(1,'Miriti Paraná'),
(1,'Puerto Alegría'),
(1,'Puerto Arica'),
(1,'Puerto Nariño'),
(1,'Puerto Santander'),
(1,'Tarapacá'),
(2,'Abejorral'),
(2,'Abriaquí'),
(2,'Alejandría'),
(2,'Amagá'),
(2,'Amalfi'),
(2,'Andes'),
(2,'Angelópolis'),
(2,'Angostura'),
(2,'Anorí'),
(2,'Anza'),
(2,'Apartadó'),
(2,'Arboletes'),
(2,'Argelia'),
(2,'Armenia'),
(2,'Barbosa'),
(2,'Bello'),
(2,'Belmira'),
(2,'Betania'),
(2,'Betulia'),
(2,'Briceño'),
(2,'Buriticá'),
(2,'Cáceres'),
(2,'Caicedo'),
(2,'Caldas'),
(2,'Campamento'),
(2,'Cañasgordas'),
(2,'Caracolí'),
(2,'Caramanta'),
(2,'Carepa'),
(2,'Carolina'),
(2,'Caucasia'),
(2,'Chigorodó'),
(2,'Cisneros'),
(2,'Ciudad Bolívar'),
(2,'Cocorná'),
(2,'Concepción'),
(2,'Concordia'),
(2,'Copacabana'),
(2,'Dabeiba'),
(2,'Don Matías'),
(2,'Ebéjico'),
(2,'El Bagre'),
(2,'El Carmen de Viboral'),
(2,'El Santuario'),
(2,'Entrerrios'),
(2,'Envigado'),
(2,'Fredonia'),
(2,'Frontino'),
(2,'Giraldo'),
(2,'Girardota'),
(2,'Gómez Plata'),
(2,'Granada'),
(2,'Guadalupe'),
(2,'Guarne'),
(2,'Guatapé'),
(2,'Heliconia'),
(2,'Hispania'),
(2,'Itagui'),
(2,'Ituango'),
(2,'Jardín'),
(2,'Jericó'),
(2,'La Ceja'),
(2,'La Estrella'),
(2,'La Pintada'),
(2,'La Unión'),
(2,'Liborina'),
(2,'Maceo'),
(2,'Marinilla'),
(2,'Medellín'),
(2,'Montebello'),
(2,'Murindó'),
(2,'Mutatá'),
(2,'Nariño'),
(2,'Nechí'),
(2,'Necoclí'),
(2,'Olaya'),
(2,'Peñol'),
(2,'Peque'),
(2,'Pueblorrico'),
(2,'Puerto Berrío'),
(2,'Puerto Nare'),
(2,'Puerto Triunfo'),
(2,'Remedios'),
(2,'Retiro'),
(2,'Rionegro'),
(2,'Sabanalarga'),
(2,'Sabaneta'),
(2,'Salgar'),
(2,'San Andrés de Cuerquía'),
(2,'San Carlos'),
(2,'San Francisco'),
(2,'San Jerónimo'),
(2,'San José de La Montaña'),
(2,'San Juan de Urabá'),
(2,'San Luis'),
(2,'San Pedro'),
(2,'San Pedro de Uraba'),
(2,'San Rafael'),
(2,'San Roque'),
(2,'Santa Bárbara'),
(2,'Santafé de Antioquia'),
(2,'Santa Rosa de Osos'),
(2,'Santo Domingo'),
(2,'San Vicente'),
(2,'Segovia'),
(2,'Sonsón'),
(2,'Sopetrán'),
(2,'Támesis'),
(2,'Tarazá'),
(2,'Tarso'),
(2,'Titiribí'),
(2,'Toledo'),
(2,'Turbo'),
(2,'Uramita'),
(2,'Urrao'),
(2,'Valdivia'),
(2,'Valparaíso'),
(2,'Vegachí'),
(2,'Venecia'),
(2,'Vigía del Fuerte'),
(2,'Yalí'),
(2,'Yarumal'),
(2,'Yolombó'),
(2,'Yondó'),
(2,'Zaragoza'),
(3,'Arauca'),
(3,'Arauquita'),
(3,'Cravo Norte'),
(3,'Fortul'),
(3,'Puerto Rondón'),
(3,'Saravena'),
(3,'Tame'),
(6,'Baranoa'),
(6,'Barranquilla'),
(6,'Campo de La Cruz'),
(6,'Candelaria'),
(6,'Galapa'),
(6,'Juan de Acosta'),
(6,'Luruaco'),
(6,'Malambo'),
(6,'Manatí'),
(6,'Palmar de Varela'),
(6,'Piojó'),
(6,'Polonuevo'),
(6,'Ponedera'),
(6,'Puerto Colombia'),
(6,'Repelón'),
(6,'Sabanagrande'),
(6,'Sabanalarga'),
(6,'Santa Lucía'),
(6,'Santo Tomás'),
(6,'Soledad'),
(6,'Suan'),
(6,'Tubará'),
(6,'Usiacurí'),
(7,'Bogotá D.C.'),
(8,'Achí'),
(8,'Altos del Rosario'),
(8,'Arenal'),
(8,'Arjona'),
(8,'Arroyohondo'),
(8,'Barranco de Loba'),
(8,'Calamar'),
(8,'Cantagallo'),
(8,'Cartagena'),
(8,'Cicuco'),
(8,'Clemencia'),
(8,'Córdoba'),
(8,'El Carmen de Bolívar'),
(8,'El Guamo'),
(8,'El Peñón'),
(8,'Hatillo de Loba'),
(8,'Magangué'),
(8,'Mahates'),
(8,'Margarita'),
(8,'María la Baja'),
(8,'Mompós'),
(8,'Montecristo'),
(8,'Morales'),
(8,'Norosí'),
(8,'Pinillos'),
(8,'Regidor'),
(8,'Río Viejo'),
(8,'San Cristóbal'),
(8,'San Estanislao'),
(8,'San Fernando'),
(8,'San Jacinto'),
(8,'San Jacinto del Cauca'),
(8,'San Juan Nepomuceno'),
(8,'San Martín de Loba'),
(8,'San Pablo de Borbur'),
(8,'Santa Catalina'),
(8,'Santa Rosa'),
(8,'Santa Rosa del Sur'),
(8,'Simití'),
(8,'Soplaviento'),
(8,'Talaigua Nuevo'),
(8,'Tiquisio'),
(8,'Turbaco'),
(8,'Turbaná'),
(8,'Villanueva'),
(8,'Zambrano'),
(9,'Almeida'),
(9,'Aquitania'),
(9,'Arcabuco'),
(9,'Belén'),
(9,'Berbeo'),
(9,'Betéitiva'),
(9,'Boavita'),
(9,'Boyacá'),
(9,'Briceño'),
(9,'Buena Vista'),
(9,'Busbanzá'),
(9,'Caldas'),
(9,'Campohermoso'),
(9,'Cerinza'),
(9,'Chinavita'),
(9,'Chiquinquirá'),
(9,'Chíquiza'),
(9,'Chiscas'),
(9,'Chita'),
(9,'Chitaraque'),
(9,'Chivatá'),
(9,'Chivor'),
(9,'Ciénega'),
(9,'Cómbita'),
(9,'Coper'),
(9,'Corrales'),
(9,'Covarachía'),
(9,'Cubará'),
(9,'Cucaita'),
(9,'Cuítiva'),
(9,'Duitama'),
(9,'El Cocuy'),
(9,'El Espino'),
(9,'Firavitoba'),
(9,'Floresta'),
(9,'Gachantivá'),
(9,'Gameza'),
(9,'Garagoa'),
(9,'Guacamayas'),
(9,'Guateque'),
(9,'Guayatá'),
(9,'Güicán'),
(9,'Iza'),
(9,'Jenesano'),
(9,'Jericó'),
(9,'Labranzagrande'),
(9,'La Capilla'),
(9,'La Uvita'),
(9,'La Victoria'),
(9,'Macanal'),
(9,'Maripí'),
(9,'Miraflores'),
(9,'Mongua'),
(9,'Monguí'),
(9,'Moniquirá'),
(9,'Motavita'),
(9,'Muzo'),
(9,'Nobsa'),
(9,'Nuevo Colón'),
(9,'Oicatá'),
(9,'Otanche'),
(9,'Pachavita'),
(9,'Páez'),
(9,'Paipa'),
(9,'Pajarito'),
(9,'Panqueba'),
(9,'Pauna'),
(9,'Paya'),
(9,'Paz de Río'),
(9,'Pesca'),
(9,'Pisba'),
(9,'Puerto Boyacá'),
(9,'Quípama'),
(9,'Ramiriquí'),
(9,'Ráquira'),
(9,'Rondón'),
(9,'Saboyá'),
(9,'Sáchica'),
(9,'Samacá'),
(9,'San Eduardo'),
(9,'San José de Pare'),
(9,'San Luis de Gaceno'),
(9,'San Mateo'),
(9,'San Miguel de Sema'),
(9,'San Pablo de Borbur'),
(9,'Santa María'),
(9,'Santana'),
(9,'Santa Rosa de Viterbo'),
(9,'Santa Sofía'),
(9,'Sativanorte'),
(9,'Sativasur'),
(9,'Siachoque'),
(9,'Soatá'),
(9,'Socha'),
(9,'Socotá'),
(9,'Sogamoso'),
(9,'Somondoco'),
(9,'Sora'),
(9,'Soracá'),
(9,'Sotaquirá'),
(9,'Susacón'),
(9,'Sutamarchán'),
(9,'Sutatenza'),
(9,'Tasco'),
(9,'Tenza'),
(9,'Tibaná'),
(9,'Tibasosa'),
(9,'Tinjacá'),
(9,'Tipacoque'),
(9,'Toca'),
(9,'Togüí'),
(9,'Tópaga'),
(9,'Tota'),
(9,'Tunja'),
(9,'Tununguá'),
(9,'Turmequé'),
(9,'Tuta'),
(9,'Tutazá'),
(9,'Umbita'),
(9,'Ventaquemada'),
(9,'Villa de Leyva'),
(9,'Viracachá'),
(9,'Zetaquira'),
(10,'Aguadas'),
(10,'Anserma'),
(10,'Aranzazu'),
(10,'Belalcázar'),
(10,'Chinchiná'),
(10,'Filadelfia'),
(10,'La Dorada'),
(10,'La Merced'),
(10,'Manizales'),
(10,'Manzanares'),
(10,'Marmato'),
(10,'Marquetalia'),
(10,'Marulanda'),
(10,'Neira'),
(10,'Norcasia'),
(10,'Pácora'),
(10,'Palestina'),
(10,'Pensilvania'),
(10,'Riosucio'),
(10,'Risaralda'),
(10,'Salamina'),
(10,'Samaná'),
(10,'San José'),
(10,'Supía'),
(10,'Victoria'),
(10,'Villamaría'),
(10,'Viterbo'),
(11,'Albania'),
(11,'Belén de Los Andaquies'),
(11,'Cartagena del Chairá'),
(11,'Curillo'),
(11,'El Doncello'),
(11,'El Paujil'),
(11,'Florencia'),
(11,'La Montañita'),
(11,'Milán'),
(11,'Morelia'),
(11,'Puerto Rico'),
(11,'San José del Fragua'),
(11,'San Vicente del Caguán'),
(11,'Solano'),
(11,'Solita'),
(11,'Valparaíso'),
(12,'Aguazul'),
(12,'Chámeza'),
(12,'Hato Corozal'),
(12,'La Salina'),
(12,'Maní'),
(12,'Monterrey'),
(12,'Nunchía'),
(12,'Orocué'),
(12,'Paz de Ariporo'),
(12,'Pore'),
(12,'Recetor'),
(12,'Sabanalarga'),
(12,'Sácama'),
(12,'San Luis de Gaceno'),
(12,'Támara'),
(12,'Tauramena'),
(12,'Trinidad'),
(12,'Villanueva'),
(12,'Yopal'),
(13,'Almaguer'),
(13,'Argelia'),
(13,'Balboa'),
(13,'Bolívar'),
(13,'Buenos Aires'),
(13,'Cajibío'),
(13,'Caldono'),
(13,'Caloto'),
(13,'Corinto'),
(13,'El Tambo'),
(13,'Florencia'),
(13,'Guachené'),
(13,'Guapi'),
(13,'Inzá'),
(13,'Jambaló'),
(13,'La Sierra'),
(13,'La Vega'),
(13,'López'),
(13,'Mercaderes'),
(13,'Miranda'),
(13,'Morales'),
(13,'Padilla'),
(13,'Páez'),
(13,'Patía'),
(13,'Piamonte'),
(13,'Piendamó'),
(13,'Popayán'),
(13,'Puerto Tejada'),
(13,'Puracé'),
(13,'Rosas'),
(13,'San Sebastián'),
(13,'Santander de Quilichao'),
(13,'Santa Rosa'),
(13,'Silvia'),
(13,'Sotara'),
(13,'Suárez'),
(13,'Sucre'),
(13,'Timbío'),
(13,'Timbiquí'),
(13,'Toribio'),
(13,'Totoró'),
(13,'Villa Rica'),
(14,'Aguachica'),
(14,'Agustín Codazzi'),
(14,'Astrea'),
(14,'Becerril'),
(14,'Bosconia'),
(14,'Chimichagua'),
(14,'Chiriguaná'),
(14,'Curumaní'),
(14,'El Copey'),
(14,'El Paso'),
(14,'Gamarra'),
(14,'González'),
(14,'La Gloria'),
(14,'La Jagua de Ibirico'),
(14,'La Paz'),
(14,'Manaure'),
(14,'Pailitas'),
(14,'Pelaya'),
(14,'Pueblo Bello'),
(14,'Río de Oro'),
(14,'San Alberto'),
(14,'San Diego'),
(14,'San Martín'),
(14,'Tamalameque'),
(14,'Valledupar'),
(15,'Acandí'),
(15,'Alto Baudo'),
(15,'Atrato'),
(15,'Bagadó'),
(15,'Bahía Solano'),
(15,'Bajo Baudó'),
(15,'Belén de Bajira'),
(15,'Bojaya'),
(15,'Carmen del Darien'),
(15,'Cértegui'),
(15,'Condoto'),
(15,'El Cantón del San Pablo'),
(15,'El Carmen de Atrato'),
(15,'El Litoral del San Juan'),
(15,'Istmina'),
(15,'Juradó'),
(15,'Lloró'),
(15,'Medio Atrato'),
(15,'Medio Baudó'),
(15,'Medio San Juan'),
(15,'Nóvita'),
(15,'Nuquí'),
(15,'Quibdó'),
(15,'Río Iro'),
(15,'Río Quito'),
(15,'Riosucio'),
(15,'San José del Palmar'),
(15,'Sipí'),
(15,'Tadó'),
(15,'Unguía'),
(15,'Unión Panamericana'),
(16,'Ayapel'),
(16,'Buenavista'),
(16,'Canalete'),
(16,'Cereté'),
(16,'Chimá'),
(16,'Chinú'),
(16,'Ciénaga de Oro'),
(16,'Cotorra'),
(16,'La Apartada'),
(16,'Lorica'),
(16,'Los Córdobas'),
(16,'Momil'),
(16,'Moñitos'),
(16,'Montelíbano'),
(16,'Montería'),
(16,'Planeta Rica'),
(16,'Pueblo Nuevo'),
(16,'Puerto Escondido'),
(16,'Puerto Libertador'),
(16,'Purísima'),
(16,'Sahagún'),
(16,'San Andrés Sotavento'),
(16,'San Antero'),
(16,'San Bernardo del Viento'),
(16,'San Carlos'),
(16,'San José de Uré'),
(16,'San Pelayo'),
(16,'Tierralta'),
(16,'Tuchín'),
(16,'Valencia'),
(17,'Agua de Dios'),
(17,'Albán'),
(17,'Anapoima'),
(17,'Anolaima'),
(17,'Apulo'),
(17,'Arbeláez'),
(17,'Beltrán'),
(17,'Bituima'),
(17,'Bojacá'),
(17,'Cabrera'),
(17,'Cachipay'),
(17,'Cajicá'),
(17,'Caparrapí'),
(17,'Caqueza'),
(17,'Carmen de Carupa'),
(17,'Chaguaní'),
(17,'Chía'),
(17,'Chipaque'),
(17,'Choachí'),
(17,'Chocontá'),
(17,'Cogua'),
(17,'Cota'),
(17,'Cucunubá'),
(17,'El Colegio'),
(17,'El Peñón'),
(17,'El Rosal'),
(17,'Facatativá'),
(17,'Fomeque'),
(17,'Fosca'),
(17,'Funza'),
(17,'Fúquene'),
(17,'Fusagasugá'),
(17,'Gachala'),
(17,'Gachancipá'),
(17,'Gachetá'),
(17,'Gama'),
(17,'Girardot'),
(17,'Granada'),
(17,'Guachetá'),
(17,'Guaduas'),
(17,'Guasca'),
(17,'Guataquí'),
(17,'Guatavita'),
(17,'Guayabal de Siquima'),
(17,'Guayabetal'),
(17,'Gutiérrez'),
(17,'Jerusalén'),
(17,'Junín'),
(17,'La Calera'),
(17,'La Mesa'),
(17,'La Palma'),
(17,'La Peña'),
(17,'La Vega'),
(17,'Lenguazaque'),
(17,'Macheta'),
(17,'Madrid'),
(17,'Manta'),
(17,'Medina'),
(17,'Mosquera'),
(17,'Nariño'),
(17,'Nemocón'),
(17,'Nilo'),
(17,'Nimaima'),
(17,'Nocaima'),
(17,'Pacho'),
(17,'Paime'),
(17,'Pandi'),
(17,'Paratebueno'),
(17,'Pasca'),
(17,'Puerto Salgar'),
(17,'Pulí'),
(17,'Quebradanegra'),
(17,'Quetame'),
(17,'Quipile'),
(17,'Ricaurte'),
(17,'San Antonio del Tequendama'),
(17,'San Bernardo'),
(17,'San Cayetano'),
(17,'San Francisco'),
(17,'San Juan de Río Seco'),
(17,'Sasaima'),
(17,'Sesquilé'),
(17,'Sibaté'),
(17,'Silvania'),
(17,'Simijaca'),
(17,'Soacha'),
(17,'Sopó'),
(17,'Subachoque'),
(17,'Suesca'),
(17,'Supatá'),
(17,'Susa'),
(17,'Sutatausa'),
(17,'Tabio'),
(17,'Tausa'),
(17,'Tena'),
(17,'Tenjo'),
(17,'Tibacuy'),
(17,'Tibirita'),
(17,'Tocaima'),
(17,'Tocancipá'),
(17,'Topaipí'),
(17,'Ubalá'),
(17,'Ubaque'),
(17,'Une'),
(17,'Útica'),
(17,'Venecia'),
(17,'Vergara'),
(17,'Vianí'),
(17,'Villa de San Diego de Ubate'),
(17,'Villagómez'),
(17,'Villapinzón'),
(17,'Villeta'),
(17,'Viotá'),
(17,'Yacopí'),
(17,'Zipacón'),
(17,'Zipaquirá'),
(18,'Barranco Minas'),
(18,'Cacahual'),
(18,'Inírida'),
(18,'La Guadalupe'),
(18,'Mapiripana'),
(18,'Morichal'),
(18,'Pana Pana'),
(18,'Puerto Colombia'),
(18,'San Felipe'),
(19,'Calamar'),
(19,'El Retorno'),
(19,'Miraflores'),
(19,'San José del Guaviare'),
(20,'Acevedo'),
(20,'Agrado'),
(20,'Aipe'),
(20,'Algeciras'),
(20,'Altamira'),
(20,'Baraya'),
(20,'Campoalegre'),
(20,'Colombia'),
(20,'Elías'),
(20,'Garzón'),
(20,'Gigante'),
(20,'Guadalupe'),
(20,'Hobo'),
(20,'Iquira'),
(20,'Isnos'),
(20,'La Argentina'),
(20,'La Plata'),
(20,'Nátaga'),
(20,'Neiva'),
(20,'Oporapa'),
(20,'Paicol'),
(20,'Palermo'),
(20,'Palestina'),
(20,'Pital'),
(20,'Pitalito'),
(20,'Rivera'),
(20,'Saladoblanco'),
(20,'San Agustín'),
(20,'Santa María'),
(20,'Suaza'),
(20,'Tarqui'),
(20,'Tello'),
(20,'Teruel'),
(20,'Tesalia'),
(20,'Timaná'),
(20,'Villavieja'),
(20,'Yaguará'),
(21,'Albania'),
(21,'Barrancas'),
(21,'Dibula'),
(21,'Distracción'),
(21,'El Molino'),
(21,'Fonseca'),
(21,'Hatonuevo'),
(21,'La Jagua del Pilar'),
(21,'Maicao'),
(21,'Manaure'),
(21,'Riohacha'),
(21,'San Juan del Cesar'),
(21,'Uribia'),
(21,'Urumita'),
(21,'Villanueva'),
(22,'Algarrobo'),
(22,'Aracataca'),
(22,'Ariguaní'),
(22,'Cerro San Antonio'),
(22,'Chivolo'),
(22,'Ciénaga'),
(22,'Concordia'),
(22,'El Banco'),
(22,'El Piñon'),
(22,'El Retén'),
(22,'Fundación'),
(22,'Guamal'),
(22,'Nueva Granada'),
(22,'Pedraza'),
(22,'Pijiño del Carmen'),
(22,'Pivijay'),
(22,'Plato'),
(22,'Pueblo Viejo'),
(22,'Remolino'),
(22,'Sabanas de San Angel'),
(22,'Salamina'),
(22,'San Sebastián de Buenavista'),
(22,'Santa Ana'),
(22,'Santa Bárbara de Pinto'),
(22,'Santa Marta'),
(22,'San Zenón'),
(22,'Sitionuevo'),
(22,'Tenerife'),
(22,'Zapayán'),
(22,'Zona Bananera'),
(23,'Acacias'),
(23,'Barranca de Upía'),
(23,'Cabuyaro'),
(23,'Castilla la Nueva'),
(23,'Cubarral'),
(23,'Cumaral'),
(23,'El Calvario'),
(23,'El Castillo'),
(23,'El Dorado'),
(23,'Fuente de Oro'),
(23,'Granada'),
(23,'Guamal'),
(23,'La Macarena'),
(23,'Lejanías'),
(23,'Mapiripán'),
(23,'Mesetas'),
(23,'Puerto Concordia'),
(23,'Puerto Gaitán'),
(23,'Puerto Lleras'),
(23,'Puerto López'),
(23,'Puerto Rico'),
(23,'Restrepo'),
(23,'San Carlos de Guaroa'),
(23,'San Juan de Arama'),
(23,'San Juanito'),
(23,'San Martín'),
(23,'Uribe'),
(23,'Villavicencio'),
(23,'Vista Hermosa'),
(24,'Albán'),
(24,'Aldana'),
(24,'Ancuyá'),
(24,'Arboleda'),
(24,'Barbacoas'),
(24,'Belén'),
(24,'Buesaco'),
(24,'Chachagüí'),
(24,'Colón'),
(24,'Consaca'),
(24,'Contadero'),
(24,'Córdoba'),
(24,'Cuaspud'),
(24,'Cumbal'),
(24,'Cumbitara'),
(24,'El Charco'),
(24,'El Peñol'),
(24,'El Rosario'),
(24,'El Tablón de Gómez'),
(24,'El Tambo'),
(24,'Francisco Pizarro'),
(24,'Funes'),
(24,'Guachucal'),
(24,'Guaitarilla'),
(24,'Gualmatán'),
(24,'Iles'),
(24,'Imués'),
(24,'Ipiales'),
(24,'La Cruz'),
(24,'La Florida'),
(24,'La Llanada'),
(24,'La Tola'),
(24,'La Unión'),
(24,'Leiva'),
(24,'Linares'),
(24,'Los Andes'),
(24,'Magüí'),
(24,'Mallama'),
(24,'Mosquera'),
(24,'Nariño'),
(24,'Olaya Herrera'),
(24,'Ospina'),
(24,'Pasto'),
(24,'Policarpa'),
(24,'Potosí'),
(24,'Providencia'),
(24,'Puerres'),
(24,'Pupiales'),
(24,'Ricaurte'),
(24,'Roberto Payán'),
(24,'Samaniego'),
(24,'San Andrés de Tumaco'),
(24,'San Bernardo'),
(24,'Sandoná'),
(24,'San Lorenzo'),
(24,'San Pablo'),
(24,'San Pedro de Cartago'),
(24,'Santa Bárbara'),
(24,'Santacruz'),
(24,'Sapuyes'),
(24,'Taminango'),
(24,'Tangua'),
(24,'Túquerres'),
(24,'Yacuanquer'),
(25,'Abrego'),
(25,'Arboledas'),
(25,'Bochalema'),
(25,'Bucarasica'),
(25,'Cachirá'),
(25,'Cácota'),
(25,'Chinácota'),
(25,'Chitagá'),
(25,'Convención'),
(25,'Cúcuta'),
(25,'Cucutilla'),
(25,'Durania'),
(25,'El Carmen'),
(25,'El Tarra'),
(25,'El Zulia'),
(25,'Gramalote'),
(25,'Hacarí'),
(25,'Herrán'),
(25,'Labateca'),
(25,'La Esperanza'),
(25,'La Playa'),
(25,'Los Patios'),
(25,'Lourdes'),
(25,'Mutiscua'),
(25,'Ocaña'),
(25,'Pamplona'),
(25,'Pamplonita'),
(25,'Puerto Santander'),
(25,'Ragonvalia'),
(25,'Salazar'),
(25,'San Calixto'),
(25,'San Cayetano'),
(25,'Santiago'),
(25,'Sardinata'),
(25,'Silos'),
(25,'Teorama'),
(25,'Tibú'),
(25,'Toledo'),
(25,'Villa Caro'),
(25,'Villa del Rosario'),
(26,'Colón'),
(26,'Leguízamo'),
(26,'Mocoa'),
(26,'Orito'),
(26,'Puerto Asís'),
(26,'Puerto Caicedo'),
(26,'Puerto Guzmán'),
(26,'San Francisco'),
(26,'San Miguel'),
(26,'Santiago'),
(26,'Sibundoy'),
(26,'Valle de Guamez'),
(26,'Villagarzón'),
(27,'Armenia'),
(27,'Buenavista'),
(27,'Calarcá'),
(27,'Circasia'),
(27,'Córdoba'),
(27,'Filandia'),
(27,'Génova'),
(27,'La Tebaida'),
(27,'Montenegro'),
(27,'Pijao'),
(27,'Quimbaya'),
(27,'Salento'),
(28,'Apía'),
(28,'Balboa'),
(28,'Belén de Umbría'),
(28,'Dosquebradas'),
(28,'Guática'),
(28,'La Celia'),
(28,'La Virginia'),
(28,'Marsella'),
(28,'Mistrató'),
(28,'Pereira'),
(28,'Pueblo Rico'),
(28,'Quinchía'),
(28,'Santa Rosa de Cabal'),
(28,'Santuario'),
(29,'Aguada'),
(29,'Albania'),
(29,'Aratoca'),
(29,'Barbosa'),
(29,'Barichara'),
(29,'Barrancabermeja'),
(29,'Betulia'),
(29,'Bolívar'),
(29,'Bucaramanga'),
(29,'Cabrera'),
(29,'California'),
(29,'Capitanejo'),
(29,'Carcasí'),
(29,'Cepitá'),
(29,'Cerrito'),
(29,'Charalá'),
(29,'Charta'),
(29,'Chimá'),
(29,'Chipatá'),
(29,'Cimitarra'),
(29,'Concepción'),
(29,'Confines'),
(29,'Contratación'),
(29,'Coromoro'),
(29,'Curití'),
(29,'El Carmen de Chucurí'),
(29,'El Guacamayo'),
(29,'El Peñón'),
(29,'El Playón'),
(29,'Encino'),
(29,'Enciso'),
(29,'Florián'),
(29,'Floridablanca'),
(29,'Galán'),
(29,'Gambita'),
(29,'Girón'),
(29,'Guaca'),
(29,'Guadalupe'),
(29,'Guapotá'),
(29,'Guavatá'),
(29,'Güepsa'),
(29,'Hato'),
(29,'Jesús María'),
(29,'Jordán'),
(29,'La Belleza'),
(29,'Landázuri'),
(29,'La Paz'),
(29,'Lebríja'),
(29,'Los Santos'),
(29,'Macaravita'),
(29,'Málaga'),
(29,'Matanza'),
(29,'Mogotes'),
(29,'Molagavita'),
(29,'Ocamonte'),
(29,'Oiba'),
(29,'Onzaga'),
(29,'Palmar'),
(29,'Palmas del Socorro'),
(29,'Páramo'),
(29,'Piedecuesta'),
(29,'Pinchote'),
(29,'Puente Nacional'),
(29,'Puerto Parra'),
(29,'Puerto Wilches'),
(29,'Rionegro'),
(29,'Sabana de Torres'),
(29,'San Andrés'),
(29,'San Benito'),
(29,'San Gil'),
(29,'San Joaquín'),
(29,'San José de Miranda'),
(29,'San Miguel'),
(29,'Santa Bárbara'),
(29,'Santa Helena del Opón'),
(29,'San Vicente de Chucurí'),
(29,'Simacota'),
(29,'Socorro'),
(29,'Suaita'),
(29,'Sucre'),
(29,'Suratá'),
(29,'Tona'),
(29,'Valle de San José'),
(29,'Vélez'),
(29,'Vetas'),
(29,'Villanueva'),
(29,'Zapatoca'),
(30,'Buenavista'),
(30,'Caimito'),
(30,'Chalán'),
(30,'Coloso'),
(30,'Corozal'),
(30,'Coveñas'),
(30,'El Roble'),
(30,'Galeras'),
(30,'Guaranda'),
(30,'La Unión'),
(30,'Los Palmitos'),
(30,'Majagual'),
(30,'Morroa'),
(30,'Ovejas'),
(30,'Palmito'),
(30,'Sampués'),
(30,'San Benito Abad'),
(30,'San Juan de Betulia'),
(30,'San Luis de Sincé'),
(30,'San Marcos'),
(30,'San Onofre'),
(30,'San Pedro'),
(30,'Santiago de Tolú'),
(30,'Sincelejo'),
(30,'Sucre'),
(30,'Tolú Viejo'),
(31,'Alpujarra'),
(31,'Alvarado'),
(31,'Ambalema'),
(31,'Anzoátegui'),
(31,'Armero'),
(31,'Ataco'),
(31,'Cajamarca'),
(31,'Carmen de Apicala'),
(31,'Casabianca'),
(31,'Chaparral'),
(31,'Coello'),
(31,'Coyaima'),
(31,'Cunday'),
(31,'Dolores'),
(31,'Espinal'),
(31,'Falan'),
(31,'Flandes'),
(31,'Fresno'),
(31,'Guamo'),
(31,'Herveo'),
(31,'Honda'),
(31,'Ibagué'),
(31,'Icononzo'),
(31,'Lérida'),
(31,'Líbano'),
(31,'Mariquita'),
(31,'Melgar'),
(31,'Murillo'),
(31,'Natagaima'),
(31,'Ortega'),
(31,'Palocabildo'),
(31,'Piedras'),
(31,'Planadas'),
(31,'Prado'),
(31,'Purificación'),
(31,'Rio Blanco'),
(31,'Roncesvalles'),
(31,'Rovira'),
(31,'Saldaña'),
(31,'San Antonio'),
(31,'San Luis'),
(31,'Santa Isabel'),
(31,'Suárez'),
(31,'Valle de San Juan'),
(31,'Venadillo'),
(31,'Villahermosa'),
(31,'Villarrica'),
(32,'Alcalá'),
(32,'Andalucía'),
(32,'Ansermanuevo'),
(32,'Argelia'),
(32,'Bolívar'),
(32,'Buenaventura'),
(32,'Bugalagrande'),
(32,'Caicedonia'),
(32,'Cali'),
(32,'Calima'),
(32,'Candelaria'),
(32,'Cartago'),
(32,'Dagua'),
(32,'El Águila'),
(32,'El Cairo'),
(32,'El Cerrito'),
(32,'El Dovio'),
(32,'Florida'),
(32,'Ginebra'),
(32,'Guacarí'),
(32,'Guadalajara de Buga'),
(32,'Jamundí'),
(32,'La Cumbre'),
(32,'La Unión'),
(32,'La Victoria'),
(32,'Obando'),
(32,'Palmira'),
(32,'Pradera'),
(32,'Restrepo'),
(32,'Riofrío'),
(32,'Roldanillo'),
(32,'San Pedro'),
(32,'Sevilla'),
(32,'Toro'),
(32,'Trujillo'),
(32,'Tuluá'),
(32,'Ulloa'),
(32,'Versalles'),
(32,'Vijes'),
(32,'Yotoco'),
(32,'Yumbo'),
(32,'Zarzal'),
(33,'Carurú'),
(33,'Mitú'),
(33,'Pacoa'),
(33,'Papunahua'),
(33,'Taraira'),
(33,'Yavaraté'),
(34,'Cumaribo'),
(34,'La Primavera'),
(34,'Puerto Carreño'),
(34,'Santa Rosalía');