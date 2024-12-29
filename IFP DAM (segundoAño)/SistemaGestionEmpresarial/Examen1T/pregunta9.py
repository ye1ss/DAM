# Ordena los datos de la siguiente lista, y quita duplicados de la misma ZARCO, VISITACION, ANDRES, LUIS, ZARCO, LUIS, ALBERTO, ANA, ANDRES, MARCO, ANACHETO, MARCO, ANDREA.
# Genera una función que diga, cuantos nombres se repetian y cuantas veces cada uno.

from collections import Counter

def contar_nombres_repetidos(lista):
    # Ordenar la lista y eliminar duplicados
    lista_ordenada_sin_duplicados = sorted(set(lista))

    # Contar la frecuencia de cada nombre
    frecuencia_nombres = Counter(lista)

    # Filtrar los nombres que se repiten y mostrar cuántas veces
    nombres_repetidos = {nombre: frecuencia_nombres[nombre] for nombre in lista_ordenada_sin_duplicados if frecuencia_nombres[nombre] > 1}

    return nombres_repetidos

# Lista de nombres
nombres = [
    "ZARCO", "VISITACION", "ANDRES", "LUIS", "ZARCO", "LUIS", "ALBERTO",
    "ANA", "ANDRES", "MARCO", "ANACHETO", "MARCO", "ANDREA"
]

# Obtener la cantidad de nombres repetidos y sus repeticiones
nombres_repetidos = contar_nombres_repetidos(nombres)

# Mostrar resultados
print("Cantidad de nombres repetidos y sus repeticiones:")
for nombre, repeticiones in nombres_repetidos.items():
    print(f"{nombre}: {repeticiones} veces")

