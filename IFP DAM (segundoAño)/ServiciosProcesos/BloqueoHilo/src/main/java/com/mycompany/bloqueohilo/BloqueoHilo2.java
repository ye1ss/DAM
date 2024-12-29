/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bloqueohilo;

/**
 *
 * @author Alumno
 */
public class BloqueoHilo2 {

    public static void main(String[] args) {
        ObjetoCompartido con = new ObjetoCompartido();
        HiloCadena2 h1 = new HiloCadena2(con, "A");
        HiloCadena2 h2 = new HiloCadena2(con, "B");
        h1.start();
        h2.start();
    }
}

class ObjetoCompartido2 {

    public void PintaCadena(String texto) {
        System.out.println(texto);

    }
}
    class HiloCadena2 extends Thread {

        ObjetoCompartido objeto;
        String cad;

        public HiloCadena2(ObjetoCompartido objeto, String cad) {
            this.objeto = objeto;
            this.cad = cad;
        }
    

        @Override
        public void run() {
            synchronized (objeto) {
                for (int i = 0; i < 15; i++) {
                    objeto.PintaCadena(cad);
                    objeto.notify(); //notifica pra que una vez pintado se pueda ir a hacer el otro 
                    try {
                        objeto.wait(); //Esto tiene q ir entre un try-catch y es que el notify avisa de cuando esta libre y asi el wait ejecita el otro
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                objeto.notify();
                System.out.println("Finalizado");
            }
        }
    }


