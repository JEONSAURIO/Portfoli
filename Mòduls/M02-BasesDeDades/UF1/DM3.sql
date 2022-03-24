USE plantes;

SELECT p.nom_cientific,pin.temperatura 
FROM planta p, planta_interior pin 
WHERE pin.temperatura = (SELECT MAX(temperatura) FROM planta_interior) -1 ORDER BY pin.temperatura, pin.nom_planta;

SELECT p.nom_popular, dad.quantitat_adob 
FROM planta p, dosi_adob dad
WHERE dad.quantitat_adob != (SELECT MIN(quantitat_adob)FROM dosi_adob) AND dad.quantitat_adob != (SELECT MAX(quantitat_adob)FROM dosi_adob) ORDER BY dad.quantitat_adob;

SELECT DISTINCT p.nom_cientific, p.nom_popular FROM planta p, dosi_adob dad
WHERE (p.nom_popular LIKE 'C%') AND (dad.nom_estacio = 'Primavera');

SELECT p.nom_cientific FROM planta p
WHERE p.nom_cientific NOT IN(SELECT nom_planta FROM dosi_adob WHERE nom_adob = 'Casadob');

SELECT DISTINCT p.nom_cientific, dad.quantitat_adob FROM exemplar_planta ep, planta p, dosi_adob dad
WHERE dad.quantitat_adob IN (SELECT MIN(quantitat_adob) FROM dosi_adob) AND (ep.num_exemplar = 1);