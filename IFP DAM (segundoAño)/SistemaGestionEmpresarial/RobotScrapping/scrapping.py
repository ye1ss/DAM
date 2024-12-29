import requests
from bs4 import BeautifulSoup
import sqlite3
from datetime import datetime

# Lista de URLs a recorrer
urls = [
    "https://www.pokemon.com/es",
    "https://www.1001juegos.com/categoria/io",
    
]

#obtener el contenido de la página web
def obtener_contenido(url):
    try:
        response = requests.get(url)
        if response.status_code == 200:
            return response.content
        else:
            print(f"No se pudo obtener contenido de {url}. Estado de respuesta: {response.status_code}")
            return None
    except Exception as e:
        print(f"Error al obtener contenido de {url}: {str(e)}")
        return None

#extraer los elementos de la web
def extraer_elementos(contenido):
    if contenido is None:
        return []
    soup = BeautifulSoup(contenido, "html.parser")
    elementos = []
    for etiqueta in ["h1", "h2", "h3", "a", "p"]:
        for elemento in soup.find_all(etiqueta):
            elementos.append((etiqueta, elemento.text.strip()))
    return elementos

#guardar los elementos en la base de datos
def guardar_elementos(url, elementos):
    try:
        conn = sqlite3.connect("datos.db")
        cursor = conn.cursor()
        fecha = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        for etiqueta, contenido in elementos:
            cursor.execute("INSERT INTO elementos (url, etiqueta, contenido, fecha) VALUES (?, ?, ?, ?)",
                           (url, etiqueta, contenido, fecha))
        conn.commit()
        conn.close()
        print(f"Elementos de {url} guardados en la bdd")
    except Exception as e:
        print(f"Error al guardar en la bdd: {str(e)}")

# Crear tabla en SQLite si no existe
def crear_tabla():
    try:
        conn = sqlite3.connect("datos.db")
        cursor = conn.cursor()
        cursor.execute('''CREATE TABLE IF NOT EXISTS elementos
                          (id INTEGER PRIMARY KEY AUTOINCREMENT,
                          url TEXT,
                          etiqueta TEXT,
                          contenido TEXT,
                          fecha TEXT)''')
        conn.commit()
        conn.close()
    except Exception as e:
        print(f"Error al crear la tabla en la base de datos: {str(e)}")

def main():
    crear_tabla()
    for url in urls:
        contenido = obtener_contenido(url)
        elementos = extraer_elementos(contenido)
        guardar_elementos(url, elementos)

if __name__ == "__main__":
    main()
