/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentapalabras;

import java.io.BufferedReader;
<<<<<<< HEAD
import java.io.File;
=======
>>>>>>> 29d9c09086e8b5064c0b2afda8e9a30db9a8f1ac
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
=======

>>>>>>> 29d9c09086e8b5064c0b2afda8e9a30db9a8f1ac

/**
 *
 * @author Alumno
 */
public class CuentaPalabras {
<<<<<<< HEAD
    //para contar palabras usar metodo split de la clase string
    public static void main(String[] args) {
        // Lista de nombres de archivos a procesar
        List<String> nombresArchivos = new ArrayList<>();
        nombresArchivos.add("archivo1.txt");
        nombresArchivos.add("archivo2.txt");
        nombresArchivos.add("archivo3.txt");

        // Contador atómico para el número total de palabras en todos los archivos
        AtomicInteger totalPalabras = new AtomicInteger(0);

        // Crear un hilo para procesar cada archivo
        List<Thread> hilos = new ArrayList<>();
        for (String nombreArchivo : nombresArchivos) {
            Thread hilo = new Thread(new ProcesadorArchivo(nombreArchivo, totalPalabras));
            hilos.add(hilo);
            hilo.start();
        }

        // Esperar a que todos los hilos terminen su ejecución
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Mostrar el número total de palabras en todos los archivos
        System.out.println("Número total de palabras en todos los archivos: " + totalPalabras.get());
    }

    static class ProcesadorArchivo implements Runnable {
        private String nombreArchivo;
        private AtomicInteger totalPalabras;

        public ProcesadorArchivo(String nombreArchivo, AtomicInteger totalPalabras) {
            this.nombreArchivo = nombreArchivo;
            this.totalPalabras = totalPalabras;
=======
    
    static class ContadorPalabrasHilo extends Thread {
        private final String nombreArchivo;
        private int contadorPalabras;

        ContadorPalabrasHilo(String nombreArchivo) {
            this.nombreArchivo = nombreArchivo;
            this.contadorPalabras = 0;
>>>>>>> 29d9c09086e8b5064c0b2afda8e9a30db9a8f1ac
        }

        @Override
        public void run() {
<<<<<<< HEAD
            System.out.println("Procesando archivo: " + nombreArchivo);
            // Lógica de conteo de palabras del archivo
            File archivo = new File(nombreArchivo);

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    // Dividir la línea en palabras usando el espacio como separador
                    String[] palabras = linea.split("\\s+");
                    // Incrementar el contador de palabras
                    totalPalabras.addAndGet(palabras.length);
                }
                System.out.println("Archivo procesado: " + nombreArchivo);
                System.out.println("Número total de palabras en " + nombreArchivo + ": " + totalPalabras.get());
=======
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] palabras = linea.split("\\s+");
                    contadorPalabras += palabras.length;
                }
                System.out.println("Archivo " + nombreArchivo + ": " + contadorPalabras + " palabras");
>>>>>>> 29d9c09086e8b5064c0b2afda8e9a30db9a8f1ac
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
<<<<<<< HEAD
=======

        public int getContadorPalabras() {
            return contadorPalabras;
        }
>>>>>>> 29d9c09086e8b5064c0b2afda8e9a30db9a8f1ac
    }

    public static void main(String[] args) {
        List<String> nombresArchivos = new ArrayList<>();
        nombresArchivos.add("arch1.txt");
        nombresArchivos.add("arch2.txt");
        nombresArchivos.add("arch3.txt");

        List<ContadorPalabrasHilo> hilos = new ArrayList<>();

        // Iniciar un hilo para cada archivo
        for (String nombreArchivo : nombresArchivos) {
            ContadorPalabrasHilo hilo = new ContadorPalabrasHilo(nombreArchivo);
            hilos.add(hilo);
            hilo.start();
        }

        int totalPalabras = 0;

        // Esperar a que todos los hilos terminen y sumar el número total de palabras
        for (ContadorPalabrasHilo hilo : hilos) {
            try {
                hilo.join(); // Esperar a que el hilo termine
                totalPalabras += hilo.getContadorPalabras();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Mostrar el número total de palabras en todos los archivos
        System.out.println("Número total de palabras en todos los archivos: " + totalPalabras);
    }
}