DROP DATABASE exemple_disparadors;

CREATE DATABASE exemple_disparadors;

USE exemple_disparadors;

CREATE TABLE prueba (codi INT);

CREATE TABLE suma (suma INT);

INSERT INTO suma VALUES (0);

DELIMITER //
CREATE TRIGGER actual AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma SET suma=suma+1;
END
DELIMITER ;

SELECT suma FROM suma;