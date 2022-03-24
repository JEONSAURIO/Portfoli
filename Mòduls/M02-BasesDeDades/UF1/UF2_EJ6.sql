USE UF2_EJS;

CREATE TABLE PRODUCTE(
codi  SMALLINT PRIMARY KEY,
codi_fabricant SMALLINT,
nom VARCHAR(20) NOT NULL,
descripcio VARCHAR(20),
categoria VARCHAR(20),
preu DOUBLE,
FOREIGN KEY(codi_fabricant) REFERENCES FABRICANT(codi)
);

CREATE TABLE FABRICANT(
codi SMALLINT PRIMARY KEY,
nom VARCHAR(20) NOT NULL,
adreca VARCHAR(20),
teléfon VARCHAR(9)
);