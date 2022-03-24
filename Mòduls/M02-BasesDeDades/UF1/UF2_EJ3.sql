USE UF2_EJS;

CREATE TABLE CLIENTE(
idclient	INTEGER AUTO_INCREMENT,	
nom		CHAR(25),
cognoms	CHAR(25),
datanaixement	DATE,
tipus 	VARCHAR(25) 	DEFAULT "Habitual",
PRIMARY	KEY (idclient),
UNIQUE (nom,cognoms)
);
