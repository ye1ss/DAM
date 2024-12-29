Sub Botón1_Haga_clic_en()

    Range("A2").Select
    ActiveCell.Value = ActiveCell.Value + "HOLA "

End Sub

-----------------------------------------------------------------------------------------------------------------

Sub Primero
	ActiveSheet.Range("A1").Value = "Hola"
End Sub

Sub Primero
	ActiveSheet.ActiveCell.Value = "Hola"
End Sub

Sub Primero
	Application.WorkBooks(1).WorkSheets(1).Range("A1").Value = "Hola"
End Sub

----------------------------------------------------------------------------------------------------------------------

Sub Mensaje()
    
    Dim saludar As String
    Dim nombre As String
    
    nombre = InputBox("Dime tu nombre")
    
    saludar = "Buenas amigo mio " + nombre
    
    MsgBox saludar
      
	  
	  
	  Sub nombres()
  
    Dim nombre   As String
    Dim apel1  As String
    Dim apel2 As String
    nombre = InputBox("tu nombre ")
    apel1 = InputBox(" tu apel1")
    apel2 = InputBox("tu apel2")

    Range("a2").Value = nombre
    Range("b2").Value = apel1
    Range("c2").Value = apel2
    
    
End Sub

--------------------------------------------------------------------------------------------------------------------

Trasladarse a una Celda
Range("A1").Select

Escribir en una Celda
Activecell.FormulaR1C1="Paty"

Letra Negrita
Selection.Font.Bold = True

Letra Cursiva
Selection.Font.Italic = True

Letra Subrayada
Selection.Font.Underline = xlUnderlineStyleSingle

Centrar Texto
With Selection
.HorizontalAlignment = xlCenter
End With

Alinear a la izquierda
With Selection
.HorizontalAlignment = xlLeft
End With

Alinear a la Derecha
With Selection
.HorizontalAlignment = xlRight
End With

Tipo de Letra (Fuente)
With Selection.Font
.Name = "AGaramond"
End With

Tamaño de Letra (Tamaño de Fuente)
With Selection.Font
.Size = 15
End With

Copiar
Selection.Copy

Pegar
ActiveSheet.Paste

Cortar
Selection.Cut

--------------------------------------------------

Function PVP(IMPORTE)
    
   PVP = Application.Round((IMPORTE * 1.21), 2)
    
End Function
------------------------------------------------------------------------------------------------------------------
Function INICIALES(Nombre, Apellido1, Apellido2)

    'Ucase - Mayusculas
    'Lcase - Minusculas
       
   INICIALES = UCase(Left(Nombre, 1) & Left(Apellido1, 1) & Left(Apellido2, 1))

End Function
-------------------------------------------------------------------------------------------------------------------
Function DESCUENTO(CANTIDAD, PRECIO)

   If CANTIDAD >= 50 Then
     DESCUENTO = CANTIDAD * PRECIO * 0.15
   Else
     DESCUENTO = 0
   End If

 DESCUENTO = Application.Round(DESCUENTO, 2)
 
End Function
-------------------------------------------------------------------------------------------------------------------
Function MESES(mes As Integer) As String
    Select Case mes
        Case 1
            MESES = "ENERO"
        Case 2
            MESES = "FEBRERO"
        Case 3
            MESES = "MARZO"
        Case 4
            MESES = "ABRIL"
        Case 5
            MESES = "MAYO"
        Case 6
            MESES = "JUNIO"
        Case 7
            MESES = "JULIO"
        Case 8
            MESES = "AGOSTO"
        Case 9
            MESES = "SEPTIEMBRE"
        Case 10
            MESES = "OCTUBRE"
        Case 11
            MESES = "NOVIEMBRE"
        Case 12
            MESES = "DICIEMBRE"
        Case Else
            MESES = "NO EXISTE"
    End Select
End Function
---------------------------------------------------------------------------------------------------------------------
Function EVALUA(calificacion As Double) As String
    
    Select Case calificacion
        Case 9 To 10
            EVALUA = "Sobresaliente"
        Case 7 To 8.9
            EVALUA = "Notable"
        Case 5 To 6.9
            EVALUA = "Aprobado"
        Case 0 To 4.9
            EVALUA = "Suspenso"
        Case Else
            EVALUA = "Nota no válida"
    End Select
    
End Function
----------------------------------------------------------------------------------------------------------------------
Function CUENTACOLOR(celdamuestra As Range, rango As Range)
      
    Dim Celda As Range
              
    For Each Celda In rango
        If Celda.Interior.Color = celdamuestra.Interior.Color Then
        
            CUENTACOLOR = CUENTACOLOR + 1
            
        End If
         
    Next Celda
 
End Function
----------------------------------------------------------------------------------------------------------------------
Sub BUCLEFOR()
Dim i As Integer

    For i = 1 To 10
        Cells(i, 1).Value = i
    Next i
    
