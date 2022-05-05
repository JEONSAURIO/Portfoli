for $atraccion in doc("parc.xml")/parc/atraccions/zona/atraccio
where $atraccion/edatMinima <= 10
return concat("Nom atracció :", $atraccion/@nom)