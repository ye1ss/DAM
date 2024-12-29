/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarnumero;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Yeismil P
 */
public class AdivinarNumero {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numeroJugadores;
        System.out.println("Vamos a jugar a Adivinar un número.");
        System.out.println("¿Número de jugadores que participan?");
        numeroJugadores= sc.nextInt();
        
        Arbitro arbitro = new Arbitro(numeroJugadores); // Crea una instancia de Arbitro
        
        // Crear hilos de jugadores
        Jugador[] jugadores = new Jugador[numeroJugadores];

        for (int i = 1; i <= numeroJugadores; i++) {
            Jugador jugador = new Jugador(i, arbitro);
            jugadores[i - 1] = jugador;
            jugador.setName("Jugador " + i); // Asigna un nombre único al hilo
            jugador.start();
        }
        
    }
}
