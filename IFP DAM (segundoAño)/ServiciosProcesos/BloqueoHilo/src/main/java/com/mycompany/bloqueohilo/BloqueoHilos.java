/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bloqueohilo;

/**
 *
 * @author Alumno
 */
public class BloqueoHilos {

    public static void main(String[] args) {
        ObjetoCompartido con = new ObjetoCompartido();
        HiloCadena1 a = new HiloCadena1(con, "A");
        HiloCadena1 b = new HiloCadena1(con, "B");
        a.start();
        b.start();
    }
}

class ObjetoCompartido {

    public void PintaCadena(String texto) {
        System.out.println(texto);
    }
}

class HiloCadena1 extends Thread {

    ObjetoCompartido objeto;
    String cad;

    public HiloCadena1(ObjetoCompartido objeto, String cad) {
        this.objeto = objeto;
        this.cad = cad;
    }

    @Override
    public void run() {
        synchronized (objeto) { //para q se sinconize para saber cuando
            for (int j = 0; j < 15; j++) {
                objeto.PintaCadena(cad);
            }
            System.out.println("Finalizado");
        }
    }
}
        

