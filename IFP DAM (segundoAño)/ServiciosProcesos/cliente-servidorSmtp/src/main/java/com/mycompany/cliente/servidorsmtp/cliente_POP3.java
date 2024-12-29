/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.servidorsmtp;

import java.io.IOException;
import org.apache.commons.net.pop3.POP3Client;
import org.apache.commons.net.pop3.POP3MessageInfo;

/**
 *
 * @author Alumno
 */
public class cliente_POP3 {
    public static void main(String[] args) {
        String servidor= "localhost", usuario= "user1", password= "user1";
        int puerto= 110;
        POP3Client cliente= new POP3Client();
        try{
            cliente.connect(servidor, puerto);
            System.out.println("Conexión realizada al servidor POP3" +servidor);
            if(!cliente.login(usuario, password)){
                System.out.println("Error al hacer el login");
            }else {
                POP3MessageInfo[] men= cliente.listMessages();
                if(men== null){
                    System.out.println("Imposible recuperar el mensaje");
                }else {
                    System.out.println("Nº mensajes: "+men.length);
                }
                cliente.logout();
            }
            cliente.disconnect();
            System.out.println("Conexión finalizada");
        }catch(IOException e){
            System.out.println("No se puede conectar al servidor");
            System.exit(2);
        }
    }
}
