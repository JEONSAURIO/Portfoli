USE UF2_EJS;

CREATE TABLE ASSIGNATURA(
codi INTEGER(3) PRIMARY KEY,
nom VARCHAR(20),
cicle VARCHAR(20),
curs VARCHAR(20)
);

CREATE TABLE PROFESSOR(
codi INTEGER PRIMARY KEY,
nom VARCHAR(20),
cognoms VARCHAR(20),
data_naixement DATE,
adreça VARCHAR(20),
telefon VARCHAR(10)
);

CREATE TABLE ALUMNE(
codi INTEGER PRIMARY KEY,
nom VARCHAR(20),
cognoms VARCHAR(20),
data_naixement DATE,
adreça VARCHAR(20),
telefon VARCHAR(10),
matricula DATE
);

CREATE TABLE A3(
prof	INTEGER,
alum	INTEGER,
asig	INTEGER(3),
PRIMARY KEY (prof,alum,asig),
FOREIGN KEY(prof) REFERENCES PROFESSOR(codi),
FOREIGN KEY(alum) REFERENCES ALUMNE(codi),
FOREIGN KEY(asig) REFERENCES ASSIGNATURA(codi)
);

