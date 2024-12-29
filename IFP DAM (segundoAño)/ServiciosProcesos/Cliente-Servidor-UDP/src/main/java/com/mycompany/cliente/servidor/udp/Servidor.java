/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.servidor.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author Alumno
 */
public class Servidor {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket serverSocket = null;

        try {
            int port = 12345;
            serverSocket = new DatagramSocket(port);

            byte[] receiveData = new byte[1024];
            System.out.println("Servidor UDP iniciado");

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String textoRecibido = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clienteAddress = receivePacket.getAddress();
                int clientePort = receivePacket.getPort();

                if (textoRecibido.equals("*")) {
                    System.out.println("Cliente ha finalizado");
                } else if (textoRecibido.equals("salir")) {
                    System.out.println("Cliente ha solicitado"
                            + " cerrar el servidor");
                    break;
                } else {
                    String textoMayusculas = textoRecibido.toUpperCase();
                    byte[] sendData = textoMayusculas.getBytes();

                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clienteAddress, clientePort);
                    serverSocket.send(sendPacket);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}