End Sub
----------------------------------------------------------------------------------------------------------------------
Sub TABLASMULTIPLICAR()

Dim x As Integer
Dim num As Integer

    For x = 1 To 10  'Filas
        For num = 1 To 10 'Columnas
            Cells(x, num).Value = x * num
        Next num
    Next x
    
End Sub
-----------------------------------------------------------------------------------------------------------------------
Sub CALCULOS()

Dim a As Integer

a = InputBox("Cuantos números quieres hacer?")

Dim x As Integer

    For x = 1 To a
        Cells(x, 1).Value = x
        Cells(x, 2).Value = x ^ (1 / 2)
        Cells(x, 3).Value = x ^ 2
        Cells(x, 4).Value = x ^ 4
    Next x
    
End Sub
-----------------------------------------------------------------------------------------------------------------------
Sub MOVERSE()

    Range("A2").Select
    
    Do While ActiveCell <> Empty
        
        ActiveCell.Value = "MANOLI"
        ActiveCell.Offset(1, 0).Select
    
    Loop

End Sub
-------------------------------------------------------------------------------------------------------------------------
Sub ENCONTRARCANTIDAD()

Dim IMPORTE As Double
Dim CONTADOR As Integer
Dim FILA As Integer
Dim X As Integer

    IMPORTE = InputBox("CANTIDAD BUSCADA?")
    
    CONTADOR = 0
    FILA = 2
    
    Do While Not IsEmpty(Cells(FILA, 2))

        If Cells(FILA, 2).Value = IMPORTE Then
        
            Cells(FILA, 2).Interior.ColorIndex = 48
            CONTADOR = CONTADOR + 1
        
        End If
        
        FILA = FILA + 1
    Loop
    
    MsgBox "CANTIDADES ENCONTRADAS " & CONTADOR

End Sub
-----------------------------------------------------------------------------------------------------------------------
Sub DOLOOP()

Dim fila As Integer

    fila = 1
    Do
        Cells(fila, 2) = fila
        fila = fila + 1
    Loop Until Cells(fila, 1).Value = ""
    
End Sub
------------------------------------------------------------------------------------------------------------------------
Sub DOLOOP2()
Dim i As Integer

    i = 0
    
    Do
      i = i + 1
    Loop Until IsEmpty(Cells(i, 1))
    
   Cells(i, 1).Select
End Sub
-------------------------------------------------------------------------------------------------------------------------
Sub COPIAR_PEGAR_SELECCION()

    Selection.Copy 'Copia el rango que tengamos seleccionado
    
    Sheets("Hoja2").Select 'Selecciona la hoja2 o la que indiquemos
    Range("A2").Select 'Se posiciona en la celda A2
    
    While ActiveCell.Value <> "" 'Mientras en valor de la celda activa sea distinto a vacio, incrementa una fila con Offset
        ActiveCell.Offset(1, 0).Select
    Wend

    ActiveSheet.Paste 'Pegar la selección desde la celda vacia que a encontrado
    
End Sub
-------------------------------------------------------------------------------------------------------------------------
Sub PEGAR_SELECCION_OPTIMIZADO()
	
	'BUCLE LOOP
	
    Dim filas As Integer 'Declaramos la variable fila como entero y en la siguiente linea
    filas = 0
    
    Selection.Copy 'Selecciona y copia lo que queramos
    
    Sheets("Hoja2").Select 'Selecciona la hoja2 o la que indiquemos
    Range("A2").Select 'Se posiciona en la celda A2
    
    Do While filas < 20 'Comienza un bucle para recorrer 19 filas, pero pueden ser las que quereamos, cuando encuentre la palabra fin parará
        
        ActiveCell.Offset(1, 0).Select 'Avanza una fila hacia abajo cada vuelta del bucle
        
        If ActiveCell.Value = "HOLA" Then 'Comprueba si la celda activa es HOLA
            ActiveCell.Offset(0, 1).Select 'Si la celda es HOLA avanza una columna a la derecha
            ActiveSheet.Paste  'Pega lo que tenemos seleccionado
            ActiveCell.Offset(0, -1).Select 'Vuelve una columna a la izquierda
        End If 'Termina la acción cuando ha encontrado HOLA
        
        If ActiveCell.Value = "FIN" Then 'Antes de terminar el bucle comprueba si la celda activa tiene el valor FIN
            Exit Do 'Si tiene FIN termina el bucle
        End If
        
        filas = filas + 1      
        
    Loop 'Vuelve a hacer el bucle FOR si no ha encontrado fin o lo ha hecho 19 veces
	
End Sub

-------------------------------------------------------------------------------------------------------------------------
'DEPURAR MACROS VBA --------------------------------------------------------------

ALT + F11 'ENTORNO VBA EXCEL

CTRL + G 'VENTANA DE INMEDIATO
?VARIABLE
?ACTIVECELL.VALUE
Debug.Print (VARIABLE)

