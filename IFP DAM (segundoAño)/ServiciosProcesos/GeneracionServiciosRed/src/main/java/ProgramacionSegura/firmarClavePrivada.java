/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.in;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 *
 * @author Alumno
 */
public class firmarClavePrivada {
    public static void main(String[] args) {
        try {
            // read from file with private key
            FileInputStream inprivada = new FileInputStream("clave.privada");
            byte[] bufferPrivada = new byte[inprivada.available()];
            inprivada.read(bufferPrivada);
            inprivada.close();

            // recover the private key
            PKCS8EncodedKeySpec clavePrivadaSpec = new PKCS8EncodedKeySpec(bufferPrivada);
            KeyFactory keyRSA = KeyFactory.getInstance("RSA");
            PrivateKey clavePrivada = keyRSA.generatePrivate(clavePrivadaSpec);

            // initialize the signature with the private key
            Signature dsa = Signature.getInstance("SHA256withRSA");
            dsa.initSign(clavePrivada);

            // read the file to sign
            FileInputStream fichero = new FileInputStream("datos.dat");
            BufferedInputStream bis = new BufferedInputStream(fichero);
            byte[] buffer = new byte[bis.available()];
            int len;
            while ((len = bis.read(buffer)) > 0) {
                dsa.update(buffer, 0, len);
            }
            bis.close();

            byte[] firma = dsa.sign(); // generate the signature and save it to a file
            FileOutputStream salida = new FileOutputStream("fichero.firma");
            salida.write(firma);
            salida.close();

        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
