/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SMTP;

import java.io.IOException;
import java.io.Writer;
import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.apache.commons.net.smtp.SimpleSMTPHeader;

/**
 *
 * @author yeism
 */
public class simpleSMTPHeader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SMTPClient cliente= new SMTPClient();
        try{
            cliente.connect("localhost");
            System.out.println(cliente.getReplyString());
            int respuesta= cliente.getReplyCode();
            if(!SMTPReply.isPositiveCompletion(respuesta)){
                cliente.disconnect();
                System.out.println("Conexión rechazada " +respuesta);
                System.exit(1);
            }else{
                cliente.login();
                String destinatario1= "postmaster@localhost";
                String destinatario2= "postmaster@localhost";
                String asunto= "Mensaje de prueba";
                String mensaje= "Hola.\nMensaje de prueba.";
                String remitente= "postermaster@localhost";
                SimpleSMTPHeader cabezera= new SimpleSMTPHeader(remitente, destinatario1, asunto);
                cabezera.addCC(destinatario2);
                cliente.setSender(remitente);
                cliente.addRecipient(destinatario1);
                cliente.addRecipient(destinatario2);
                Writer writer= cliente.sendMessageData();
                if(writer== null){
                    System.out.println("ERROR. Fallo al enviar el correo");
                    System.exit(1);
                }
                System.out.println(cabezera.toString());
                writer.write(cabezera.toString());
                writer.write(mensaje);
                writer.close();
                if(!cliente.completePendingCommand()){
                    System.out.println("ERROR. Fallo al finalizar la transacción");
                    System.exit(1);
                }
                cliente.logout();
            }
            cliente.disconnect();
            System.out.println("Conexion finalizada");
        }catch(IOException e){
            System.out.println("ERROR. No se puede conectar al servidor.");
        }
    }  
}
