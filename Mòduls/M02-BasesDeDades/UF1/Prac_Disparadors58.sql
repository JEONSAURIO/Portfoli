DROP DATABASE exemple_disparadors_58;
CREATE DATABASE exemple_disparadors_58;

USE exemple_disparadors_58;

CREATE TABLE prueba (codi INT);
CREATE TABLE suma (suma INT);

CREATE TABLE prueba_puntuacion(
lletra ENUM("A","B","C","D","E"), 
puntuacio ENUM ("1","2","3","4","5")
);
CREATE TABLE prueba_puntuacion_seg(
letra ENUM("A","B","C","D","E"), 
puntuacion INT
);

INSERT INTO prueba_puntuacion_seg VALUES('A','1');
INSERT INTO prueba_puntuacion_seg VALUES('C','1');
INSERT INTO prueba_puntuacion_seg VALUES('D','1');
INSERT INTO prueba_puntuacion_seg VALUES('B','1');
INSERT INTO prueba_puntuacion_seg VALUES('E','1');


DELIMITER //
CREATE TRIGGER ex_58 AFTER INSERT ON prueba_puntuacion FOR EACH ROW
    BEGIN
    UPDATE prueba_puntuacion_seg SET puntuacion = NEW.puntuacio WHERE letra = new.lletra;
    END //
DELIMITER ;

INSERT INTO prueba_puntuacion VALUES('A','5');
INSERT INTO prueba_puntuacion VALUES('C','2');
INSERT INTO prueba_puntuacion VALUES('D','4');
INSERT INTO prueba_puntuacion VALUES('B','3');
INSERT INTO prueba_puntuacion VALUES('E','1');

SELECT letra,puntuacion FROM prueba_puntuacion_seg;