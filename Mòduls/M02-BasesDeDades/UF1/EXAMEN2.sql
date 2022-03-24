use motoGP;

/*1 */
SELECT p.nombre, e.nombre FROM pilotos p, escuderias e, resultados r
WHERE e.sede LIKE '%Italia%' AND r.puesto = 1 AND e.nombre = p.nombreescuderia AND p.codigo = r.codpiloto
GROUP BY p.nombre;

/*2 - A MEDIAS*/
SELECT p.nombre, p.nombreescuderia, COUNT(r.puesto) FROM pilotos p, resultados r, carreras c
WHERE r.puesto = 1 AND RIGHT(c.fechahorarioinicio,5) > '15:00' AND p.codigo = r.codpiloto AND r.nombregp = c.nombregp AND  c.año = r.anyo
GROUP BY p.nombre;

/*3 - A MEDIAS */
SELECT e.nombre, COUNT(p.codigo) FROM pilotos p, escuderias e
WHERE e.nombre = p.nombreescuderia 
GROUP BY e.nombre;

/*4 -A MEDIAS*/
SELECT p.nombre, COUNT(r.puesto) FROM pilotos p,resultados r
WHERE r.puesto = 1 AND r.anyo = '2010' AND p.codigo = r.codpiloto
GROUP BY p.nombre
ORDER BY r.puesto DESC;

/*5*/
SELECT p.nombre, RIGHT(p.carreradebut,4) FROM resultados r, pilotos p
WHERE r.puesto = 1 AND p.codigo = r.codpiloto 
GROUP BY p.nombre
ORDER BY COUNT(r.puesto) LIMIT 1;

/*6*/
SELECT COUNT(r.codpiloto), c.nombregp FROM resultados r, carreras c
WHERE r.distanciaganador > '00:10:00' AND c.año = '2010' AND c.año = r.anyo AND c.nombregp = r.nombregp
GROUP BY c.nombregp
ORDER BY c.numvueltas LIMIT 1;

/*7*/
SELECT COUNT(r.puesto), p.nombreescuderia FROM resultados r, pilotos p
WHERE r.puesto = 1 AND p.codigo = r.codpiloto
GROUP BY p.nombreescuderia
ORDER BY COUNT(*) DESC LIMIT 1;

/*8 - NO DEL TODO BIEN*/

SELECT COUNT(nacionalidad), nacionalidad FROM pilotos 
GROUP BY nacionalidad 
ORDER BY COUNT(*) DESC LIMIT 2;

/*9 - MUESTRA LOS CIRCUITOS DONDE NO HA GANADO UN PILOTO CON NACIONALIDAD ESPAÑOLA*/
select distinct c.nombrecircuito from resultados r, carreras c
where (r.nombregp=c.nombregp) and (c.año=r.anyo) and (r.puesto=1) and r.codpiloto NOT IN (select codigo from pilotos
where nacionalidad='Española');
/* 10 */

/*añadir a la base de datos*/
CREATE TABLE velocidad (
codpiloto VARCHAR(4),
carrera VARCHAR(30),
año VARCHAR (4),
velMax INTEGER(3),
velMin INTEGER (3),

PRIMARY KEY (codpiloto),
FOREIGN KEY (codpiloto) REFERENCES pilotos(codigo),
FOREIGN KEY (carrera, año) REFERENCES carreras(nombregp, año)
);

insert into velocidad(codpiloto, carrera, año, velMax, velMin) values('1','GP de Australia','2010','200','100');
insert into velocidad(codpiloto, carrera, año, velMax, velMin) values('2','GP de Europa','2011','290','96');


