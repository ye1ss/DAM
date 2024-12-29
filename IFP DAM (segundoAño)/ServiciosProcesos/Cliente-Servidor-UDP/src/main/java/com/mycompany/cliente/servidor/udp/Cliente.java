/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.servidor.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/**
 *
 * @author Alumno
 */
public class Cliente {
    public static void main(String[] Args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket clientSocket = null;

        try {
            clientSocket = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 12345;

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            clientSocket.setSoTimeout(5000); // Establecer tiempo de espera en milisegundos

            while (true) {
                System.out.print("Introduce un texto o '*' para finalizar: ");
                String texto = userInput.readLine();
                sendData = texto.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                clientSocket.send(sendPacket);

                if (texto.equals("*") || texto.toLowerCase().equals("salir")) {
                    if (texto.equals("*")) {
                        System.out.println("Mensaje enviado para finalizar el cliente");
                    } else {
                        System.out.println("Mensaje enviado para finalizar el servidor");
                    }
                    break;
                }

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                try {
                    clientSocket.receive(receivePacket);
                    String textoMayusculas = new String(receivePacket.getData(), 0, receivePacket.getLength());
                    System.out.println("Este es el texto recibido desde el servidor: " + textoMayusculas);
                } catch (SocketTimeoutException e) {
                    System.out.println("El paquete se ha perdido.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (clientSocket != null) {
                clientSocket.close();
            }
        }

    }
}

