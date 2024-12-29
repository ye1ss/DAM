/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adivinarnumero;

import java.util.Random;

/**
 *
 * @author Yeismil P
 */
public class Jugador extends Thread{
    private int JugadorId;
    private Arbitro arbitro;
    
    public Jugador(int jugadorID, Arbitro arbitro) {
        this.JugadorId = jugadorID;
        this.arbitro = arbitro;
    }

    @Override
    public void run() {
        while (!arbitro.juegoTerminado()) {
            int miTurno = arbitro.getTurno();

            if (miTurno == JugadorId) {
                int numeroJugado = new Random().nextInt(20) + 1; // Número aleatorio entre 1 y 20
                System.out.println("Jugador " + JugadorId + " juega " + numeroJugado);
                arbitro.comprobarJugada(JugadorId, numeroJugado);
            }
        }
    }
}
