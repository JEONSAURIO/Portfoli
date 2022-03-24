DROP DATABASE exemple_disparadors;

CREATE DATABASE exemple_disparadors;

USE exemple_disparadors;

CREATE TABLE prueba (codi INT);

CREATE TABLE suma (suma INT);
INSERT INTO suma VALUES (0);
/* 
DELIMITER //
CREATE TRIGGER actual AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma SET suma =suma +1;
END //
CREATE TRIGGER actual AFTER DELETE ON prueba FOR EACH ROW
BEGIN
	UPDATE suma SET suma = (SELECT count(codi) FROM prueba);
END
DELIMITER ;
*/

DELIMITER //
CREATE TRIGGER ex_52 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma SET suma = NEW.codi;
END
DELIMITER ;

INSERT INTO prueba VALUES (0);
INSERT INTO prueba VALUES (5);
SELECT suma FROM suma;