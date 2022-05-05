for $atraccion in doc("parc.xml")/parc/atraccions/zona/atraccio
where $atraccion/intensitat = "Forta" and $atraccion/edatMinima > 12

return concat("Nom atracció :", $atraccion/@nom)