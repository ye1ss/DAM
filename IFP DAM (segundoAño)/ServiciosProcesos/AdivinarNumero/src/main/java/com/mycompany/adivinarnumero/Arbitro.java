/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adivinarnumero;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Yeismil P
 */
class Arbitro {
    private int numeroAdivinar;
    private int turno;
    private boolean resultado;
    private int numeroJugadores;
    private Set<Integer> numerosIntentados;

    public Arbitro(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
        this.turno = 1;
        this.numeroAdivinar = new Random().nextInt(20) + 1; // Número aleatorio entre 1 y 20
        this.resultado = false;
        this.numerosIntentados = new HashSet<>();// esto es para que coja los números ya intentados
    }
    
    public synchronized int getTurno() {
        return turno;
    }

    public synchronized boolean juegoTerminado() {
        return resultado;
    }

    public synchronized void comprobarJugada(int jugadorID, int numeroJugado) {
        if (resultado) {
            System.out.println("El juego ha terminado. Jugador " + jugadorID + " está fuera.");
            return;
        }
        //Para cuando se juege un número que ya se ha intentado
        if (numerosIntentados.contains(numeroJugado)) {
            System.out.println("Jugador " + jugadorID + " ya se intentó con ese numero (" + numeroJugado + "), prueba con uno diferente.");
            return;
        }

        numerosIntentados.add(numeroJugado);
        //Cuando coincide el numero jugado con el adivinado gana el juego
        if (numeroJugado == numeroAdivinar) {
            System.out.println("Jugador " + jugadorID + " ha adivinado el número!! El número a adivinar es el " + numeroAdivinar + " y lo acertó.");
            resultado = true;
            return;
        }

        System.out.println("Jugador " + jugadorID + " intentó con el número " + numeroJugado);

        turno = (turno % numeroJugadores) + 1;
        System.out.println("Siguiente turno: Le toca a Jugador " + turno);
    }
}
