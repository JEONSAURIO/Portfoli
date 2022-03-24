USE motoGP;
/* ---- DML ----*/

/* EX.1 : Mostra quins pilots no han abandonat mai en cap cursa.*/
SELECT DISTINCT p.nombre FROM pilotos p, resultados r
WHERE (r.codpiloto = p.codigo) AND (r.distanciaganador != 'Abandono')
group by r.nombregp, r.anyo;

/* EX.2 : Mostra quin pilots, i en quina cursa, han quedat en última posició (tenint en compte els abandonaments).*/
SELECT p.nombre, r.nombregp FROM resultados r, pilotos p
WHERE puesto = (SELECT MAX(puesto) FROM resultados WHERE (nombregp = r.nombregp) AND (anyo = r.anyo) AND (p.codigo = r.codpiloto)
GROUP BY r.nombregp, r.anyo;

/* EX.3 : Mostra el dissenyador, en el cas de què es sàpiga, del circuit amb menor longitud. */
SELECT disenyador FROM circuitos 
WHERE disenyador IS NOT NULL
ORDER BY longitud LIMIT 1;

/* EX.4 : Mostra el nom dels pilots i la seva escuderia d'aquells que han quedat primers més d'un cop.*/
SELECT p.nombre, p.nombreescuderia FROM pilotos p, resultados r
WHERE (r.puesto = 1) AND (p.codigo = r.codpiloto)
GROUP BY p.nombre HAVING COUNT(puesto) > 1;

/* EX.5 : Mostra el nom dels pilots, menors de 30 anys, que no han guanyat cap cursa (posició 1a) en el 2011.*/
SELECT p.nombre FROM pilotos p, resultados r 
WHERE ((YEAR(NOW()) - YEAR(fechanacimiento)) < 30) AND (r.puesto != 1) AND (r.anyo = 2011);

/* EX.6 : Mostra els circuits en els quals no ha guanyat cap pilot alemany.*/
SELECT DISTINCT c.nombrecircuito FROM carreras c, resultados re
WHERE (c.nombregp = re.nombregp) AND (c.año = re.anyo) AND re.codpiloto NOT IN (SELECT DISTINCT p.codigo FROM pilotos p, resultados r WHERE (r.codpiloto = p.codigo) AND (p.nacionalidad = 'Alemana') AND (r.puesto = 1));

/* EX.7 : Mostra per a cadascun dels pilots, el seu codi i quants cops ha quedat tercers al 2010 (ordenats del nombre de vegades de major a menor).*/
SELECT DISTINCT p.nombre, p.codigo, COUNT(r.puesto) from resultados r, pilotos p
WHERE (r.codpiloto = p.codigo) AND (r.anyo = 2010) AND (r.puesto = '3')
GROUP BY p.nombre;

/* ---- DDL ----*/

/* EX.1 : Digues quines són les instruccions necessàries per afegir als insert de "resultados" a la columna "distanciaganador"*/
INSERT INTO resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('','2000','1',1, '00:00.00');

/* EX.2 : Digues les instruccions necessàries per introduir les tres primeres posicions als resultats del GP Àfrica celebrat al 2012.*/
INSERT INTO resultados(nombregp, anyo, codpiloto, puesto) values('GP de Àfrica','2012','1',1);
INSERT INTO resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Àfrica','2012','2',2, '00:00.00');
INSERT INTO resultados(nombregp, anyo, codpiloto, puesto, distanciaganador) values('GP de Àfrica','2012','3',3, '00:00.00');

/* EX.3 : Afegeix la columna puntuació a la taula resultados on es podran emmagatzemar números enters positius.*/
ALTER TABLE resultados ADD puntuacion INT;