for $dataTanc in doc ("parc.xml")/parc/dates/dataTancament

return
replace node $dataTanc with <dataTancament>10/02/2021</dataTancament>