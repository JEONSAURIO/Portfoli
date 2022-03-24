DROP DATABASE EJ6_CINE;
CREATE DATABASE IF NOT EXISTS EJ6_CINE;

USE EJ6_CINE;

CREATE TABLE IF NOT EXISTS cine(
nombre			VARCHAR(50),
codCine			INTEGER		PRIMARY KEY,
direccion		VARCHAR(40),
numSalas		INTEGER
);

CREATE TABLE IF NOT EXISTS personal(
nombre			VARCHAR(20),
apellidos		VARCHAR(40),
DNI				CHAR(9)		PRIMARY KEY NOT NULL,
dias_lab		VARCHAR(70),
fecha_inici		DATE,
cargo			VARCHAR(20),
cine			INTEGER,
FOREIGN KEY (cine) REFERENCES cine(codCine)
);

CREATE TABLE IF NOT EXISTS horas(
fecha			DATE,
tiempo			TIME 		PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS sala(
codSala			INTEGER		PRIMARY KEY,
tipo			VARCHAR(10),
numAsientos		INTEGER,
disponibilidad	ENUM('Disponible','Lleno')
);

CREATE TABLE IF NOT EXISTS existencias(
codProducto		INTEGER		PRIMARY KEY,
cantidad		INTEGER,
cine			INTEGER,
nomProducto 	VARCHAR(20),
FOREIGN KEY (cine) REFERENCES cine(codCine)
);

CREATE TABLE IF NOT EXISTS asientos(
numAsiento		INTEGER,
fila			INTEGER,
codAsiento		INTEGER		PRIMARY KEY,
disponibilidad	ENUM('Disponible','Ocupado'),
sala			INTEGER,
FOREIGN KEY (sala) REFERENCES sala(codSala)
);

CREATE TABLE IF NOT EXISTS entrada(
tipo			VARCHAR(15),
codEntrada		INTEGER		PRIMARY KEY,
precio			INTEGER
);

CREATE TABLE IF NOT EXISTS pelicula(
nombre			VARCHAR(20),
codPeli			INTEGER		PRIMARY KEY,
actores			VARCHAR(80),
director		VARCHAR(50),
tipo			VARCHAR(20),
duracion		TIME,
sala			INTEGER,
horas			TIME,
entrada			INTEGER,
FOREIGN KEY (sala) 		REFERENCES sala(codSala),
FOREIGN KEY (horas) 	REFERENCES horas(tiempo),
FOREIGN KEY (entrada) 	REFERENCES entrada(codEntrada)
);

CREATE TABLE IF NOT EXISTS contiene(
codSala			INTEGER,
codPeli			INTEGER,
codCine			INTEGER 	UNIQUE	NOT NULL,
PRIMARY KEY(codSala,codPeli),
FOREIGN KEY (codSala) REFERENCES sala(codSala),
FOREIGN KEY (codPeli) REFERENCES pelicula(codPeli),
FOREIGN KEY (codCine) REFERENCES cine(codCine)
);

INSERT INTO cine VALUES('Cinesa','1','C/Pérez nº1','20'),
								('Cinema Catalunya','2','C/Sant Pere nº9','10'),
                                ('Yelmo','3','Sant Cugat','15'),
                                ('Cinema Verdi','4','Gran Via de les corts catalanes','5'),
                                ('Glòries Multicines','5','Avinguda Diagonal nº208','10');
                                
INSERT INTO personal VALUES('Aiman','Benali Kharkhour','12345678M','Lunes y Jueves','2021/4/23','jefe','1'),
									('Laura','Roldán García','23456789A','Miercoles y Jueves','2021/7/4','subjefa','2'),
                                    ('Emira','Benali García','34567891O','Martes y Sábados','2022/1/16','gerente','3'),
                                    ('Jeon','Min Suga','45678912K','Jueves y Viernes','2021/1/28','taquillero','4'),
                                    ('Pere','Muñoz Ortega','56789123L','Lunes y Martes','2020/8/7','Limpieza','5');
                                    
INSERT INTO horas VALUES('2022/1/30','16:30:00'),
								('2022/2/4','18:00:00'),
                                ('2022/1/22','17:40:00'),
                                ('2022/2/1','20:30:00'),
                                ('2022/1/28','19:20:00'),
                                ('2022/1/23','17:30:00');
                                
INSERT INTO sala VALUES('1','3D','50','Disponible'),
								('5','Normal','40','Lleno'),
                                ('2','5D','35','Disponible'),
                                ('3','Normal','55','Disponible'),
                                ('4','Normal','60','Lleno');
                                
INSERT INTO existencias VALUES ('1','500','1', 'Palomitas'),
										('6','700','3', 'Palomitas'),
										('7','200','5', 'Palomitas'),
										('2','450','2', 'CocaCola'),
										('3','150','3','Nachos'),
										('4','600','4','Chuches'),
										('5','150','5','Fanta');
                                        
INSERT INTO asientos VALUES ('12','1','121','Disponible','1'),
									('13','5','135','Ocupado','2'),
                                    ('20','2','202','Ocupado','3'),
                                    ('1','10','101','Disponible','4'),
                                    ('9','6','96','Disponible','5');
                                    
INSERT INTO entrada VALUES ('3D','1','15.00'),
									('5D','2','20.00'),
                                    ('Normal','3','11.00'),
                                    ('VIP','4','16.50'),
                                    ('Normal','5','7.99');
                                    
INSERT INTO pelicula VALUES ('Titanic','1','Leonardo DiCaprio','Ron Wisli','Romance','02:30:00','4','16:30:00','1'),
									('Ready Player One','2','Rasputia','Hobbit','Accion','01:40:00','1','18:00:00','3'),
                                    ('Venom','3','Mr.Increible','Mikasa Ackerman','Accion','02:00:00','5','17:40:00','2'),
                                    ('Spiderman','4','Tom Holand','Zendaya', 'Accion','01:50:00','3','20:30:00','4'),
                                    ('Assasins Creed','5','Orco','Dr.Strange','Guerra','02:20:00','2','19:20:00','5'),
                                    ('Encanto','6','Isabella','Maribel','Fantasía','01:39:00','4','17:30:00','3');
                                    
INSERT INTO contiene VALUES('1','1','1'),
									('2','2','2'),
                                    ('3','3','3'),
                                    ('4','4','4'),
                                    ('5','5','5');
									
