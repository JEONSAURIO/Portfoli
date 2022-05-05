for $passPrefer in doc ("parc.xml")/parc/atraccions/zona/atraccio/servei
where $passPrefer/text() ="PassPreferent"
return insert node attribute vip {'1'} into $passPrefer