DESPLAZAR PUNTERO AMARILLO EN EJECUCIÓN PASO A PASO(F8)

AGREGAR INSPECCION (MENU DEPURACIÓN) - VARIABLES A CONTROLAR
-------------------------------------------------------------------------------------------------------------------------

Trasladarse a una Celda
Range("A1").Select

Escribir en una Celda
Activecell.FormulaR1C1="Paty"

Letra Negrita
Selection.Font.Bold = True

Letra Cursiva
Selection.Font.Italic = True

Letra Subrayada
Selection.Font.Underline = xlUnderlineStyleSingle

Centrar Texto
With Selection
.HorizontalAlignment = xlCenter
End With

Alinear a la izquierda
With Selection
.HorizontalAlignment = xlLeft
End With

Alinear a la Derecha
With Selection
.HorizontalAlignment = xlRight
End With

Tipo de Letra (Fuente)
With Selection.Font
.Name = "AGaramond"
End With

Tamaño de Letra (Tamaño de Fuente)
With Selection.Font
.Size = 15
End With

Copiar
Selection.Copy

Pegar
ActiveSheet.Paste

Cortar
Selection.Cut

----------------------------------------------------------

Private Sub CommandButton2_Click()

    NOMBREHOJA = InputBox("¿Que nombre quieres para la nueva hoja?")
    
    Sheets.Add
    
    With ActiveSheet
        .Name = NOMBREHOJA
    End With
    
    Range("A1").Select
    
    ActiveCell.Value = "NOMBRE"
    ActiveCell.Offset(0, 1).Value = "DIRECCIÓN"
    ActiveCell.Offset(0, 2).Value = "FECHA"
    ActiveCell.Offset(0, 3).Value = "IMPORTTE"
    ActiveCell.Offset(0, 4).Value = "PVP"

End Sub

Private Sub CommandButton3_Click()

    'Range("a:a").Select
    
    Range("A2").Select
    
    PERSONA = InputBox("¿Dime que nombre busco?")
    
    Dim CELDA As Range
    Dim RANGO As Range
    
    'RANGO = Range("A1:A5")
    
    'For Each CELDA In RANGO
    
        'If CELDA.Value = PERSONA Then
            'With Selection.Font
                    '.Color = -16776961
            'End With
        'End If
    
    'Next CELDA
    
    
    
    
    While ActiveCell.Value <> Empty
    
        If ActiveCell.Value = PERSONA Then
            With Selection.Font
                    .Color = -16776961
            End With
        End If
        
        ActiveCell.Offset(1, 0).Select
        
    Wend
    
End Sub

Private Sub CommandButton4_Click()

    SALUDO.Show
    
    Unload PRINCIPAL
       
    

End Sub

Private Sub INSERTAR_Click()

    'MsgBox ("HOLA AMIGOS")
    
    Range("A1").Select
    
    While ActiveCell.Value <> Empty
        ActiveCell.Offset(1, 0).Select
    Wend
    
    ActiveCell.Value = NOMBRE
    ActiveCell.Offset(0, 1).Value = DIR
    ActiveCell.Offset(0, 2).Value = FECHA
    ActiveCell.Offset(0, 3).Value = IMPORTE

    
    NOMBRE = ""
    DIR = ""
    FECHA = ""
    IMPORTE = ""
  
End Sub

----------------------------------------------------

Sub Prueba_Format()

Dim Pruebafecha As Date
Dim Texto As String
Pruebafecha = #1/27/2001 5:04:23 PM#

'Permite obtener la hora actual en formato largo(completo)
Texto = Format(Now(), "Long Time")

'Permite obtener la fecha actual en formato largo (completo)
Texto = Format(Now(), "Long Date")

'Permite obtener el número del día
Texto = Format(Now(), "D")

' Permite obtener la hora minuto y segundo
Texto = Format(Pruebafecha, "h:m:s")

' Se obtiene el formato, completando con ceros
Texto = Format(Pruebafecha, "hh:mm:ss")

' Formato largo incluyendo el nombre del día
Texto = Format(Pruebafecha, "dddd, MMM d yyyy")

' HH sirve para obtener el formato de 24 horas
Texto = Format(Pruebafecha, "HH:mm:ss")

' Formato de número
Texto = Format(54765.4, "##,##0.00")
Texto = Format(32334.9, "###0.00")

' Formato de porcentaje
Texto = Format(5, "0.00%")

msgbox texto

End Sub

-------------------------------------------------------

Private Sub CommandButton1_Click()
'
With Me.TextBox1
    .Value = Range("B1").Value
    .Value = Format(.Value, "$#,##0.00")
End With
'
With Me.TextBox2
    .Value = Range("B2").Value
    .Value = Format(.Value, "dd-mmmm-yyyy")
End With
'
End Sub
