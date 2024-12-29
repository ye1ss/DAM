/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.envioobjetostcp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class cliente {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Introduce un número (0 o menor para finalizar): ");
                int num = scanner.nextInt();

                if (num <= 0) {
                    System.out.println("Número menor o igual a 0. Finalizando el cliente.");
                    break;
                }

                numeros numero = new numeros(num);

                Socket socket = new Socket("localhost", 12345);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

                out.writeObject(numero);
                out.flush();

                numeros resultado = (numeros) in.readObject();

                System.out.println("El cuadrado del número es: " + resultado.getCuadrado());
                System.out.println("El cubo del número es: " + resultado.getCubo());

                socket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
               
        
        
    }
}
