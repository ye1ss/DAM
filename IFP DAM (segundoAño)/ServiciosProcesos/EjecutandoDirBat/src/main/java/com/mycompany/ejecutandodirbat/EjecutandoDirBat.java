/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecutandodirbat;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class EjecutandoDirBat {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb= new ProcessBuilder("CMD");
        
        File fBat= new File("comandos.bat");
        File fSalida= new File("salida.txt");
        File fError= new File("error.txt");
        
        pb.redirectInput(fBat);
        pb.redirectOutput(fSalida);
        pb.redirectError(fError);
        pb.start();
    }
}
