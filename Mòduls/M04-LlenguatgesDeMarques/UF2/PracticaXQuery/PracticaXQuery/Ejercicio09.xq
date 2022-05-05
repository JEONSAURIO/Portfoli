for $menuEspecial in doc ("parc.xml")/parc/restaurants/zona/restaurant/menuEspecial
where $menuEspecial="Infantil"
return 
replace node $menuEspecial with <petitMenu>Infantil</petitMenu>