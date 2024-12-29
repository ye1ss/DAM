/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;

import java.util.HashMap;

/**
 *
 * @author Alumno
 */
public class Hash_Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap <String, Integer> map= new HashMap<>();
        map.put("Fruta", 6);
        map.put("Fruta", 2);
        map.put("Fruta", 8);
        
        for (String clave:map.keySet()){
            int valor= map.get(clave);
            System.out.println("Clave: " + clave +", valor: " +valor);
        }
    }
    
}
