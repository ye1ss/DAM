/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJCLASE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno
 */
public class EJFichero {
    //Ejemplo uso de ficheros 
    public static void main(String[]args) throws FileNotFoundException, IOException{
        File fichero= new File ("priebafichero1.txt");
        if (fichero.exists()){
            System.out.println ("El fichero existe");
            System.out.println("El nombre del fichero es: "+fichero.getName());
            System.out.println("Su longitud es: "+fichero.length());
        }else
            System.out.println("El fichero no existe");
        escribirFichero();
        copiarFichero ("fich1.txt", "fich2.txt");
    }
        public static void escribirFichero() throws IOException {
    PrintWriter salida;
    salida= new PrintWriter(new FileWriter("Carpetafichero/fichero.txt",true));
    salida.print("escribir texto en fichero\n");
    salida.write("segunda línea\n");
    salida.append("mas datos");
    salida.close();
}
    public static void copiarFichero (String fich1, String fich2){
        File origen =new File(fich1);
        File destino = new File(fich2);
        FileInputStream entrada=null;
        FileOutputStream salida=null;
        try{
            entrada=new FileInputStream (origen);
            salida=new FileOutputStream (destino);
            byte[]buffer=new byte[4096];
            while (true){
                int n=entrada.read(buffer);
                if (n>0){
                    salida.write(buffer,0,n);
                }else {
                    System.out.println(fich1+"copiado a "+fich2);
                    break;
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }finally{
                }
    }
    
        }
    
 
    
    
    
    

