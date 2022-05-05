for $servei in doc ("parc.xml")/parc/espectacles/zona/espectacle/servei
  where $servei ="Seient VIP"
return delete node $servei