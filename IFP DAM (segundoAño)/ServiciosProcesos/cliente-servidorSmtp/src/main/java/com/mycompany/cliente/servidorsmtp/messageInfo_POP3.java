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
 * @author Yeismil+
 */
public class messageInfo_POP3 {
    public static void recuperarMensaje(POP3MessageInfo[] mensajes, POP3Client cliente) throws IOException{
        for(int i= 0; i< mensajes.length; i ++){
            System.out.println("Mensaje: " +(i+1));
            POP3MessageInfo infoMensaje= mensajes[i];
            System.out.println("Identificador: " +infoMensaje.identifier+", Número; "+ infoMensaje.number+ ", Tamaño: "+ infoMensaje.size);
            System.out.println("Prueba de listUniqueIdentifier: ");
            POP3MessageInfo pmi= cliente.listUniqueIdentifier(i+1);
            System.out.println("Identificador: " +pmi.identifier+", Número; "+ pmi.number+ ", Tamaño: "+ pmi.size);
        }
    }
    public static void main(String[] args) {
        String servidor= "localhost", usuario= "user1", password= "user1";
        int puerto= 110;
        POP3Client cliente= new POP3Client();
        try{
            cliente.connect(servidor, puerto);
            System.out.println("Conexion realizada por el servidor POP3 " +servidor);
            if(!cliente.login(usuario, password)){
                System.out.println("Error al hacer login");
            }else{
                POP3MessageInfo[] mensajes= cliente.listMessages();
                if (mensajes.length==0)System.out.println("No hay mensajes en el servidor");
                else recuperarMensaje(mensajes, cliente);
            }
        }catch(IOException e){
            System.out.println("No se puede conectar al servidor");
            System.exit(2);
        }
    }
}
