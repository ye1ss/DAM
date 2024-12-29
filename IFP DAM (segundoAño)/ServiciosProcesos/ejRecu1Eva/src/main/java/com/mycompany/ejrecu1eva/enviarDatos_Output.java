/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author yeism
 */
public class enviarDatos_Output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Aqui enviamos datos al Stream de entrada del proceso  a través de getOutputStream().
        
        Process p= new ProcessBuilder("CMD", "/C", "DATE").start();
        OutputStream os= p.getOutputStream();
        os.write("11-10-2024".getBytes());
        os.flush();
        InputStream is= p.getInputStream();
        int c;
        while ((c=is.read())!=-1){
            System.out.print((char)c);
        }
        is.close();
        int exitVal;
        try{
            exitVal= p.waitFor();
            System.out.println("Valor de salida: "+ exitVal);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
