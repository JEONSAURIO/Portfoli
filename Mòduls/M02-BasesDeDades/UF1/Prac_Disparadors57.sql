DROP DATABASE exemple_disparadors_57;
CREATE DATABASE exemple_disparadors_57;

USE exemple_disparadors_57;

CREATE TABLE prueba (codi INT);
CREATE TABLE suma (suma INT);



DELIMITER //
CREATE TRIGGER ex_57 AFTER INSERT ON prueba FOR EACH ROW
    BEGIN
     INSERT INTO suma VALUES(NEW.codi);
     IF((SELECT COUNT(codi) FROM prueba) > 9) THEN 
    DELETE FROM suma limit 1;
    END IF;
    END //
DELIMITER ;

INSERT INTO prueba VALUES(1);
INSERT INTO prueba VALUES(2);
INSERT INTO prueba VALUES(3);
INSERT INTO prueba VALUES(4);
INSERT INTO prueba VALUES(5);
INSERT INTO prueba VALUES(6);
INSERT INTO prueba VALUES(7);
INSERT INTO prueba VALUES(8);
INSERT INTO prueba VALUES(9);
INSERT INTO prueba VALUES(10);
INSERT INTO prueba VALUES(11);
INSERT INTO prueba VALUES(12);
INSERT INTO prueba VALUES(13);

SELECT suma FROM suma;
