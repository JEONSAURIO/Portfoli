for $espectaculo in doc ("parc.xml")/parc/espectacles/zona/espectacle/tipus
where $espectaculo/text() ="Passatge del terror"
return insert node <preu>5</preu> before $espectaculo