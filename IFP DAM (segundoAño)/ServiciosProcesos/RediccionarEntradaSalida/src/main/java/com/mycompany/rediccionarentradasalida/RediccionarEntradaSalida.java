/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rediccionarentradasalida;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class RediccionarEntradaSalida {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb= new ProcessBuilder("CMD", "/C", "DIR");
        
        File fSalida= new File("salida.txt");
        File fError= new File("error.txt");
        
        pb.redirectOutput(fSalida);
        pb.redirectError(fError);
        pb.start();
        
    }
}
