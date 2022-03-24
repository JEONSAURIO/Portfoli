DROP DATABASE EX8;
CREATE DATABASE EX8;
USE EX8;

CREATE TABLE USUARI(
codi_usuari INTEGER	AUTO_INCREMENT,
dni		VARCHAR(9)	NOT NULL 			UNIQUE,
nom		VARCHAR(20) NOT NULL,
cognoms	VARCHAR(20) NOT NULL,
adreca	VARCHAR(50) NOT NULL,
ciutat	VARCHAR(20) DEFAULT 'Terrassa' NOT NULL,
sexe	ENUM('H','D')	NOT NULL,
telefon	VARCHAR(9),
movil	VARCHAR(9)	UNIQUE,
correu	VARCHAR(30) UNIQUE,
dataN 	DATE 		NOT NULL 			CHECK(dataN > '1900/1/1'),
PRIMARY KEY (codi_usuari)
);

CREATE TABLE CATEGORIA(
codi_categoria	INTEGER 	AUTO_INCREMENT 	NOT NULL,
categoria 		VARCHAR(30) NOT NULL 		UNIQUE,
PRIMARY KEY (codi_categoria)
);

CREATE TABLE DVD(
codi_peli	INTEGER 	AUTO_INCREMENT	NOT NULL,
titol 		VARCHAR(30)	NOT NULL		UNIQUE,
director	VARCHAR(30)	NOT NULL,
actors		VARCHAR(50)	NOT NULL,
productora	VARCHAR(30)	NOT NULL,
any_film	INTEGER(4)	NOT NULL		CHECK(any_film > 1900),
argument	TEXT,
durada		INTEGER(3)	NOT NULL 		CHECK(durada BETWEEN 1 AND 300),
data_alta	DATE		DEFAULT '2021/11/04' NOT NULL 		CHECK(data_alta > '2001/01/01'),
nacionalitat VARCHAR(30)	NOT NULL,
baixa		ENUM('S','N')	NOT NULL		DEFAULT('N'),
codi_categoria	INTEGER	NOT NULL,
PRIMARY KEY (codi_peli),
FOREIGN KEY	(codi_categoria) REFERENCES CATEGORIA(codi_categoria)
);

CREATE TABLE COPIA(
codi_copia		INTEGER 	NOT NULL,
codi_pelicula	INTEGER 	NOT NULL,
PRIMARY KEY (codi_copia,codi_pelicula),
FOREIGN KEY	(codi_pelicula) REFERENCES DVD(codi_peli)
);

CREATE TABLE LLOGA(
codi_usuari		INTEGER		NOT NULL,
codi_copia		INTEGER		NOT NULL,
codi_pelicula	INTEGER		NOT NULL,
data_lloguer	DATE		DEFAULT '2021/11/04'	NOT NULL,
data_retorn		DATE,
PRIMARY KEY(codi_usuari,codi_copia,codi_pelicula),
FOREIGN KEY (codi_usuari) 	REFERENCES USUARI(codi_usuari),
FOREIGN KEY (codi_copia) 	REFERENCES COPIA(codi_copia),
FOREIGN KEY (codi_pelicula) REFERENCES DVD(codi_peli)
);