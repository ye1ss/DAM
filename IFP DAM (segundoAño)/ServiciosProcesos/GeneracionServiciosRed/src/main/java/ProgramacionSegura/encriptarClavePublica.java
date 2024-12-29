/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.security.Key;
import java.security.KeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author Alumno
 */
public class encriptarClavePublica {
    public static void main(String[] args) throws NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
         try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(1024, new SecureRandom());
            KeyPair par = keyGen.generateKeyPair();
            PrivateKey clavepriv = par.getPrivate();
            PublicKey clavepub = par.getPublic();
            
            KeyGenerator kg = KeyGenerator.getInstance("AES");
            kg.init(128);
            SecretKey clavesecreta = kg.generateKey();
            
            Cipher c = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            c.init(Cipher.WRAP_MODE, clavepub);
            byte[] claveenvuelta = c.wrap(clavesecreta);
            
            c = Cipher.getInstance("AES/ECB/PKCS5Padding");
            c.init(Cipher.ENCRYPT_MODE, clavesecreta);
            byte[] textoPlano = "Esto es un texto plano".getBytes();
            byte[] textoCifrado = c.doFinal(textoPlano);
            System.out.println("Encriptado: " + new String(textoCifrado));
            
            Cipher c2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            c2.init(Cipher.UNWRAP_MODE, clavepriv);
            Key clavedesenvuelta = c2.unwrap(claveenvuelta, "AES", Cipher.SECRET_KEY);
            
            c2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            c2.init(Cipher.DECRYPT_MODE, clavedesenvuelta);
            byte[] desencriptado = c2.doFinal(textoCifrado);
            System.out.println("Desencriptacion: " + new String(desencriptado));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
