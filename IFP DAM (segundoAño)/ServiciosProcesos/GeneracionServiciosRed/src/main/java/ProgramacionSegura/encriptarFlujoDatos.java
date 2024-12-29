/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Alumno
 */
public class encriptarFlujoDatos {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("clave.secreta"));
            Key claveSecreta = (Key) oin.readObject();
            oin.close();

            Cipher c = Cipher.getInstance("AES/ECB/PKCS5Padding");
            CipherInputStream in = new CipherInputStream(new FileInputStream("FicheroPDF.Cifrado"), c);
            c.init(Cipher.DECRYPT_MODE, claveSecreta);

            int blockSize = c.getBlockSize();
            byte[] bytes = new byte[blockSize];
            int i;

            FileOutputStream fileout = new FileOutputStream("FICHERODescrifado.pdf");
            while ((i = in.read(bytes)) != -1) {
                fileout.write(bytes, 0, i);
            }
            fileout.flush();
            in.close();
            System.out.println("Fichero descifrado con clave secreta");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
