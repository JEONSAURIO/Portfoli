for $tiendas in doc("parc.xml") /parc/botigues/zona/botiga
for $restaurantes in doc("parc.xml") /parc/restaurants/zona/restaurant

where $tiendas/../@nom = $restaurantes/../@nom

return concat($tiendas, " está en la mateixa zona que : ", $tiendas)