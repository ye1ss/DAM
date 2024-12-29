/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author Alumno
 */
public class crearParClaves {
    public static void main(String[] args) throws Exception {
        System.out.println("Obteniendo generador de claves con el cifrado RSA");
        KeyPairGenerator keyGen= KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        System.out.println("Generando par de claves");
        KeyPair keyPair= keyGen.generateKeyPair();
        PublicKey publicKey= keyPair.getPublic();
        PrivateKey privateKey= keyPair.getPrivate();
        System.out.println("Clave pública: " +publicKey);
        System.out.println("Clave privada: " +privateKey);
        
        
    }
}
