/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejclase;

import java.util.logging.Level;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class usoLogger {
/**
 *
 * @author Alumno
 */
    
    public static void main(String[]args)throws IOException{

    //Crea un logger
    //Logger logger = Logger.getLogger(UsoLogger.class.getName()); <-"ESTA ES OTRA FORMA DE PONERLO"
    Logger milogger = Logger.getLogger("com.mycopany.ejclase");
    FileHandler ficheroXML = new FileHandler("FicheroLOG.xml");
    //Asocia el log al fichero FicheroLog.xml
    milogger.addHandler(ficheroXML);
    //escribe mensajes en el logger
    milogger.log(Level.INFO, "This is message 1");
    milogger.log(Level.WARNING, "This is message 2");

    }
}
 

