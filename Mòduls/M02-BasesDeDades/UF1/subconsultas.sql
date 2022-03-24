USE plantes;

SELECT dad.nom_planta FROM dosi_adob dad
WHERE dad.nom_planta NOT IN(SELECT nom_planta FROM dosi_adob WHERE nom_estacio = 'Primavera');

SELECT p.nom_popular FROM planta p
WHERE p.nom_cientific IN(SELECT dad.nom_planta FROM dosi_adob dad
WHERE dad.nom_planta NOT IN(SELECT nom_planta FROM dosi_adob WHERE nom_estacio = 'Primavera'));

SELECT dad.nom_planta FROM dosi_adob dad
WHERE quantitat_adob > (SELECT AVG(quantitat_adob) FROM dosi_adob);
    
SELECT dad.nom_planta FROM dosi_adob dad, planta p
WHERE quantitat_adob = (SELECT AVG(quantitat_adob) FROM dosi_adob) AND (dad.nom_planta = p.nom_cientific);

SELECT p.nom_popular FROM planta p, exemplar_planta ep
WHERE ep.num_exemplar = (SELECT MAX(num_exemplar) FROM exemplar_planta) AND (ep.nom_planta = p.nom_cientific);

SELECT SUM(quantitat_adob),nom_planta FROM dosi_adob 
GROUP BY nom_planta;