/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.servidorsmtp;

import java.io.IOException;
import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;

/**
 *
 * @author Alumno
 */
public class mensajeSimpleSmtp {
    public static void main(String[] args) {
        SMTPClient cliente= new SMTPClient();
        try{
            cliente.connect("localhost");
            System.out.println(cliente.getReplyString());
            int respuesta= cliente.getReplyCode();
            System.out.println("Codigo de respuesta del servidor: " +respuesta);
            if (!SMTPReply.isPositiveCompletion(respuesta)){
                cliente.disconnect();
                System.out.println("Conexion rechazada "+respuesta);
                System.exit(1);
            } else{
                cliente.login();
                String destinatario= "postmaster@localhost";
                String mensaje= "Hola.\nMensaje de prueba";
                String remitente= "postmaster@localhost";
                if (cliente.sendSimpleMessage(remitente, destinatario, mensaje)){
                    System.out.println("Mensaje enviado a " +destinatario);
                    respuesta= cliente.getReplyCode();
                    System.out.println("Código de respuesta del servidor " +respuesta);
                } else {
                    System.out.println("No se ha podido enviar el mensaje");
                }
                cliente.logout();
            }
            
            cliente.disconnect();
            System.out.println("Conexión finalizada");
        }catch (IOException e){
            System.out.println("No se puede conectar al servidor");
            System.exit(2);
        }
    }
}
