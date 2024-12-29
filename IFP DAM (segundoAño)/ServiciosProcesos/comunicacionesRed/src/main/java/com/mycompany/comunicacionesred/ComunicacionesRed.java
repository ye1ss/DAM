/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.comunicacionesred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Alumno
 */
public class ComunicacionesRed {

    public static void main(String[] args){
        URL url = null;
        URLConnection conexion = null;
        try {
            url = new URL("http://localhost/estoSeMeteEnElXampp/script.php");
            conexion = url.openConnection();
            conexion.setDoOutput(true);
            String cadena = "nombre=Ana&apellidos=Levi Alba";
            //Escribe en la URL -Stream de salida
            PrintWriter output = new PrintWriter(conexion.getOutputStream());
            output.write(cadena);
            output.close();
            //Lee de la URL- Stream de entrada
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));;
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
