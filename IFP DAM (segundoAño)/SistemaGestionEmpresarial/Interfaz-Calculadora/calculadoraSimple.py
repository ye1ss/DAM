from tkinter import*

def sumar():
    resultado= res.set(float(num1.get())+ float(num2.get()))
    
def restar():
    resultado= res.set(float(num1.get())- float(num2.get()))
    
def multiplicar():
    resultado= res.set(float(num1.get())* float(num2.get()))
    
def dividir():
    resultado= res.set(float(num1.get())/ float(num2.get()))
    
def borrar():
    num1.set("")
    num2.set("")
    resultado= res.set("")
    
pantalla= Tk()
pantalla.title("Calculadora Simple")
pantalla.resizable(0,0) #que se pueda agrandar o no
pantalla.geometry("380x300") #tamaño de la pantalla
pantalla.iconbitmap("calculadora.ico") #creamos un icono 
pantalla.config(background="dark gray") #cambiar color al fondo de pantalla

#variables
num1=StringVar
num2=StringVar
resultado= res= StringVar

Label(pantalla, text="Primer número", anchor="center").grid(row=0, column=2, padx=10, pady=10, sticky=E+W)
Entry(pantalla, justify="center", width=15, textvariable= num1).grid(row=1, column=2, padx=10, pady=10, sticky=E+W)

Label(pantalla, text="Segundo número", anchor="center").grid(row=2, column=2, padx=10, pady=10, sticky=E+W)
Entry(pantalla, justify="center", width=15, textvariable= num2).grid(row=3, column=2, padx=10, pady=10, sticky=E+W)


Button(pantalla, text="Suma", command=sumar).grid(row=4, column=0, padx=10, pady=10, sticky=E+W)
Button(pantalla, text="Resta", command=restar).grid(row=4, column=1, padx=10, pady=10, sticky=E+W)  
Button(pantalla, text="Multiplicación", command=multiplicar).grid(row=4, column=2, padx=10, pady=10, sticky=E+W)  
Button(pantalla, text="División", command=dividir).grid(row=4, column=3, padx=10, pady=10, sticky=E+W)
Button(pantalla, text="Borrar", command=borrar).grid(row=4, column=4, padx=10, pady=10, sticky=E+W)

Label(pantalla, text="Reusltado", anchor="center").grid(row=5, column=2, padx=10, pady=10, sticky=E+W)
Entry(pantalla, justify="center", width=15, foreground="green", textvariable=resultado, state="disabled").grid(row=6, column=2, padx=10, pady=10, sticky=E+W)  


pantalla.mainloop()