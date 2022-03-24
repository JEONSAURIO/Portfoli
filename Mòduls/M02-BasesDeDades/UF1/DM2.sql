USE plantes;

SELECT DISTINCT p.nom_popular FROM planta p, 
exemplar_planta ep WHERE (p.floracio = 'Estiu') AND (p.nom_cientific=ep.nom_planta);

SELECT DISTINCT pe.nom_planta,pe.tipus_planta FROM planta_exterior pe,
planta p WHERE (p.floracio ='Primavera') AND (pe.nom_planta = p.nom_cientific);

SELECT DISTINCT pe.nom_planta,ad.nom_adob FROM planta_exterior pe, planta p,dosi_adob dad,
adob ad WHERE (ad.nom_firma ='CIRSADOB') AND (pe.nom_planta = p.nom_cientific) AND (dad.nom_adob = ad.nom_adob) AND (dad.nom_planta = p.nom_cientific) ;

SELECT DISTINCT r.metode_reproduccio,ep.nom_planta FROM reproduccio r, 
exemplar_planta ep, planta p WHERE (r.nom_planta = p.nom_cientific) AND (ep.nom_planta = p.nom_cientific);

SELECT DISTINCT CONCAT (p.nom_popular,'(', dad.quantitat_adob, ')') FROM planta p, adob ad, dosi_adob dad
WHERE (ad.nom_firma = 'UOCADOB') AND (dad.nom_planta = p.nom_cientific) AND ( dad.nom_adob = ad.nom_adob);

SELECT p.nom_popular, rep.metode_reproduccio FROM planta p, reproduccio rep
WHERE (p.floracio = 'Hivern') AND (p.nom_cientific = rep.nom_planta);

SELECT DISTINCT p.nom_cientific, LEFT (p.nom_popular,5) FROM planta p, reproduccio rep, planta_interior pin, planta_exterior pex
WHERE (rep.metode_reproduccio = 'Esqueix') AND (rep.nom_planta = p.nom_cientific) AND ( p.nom_cientific= pex.nom_planta) 
OR (rep.grau_exit='Baix') AND (p.nom_cientific = pin.nom_planta) AND (rep.nom_planta = p.nom_cientific);

SELECT p.nom_popular, p.floracio FROM planta p, dosi_adob dad
WHERE (dad.quantitat_adob > 40) AND (p.nom_cientific = dad.nom_planta);

SELECT p.nom_popular FROM planta p, planta_interior pin, planta_exterior pex
WHERE (pin.nom_planta = p.nom_cientific) AND (pin.ubicacio = 'Llum indirecta') 
OR (pex.nom_planta = p.nom_cientific) AND (pex.tipus_planta = 'T');

SELECT DISTINCT p.nom_cientific, p.floracio FROM planta p, exemplar_planta ep
WHERE (p.nom_cientific = ep.nom_planta);

SELECT ad.nom_adob, ad.nom_firma FROM adob ad, dosi_adob dad
WHERE (dad.quantitat_adob BETWEEN 20 AND 40) AND (dad.nom_adob = ad.nom_adob);

SELECT UPPER(p.nom_popular) FROM adob ad, dosi_adob dad, planta p,exemplar_planta ep
WHERE (ad.tipus_adob = 'AI') AND (ad.nom_adob = dad.nom_adob) AND (dad.nom_planta = p.nom_cientific) AND (ep.nom_planta = p.nom_cientific);

SELECT p.nom_popular, pin.ubicacio FROM planta p, exemplar_planta ep, planta_interior pin
WHERE (ep.num_exemplar = 1) AND (p.nom_cientific = ep.nom_planta) AND (p.nom_cientific = pin.nom_planta);

SELECT p.nom_popular, dad.nom_adob, dad.quantitat_adob + 10 FROM planta p, dosi_adob dad, adob ad
WHERE (dad.nom_adob = ad.nom_adob) AND (p.nom_cientific = dad.nom_planta) AND (ad.nom_firma = 'PRISADOB')
OR (dad.quantitat_adob <= 30);

SELECT DISTINCT p.nom_popular FROM planta p, adob ad, dosi_adob dad 
WHERE (p.nom_cientific = dad.nom_planta) AND (ad.nom_adob = dad.nom_adob) AND (p.floracio = 'Primavera') AND (ad.tipus_adob = 'AI');

SELECT DISTINCT p.nom_cientific, rep.metode_reproduccio FROM planta p, reproduccio rep, dosi_adob dad
WHERE (dad.nom_adob != 'Casadob') AND (p.nom_cientific = rep.nom_planta) AND (dad.nom_planta = p.nom_cientific);

SELECT p.floracio FROM planta p, exemplar_planta ep
WHERE (ep.num_exemplar = 1) AND (ep.nom_planta = p.nom_cientific);

SELECT p.nom_popular, LEFT(mer.nom_metode,1) FROM planta p, metode_reproduccio mer, reproduccio rep
WHERE (rep.grau_exit != 'Alt') AND (p.nom_cientific = rep.nom_planta) AND (rep.metode_reproduccio = mer.nom_metode);

SELECT p.nom_cientific FROM planta p, dosi_adob dad
WHERE (p.nom_cientific = dad.nom_planta) AND (p.floracio = dad.nom_estacio);

SELECT LOWER(pex.nom_planta), pin.nom_planta FROM planta p, planta_exterior pex, planta_interior pin, dosi_adob dad, adob ad, reproduccio rep 
WHERE (pex.nom_planta = p.nom_cientific) AND (ad.nom_firma = 'CIRSADOB') AND (p.nom_cientific = dad.nom_planta) AND (dad.nom_adob = ad.nom_adob) 
OR (pin.nom_planta = p.nom_cientific) AND (rep.metode_reproduccio = 'Capficats');
