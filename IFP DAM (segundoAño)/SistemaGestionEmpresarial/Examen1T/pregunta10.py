# Usando una función lambda y Filter, genera una lista que contenga los números positivos de: [100,-12,-56,15,25,-257,40,-75,-34,20,10,-5]

lista_numeros = [100, -12, -56, 15, 25, -257, 40, -75, -34, 20, 10, -5]
numerosP = list(filter(lambda x: x > 0, lista_numeros))
print(numerosP)