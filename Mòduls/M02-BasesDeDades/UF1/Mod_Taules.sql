DROP DATABASE EMPRESA;
CREATE DATABASE EMPRESA;

USE EMPRESA;

CREATE TABLE EMPLEAT(
codi			INTEGER(4),
nom				VARCHAR(15),
cognoms			VARCHAR(30),
treball			VARCHAR(10),
codi_carrec		INTEGER(4),
data_contracte	DATE,
salari			INTEGER(7),
comissio		INTEGER(7),
departament		INTEGER(2),
PRIMARY KEY(codi)
);

ALTER TABLE EMPLEAT MODIFY salari DECIMAL(5,2) NOT NULL;

CREATE TABLE DEPARTAMENT(
numero_dep 		INTEGER(2),
nom_dep			VARCHAR(9),
localitzacio	VARCHAR(10),
PRIMARY KEY (nom_dep)
);

CREATE TABLE DEPARTAMENT2(
numero_dep 		INTEGER(2),
nom_dep			VARCHAR(9),
localitzacio	VARCHAR(10),
PRIMARY KEY (numero_dep)
);

CREATE TABLE EMPLEAT2(
codi			INTEGER(4),
nom				VARCHAR(15),
cognoms			VARCHAR(30),
treball			VARCHAR(10),
codi_carrec		INTEGER(4),
data_contracte	DATE,
salari			INTEGER(7),
comissio		INTEGER(7),
departament		INTEGER(2),
PRIMARY KEY(codi),
FOREIGN KEY (departament) REFERENCES DEPARTAMENT2 (numero_dep)
);

ALTER TABLE EMPLEAT2 ADD CONSTRAINT unic_sal_comm UNIQUE (salari,comissio);
INSERT INTO EMPLEAT2 (codi,nom,cognoms) VALUE (1,'Emira','Benali García');