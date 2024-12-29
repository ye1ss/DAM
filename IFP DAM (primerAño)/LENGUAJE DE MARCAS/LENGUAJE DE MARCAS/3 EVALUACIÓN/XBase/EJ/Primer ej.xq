(:
(1)
for $b in //baile
  order by $b
  return 
    <nombre_baile>
      {data($b/nombre)}
    </nombre_baile>
:)
(:
(2)
  for $b in //baile
  return
    <baile_plaza>
      {$b/nombre/text()}
      ({$b/plazas/text()})
    </baile_plaza>
:)
(:
(3)
for $b in //baile[precio<30]
return
  <nombre>
    {data($b/nombre)}
  </nombre>
:)
(:
(4)
for $b in //baile 
where $b/precio <30
return
  <nombre>
    {data($b/nombre)}
  </nombre>
:)
for $b in //bailes_de_salon/baile
for $nombre in $b/nombre
where $b/precio[@moneda='dolar'] >30 
return
$nombre