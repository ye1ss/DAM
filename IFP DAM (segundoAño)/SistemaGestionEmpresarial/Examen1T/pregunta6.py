
#   Crea un objeto GUISOS, que recocoja el NOMBRE y las cantidades de ingredientes por parametro. Ingredientes SAL, ACEITE, PATATAS, PIMIENTOS, CALDO, AGUA, LENGUMBRES.
#   Cuando lo instanciemos nos mostrará (EL GUISO ESTÁ PREPARADO)
#   Cuando lo imprimamos, mostrará una tarjeta de ingredientes:
#   NOMBRE: COCIDO
#   SAL: ...   ACEITE:  ... 
#   PATATAS:  ...
#   PIMIENTOS: ...
#   CALDO:         AGUA:
#   LEGUMBRES: ...


class Guisos:
    def __init__(self, nombre, sal, aceite, patatas, pimientos, caldo, agua, legumbres):
        self.nombre = nombre
        self.sal = sal
        self.aceite = aceite
        self.patatas = patatas
        self.pimientos = pimientos
        self.caldo = caldo
        self.agua = agua
        self.legumbres = legumbres
        print("El guiso está preparado")

    def __str__(self):
        card = f"""
        NOMBRE: {self.nombre}
        SAL: {self.sal}   ACEITE: {self.aceite}
        PATATAS: {self.patatas}
        PIMIENTOS: {self.pimientos}
        CALDO: {self.caldo}   AGUA: {self.agua}
        LEGUMBRES: {self.legumbres}
        """
        return card


guiso_cocido = Guisos("COCIDO", "al gusto", "dos cucharadas", "500g", "tres", "1 litro", "2 litros", "300g")
print(guiso_cocido)