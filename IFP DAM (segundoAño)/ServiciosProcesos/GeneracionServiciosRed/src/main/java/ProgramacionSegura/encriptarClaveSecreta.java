/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Alumno
 */
public class encriptarClaveSecreta {
    public static void main(String[] args) {
        try{
            //creamos la clave secreta
            KeyGenerator kg= KeyGenerator.getInstance("AES");
            kg.init(128);
            SecretKey claveSecreta= kg.generateKey();
            
            //creamos un objeto cipher con el algoritmo indicado entre comillas
            Cipher c= Cipher.getInstance("AES/ECB/PKCS5Padding");
            c.init(Cipher.ENCRYPT_MODE, claveSecreta);
            
            //ciframos la informacion con doFinal()
            byte textoPlano[]= "Esto es un Texto Plano ".getBytes();
            byte textoCifrado[]= c.doFinal(textoPlano);
            System.out.println("Encriptado: " +new String(textoCifrado));
            
            //configuramos Cipher en modo desencriptacion con misma clave
            c.init(Cipher.DECRYPT_MODE, claveSecreta);
            byte desencriptado[]= c.doFinal(textoCifrado);
            System.out.println("Desencriptado: " +new String(desencriptado));
            
            //guardamos la clave secreta en un fichero
            ObjectOutputStream out= new ObjectOutputStream(
                new FileOutputStream("Clave.secreta"));
            out.writeObject(claveSecreta);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
