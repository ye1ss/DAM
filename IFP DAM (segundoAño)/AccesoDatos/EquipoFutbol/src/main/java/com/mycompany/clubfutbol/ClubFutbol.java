/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubfutbol;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ClubFutbol {

    public static void main(String[] args) throws IOException {
        /*
        Crear un Array-Vector con 5 equipos de la LFP Primera División a elegir y un vector con las cinco posiciones para hacer recorrido del vector 
        Escribir en un fichero de texto texto.txt los 5 equipos de la LFP Primera División elegidos
        Leer del fichero de texto creado con los 5 equipos de la LFP los nombres de los equipos de futbol del fichero de texto texto.txt
        Mostrar por pantalla estos 5 equipos de futbol de la LFP 
        */
        Scanner sc= new Scanner(System.in);
        //Creamos el array
        String equipos[]={"RealMadrid","BarcelonaFC","ManchesterCity","PSG","Betis"};
        //Creamos el archivo
        File archivo= new File("EquiposFutbol.txt");
        archivo.createNewFile();
        //Creamos el objeto FileWriter para escribir en el archivo
        FileWriter escribir= new FileWriter(archivo);
        for(String datos: equipos){
            escribir.write(datos + "\n");
        }
//        escribir.write("RealMadrid\nBarcelonaFC\nManchesterCity\nPSG\nBetis\n");
        escribir.flush();
        escribir.close();
        //Con esto estoy leeyendo el archivo que he creado
        FileReader fr= new FileReader(archivo);
        char[] a= new char[100];
        fr.read(a);
        
        //Bucle para que leea todo el fichero
        for(char c : a)
            System.out.print(c);
        fr.close();
    }
}
