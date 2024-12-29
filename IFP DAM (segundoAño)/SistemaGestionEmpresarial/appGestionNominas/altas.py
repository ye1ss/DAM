from tkinter import *

def ventanaAltas():

    import sqlite3 #IMPORTANTE LUEGO METER ESTO DENTRO DEL DEF
    import re
    from tkinter import Text

    ventana_altas= Tk()
    ventana_altas.title("ALTAS")
    ventana_altas.geometry("880x400")
    ventana_altas.resizable(0,0)
    #ventana_altas.iconbitmap("icono.ico")
    ventana_altas.config(background="dark gray") 
    ##################################################################################################################

    #VALIDACIONES DE DATOS
    def validar_apellidoNombre(nombre):
        return re.match("[A-Za-z]+", nombre)

    def validar_fecha(fecha):
        return re.match("[0-9/]{10}", fecha)

    def validar_nacimiento(nacimiento):
        return re.match("[0-9/]{10}", nacimiento)

    def validar_direccion(direccion):
        return re.match("[A-Za-z]+[ 0-9]*", direccion)

    def validar_nif(nif):
        return re.match("[[0-9]{8}[A-Za-z]", nif)

    def validar_datosBancarios(datosBancarios):
        return re.match("[A-Za-z]{2}[[0-9]{22}", datosBancarios)

    def validar_numeroAfiliacionSs(numeroAfiliacionSs):
        return re.match("[0-9]{9}", numeroAfiliacionSs) 

    def validar_genero(genero):
        return re.match("[A-Za-z]+", genero)
    def validar_departamento(departamento):
        return re.match("[A-Za-z]+", departamento)

    def validar_puesto(puesto):
        return re.match("[A-Za-z]+", puesto)

    def validar_telefono(telefono):
        return re.match("[0-9]{9}", telefono)

    def validar_salarioMensual(salarioMensual):
        return re.match("[0-9]", salarioMensual)

    def validar_irpf(irpf): #NAF
        return re.match("[0-9]{1,2}[.,][0-9]{1,2}", irpf)

    #def pedir_naf():
    #        naf= input(altaIrpf)
    #        return naf

    #def validarEntrada(naf):
    #    if len(naf) != 12:
    #        return False
    #    if not naf.isdigit():  #Verifica que naf contiene solo dígitos
    #        return False
    #    return True
        
    #def separarPartes(naf):
    #    if validarEntrada(naf):
    #        a= naf[:2]
    #        b= naf[2:10]
    #        c= naf[10:]

    #        print(f"A = {a}")
    #        print(f"B = {b}")
    #        print(f"C = {c}")

    #        if int(b) <10000000:
    #            codigo_control = (int(b) +int(a) *10000000) % 97
    #        else:
    #            codigo_control = (int(a) *10000000 +int(b)) % 97

    #           print(f"Código de control: {codigo_control}")
    #    else:
    #        print("Entrada no válida")

    #    pedir_naf()
    #    separarPartes(naf)

    def validar_email(email):
        return re.match("\w+([@.-]?\w+)*", email)

    def validar_pagaExtra(pagaExtra):
        return re.match("[0-9]", pagaExtra)

    def validar_segSocial(segSocial):
        return re.match("[0-9.;%]+", segSocial)
        
    ###################################################################################################################
    error=False

    #GUARDADO DE DATOS EN LA BASE DE DATOS
    def guardarDatos():
        conexion= sqlite3.connect("gestionDatos.db")
        validaciones.delete("1.0", "end") #no se porque pero se pone desde el 1.0
        cursor= conexion.cursor()
        
        if validar_apellidoNombre(altaApellidoNombre.get()):
            print("Nombre introducido correctamenete")
        else:
            error = True
            validaciones.insert("end", "El nombre es incorrecto introduce solo letras\n")   
        
        if validar_fecha(altaFechaInicio.get()):
            print("Fecha inicio introducida correctamente")
        else:
            error = True
            validaciones.insert("end", "Fecha inicio introducida incorrectamente, este es el patrón:(00/00/0000)\n")
        
        if validar_nacimiento(altaFechaNacimiento.get()):
            print("Fecha de nacimiento introducida correctamente")
        else:
            validaciones.insert("end", "Fecha nacimiento introducida incorrectamente, este es el patrón:(00/00/0000)\n")
            
        dir = altaDireccion.get()
        if validar_direccion(dir):
            print("Dirección introducida correcamente")
        else:
            error = True
            validaciones.insert("end", "La direccion introducida es incorrecta por que se han incluido carácteres especiales\n")
        
        if validar_nif(altaNif.get()):
            print("Nif introducido correcamente")
        else:
            error = True
            validaciones.insert("end", "El nif introcucido no es correcto, el nif consta de 8 números y una letra\n")
        
        if validar_datosBancarios(altaDatosBancarios.get()):
            print("Datos bancarios introducidos correcamente")
        else:
            error = True
            validaciones.insert("end", "Los datos bancarios intoducidos son incorrectos, los datos bancarios constan de 2 letras y 22 números\n")
        
        if validar_numeroAfiliacionSs(altaNumeroAfiliacionSs.get()):
            print("Número introducido correcamente")
        else:
            error = True
            validaciones.insert("end", "Número introducido incorrecto, introduce 9 numeros sin carácteres especiales\n")
        
        if validar_genero(altaGenero.get()):
            print("El genero introducido correcamente")
        else:
            error = True
            validaciones.insert("end", "Género incorrecto introduce: (Hombre o Mujer)\n")
            
        if validar_departamento(altaDepartamento.get()):
            print("Departamento introducido correcamente")
        else:
            error = True
            validaciones.insert("end", "Departamento incorrecto, introduce solo letras\n")
        
        if validar_puesto(altaPuesto.get()):
            print("Puesto introducido correctamente")
        else:
            error = True
            validaciones.insert("end", "Puesto introducido incorrecto, introduce solo letras\n")    
        
        if validar_telefono(altaTelefono.get()):
            print("Número introducido correcamente")
        else:
            error = True
            validaciones.insert("end", "Número introducido incorrectamente , introduce 9 digitos\n")
            
        if validar_salarioMensual(altaSalarioMensual.get()):
            print("Salario mensual introducido correctamente")
        else:
            error= True
            validaciones.insert("end", "Salario mensual introducido incorrecto introduce solo números")
        
        if validar_irpf(altaIrpf.get().replace(",", ".")):
            print("Irpf introducido corretamente")
        else:
            error = True
            validaciones.insert("end", "Irpf introducido incorrecto\n")
        
        if validar_email(altaEmail.get()):
            print("Email introducido correctamente")
        else:
            error= True
            validaciones.insert("end", "Email introducido incorrectamente\n")
        
        if validar_pagaExtra(altaPagaExtra.get()):
            print("Paga extra introducida correctamente")
        else:
            error==True
            validaciones.insert("end", "Paga extra introducida incorrecta\n")
            
        if validar_segSocial(altaSegSocial.get()):
            print("Seguridad social introducida correctamente")
        else:
            error= True
            validaciones.inset("end", "Seguridad social introducida incorrectamente\n")
        
        #creamos la tabla
        cursor.execute('''CREATE TABLE IF NOT EXISTS altas(
            altaCodigo INTEGER PRIMARY KEY AUTOINCREMENT,
            altaApellidoNombre VARCHAR(50),
            altaFechaInicio DATE,
            altaFechaNacimiento DATE,
            altaDireccion VARCHAR (100), 
            altaNif VARCHAR (9),
            altaDatosBancarios VARCHAR (24),
            altaNumeroAfiliacionSs VARCHAR (30),
            altaGenero VARCHAR (10),
            altaDepartamento VARCHAR (30),
            altaPuesto VARCHAR (30),
            altaTelefono INTEGER (9),
            altaSalarioMensual INTEGER (27),
            altaIrpf FLOAT,
            altaEmail VARCHAR (50),
            altaPagaExtra FLOAT,
            altaSegSocial FLOAT (20)
            )''')
        
        conexion.commit()
        # for cursorp in cursor:
        #     print(cursorp) 
        
        getCodigo=codigo.get() #esto meterlo en el value
        getApellidoNombre=altaApellidoNombre.get()
        getFechaInicio=altaFechaInicio.get()
        getFechaNacimiento=altaFechaNacimiento.get()
        getDireccion=altaDireccion.get()
        getNif=altaNif.get()
        getDatosBancarios=altaDatosBancarios.get()
        getNumeroAfiliacionSs=altaNumeroAfiliacionSs.get()
        getGenero=altaGenero.get()
        getDepartamento=altaDepartamento.get()
        getPuesto=altaPuesto.get()
        getTelefono=altaTelefono.get()
        getSalarioMensual=altaSalarioMensual.get()
        getIrpf=altaIrpf.get()
        getEmail=altaEmail.get()
        getPagaExtra=altaPagaExtra.get()
        getSegSocial=altaSegSocial.get()
    
    # Realizar la inserción en la base de datos
        query = '''INSERT INTO altas (
            altaApellidoNombre, altaFechaInicio, altaFechaNacimiento, altaDireccion, altaNif, altaDatosBancarios, 
            altaNumeroAfiliacionSs, altaGenero, altaDepartamento, altaPuesto, altaTelefono, altaSalarioMensual, 
            altaIrpf, altaEmail, altaPagaExtra, altaSegSocial
            ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)'''

    # Los valores deben pasarse como una tupla en el segundo argumento de execute()
        valores = (
        getApellidoNombre, getFechaInicio, getFechaNacimiento, getDireccion, getNif, getDatosBancarios,
        getNumeroAfiliacionSs, getGenero, getDepartamento, getPuesto, getTelefono, getSalarioMensual,
        getIrpf, getEmail, getPagaExtra, getSegSocial
        )
            
        print(query, "ES ESTA")
        cursor = conexion.cursor()
        cursor.execute(query, valores)

        # Guardamos los cambios
        conexion.commit()
        tablas = cursor.fetchall()
        for tabla in tablas:
            print(tabla[0])

        conexion.close() # Cerrar la conexión después de usarla
        
    fontEstilo=("Arial", 10, "bold")
    fontEstiloBtn=("Arial", 20)

    #LÍNEA 1
    codigo= StringVar()
    apellidoNombre= StringVar()

    Label(ventana_altas, text="CÓDIGO", anchor="center", width=6, background="dark gray" ,font=fontEstilo).place(x=50, y=10)
    Label(ventana_altas, text="APELLIDOS Y NOMBRE", anchor="center", width=25, background="dark gray" ,font=fontEstilo).place(x=400, y=10)

    altaCodigo=Entry(ventana_altas, justify="center", width=8, font=fontEstilo,textvariable=codigo, state= "disabled").place(x=48, y=30)
    altaApellidoNombre=Entry(ventana_altas, justify="center", width=98, font=fontEstilo, textvariable=apellidoNombre)
    altaApellidoNombre.place(x=150, y=30)
    altaApellidoNombre.get()

    #LÍNEA 2
    fechaInicio= StringVar()
    fechaFin= StringVar()
    direccion=StringVar()

    Label(ventana_altas, text="FECHA INICIO", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=50, y=60) 
    Label(ventana_altas, text="FECHA NACIMIENTO", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=170, y=60)
    Label(ventana_altas, text="DIRECCIÓN", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=520, y=60)

    altaFechaInicio=Entry(ventana_altas, justify="center", width=15, font=fontEstilo, textvariable=fechaInicio)
    altaFechaInicio.place(x=48, y=80)
    altaFechaInicio.get()
    altaFechaNacimiento=Entry(ventana_altas, justify="center", width=15, font=fontEstilo, textvariable=fechaFin)
    altaFechaNacimiento.place(x=180, y=80)
    altaFechaNacimiento.get()
    altaDireccion=Entry(ventana_altas, justify="center", width=75, font=fontEstilo, textvariable=direccion)
    altaDireccion.place(x=310, y=80)
    altaDireccion.get()
        
    #LÍNEA 3
    nif= StringVar()
    datosBancarios= StringVar()
    numeroAfiliacionSs= StringVar()

    Label(ventana_altas, text="NIF", anchor="center", width=4, background="dark gray" ,font=fontEstilo).place(x=80, y=110) 
    Label(ventana_altas, text="DATOS BANCARIOS", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=280, y=110) 
    Label(ventana_altas, text="NUMERO AFILIACIÓN DE SS", anchor="center", width=25, background="dark gray" ,font=fontEstilo).place(x=570, y=110) 

    altaNif=Entry(ventana_altas, justify="center", width=15, font=fontEstilo, textvariable=nif)
    altaNif.place(x=48, y=130)
    altaNif.get()
    altaDatosBancarios=Entry(ventana_altas, justify="center", width=46, font=fontEstilo, textvariable=datosBancarios)
    altaDatosBancarios.place(x=180, y=130)
    altaDatosBancarios.get()
    altaNumeroAfiliacionSs=Entry(ventana_altas, justify="center", width=44, font=fontEstilo, textvariable=numeroAfiliacionSs)
    altaNumeroAfiliacionSs.place(x=525, y=130)
    altaNumeroAfiliacionSs.get()

    #LÍNEA 4
    genero= StringVar()
    departamento= StringVar()
    puesto= StringVar()

    Label(ventana_altas, text="GÉNERO", anchor="center", width=6, background="dark gray" ,font=fontEstilo).place(x=80, y=160) 
    Label(ventana_altas, text="DEPARTAMENTO", anchor="center", width=16, background="dark gray" ,font=fontEstilo).place(x=280, y=160) 
    Label(ventana_altas, text="PUESTO", anchor="center", width=25, background="dark gray" ,font=fontEstilo).place(x=590, y=160) 

    altaGenero=Entry(ventana_altas, justify="center", width=15, font=fontEstilo, textvariable=genero)
    altaGenero.place(x=48, y=180)
    altaGenero.get()
    altaDepartamento=Entry(ventana_altas, justify="center", width=46, font=fontEstilo, textvariable=departamento)
    altaDepartamento.place(x=180, y=180)
    altaDepartamento.get()
    altaPuesto=Entry(ventana_altas, justify="center", width=44, font=fontEstilo, textvariable=puesto)
    altaPuesto.place(x=525, y=180)
    altaPuesto.get()

    #LÍNEA 5
    telefono= StringVar()

    Label(ventana_altas, text="TELÉFONO", anchor="center", width=8, background="dark gray" ,font=fontEstilo).place(x=45, y=230) 
    altaTelefono=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=telefono)
    altaTelefono.place(x=120, y=230)
    altaTelefono.get()

    salarioMensual= StringVar()

    Label(ventana_altas, text="SALARIO MENSUAL", anchor="center", width=15, background="dark gray" ,font=fontEstilo).place(x=295, y=230) 
    altaSalarioMensual=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=salarioMensual)
    altaSalarioMensual.place(x=430, y=230)
    altaSalarioMensual.get()

    irpf= StringVar()

    Label(ventana_altas, text="IRPF", anchor="center", width=5, background="dark gray" ,font=fontEstilo).place(x=610, y=230) 
    altaIrpf=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=irpf)
    altaIrpf.place(x=692, y=230)
    altaIrpf.get()

    #LÍNEA 6

    email= StringVar()

    Label(ventana_altas, text="EMAIL", anchor="center", width=8, background="dark gray" ,font=fontEstilo).place(x=45, y=260) 
    altaEmail=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=email)
    altaEmail.place(x=120, y=260)
    altaEmail.get()

    pagaExtra= StringVar()

    Label(ventana_altas, text="PAGA EXTRA", anchor="center", width=15, background="dark gray" ,font=fontEstilo).place(x=295, y=260) 
    altaPagaExtra=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=pagaExtra)
    altaPagaExtra.place(x=430, y=260)
    altaPagaExtra.get()

    segSocial= StringVar()

    Label(ventana_altas, text="SEG. SOCIAL", anchor="center", width=12, background="dark gray" ,font=fontEstilo).place(x=590, y=260) 
    altaSegSocial=Entry(ventana_altas, justify="center", width=20, font=fontEstilo, textvariable=segSocial)
    altaSegSocial.place(x=692, y=260)
    altaSegSocial.get()

    #MENSAJE VALIDACIÓN
    validaciones= Text(ventana_altas, background="dark gray", fg="red", font=fontEstilo, width=70, height=5)
    validaciones.place(x=50, y=300)

    #BOTON INSERTAR
    Button(ventana_altas, text="INSERTAR", anchor="center", width=14, background="light yellow", font=fontEstiloBtn, command=guardarDatos).place(x=588, y=300)
        
    ventana_altas.mainloop()