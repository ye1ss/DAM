/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.setcmd;

import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class SETcmd {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb= new ProcessBuilder("CMD","/C","SET");
        Process p= pb.start();
        
        
    }
}
