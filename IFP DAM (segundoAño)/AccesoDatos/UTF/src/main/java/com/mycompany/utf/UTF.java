/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utf;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class UTF {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Inicializamos el FileOutputStream
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Alumno\\OneDrive - IFP Formación Profesional\\SegundoAñoDamYeismil\\1Trimestre\\AccesoDatos\\UTF");
        //Inicializamos el FileOutputStream
        DataOutputStream os = new DataOutputStream(fo);
        //Escribiendo el output
         os.writeUTF("టుటోరియల్స్ పాయింట్ కి స్వాగతిం");
         os.flush();
        System.out.println("Los datos han enrado en el archivo");

    }
}
