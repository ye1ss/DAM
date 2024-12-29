/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Alumno
 */
public class servidor {
    public static void main(String[] args){
        try{
            String host= "localhost";
            int puerto= 6000;
            ServerSocket servidor= new ServerSocket(puerto);
            Socket clienteConectado= null;
            System.out.println("Escuchando en el puerto: " +servidor.getLocalPort());
            System.out.println("Esperando cliente.");
            clienteConectado= servidor.accept();
            
            //crear flujo de entrada
            InputStream entrada= clienteConectado.getInputStream();
            DataInputStream flujoEntrada= new DataInputStream(entrada);
            System.out.println("Recibido del cliente: \n\t" +flujoEntrada.readUTF());
            
            //crear flujo de salida
            OutputStream salida= clienteConectado.getOutputStream();
            DataOutputStream flujoSalida= new DataOutputStream(salida);
            
            //enviar saludo al cliente
            flujoSalida.writeUTF("Hola cliente, soy el servidor");
            
            
            //cerrar streams y sockets
            entrada.close();
            flujoEntrada.close();
            salida.close();
            flujoSalida.close();
            clienteConectado.close();
            servidor.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
