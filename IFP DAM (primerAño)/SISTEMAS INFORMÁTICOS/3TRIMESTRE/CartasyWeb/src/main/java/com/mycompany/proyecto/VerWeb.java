/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto;

import java.awt.Desktop;
import java.net.URI;
/**
 *
 * @author Alumno
 */
public class VerWeb {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) throws Exception {
        Desktop desktop = Desktop.getDesktop();
        //Lo de ifp lo cambias por la web que te de la gana abrir
        desktop.browse(new URI("https://tracker.gg/valorant/profile/riot/bajapantis%232904/overview"));
    }
}