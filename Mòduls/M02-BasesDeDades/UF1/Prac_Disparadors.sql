DROP DATABASE exemple_disparadors;
CREATE DATABASE exemple_disparadors;

USE exemple_disparadors;

CREATE TABLE prueba (codi INT);
CREATE TABLE suma_text (suma VARCHAR(200));
CREATE TABLE suma (suma INT);
INSERT INTO suma_text VALUES (0);

/* EJERCICIO 52 
DELIMITER //
CREATE TRIGGER ex_52 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma SET suma = new.codi;
END //
DELIMITER ;
*/
/* EJERCICIO 54
DELIMITER //
CREATE TRIGGER ex_54 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma_text SET suma = CONCAT(suma, "+", new.codi );
END //
DELIMITER ;


INSERT INTO prueba VALUES (1);
INSERT INTO prueba VALUES (2);
INSERT INTO prueba VALUES (3);
*/


INSERT INTO prueba VALUES (0);
SELECT suma FROM suma;