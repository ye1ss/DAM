/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testinetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Alumno
 */
public class TestInetAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress dir= null;
        System.out.println("Salida para local host");
            try{
                dir= InetAddress.getByName("localhost");
                pruebaMetodos(dir);
                System.out.println("SALIDA PARA URL www.google.es: ");
                pruebaMetodos(dir);
                InetAddress[] direcciones= InetAddress.getAllByName(dir.getHostName());
                for (int i=0; i< direcciones.length; i++){
                    System.out.println("\t\t"+direcciones[i].toString());
                }
            }catch(UnknownHostException e){
                e.printStackTrace();
            } 
    }
    
    private static void pruebaMetodos(InetAddress dir){
        System.out.println("\tMétodo getByName(): "+dir);
        InetAddress dir2;
        try{
            dir2= InetAddress.getLocalHost();
            System.out.println("\tMétodo getLocalHost(): "+dir2);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        System.out.println("\tMétodo getHostName(): "+dir.getHostName());
        System.out.println("\tMétodo getHostAddress(): "+dir.getHostAddress());
        System.out.println("\tMétodo toString(): "+ dir.toString());
        System.out.println("\tMétodo getCanonicalHostName(): "+dir.getCanonicalHostName());
    }
    
}
