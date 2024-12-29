
import java.io.IOException;
import java.io.InputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class LanzarDir {
    public static void main(String[] args) throws IOException {
    Process p= new ProcessBuilder("CMD","/C","DIR").start();
        InputStream is= p.getInputStream(); //Para sacar los datos de la cmd y meterlos en java
        int c=0;
        while((c= is.read())!= -1){ //Creamos esto con el método read para que lea los datos y cuando no queden datos devuelve -1 y ahi ya lo imprime
            System.out.print((char)c);
        }
    }
}
