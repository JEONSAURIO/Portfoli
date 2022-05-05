for $botiga1 in doc ("parc.xml")/parc/botigues
for $botiga2 in doc ("parc.xml")/parc/botigues
where $botiga1/producte = $botiga2/producte and $botiga1/nom != $botiga2/nom
return concat ($botiga1, "i", $botiga2, "tenen el producte :", $botiga1/producte)