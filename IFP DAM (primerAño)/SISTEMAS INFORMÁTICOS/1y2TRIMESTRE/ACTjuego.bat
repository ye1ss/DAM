@echo off

set /a turneX= 0
set /a turnoO= 0

echo byYeis
echo.
:principio
set jugar=Jugar
set salir=Salir

echo 1. %jugar%
echo 2. %salir%

set uno=1
set dos=2
set tres=3
set cuatro=4
set cinco=5
set seis=6
set siete=7
set ocho=8
set nueve=9

echo.
set /p opciones= Introdice que quieres hacer 

if %opciones%==2 (exit)
if %opciones%==1 (goto eleccion)


:eleccion
echo.
echo Selecione jugador 
echo.
echo 1 jugador X
echo.
echo 2 jugador O
echo.
set /p jugador= eleccion 
if %jugador%==1 (goto turnX)
if %jugador%==2 (goto turnO)

:X
echo.
set /p escoge=Escoge posicion jugador X :
set equis=X
if %escoge%==1 (set uno=%equis%)
if %escoge%==2 (set dos=%equis%)
if %escoge%==3 (set tres=%equis%)
if %escoge%==4 (set cuatro=%equis%)
if %escoge%==5 (set cinco=%equis%)
if %escoge%==6 (set seis=%equis%)
if %escoge%==7 (set siete=%equis%)
if %escoge%==8 (set ocho=%equis%)
if %escoge%==9 (set nueve=%equis%)
goto pintar

:Y
echo.
set /p escoge=Tu turno, jugador Y, escoge una posicion :
set circulo=O
if %escoge%==1 (set uno=%circulo%)
if %escoge%==2 (set dos=%circulo%)
if %escoge%==3 (set tres=%circulo%)
if %escoge%==4 (set cuatro=%circulo%)
if %escoge%==5 (set cinco=%circulo%)
if %escoge%==6 (set seis=%circulo%)
if %escoge%==7 (set siete=%circulo%)
if %escoge%==8 (set ocho=%circulo%)
if %escoge%==9 (set nueve=%circulo%)
goto pintar

:turnos
if %turneX%==1 (goto X)
if %turnoO%==1 (goto Y)

:turnX
set /a turneX= 1
set /a turnoO= 0
goto turnos

:turnO
set /a turnoO= 1
set /a turneX= 0
goto turnos


:pintar 
cls
echo.
echo.
echo        I       I    
echo   %uno%    I   %dos%   I    %tres%  
echo        I       I
echo -------I-------I-------
echo        I       I     
echo   %cuatro%    I   %cinco%   I    %seis%
echo        I       I     
echo -------I-------I-------
echo        I       I
echo   %siete%    I   %ocho%   I   %nueve% 
echo        I       I     


if %uno%%dos%%tres%==%equis%%equis%%equis% goto victoria
if %uno%%dos%%tres%==%circulo%%circulo%%circulo% goto victoria
if %cuatro%%cinco%%seis%==%equis%%equis%%equis% goto victoria
if %cuatro%%cinco%%seis%==%circulo%%circulo%%circulo% goto victoria
if %siete%%ocho%%nueve%==%equis%%equis%%equis% goto victoria
if %siete%%ocho%%nueve%==%circulo%%circulo%%circulo% goto victoria
if %uno%%cuatro%%siete%==%equis%%equis%%equis% goto victoria
if %uno%%cuatro%%siete%==%circulo%%circulo%%circulo% goto victoria
if %dos%%cinco%%ocho%==%equis%%equis%%equis% goto victoria
if %dos%%cinco%%ocho%==%circulo%%circulo%%circulo% goto victoria
if %tres%%seis%%nueve%==%equis%%equis%%equis% goto victoria
if %tres%%seis%%nueve%==%circulo%%circulo%%circulo% goto victoria
if %uno%%cinco%%nueve%==%equis%%equis%%equis% goto victoria
if %uno%%cinco%%nueve%==%circulo%%circulo%%circulo% goto victoria
if %tres%%cinco%%siete%==%equis%%equis%%equis% goto victoria
if %tres%%cinco%%siete%==%circulo%%circulo%%circulo% goto victoria


if %turneX%==0 (goto turnX)
if %turnoO%==0 (goto turnO)

:victoria
echo Felicidades has hecho tres en raya!
echo.
goto principio

shift
pause