/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conectarmeServidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alumno
 */
public class servidorSocket {
    public static void main(String[] args) {
        try{
            int puerto= 6000;
            ServerSocket servidor= new ServerSocket(puerto);
            System.out.println("Escuchando en el puerto: "+servidor.getLocalPort());
            Socket cliente1= servidor.accept();
            Socket cliente2= servidor.accept();
            servidor.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
