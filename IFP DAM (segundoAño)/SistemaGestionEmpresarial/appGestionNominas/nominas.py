from tkinter import*

def ventanaNominas():
    ventana_nominas= Tk()
    ventana_nominas.title("NÓMINAS")
    ventana_nominas.geometry("880x460")
    ventana_nominas.resizable(0,0)
    ventana_nominas.config(background="dark gray")

    fontEstilo=("Arial", 10, "bold")
    fontEstiloBtn=("Arial", 20)

    #LÍNEA 1
    Label(ventana_nominas, text="CÓDIGO", anchor="center", width=6, background="dark gray" ,font=fontEstilo).place(x=50, y=10) 
    Label(ventana_nominas, text="APELLIDOS Y NOMBRE", anchor="center", width=25, background="dark gray" ,font=fontEstilo).place(x=400, y=10)

    Entry(ventana_nominas, justify="center", width=8, font=fontEstilo).place(x=48, y=30)
    Entry(ventana_nominas, justify="center", width=98, font=fontEstilo).place(x=150, y=30)

    #LÍNEA 2
    Label(ventana_nominas, text="FECHA INICIO", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=50, y=60) 
    Label(ventana_nominas, text="FECHA FIN", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=180, y=60)
    Label(ventana_nominas, text="DIRECCIÓN", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=520, y=60)

    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=48, y=80)
    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=180, y=80)
    Entry(ventana_nominas, justify="center", width=75, font=fontEstilo).place(x=310, y=80)

    #LÍNEA 3
    Label(ventana_nominas, text="NIF", anchor="center", width=4, background="dark gray" ,font=fontEstilo).place(x=80, y=110) 
    Label(ventana_nominas, text="DATOS BANCARIOS", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=280, y=110) 
    Label(ventana_nominas, text="NUMERO AFILIACIÓN DE SS", anchor="center", width=25, background="dark gray" ,font=fontEstilo).place(x=570, y=110) 

    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=48, y=130)
    Entry(ventana_nominas, justify="center", width=46, font=fontEstilo).place(x=180, y=130)
    Entry(ventana_nominas, justify="center", width=44, font=fontEstilo).place(x=525, y=130)

    #LÍNEA 4
    Label(ventana_nominas, text="SALARIO BRUTO", anchor="center", width=14, background="dark gray" ,font=fontEstilo).place(x=40, y=170)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=160, y=170)

    Label(ventana_nominas, text="NÚMERO PAGAS", anchor="center", width=14, background="dark gray" ,font=fontEstilo).place(x=380, y=170)
    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=500, y=170)

    #LÍNEA 5
    Label(ventana_nominas, text="SALARIO MES", anchor="center", width=14, background="dark gray" ,font=fontEstilo).place(x=30, y=220)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=160, y=220)

    Label(ventana_nominas, text="% IRPF", anchor="center", width=8, background="dark gray" ,font=fontEstilo).place(x=320, y=220)
    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=410, y=220)

    Label(ventana_nominas, text="RETENCIÓN IRPF", anchor="center", width=14, background="dark gray" ,font=fontEstilo).place(x=550, y=220)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=680, y=220)

    #LÍNEA 6
    Label(ventana_nominas, text="PRORRATA PAGAS", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=30, y=260)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=160, y=260)

    Label(ventana_nominas, text="SEG. SOCIAL", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=310, y=260)
    Entry(ventana_nominas, justify="center", width=15, font=fontEstilo).place(x=410, y=260)

    Label(ventana_nominas, text="DEDUCCIÓN SS", anchor="center", width=14, background="dark gray" ,font=fontEstilo).place(x=550, y=260)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=680, y=260)

    #MENSAJES DE VALIDACIÓN Y LÍNEA 7
    #Text(ventana_nominas, Text="MENSAJES VALIDACIÓN", justify="center", background="dark gray", width=70, height=20, fg="red", font=fontEstilo).place(x=50, y=300)

    Label(ventana_nominas, text="A PERCIBIR", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=550, y=300)
    Entry(ventana_nominas, justify="center", width=20, font=fontEstilo).place(x=680, y=300)

    #BOTONES
    Button(ventana_nominas, text="CARGAR EMPLEADO", anchor="center", width=18, background="light yellow", font=fontEstiloBtn).place(x=50, y=360)

    Button(ventana_nominas, text="CALCULAR", anchor="center", width=9, background="light yellow", font=fontEstiloBtn).place(x=400, y=360)

    Button(ventana_nominas, text="IMPRIMIR", anchor="center", width=9, background="light yellow", font=fontEstiloBtn).place(x=600, y=360)
    
    #escribirlo en txt

    ventana_nominas.mainloop()