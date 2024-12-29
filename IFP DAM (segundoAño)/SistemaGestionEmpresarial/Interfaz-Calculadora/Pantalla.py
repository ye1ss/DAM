from tkinter import*

def navegar():
    pantalla2= Toplevel()
    pantalla2.title("SEGUNDA PANTALLA") #le ponemos nombre a lapantalla
    pantalla2.resizable(0,0) #que se pueda agrandar o no
    pantalla2.geometry("300x300")
    pantalla2.title("Pantalla destino")
    Label(pantalla2, text="Holaaa", width=15, anchor="center", background="lightblue", foreground="red").grid(row=0, column=0, padx=10, pady=10)
    
    pantalla2.mainloop()

pantalla= Tk()
pantalla.title("INTERFAZ") #le ponemos nombre a lapantalla
pantalla.resizable(0,0) #que se pueda agrandar o no
pantalla.geometry("600x600") #tamaño de la pantalla
pantalla.iconbitmap("gengar.ico") #creamos un icono 
pantalla.config(background="dark gray") #cambiar color al fondo de pantalla

Label(pantalla, text="Nombre: ", width=15, anchor="center", background="lightblue", foreground="red").grid(row=0, column=0, padx=10, pady=10)
#con el row y column es como se mueve por si quiero q el label este en el medio y eso 
Entry(pantalla, justify="center", width=30, foreground="green", font="arial").grid(row=0, column=1, padx=10, pady=10)

Label(pantalla, text="Apellido: ", width=15, anchor="center", background="lightblue", foreground="red").grid(row=1, column=0, padx=10, pady=10)
Entry(pantalla, justify="center", width=30, foreground="green", font="arial").grid(row=1, column=1, padx=10, pady=10)

Button(pantalla, text="Pantalla Atlas", command=navegar).grid(row=2, column=0, padx=10, pady=10, sticky=E+W)  
Button(pantalla, text="Cerrar", height=5, command=pantalla.destroy).grid(row=3, column=0, padx=10, pady=10, sticky=E+W) #con el stiky hago que el boton se ajuste a su columna 
#columnspan=2 esto se pone donde el grid y hago que ocupe todas las columnas que haya 

pantalla.mainloop()