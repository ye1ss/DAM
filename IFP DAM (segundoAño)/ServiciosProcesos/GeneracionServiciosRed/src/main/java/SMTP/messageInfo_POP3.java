/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SMTP;

import org.apache.commons.net.pop3.POP3Client;
import org.apache.commons.net.pop3.POP3MessageInfo;

/**
 *
 * @author yeism
 */
public class messageInfo_POP3 {

    public static void recuperarMensaje (POP3MessageInfo[] mensajes, POP3Client cliente){
        for(int i= 0; i < mensajes.length; i++){
            System.out.println("Mensaje: " +(i+1));
            POP3MessageInfo infoMensaje= mensajes[i];
            
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
