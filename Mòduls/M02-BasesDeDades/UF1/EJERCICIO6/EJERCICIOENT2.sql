USE EJ6_CINE;

/* Consulta 1: Qué entrada debería comprar,y cuanto cuesta para ver Venom? */
SELECT p.nombre, e.tipo, e.precio FROM pelicula p, entrada e
WHERE (p.nombre = 'Venom') AND (e.codEntrada = p.entrada);

/* Consulta 2 - Agrupada: Muestra cuanta cantidad de cada producto registrado hay en total*/
SELECT nomProducto ,SUM(cantidad) FROM existencias
GROUP BY nomProducto;

/* Consulta 3 : Muestra las películas que hay disponibles para la sala 2 y, si está llena o hay asientos disponibles*/
SELECT s.codSala, p.nombre, s.disponibilidad  FROM sala s, pelicula p
WHERE (codSala = 2) AND (s.codSala = p.sala);

/* Consulta 4 - Subconsulta : Muestra el código de los trabajadores que pertenezcan a cualquier cine, menos en los que empiezan por "C"*/
SELECT pe.DNI, c.codCine, c.nombre FROM cine c, personal pe
WHERE (pe.cine = c.codCine) AND c.nombre NOT IN (SELECT nombre FROM cine WHERE nombre LIKE 'C%');

/* Consulta 5 : Muestra en orden las horas a las que hay películas asignadas  */
SELECT h.tiempo, p.nombre FROM pelicula p, horas h
WHERE (h.tiempo = p.horas)
ORDER BY h.tiempo;

/* Consulta 6 - Agrupada : Muestra la cantidad de películas que sean en enero */
SELECT COUNT(h.fecha), p.nombre  FROM horas h, pelicula p
WHERE (fecha BETWEEN '2022/1/1' AND '2022/1/31') AND (p.horas = h.tiempo)
GROUP BY fecha;

/* Consulta 7 :  Consulta la cantidad de palomitas que hay en cada cine y muestra el personal que hay en cada cine de la anterior consulta*/
SELECT ex.cantidad, c.nombre, p.nombre, p.apellidos FROM existencias ex, cine c, personal p
WHERE ex.cine = c.codCine AND c.codCine = p.cine AND ex.nomProducto = 'Palomitas';

/* Consulta 8 - Subconsulta: Muestra el número del asiento libre y la sala para ver la película de titanic */
SELECT a.numAsiento, a.fila, a.sala FROM asientos a
WHERE a.sala = (SELECT sala FROM pelicula WHERE nombre ='Titanic');

/* Consulta 9 - Union :*/

/* Consulta 10 : Muestra la cantidad total de los asientos que hay */
SELECT SUM(numAsientos) FROM sala;