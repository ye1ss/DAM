/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class cliente {
    public static void main(String[] Args) throws SocketException, UnknownHostException, IOException{
        System.out.println("CLIENTE UDP INICIADO");
        DatagramSocket socket= new DatagramSocket();
        String mensaje= "Hola mundo";
        byte[] data= mensaje.getBytes();
        InetAddress address= InetAddress.getByName("localhost");
        int port= 1234;
        DatagramPacket paquete= new DatagramPacket(data, data.length, address, port);
        socket.send(paquete);
        System.out.println("Paquete enviado");
        socket.close();
        
    }
}
