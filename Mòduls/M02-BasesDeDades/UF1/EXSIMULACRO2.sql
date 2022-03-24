USE hospital;

/*CONSULTA 1 : Mostra per a cada àrea el número total d'infermes i el total de metges que té. */
SELECT a.nomArea, COUNT(m.codMetge), COUNT(i.codInf) FROM area a, metge m, infermer i
WHERE a.numArea = m.numArea AND a.numArea = i.numArea
GROUP BY a.nomArea;

/*CONSULTA 2 : Mostra quin ha sigut el diagnòstic més freqüent durant el mes de març.*/
SELECT MAX(diagnostic) FROM visita
WHERE data LIKE '2014-03-%' AND diagnostic = (SELECT diagnostic FROM visita HAVING count(*));

/*CONSULTA 3 : Mostra el pacient i el número de proves que s'ha fet, el pacient que més visities ha tingut.*/
SELECT p.nom, p.cognoms, COUNT(r.codProv) FROM pacient p, realitzacio r, visita v
WHERE p.dni = r.dniPac AND p.dni = v.dniPac
GROUP BY p.dni HAVING COUNT(v.dniPac)
ORDER BY COUNT(*) DESC LIMIT 1;

/*CONSULTA 4 : Mostra el nom de les àrees on hi ha algun metge que cobra un sou per baix de la mitjana de tots els metges.*/
SELECT a.nomArea, m.nom, m.cognoms FROM area a, metge m
WHERE a.numArea = m.numArea AND m.sou < (SELECT AVG(sou) FROM metge);

/*CONSULTA 5 : Digues la diferència de llits que hi ha entre la planta que més llits té i la planta que menys llits té.*/
SELECT
(SELECT COUNT(numLlit) FROM llit WHERE numPl = '2')
-
(SELECT COUNT(numLlit) FROM llit WHERE numPl = '1');

/*CONSULTA 6 : Mostra quants llits no han estat assignats.*/

SELECT ABS(MAX(l.numLlit) - MAX(p.numL)) FROM llit l, pacient p WHERE l.numPl = '1'
UNION
SELECT  ABS(MAX(l.numLlit) - MAX(p.numL)) FROM llit l, pacient p WHERE l.numPl = '2';

/*CONSULTA 7 : Mostra el nom i els cognoms dels pacients que se'ls ha fet més d'una prova i també més d'una visita.*/
SELECT 