USE plantes;

/* Ejercicio 1 : Mostra el nom popular de les plantes que solament tenim un exemplar. */
SELECT p.nom_popular FROM planta p, exemplar_planta ep
WHERE ep.nom_planta = p.nom_cientific
GROUP BY ep.nom_planta HAVING COUNT(ep.num_exemplar) = 1;

/* Ejercicio 2: Mostra el nom popular de les plantes les quals no tenim exemplars. */
SELECT p.nom_popular FROM planta p, exemplar_planta ep
WHERE p.nom_cientific NOT IN(SELECT nom_planta FROM exemplar_planta)
GROUP BY p.nom_cientific;

/*Ejercicio 3: Mostra les vegades que hem d’abonar les plantes en cada estació. */
SELECT nom_planta, nom_estacio, quantitat_adob FROM dosi_adob;

/* Ejercicio 4: Mostra el nom popular i el nombre d’exemplars de les plantes d’interior que necessiten 17 graus de temperatura i totes les d’exterior. */
SELECT p.nom_popular, MAX(ep.num_exemplar) FROM planta p, exemplar_planta ep, planta_interior pin
WHERE pin.nom_planta = p.nom_cientific AND temperatura = 17 AND ep.nom_planta = p.nom_cientific
UNION 
SELECT p.nom_popular, ep.num_exemplar FROM planta p,planta_exterior pex, exemplar_planta ep
WHERE pex.nom_planta = p.nom_cientific
GROUP BY pex.nom_planta;

/* Ejercicio 5: Mostra quines plantes no reben adob a la primavera. */
SELECT dad.nom_planta FROM dosi_adob dad
WHERE dad.nom_planta NOT IN(SELECT nom_planta FROM dosi_adob WHERE nom_estacio = 'Primavera');

/* Ejercicio 6:  Mostra quants mètodes de reproducció té cada planta. */
SELECT nom_planta, COUNT(metode_reproduccio) FROM reproduccio
GROUP BY nom_planta;

/* Ejercicio 7: Mostra quants mètodes de reproducció té cada planta amb un grau d'èxit alt. */
SELECT nom_planta, COUNT(metode_reproduccio) FROM reproduccio
WHERE grau_exit = 'Alt'
GROUP BY nom_planta;

/* Ejercicio 8: Mostra quines plantes no es reprodueixen per 'Esqueix' */
SELECT nom_planta, COUNT(metode_reproduccio) FROM reproduccio
WHERE metode_reproduccio != 'Esqueix'
GROUP BY nom_planta;

/* Ejercicio 9 : Mostra quines plantes d'interior floreixen a la 'Primavera' */
SELECT pin.nom_planta FROM planta_interior pin, planta p
WHERE pin.nom_planta = p.nom_cientific AND p.floracio = 'Primavera';

/* Ejercicio 10:  Mostra quants adobs té cada fima comercial. */
SELECT ad.nom_adob, COUNT(dad.quantitat_adob) FROM adob ad, dosi_adob dad
WHERE ad.nom_adob = dad.nom_adob
GROUP BY nom_firma;