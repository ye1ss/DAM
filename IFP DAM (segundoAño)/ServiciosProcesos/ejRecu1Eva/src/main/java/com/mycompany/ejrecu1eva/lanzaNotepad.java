/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejrecu1eva;

import java.io.IOException;

/**
 *
 * @author yeismil
 */
public class lanzaNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb= new ProcessBuilder("NOTEPAD");
        Process p= pb.start();
    }
    
}
