/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package conectarmeServidor;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Alumno
 */
public class SocketsEjUso {

    public static void main(String[] args) {
        try{
            String host= "localhost";//Aqui tambien puedo poner una ip y concetarme a otro pc
            int puerto= 6000;
            Socket cliente= new Socket(host, puerto);
            InetAddress dir= cliente.getInetAddress();
            System.out.println("Puerto local: "+cliente.getLocalPort());
            System.out.println("Puerto remoto: "+cliente.getPort());
            System.out.println("Nombre host/IP: "+ cliente.getInetAddress());
            System.out.println("Host remoto: "+dir.getHostName());
            System.out.println("IP host remoto: "+dir.getHostAddress().toString());
            cliente.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
