DROP DATABASE exemple_disparadors;
CREATE DATABASE exemple_disparadors;

USE exemple_disparadors;

CREATE TABLE prueba (codi INT);

CREATE TABLE prova_log (
horadata DATETIME , 
usuari VARCHAR(30), 
accio VARCHAR(30)
);

DELIMITER //
CREATE TRIGGER ex_55 AFTER INSERT ON prueba FOR EACH ROW
BEGIN
	INSERT INTO prova_log VALUES( now() ,current_user,concat("Inserció ",NEW.codi));
END //
CREATE TRIGGER ex_55_1 AFTER DELETE ON prueba FOR EACH ROW
BEGIN
   INSERT INTO prova_log VALUES( now() ,current_user,concat("Eliminació ",OLD.codi));
END //
CREATE TRIGGER ex_55_2 AFTER UPDATE ON prueba FOR EACH ROW
BEGIN
  INSERT INTO prova_log VALUES( now() ,current_user,concat("Canvi",OLD.codi, ">", NEW.codi));
END //
DELIMITER ;

INSERT INTO prueba VALUES(4);
INSERT INTO prueba VALUES(3);


SELECT horadata, usuari, accio FROM prova_log;