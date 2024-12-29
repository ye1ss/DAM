/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/**
 *
 * @author Alumno
 */
public class digest1 {
    public static void main(String[] args) {
        MessageDigest md;
        try{
        md= MessageDigest.getInstance("SHA-256");
        String datos= "El día que a Santiago Nasar lo iban a ...";
        byte dataBytes[]= datos.getBytes();
        md.update(dataBytes); //aqui los recarga para tenerlos
        byte resumen[]= md.digest(); //aqui ya calcula y lo genera en el array de bytes
            System.out.println("Mensaje original: " +datos);
            System.out.println("Numero de bytes: " +md.getDigestLength());
            System.out.println("Algoritmo: " +md.getAlgorithm());
            System.out.println("Mensaje resumen: " +new String(resumen));
            Provider proveedor= md.getProvider();
            System.out.println("Proveedor: " +proveedor.toString());
        
        }catch(NoSuchAlgorithmException ex){
            ex.printStackTrace();
        }
    }
}
