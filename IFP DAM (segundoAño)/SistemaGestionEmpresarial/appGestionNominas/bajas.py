from tkinter import*

def ventanaBajas():
    
    import sqlite3
    from tkinter import Text
    import re
    
    ventana_bajas= Tk()
    ventana_bajas.title("BAJAS")
    ventana_bajas.geometry("410x250")
    ventana_bajas.resizable(0,0)
    #ventana_bajas.iconbitmap("icono.ico")
    ventana_bajas.config(background="dark gray") 

    #Creamos la conexion con la base de datos
    conexion= sqlite3.connect("gestionDatos.db")
    cursor= conexion.cursor()

    #VALIDACIONES DE DATOS
    def validar_codEmpleado(codigoEmpleado):
        return re.match("[0-9]+", codigoEmpleado)

    def validar_fechaRegistro(fechaRegistro):
        return re.match("[0-9/]{10}", fechaRegistro)

    error= False
    def baja_registro():
        global error
        
        if validar_codEmpleado(entryCodEmpleado.get()):
            print("Codigo empleado introducido correctamente")
        else:
            error= True
            validaciones.insert("end", "Codigo empleado incorrecto porfavor introduce solo números\n")
            
        #validaciones.insert(END, "Registro eliminado\n"if conexion.total_changes > 0 else "No se pudo eliminar el registro\n")
        
        if validar_fechaRegistro(entryFechaBajas.get()):
            print("Fecha bajas introducido correctamente")
        else:
            error= True
            validaciones.insert("end", "Fecha inicio introducida incorrectamente, este es el patrón:(00/00/0000)\n")
            
        
        codEmpleado=entryCodEmpleado.get()
        codFechaBajas=entryFechaBajas.get()

        #Hacemos la query para eliminar 
        queryDelete= "DELETE FROM altas WHERE altaCodigo = ?"

        cursor.execute(queryDelete, (codEmpleado,))
        conexion.commit()

        validaciones.delete("insert", "end") #insert es para eliminar el contenido desde el cursor
        
        if not error:
            cursor.execute(queryDelete, (codEmpleado,))
            conexion.commit()
            validaciones.insert("end", "Registro eliminado\n" if conexion.total_changes > 0 else "No se pudo eliminar el registro\n")
        else:
            validaciones.insert("end", "Error en las validaciones. No se ha eliminado el registro.\n")

        validaciones.delete("insert", "end")
        
    fontEstilo=("Arial", 10, "bold")
    fontEstiloBtn=("Arial", 20)

    Label(ventana_bajas, text="CÓDIGO EMPLEADO", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=44, y=10) 
    Label(ventana_bajas, text="FECHA DE BAJA", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=232, y=10)

    codigo= StringVar()
    fechaBajas= StringVar()

    entryCodEmpleado= Entry(ventana_bajas, justify="center", width=22, font=fontEstilo, textvariable= codigo)
    entryCodEmpleado.place(x=32, y=40)
    entryFechaBajas= Entry(ventana_bajas, justify="center", width=22, font=fontEstilo, textvariable= fechaBajas)
    entryFechaBajas.place(x=220, y=40)


        
    validaciones= Text(ventana_bajas, background="dark gray", fg="red", font=fontEstilo, width=50, height=4)
    validaciones.place(x=28, y=80)

    Button(ventana_bajas, text="CONFIRMAR", anchor="center", width=14, background="light yellow", font=fontEstiloBtn, command= baja_registro).place(x=90, y=170)
            
    #hacer un update
        
    ventana_bajas.mainloop()
    conexion.close()