from tkinter import*
import sqlite3

def ventanaInformes():
    ventana_informes= Tk()
    ventana_informes.title("INFORMES")
    ventana_informes.geometry("700x180")
    ventana_informes.resizable(0,0)
    ventana_informes.config(background="dark gray") 
    fontEstilo=("Arial", 10, "bold")
    fontEstiloEntry=("Arial", 10)

    def conexionBdd():
        conexion= sqlite3.connect=("gestionDatos.db")
        cursor= conexion.cursor()
        
        query= "SELECT COUNT(*) FROM altas"
        
        cursor.execute(query)
        
        numeroRegistros= cursor.fetchone()[0]
        entryEmpleadosAlta.insert("end", numeroRegistros)
        conexion.close()
        
    #LÍNEA 1
    Label(ventana_informes, text="EMPLEADOS ALTA", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=30, y=10) 
    Label(ventana_informes, text="EMPLEADOS BAJA", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=200, y=10) 
    Label(ventana_informes, text="MEDIA EDADES", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=350, y=10) 
    Label(ventana_informes, text="RETRUBUCIÓN MEDIA", anchor="center", width=18, background="dark gray",fg="dark blue" ,font=fontEstilo).place(x=520, y=10) 

    entryEmpleadosAlta= Text(ventana_informes, width=18, font=fontEstilo, state="disabled", height=1)
    entryEmpleadosAlta.place(x=32, y=30)
    entryEmpleadosBaja= Text(ventana_informes, width=18, font=fontEstilo, state="disabled", height=1)
    entryEmpleadosBaja.place(x=202, y=30)
    entryMediaEdades= Text(ventana_informes, width=18, font=fontEstilo, state="disabled", height=1)
    entryMediaEdades.place(x=362, y=30)
    entryRetribucionMedia= Text(ventana_informes, width=18, font=fontEstilo, state="disabled", height=1)
    entryRetribucionMedia.place(x=532, y=30)

    #LÍNEA 2
    Label(ventana_informes, text="% MUJERES", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=30, y=60) 
    Label(ventana_informes, text="% MUJERES", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=200, y=60) 
    Label(ventana_informes, text="% MUJERES", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=350, y=60) 
    Label(ventana_informes, text="MUJERES", anchor="center", width=10, background="dark gray",fg="blue" ,font=fontEstiloEntry).place(x=520, y=60) 

    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=32, y=80)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=202, y=80)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=362, y=80)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=532, y=80)

    #LÍNEA 3
    Label(ventana_informes, text="% HOMBRE", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=30, y=110) 
    Label(ventana_informes, text="% HOMBRE", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=200, y=110) 
    Label(ventana_informes, text="% HOMBRE", anchor="center", width=10, background="dark gray" ,font=fontEstiloEntry).place(x=350, y=110) 
    Label(ventana_informes, text="HOMBRES", anchor="center", width=10, background="dark gray",fg="blue" ,font=fontEstiloEntry).place(x=520, y=110) 

    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=32, y=130)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=202, y=130)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=362, y=130)
    Entry(ventana_informes, justify="center", width=18, font=fontEstiloEntry).place(x=532, y=130)

    ventana_informes.mainloop()