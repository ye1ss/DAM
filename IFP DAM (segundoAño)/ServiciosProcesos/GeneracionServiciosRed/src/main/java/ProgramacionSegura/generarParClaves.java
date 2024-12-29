/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 *
 * @author Alumno
 */
public class generarParClaves {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        try {
            System.out.println("Obteniendo generador de claves con cifrado RSA");
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            SecureRandom numero = SecureRandom.getInstance("SHA1PRNG");
            keyGen.initialize(2048, numero);
            KeyPair par = keyGen.generateKeyPair();
            PrivateKey clavePrivada = par.getPrivate();
            PublicKey clavePublica = par.getPublic();

            PKCS8EncodedKeySpec pk8Spec = new PKCS8EncodedKeySpec(clavePrivada.getEncoded());
            FileOutputStream outprivada = new FileOutputStream("clave.privada");
            outprivada.write(pk8Spec.getEncoded());
            outprivada.close();
            System.out.println("Generada clave privada");

            X509EncodedKeySpec pkX509 = new X509EncodedKeySpec(clavePublica.getEncoded());
            FileOutputStream outPublica = new FileOutputStream("clave.publica");
            outPublica.write(pkX509.getEncoded());
            outPublica.close();
            System.out.println("Generada clave pública");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
