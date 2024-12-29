/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.comunicacionservidorftp;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
/**
 *
 * @author yeismil
 */
public class clienteFtp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FTPClient cliente = new FTPClient();
        //String servidorFTP = "ftp.rediris.es";
        String servidorFTP= "127.0.0.1"; //este es mi FileZila asi que con esto me conecto conmigo
        System.out.println("Conectando con: " + servidorFTP);
        cliente.connect(servidorFTP);
        System.out.println(cliente.getReplyString());
        int respuesta = cliente.getReplyCode();
        System.out.println("Código de respuesta del servidor " + respuesta);
        if (!FTPReply.isPositiveCompletion(respuesta)) {
            cliente.disconnect();
            System.out.println("Conexion rechazada: " + respuesta);
            System.exit(0);
        }
        cliente.disconnect();
        System.out.println("Conexion finalizada");
    }

}
