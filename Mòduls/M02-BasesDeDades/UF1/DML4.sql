USE plantes;

/*Ejercicio 72 */
SELECT nom_adob, COUNT(nom_planta) FROM dosi_adob
GROUP BY nom_adob;

/*Ejercicio 73 */
SELECT p.nom_popular, COUNT(*) FROM dosi_adob dad, planta p
WHERE (p.nom_cientific = dad.nom_planta)
GROUP BY nom_planta HAVING COUNT(*) >=3
ORDER BY COUNT(*), nom_popular;

/*Ejercicio 74 */
SELECT nom_planta, SUM(quantitat_adob) FROM dosi_adob
GROUP BY nom_planta HAVING SUM(quantitat_adob) BETWEEN 60 AND 90
ORDER BY SUM(quantitat_adob) DESC;

/*Ejercicio 75 */
SELECT nom_planta, floracio, SUM(quantitat_adob) FROM dosi_adob, planta
WHERE nom_cientific = nom_planta AND nom_adob = 'Casadob'
GROUP BY nom_planta
ORDER BY nom_planta;

/*Ejercicio 76 */
SELECT nom_planta, floracio, SUM(quantitat_adob) FROM dosi_adob, planta
WHERE nom_cientific = nom_planta AND nom_adob = 'Casadob'
GROUP BY nom_planta;

/*Ejercicio 77 */
SELECT p.nom_popular, MAX(ep.num_exemplar) FROM planta p, exemplar_planta ep, planta_interior pin
WHERE pin.nom_planta = p.nom_cientific AND temperatura = 17 AND ep.nom_planta = p.nom_cientific
UNION 
SELECT p.nom_popular, ep.num_exemplar FROM planta p,planta_exterior pex, exemplar_planta ep
WHERE pex.nom_planta = p.nom_cientific
GROUP BY pex.nom_planta;

/*Ejercicio 78 */
SELECT nom_planta, nom_estacio, quantitat_adob FROM dosi_adob;

/* Ejercicio 79 */
SELECT p.nom_popular, p.nom_cientific FROM planta p, dosi_adob dad
WHERE (p.nom_cientific = dad.nom_planta) AND (dad.nom_adob = 'Casadob') AND (dad.nom_estacio != 'Primavera')
ORDER BY p.nom_cientific;

/* Ejercicio 80 */
SELECT DISTINCT p.nom_popular FROM planta p, planta_interior pin, planta_exterior pex
WHERE (pin.nom_planta = p.nom_cientific) AND (pin.ubicacio = 'Llum indirecta') 
OR (pex.nom_planta = p.nom_cientific) AND (pex.tipus_planta = 'T');

/* Ejercicio 81 */
SELECT p.nom_popular, MAX(ep.num_exemplar) FROM planta p, exemplar_planta ep, dosi_adob dad
WHERE (p.nom_cientific = ep.nom_planta) AND ep.nom_planta IN (SELECT nom_planta FROM dosi_adob WHERE nom_adob= 'Casadob') 
OR ep.nom_planta IN (SELECT nom_planta FROM dosi_adob WHERE nom_adob = 'Sanexplant')
GROUP BY ep.nom_planta;

/* Ejercicio 82 */
SELECT p.nom_cientific, AVG(dad.quantitat_adob) FROM planta p, exemplar_planta ep,dosi_adob dad
WHERE (ep.num_exemplar > 3)
GROUP BY dad.quantitat_adob;

/* Ejercicio 83 */
SELECT DISTINCT p.nom_popular FROM planta p, dosi_adob dad
WHERE (dad.quantitat_adob >= 40) AND (p.nom_cientific = dad.nom_planta)
ORDER BY p.nom_popular;

/* Ejercicio 84 */
SELECT pin.nom_planta, SUM(dad.quantitat_adob) FROM planta_interior pin, planta p, dosi_adob dad
WHERE pin.nom_planta = p.nom_cientific
GROUP BY pin.nom_planta;

/* Ejercicio 85 */

/* Ejercicio 86 */

/* Ejercicio 87 */

/* Ejercicio 88 */

