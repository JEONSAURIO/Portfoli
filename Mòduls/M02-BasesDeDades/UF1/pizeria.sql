use pizzeria;
/*1. (1 punt) Mostreu el nom de la pizza/s que porta més ingredients.
*/
select pr.nom from forma f, pizza p , producte pr 
where f.pizza = p.codi AND pr.codi = p.codi
group by f.pizza
having count(*) = (select count(*) FROM forma group by pizza order by count(ingredient) DESC LIMIT 1); 

/* Mostreu el nom del/s ingredient/s que no s’utilitza a cap pizza.*/
select nom from ingredient 
where codi NOT IN (select ingredient from forma);

/* Mostreu el número de comandes fetes per cadascuna de les poblacions.*/
select count(cm.numero) from comanda cm, client c
where cm.telefon_client = c.telefon
group by c.poblacio;

/* Mostreu quantes comandes s’han fet que contenien postre.*/
select count(distinct(c.comanda)) from postre p, comanda cm, conte c, producte pr
where p.codi = pr.codi AND cm.numero = c.comanda AND c.producte = pr.codi;

/* Mostreu el nom i el cognom dels empleats que han fet menys comandes*/
select e.nom, e.cognoms FROM empleat e, comanda cm
where e.codi = cm.empleat
group by cm.empleat
having count(cm.numero) = (select count(numero) from comanda group by empleat order by count(numero) LIMIT 1);

/* Mostreu quantes comandes s’han fet a domicili i també quantes s’han fet de recollida en local.*/
select count(*), "Local" from comanda
where domicili_local = "L"
union
select count(*), "Domicili" from comanda
where domicili_local = "D";

/* Mostreu la capacitat mitja de les begudes alcohòliques.
*/
select AVG(capacitat) from beguda
where beguda_alcoholica = "S";

/*Mostreu el nom del client/s que han fet més comandes.*/
select c.nom from comanda cm, client c
where cm.telefon_client = c.telefon
group by cm.telefon_client
having count(*) = (select count(*) FROM comanda group by telefon order by count(*) DESC LIMIT 1); 

/*Mostreu les comandes on s’hagin demanat més de 3 pizzes diferents.*/
select c.comanda from pizza p, producte pr, conte c
where p.codi = pr.codi AND pr.codi = c.producte 
group by c.comanda
having count(*)> 3;

/* Mostreu el nom del client/s que han fet comandes a domicili però no de recollida a local.*/
select c.nom from comanda cm, client c
where cm.telefon_client = c.telefon AND domicili_local = "D" AND c.telefon 	NOT IN (select telefon_client from comanda where domicili_local = "L");


