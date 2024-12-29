<?php
$usuario =$_POST["usuario"];
$correo =$_POST["usuario-correo"];
echo $usuario." ".$correo;

$usuario_bbdd= "root";
$contra_bbdd= "";
$host= "localhost";
$bbdd= "entradas";

$mysqli= new mysqli($hots, $usuario_bbdd, $contra_bbdd, $bbdd);
if ($mysqli->connect_errno){
printf("Falló la conexión: %s\n", $mysqli->connection_error);
exit();
}
$consulta= "SELECT * FROM entradas";
if($mysqli->query($consulta)){
    printf("La seleccion devolvió %d filas. \n", $resultado->num_rows);
}
?>