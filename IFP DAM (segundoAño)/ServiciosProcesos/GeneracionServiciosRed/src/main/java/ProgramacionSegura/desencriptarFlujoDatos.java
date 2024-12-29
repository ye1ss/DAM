/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class desencriptarFlujoDatos {
    public static void main(String[] args) throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchPaddingException {
        try {
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("clave.secreta"));
            Key claveSecreta = (Key) oin.readObject();
            oin.close();

            Cipher c = Cipher.getInstance("AES/ECB/PKCS5Padding");
            c.init(Cipher.DECRYPT_MODE, claveSecreta);

            CipherInputStream cin = new CipherInputStream(new FileInputStream("FicheroPDF.Cifrado"), c);

            FileOutputStream fileout = new FileOutputStream("FICHERODescrifado.pdf");
            byte[] buffer = new byte[c.getBlockSize()];
            int i;
            while ((i = cin.read(buffer)) != -1) {
                fileout.write(buffer, 0, i);
            }
            fileout.flush();
            cin.close();
            fileout.close();

            System.out.println("Fichero descifrado con clave secreta");

        } catch (ClassNotFoundException | InvalidKeyException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
