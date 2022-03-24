USE ACB;

/* Exercici 90: Mostra el nom de l’equip, el pavelló i el seu president dels equips que tenen un aforament per sota la mitjana.*/
SELECT ep.nom ,es.nom, dir.nom FROM estadi es, equip ep, directiu dir, membre_equip me
WHERE es.aforament < (SELECT AVG(aforament) FROM estadi) AND (ep.estadi = es.nom) AND (me.nom = dir.nom) AND (me.equip = ep.nom) AND (dir.carrec = 'President');

/*Exercici 91:  Mostra el nom dels àrbitres que han arbitrat més d’un partit que ha guanyat l’equip de casa.*/
SELECT ara.arbitre FROM arbitra ara, partit pa
WHERE (pa.punts_local > pa.punts_visitant) AND (ara.equip_local = pa.equip_local) AND (pa.jornada = ara.jornada)
GROUP BY ara.arbitre 
HAVING COUNT(*) > 1;

/*Exercici 92: Trobar el nom de l’equip, el nom dels jugadors i el nom de l’entrenador dels equips que han guanyat com a
mínim dos partits fora de casa.*/ 
SELECT pa.equip.visitant, ent.nom FROM equip ep, entrenador ent, membre_equip me, partit pa
WHERE (pa.punts_visitant > pa.punts_local) AND (pa.equip_visitant = ep.nom) AND (ep.nom = me.equip) AND (me.nom = ent.nom)
GROUP BY pa.equip_visitant
HAVING COUNT(*) >= 2;

/*Exercici 93: Mostra el nom i el president dels equips que han aconseguit una puntuació com a visitants superior a la mitjana
dels equips que han jugat fora.*/ 
SELECT ep.nom ,dir.nom FROM equip ep, directiu dir, partit pa, membre_equip me
WHERE (dir.carrec = 'President') AND pa.punts_visitant > (SELECT AVG(punts_visitant) FROM partit) AND (me.nom = dir.nom) AND (ep.nom = me.equip);

/*Exercici 94: Mostra el nom i la posició dels jugadors que són entrenadors a la vegada. Mostra també l’equip on juga i
ordena-ho tot per l’equip i pel nom del jugador.*/
SELECT j.nom, j.posicio, me.equip FROM membre_equip me, jugador j, entrenador e
WHERE (j.nom = me.nom) AND (me.nom = e.nom)
ORDER BY me.equip, j.nom;

/*Exercici 95: Mostra el nom i l’equip de tots els membres d’algun equip que el seu cognom és Brunet.*/
SELECT nom, equip FROM membre_equip
WHERE nom LIKE '%Brunet%';

/*Exercici 96: Mostra el nom i l’equip al que pertanyen de les persones que són directius però no són presidents.*/
SELECT me.nom, me.equip FROM membre_equip me, directiu dir
WHERE (dir.carrec != 'President') AND (me.nom = dir.nom);

/*Exercici 97: Mostra la quantitat de fitxes que tenim de cada equip.*/
SELECT COUNT(j.fitxa), me.equip FROM jugador j, membre_equip me
WHERE (j.nom = me.nom) 
GROUP BY me.equip;

/*Exercici 98: Mostrar dels equips que han guanyat alguna vegada fora de casa el total de punts que tenen com a visitants.*/
SELECT equip_visitant, SUM(punts_visitant) FROM partit
WHERE pa.punts_visitant > pa.punts_local
GROUP BY equip_visitant;

/*Exercici 99: Mostra la quantitat de punts obtinguts per cada equip jugant com a local.*/
SELECT equip_local, SUM(punts_local) FROM partit 
GROUP BY equip_local;

/*Exercici 100: Digues el nom i l’equip on juguen dels jugadors que tenen una fitxa superior al número 400.*/
SELECT me.nom, me.equip, j.fitxa FROM membre_equip me, jugador j
WHERE (j.fitxa > 400) AND (j.nom = me.nom);

/*Exercici 101: De l’exercici anterior ordena els equips en ordre ascendent i digues quantes fitxes té cada equip.*/
SELECT me.nom, me.equip, COUNT(j.fitxa) FROM membre_equip me, jugador j
WHERE (j.fitxa > 400) AND (j.nom = me.nom)
GROUP BY me.equip
ORDER BY me.equip;
/*Exercici 102: Mostra el nom dels equips que tenen el pressupost més alt.*/
SELECT nom, MAX(pressupost) FROM equip;

/*Exercici 103: Digues el nom dels àrbitres que han nascut a Olot i també els que porten més de 5 anys arbitrant*/
SELECT nom FROM arbitre
WHERE ciutat_naixement ='Olot' AND (YEAR(NOW()) - antiguitat >5 );

/*Exercici 104: Mostra la màxima diferència que s’ha produït en un partit.*/
SELECT MAX(ABS(punts_visitant - punts_local)) FROM partit;

/*Exercici 105: Mostra el nom i el pressupost dels equips que són filials d’un altre. Mostra també a la mateixa línia el nom i el
pressupost del seu equip “pare”.*/

/*Exercici 106: Mostra la mitjana d’anys que porten els àrbitres arbitrant.*/
SELECT ABS(YEAR(NOW()) - antiguitat) FROM arbitre
GROUP BY nom;   