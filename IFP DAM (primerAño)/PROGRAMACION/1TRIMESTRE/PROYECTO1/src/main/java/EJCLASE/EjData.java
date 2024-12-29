package com.mycompany.ejclase;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class EjData {
    public static void main(String[] args) throws IOException {
      File fichero=new File ("file.txt");
        FileOutputStream destino = new FileOutputStream("fichero_binario.txt");
        DataOutputStream salida = null; 
        
        //escribe datos del destino tipo en el fichero 
        salida= new DataOutputStream(destino);
        salida.writeInt(120);
        salida.writeUTF("-cadena de caracteres-");
        salida.writeByte(120);
        salida.writeChar('c');
        salida.writeBoolean(true);
        salida.writeFloat((float)1234.454);
        
        //crea el stream
        FileInputStream origen = new FileInputStream("fichero_binario.txt");
        DataInputStream entrada=null;

        //lee los datos del fichero, teniendo en cuenta el tipo
        entrada=new DataInputStream (origen);
        System.out.println(entrada.readInt());
        System.out.println(entrada.readUTF());
        System.out.println(entrada.readByte());
        System.out.println(entrada.readByte());
        
        }
    } 