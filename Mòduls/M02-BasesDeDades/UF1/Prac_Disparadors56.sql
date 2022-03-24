DROP DATABASE exemple_disparadors;
CREATE DATABASE exemple_disparadors;

USE exemple_disparadors;

CREATE TABLE prueba (codi INT);

CREATE TABLE suma_valors (
codi INT, 
vegades INT
);

DELIMITER //
CREATE TRIGGER ex_56 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades=(SELECT COUNT(*) FROM prueba WHERE codi=NEW.codi) WHERE codi = NEW.codi;
END //
CREATE TRIGGER ex_56_1 AFTER DELETE ON prueba FOR EACH ROW
BEGIN
	UPDATE suma_valors SET vegades=(SELECT COUNT(*) FROM prueba WHERE codi=OLD.codi) WHERE codi = OLD.codi;
END //
CREATE TRIGGER ex_56_2 AFTER INSERT ON prueba FOR EACH ROW
	IF((SELECT COUNT(*) FROM suma_valors WHERE codi=NEW.codi) = 0) THEN 
    INSERT INTO suma_valors VALUES(NEW.codi, 1);
    ELSE 
    UPDATE suma_valors SET vegades = ( SELECT COUNT(*) FROM prueba WHERE codi=NEW.codi) WHERE codi=NEW.codi;
    END IF;
CREATE TRIGGER ex_56_3 AFTER DELETE ON prueba FOR EACH ROW
	IF((SELECT COUNT(*) FROM suma_valors WHERE codi=OLD.codi) = 0) THEN 
    DELETE INTO suma_valors VALUES(OLD.codi, 1);
    ELSE 
    UPDATE suma_valors SET vegades = ( SELECT COUNT(*) FROM prueba WHERE codi=OLD.codi) WHERE codi=OLD.codi;
    END IF;
DELIMITER ;

INSERT INTO prueba VALUES(4);
INSERT INTO prueba VALUES(3);
INSERT INTO prueba VALUES(5);

SELECT codi FROM suma_valors;