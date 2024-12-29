from tkinter import* #importar tkinter para hacer la interfaz
pantalla= Tk() #creamos la pantalla
pantalla.geometry("800x600") #ajustar como de grande es la pantalla
pantalla.wm_resizable(0,0) #si pongo 1,1 se puede mover o 0,1... 
pantalla.iconbitmap("fuego.ico")
Label(pantalla, text="Nombre: ").grid(row=1, column=0, sticky='w', padx=5, pady=5)
Entry(pantalla, width=40).grid(row=2, column=0, sticky='w', padx=5, pady=5)
Button(pantalla, text="Aceptar").grid(row=3, column=0)
Button(pantalla, text="Borrar").grid(row=3, column=1)

pantalla.mainloop() #esto es para que se ejecute la pantalla