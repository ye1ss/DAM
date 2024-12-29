/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Alumno
 */
public class servidor {
    public static void main(String[] args) throws SocketException, IOException {
      DatagramSocket socket= new DatagramSocket(1234);  
        System.out.println("SERVIDOR UDP INICIADO");
        byte[] data= new byte[1024];
        DatagramPacket paquete= new DatagramPacket(data, data.length);
        System.out.println("Esperando datagrama del cliente...");
        socket.receive(paquete);
        String mensaje= new String(data, 0, paquete.getLength());
        System.out.println("Mensaje recibido: "+mensaje);
        socket.close();
    }
}
