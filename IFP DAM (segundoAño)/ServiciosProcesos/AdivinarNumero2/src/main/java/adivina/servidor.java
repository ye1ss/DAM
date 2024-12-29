/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adivina;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Garbine
 * OK ppt 40
 * Ejemplo de programa cliente-servidor multihilo para adivinar un nÃºmero.
 * Ejecutar a la vez que el cliente JugadorAdivina.
 * El servidor define un nÃºmero a adivinar. Los clientes que se conecten tienen que adivinar el nÃºmero, 
 * tienen 5 intentos cada uno. Cada jugador se gestiona con un hilo y todos comparten
 * un objeto que contiene el nÃºmero a adivinar, el estado del juego, si ha terminado o no
 * Si ya hay un ganador y el mÃ©todo que comprueba si un jugador ha acertado el nÃºmero o no (nuevajugada).
 */

public class servidor {
     public static void main(String[] args) throws IOException {
        int puerto = 6001;
        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Servidor iniciado.");
        int numero = (int) (1 + 25 * Math.random());
        System.out.println("NÃºmero a adivinar: " + numero);
        ObjetoCompartido objeto = new ObjetoCompartido(numero);
        int id = 0;
        while (true) {
            Socket cliente = new Socket();
            cliente = servidor.accept();
            id++;
            HiloServidorAdivina hilo = new HiloServidorAdivina(cliente, objeto, id);
            hilo.start();
        }
    }

    public static class ObjetoCompartido {
        private int numero;
        private boolean acabo;
        private int ganador;
        public ObjetoCompartido(int numero){
            this.numero = numero;
            this.acabo = false;
        }
        public boolean seAcabo(){
            return acabo;
        }
        public int getGanador(){
            return ganador;
        }
        public synchronized String nuevaJugada (int jugador, int suNumero){
            String cad="";
            if(!seAcabo()){
                if(suNumero> numero) cad = "Demasiado grande";
                else if(suNumero< numero) cad = "Demasiado pequeÃ±o";
                else if(suNumero==numero){
                    cad = "El jugador "+jugador+" gana, el nÃºmero "+"adivinado es: "+numero;
                    acabo =true;
                    ganador=jugador;
                }
            } else cad="Jugador "+ganador+" adivinÃ³ el nÃºmero: "+numero;
            return cad;
        }
    }
    public static class HiloServidorAdivina extends Thread {

        ObjectInputStream fentrada;
        ObjectOutputStream fsalida;
        Socket socket = null;
        ObjetoCompartido objeto;
        int identificador;
        int intentos = 0;

        public HiloServidorAdivina(Socket s, ObjetoCompartido objeto, int id) {
            this.socket = s;
            this.objeto = objeto;
            this.identificador = id;
            try {
                fsalida = new ObjectOutputStream(socket.getOutputStream());
                fentrada = new ObjectInputStream(socket.getInputStream());
            } catch (IOException e) {
                System.out.println("ERROR DE E/S EN HiloServidor");
            }
        }

        @Override
        public void run() {
            System.out.println("Cliente conectado: " + identificador);
            Datos datos = new Datos("Adivina un nÃºmero entre 1 y 25", intentos, identificador);
            if (objeto.seAcabo()) {
                datos.setCadena("Lo sentimos, el juego ha terminado. Otro jugador ha adivinado el nÃºmero");
                datos.setJuega(false);
            }
            try {
                fsalida.reset();
                fsalida.writeObject(datos);
            } catch (IOException e) {
                System.out.println("Error en el hilo al realizar el primer envÃ­o al jugador" + identificador);
                return;
            }
            while (!objeto.seAcabo() || !(datos.getIntentos() == 5)) {
                int numecli = 0;
                try {
                    Datos d = (Datos) fentrada.readObject();
                    numecli = Integer.parseInt(d.getCadena());
                } catch (IOException e) {
                    System.out.println("Error en el Hilo al leer del jugador" + identificador);
                    break;
                } catch (NumberFormatException n) {
                    System.out.println("El jugador: " + identificador + " se ha desconectado.");
                } catch (ClassNotFoundException e) {
                    break;
                }
                String cad = objeto.nuevaJugada(identificador, numecli);
                intentos++;
                datos = new Datos(cad, intentos, identificador);
                if (objeto.seAcabo()) {
                    datos.setJuega(false);
                    if (identificador == objeto.getGanador()) {
                        datos.setGana(true);
                    }
                }
                try {
                    fsalida.reset();
                    fsalida.writeObject(datos);
                } catch (IOException e) {
                    System.out.println("Error escribiendo en flujo de salida del jugador" + identificador + " * " + e.getMessage());
                    break;
                } catch (NullPointerException n) {
                    System.out.println("El jugador: " + identificador + " se ha desconectado.");
                }
            }
            if (objeto.seAcabo()) {
                System.out.println("El juego se ha acabado ");
                System.out.println(" Desconecta:  " + identificador);
            }
            try {
                fsalida.close();
                fentrada.close();
                socket.close();
            } catch (IOException e) {
                System.out.println("Error en el hilo al cerrar cliente" + identificador);
            }
        }
    }
    public static class Datos implements Serializable {
        String cadena;
        int intentos;
        int identificador;
        boolean gana;
        boolean juega;
        
        public String getCadena() {
            return cadena;
        }

        public void setCadena(String cadena) {
            this.cadena = cadena;
        }

        public int getIntentos() {
            return intentos;
        }

        public void setIntentos(int intentos) {
            this.intentos = intentos;
        }

        public int getIdentificador() {
            return identificador;
        }

        public void setIdentificador(int identificador) {
            this.identificador = identificador;
        }

        public boolean isGana() {
            return gana;
        }

        public void setGana(boolean gana) {
            this.gana = gana;
        }

        public boolean isJuega() {
            return juega;
        }

        public void setJuega(boolean juega) {
            this.juega = juega;
        }
        
        public Datos (String cadena, int intentos, int identificador){
            this.cadena =cadena;
            this.intentos =intentos;
            this.identificador =identificador;
            this.gana =false;
            this.juega =true;
        }
        public Datos () {super();}   
    }   
  
}
