@echo off
:inicio
echo 1- Crear una carpeta
echo 2- Escanear el disco duro
echo 3- Formatear el disco duro
echo 4- Recorrer array
echo 5- Reiniciar pc (para cancelar el reinicio del pc se pone shutdown -a)
echo 0- Salir
set /p variable= Introduce una opcion
if %variable%==1 (goto crearcarpeta)
if %variable%==2 (sfc / scannow)
if %variable%==3 (format c:)
if %variable%==4 (goto arrays)
if %variable%==5 (shutdown -r -t 3000 -c "Hola")
if %variable%==0 (exit)
pause
cls
goto inicio
:crearcarpeta
mkdir yeis
echo carpeta creada correctamente!!!
pause
cls
goto inicio
:arrays
set /p lista =Introduce carpetas separadas con espacios
for %%i in %lista% do(
)
pause
cls
goto inicio