/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Alumno
 */
public class cliente {
    public static void main(String[] args) {
        try{
            String host= "localhost";
            int puerto= 6000;
            System.out.println("Iniciando programa cliente");
            Socket cliente= new Socket(host, puerto);
            
            //crear flujo salida
            DataOutputStream flujoSalida= new DataOutputStream(cliente.getOutputStream());
            
            
            //enviar saludo al servidor
            flujoSalida.writeUTF("Hola servidor, soy el cliente");
            DataInputStream flujoEntrada= new DataInputStream(cliente.getInputStream());
            System.out.println("Recibiendo del servidor: \n\t"+flujoEntrada.readUTF());
            
            //cerrar en orden los streams
            flujoEntrada.close();
            flujoSalida.close();
            cliente.close();   
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
