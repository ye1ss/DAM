from tkinter import*

import altas
import bajas
import informes
import nominas

ventana= Tk()
ventana.title("APLICACIÓN DE GESTIÓN DE NÓMINAS")
ventana.geometry("800x480")

ventana.resizable(0,0)
ventana.iconbitmap("icono.ico")
ventana.config(background="dark gray") 

imagen = PhotoImage(file="munchlax.png")
imagen = imagen.subsample(12)

def btnAltas():
    altas.ventanaAltas()
    
def btnBajas():
    bajas.ventanaBajas()

def btnInformes():
    informes.ventanaInformes()

def btnNominas():
    nominas.ventanaNominas()

fontEstilo=("Arial", 20, "bold")

Label(ventana, text="NOMINATOR +", anchor="center", width=20, background="dark gray", font=fontEstilo ).place(x=220, y=30) 
fondo=Label(ventana, image=imagen, background="dark gray").place(x=330, y=80)

Button(ventana, text="ALTAS", anchor="center", width=10, background="light yellow", font=fontEstilo, command=btnAltas).place(x=165, y=300)# y los botones de la derecha 240
Button(ventana, text="INFORMES", anchor="center", width=10, background="light yellow", font=fontEstilo, command=btnInformes).place(x=165, y=380)
Button(ventana, text="BAJAS", anchor="center", width=10, background="light yellow", font=fontEstilo, command=btnBajas).place(x=465, y=300)
Button(ventana, text="NÓMINAS", anchor="center", width=10, background="light yellow", font=fontEstilo, command=btnNominas).place(x=465, y=380)

ventana.mainloop()

