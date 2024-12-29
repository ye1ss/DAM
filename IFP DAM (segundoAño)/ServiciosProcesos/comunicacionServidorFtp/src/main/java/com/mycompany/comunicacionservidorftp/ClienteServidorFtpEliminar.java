/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comunicacionservidorftp;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Alumno
 */
public class ClienteServidorFtpEliminar {
    
    public static void main(String[] args) {
        
    FTPClient cliente = new FTPClient();
    // Datos de conexión
    String server = "192.168.56.1";
    int port = 21;
    String user = "usuario";
    String pass = "0000";

    try{
        cliente.connect(server);
        cliente.enterLocalPassiveMode();
        boolean login= cliente.login(user, pass);
        if(login){
            System.out.println("Login correcto");
            if(cliente.rename("fichero.txt", "nuevo.txt")){
                System.out.println("Fichero renombrado");
            }else {
                System.out.println("No se ha podido renombrar el fichero");
            }
            if(cliente.removeDirectory("TMP")){
                System.out.println("Direcotorio eliminado");
            }else {
                System.out.println("No se ha podido eliminar el directorio");
            }
            if(cliente.deleteFile("nuevo.txt")){
                System.out.println("Fichero eliminado");
            }else{
                System.out.println("No se ha podido eliminar el fichero");
            }
            }else {
                System.out.println("Login incorrecto");
                cliente.disconnect();
                System.exit(1);
            }
            boolean logout= cliente.logout();
            cliente.disconnect();
            System.out.println("Desconectado");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}