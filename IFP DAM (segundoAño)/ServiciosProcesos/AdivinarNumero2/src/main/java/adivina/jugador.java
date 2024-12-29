/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivina;

import adivina.servidor.Datos;

import java.net.Socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author Garbine OK ppt 43 Ejemplo de uso de la clase Socket, se conecta al
 * servidor del EjemploServidort Ejecutar a la vez que el servidor
 * ServidorAdivina Puertos TCP de 0 a 65535
 */
public class jugador {

    public static boolean validarCadena(String cadena) {
        boolean valor = false;
        try {
            Integer.parseInt(cadena);
            valor = true;
        } catch (NumberFormatException e) {
        }
        return valor;
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String host = "localhost";
        int puerto = 6001;
        System.out.println("Iniciando programa cliente ");
        Socket cliente = new Socket(host, puerto);
        ObjectOutputStream fSalida = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream fEntrada = new ObjectInputStream(cliente.getInputStream());
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        Datos datos = (Datos) fEntrada.readObject();
        int identificador = datos.getIdentificador();
        System.out.println("El jugador: " + identificador);
        System.out.println(datos.getCadena());
        cadena = "";
        if (!datos.isJuega()) {
            cadena = "*";
        }
        while (datos.isJuega() && !cadena.trim().equals("*")) {
            System.out.println("Intento: " + (datos.getIntentos() + 1) + " - introduce un nÃºmero: ");
            cadena = sc.nextLine();
            Datos d = new Datos();
            if (!validarCadena(cadena)) {
                continue;
            }
            d.setCadena(cadena);
            fSalida.reset();
            fSalida.writeObject(d);
            datos = (Datos) fEntrada.readObject();
            System.out.println("\t" + datos.getCadena());
            if (datos.getIntentos() >= 5) {
                System.out.println("\t Juego finalizado.");
                cadena = "*";
            }
            if (datos.isGana()) {
                System.out.println("Enhorabuena Â¡HAS GANADO!\n El juego ha terminado");
                cadena = "*";
            } else if (!datos.isJuega()) {
                System.out.println("El juego ha terminado.");
                cadena = "*";
            }
        }
        fSalida.close();
        fEntrada.close();
        System.out.println("Â¡AdiÃ³s!");
        sc.close();
        cliente.close();
    }
}

