/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SMTP;

import java.io.IOException;
import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;

/**
 *
 * @author Alumno
 */
public class ClienteServidorSmtp {

    public static void main(String[] args) {
        SMTPClient cliente= new SMTPClient();
        try{
            cliente.connect("localhost");
            System.out.println(cliente.getReplyString());
            int respuesta= cliente.getReplyCode();
            System.out.println("Codigo de respuesta del servidor: " +respuesta);
            if(!SMTPReply.isPositiveCompletion(respuesta)){
                cliente.disconnect();
                System.out.println("Conexion rechazada: "+respuesta);
                System.exit(1);
            }
            else System.out.println("Conexión aceptada");
            cliente.disconnect();
            System.out.println("Conexión finalizada");
        }catch (IOException e){
            System.out.println("No se puede conectar al servidor");
            System.exit(2);
        }
    }
}
