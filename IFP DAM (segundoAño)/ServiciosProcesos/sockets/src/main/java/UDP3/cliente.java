/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UDP3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Yeismil
 */
public class cliente {
    public static void main(String[] Args) throws SocketException, UnknownHostException, IOException{
        Scanner sc= new Scanner(System.in);
        System.out.println("CLIENTE UDP INICIADO");
        DatagramSocket socket= new DatagramSocket();
        
        //Introducir los datos
        System.out.println("Introduce el mensaje");
        String mensaje= sc.nextLine();
        
        byte[] data= mensaje.getBytes();
        InetAddress address= InetAddress.getByName("localhost");
        int port= 1234;
        DatagramPacket paquete= new DatagramPacket(data, data.length, address, port);
        socket.send(paquete);
        System.out.println("Paquete enviado");
        
        byte[] respuestaData = new byte[1024];
            DatagramPacket respuestaPaquete = new DatagramPacket(respuestaData, respuestaData.length);
            socket.receive(respuestaPaquete);
            String contadorUStr = new String(respuestaData, 0, respuestaPaquete.getLength());
            System.out.println("Respuesta: ");
            System.out.println(contadorUStr);
            
        
        socket.close();
        
    }
}
