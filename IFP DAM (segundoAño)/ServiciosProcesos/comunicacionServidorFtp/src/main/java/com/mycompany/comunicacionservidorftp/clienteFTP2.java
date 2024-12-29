/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.comunicacionservidorftp;

import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author yeism
 */
public class clienteFTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FTPClient cliente= new FTPClient();
        String servidorFTP= "ftp.rediris.es";
        System.out.println("Conectando con: "+ servidorFTP);
        String usuario= "anonymous";
        String clave= "anonymous";
        try{
            cliente.connect(servidorFTP);
            cliente.enterLocalPassiveMode();
            boolean login= cliente.login(usuario, clave);
            if(login){
                System.out.println("Login correcto");
            } else{
                System.out.println("Login incorrecto"); 
                cliente.disconnect();
                System.exit(1);
            }
            System.out.println("Direcorio actual: "+ cliente.printWorkingDirectory());
            FTPFile[] ficheros= cliente.listFiles();
            System.out.println("Ficheros en el directorio actual: "+ ficheros.length);
            String tipos[]= {"Fichero", "Directorio", "Enlace simb."};
            for (int i= 0; i <ficheros.length; i++){
                System.out.println("\t"+ ficheros[i].getName() +" -> "+ tipos[ficheros[i].getType()]);
            }
            boolean logout= cliente.logout();
            if(logout){
                System.out.println("Logout del servidor FTP");
            }else{
                System.out.println("Error al hacer logout del servidor");
            }
            cliente.disconnect();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
