
CREATE DATABASE EntidadBancaria;

USE EntidadBancaria;

/*Creamos la tabla CATEGORIA*/
CREATE TABLE CATEGORIA(
codCat		INTEGER		PRIMARY KEY,
nomCat		VARCHAR(20),
souBase		VARCHAR(10),
horaExtra	TIME
);

/*Creamos la tabla TITOL*/
CREATE TABLE TITOL(
codTit		INTEGER		PRIMARY KEY,
nomTit		VARCHAR(20)
);

/*Creamos la tabla CENTRALSINDICAL*/
CREATE TABLE CENTRALSINDICAL(
codCen		INTEGER		PRIMARY KEY,
nomCen		VARCHAR(20),
quota		INTEGER
);

/*Creamos la tabla CIUTAT*/
CREATE TABLE CIUTAT(
codCiu		INTEGER		PRIMARY KEY,
nomCiu		VARCHAR(20)
);

/*Creamos la tabla AGENCIA*/
CREATE TABLE AGENCIA(
codAg		INTEGER		PRIMARY KEY,
nom			VARCHAR(20),
adreca		VARCHAR(30),
telefon		VARCHAR(9),
ciutat		INTEGER,
FOREIGN KEY (ciutat)	REFERENCES CIUTAT (codCiu)
);

/*Creamos la tabla EMPLEAT*/
CREATE TABLE EMPLEAT(
codEmp		INTEGER		PRIMARY KEY,
nom			VARCHAR(20),
cognom		VARCHAR(20),
dni			VARCHAR(10),
categoria	INTEGER,
treballa 	INTEGER,
ciutat		INTEGER,
csindical	INTEGER,
FOREIGN KEY (categoria)	REFERENCES CATEGORIA (codCat),
FOREIGN KEY (treballa)	REFERENCES AGENCIA (codAg),
FOREIGN KEY (ciutat)	REFERENCES CIUTAT (codCiu),
FOREIGN KEY (csindical) REFERENCES CENTRALSINDICAL (codCen)
);

/*Creamos la tabla TITULACIONS a partir de una relacion n a n*/
CREATE TABLE TITULACIONS(
dataObt		DATE,
titol		INTEGER,
empleat		INTEGER,
FOREIGN KEY	(titol) 	REFERENCES TITOL (codTit),
FOREIGN KEY	(empleat) 	REFERENCES EMPLEAT (codEmp)
);
