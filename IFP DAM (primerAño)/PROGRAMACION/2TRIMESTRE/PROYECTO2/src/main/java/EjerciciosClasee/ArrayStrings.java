/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosClasee;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alumno
 */
public class ArrayStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> nombres=new ArrayList();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        
        System.out.println(nombres);//me pondra Ana, Luisa y Felipe.
        nombres.add(1,"Pablo");
        System.out.println(nombres);//me pondra Ana, Pablo, Luisa, Felipe.
        nombres.remove(0);
        System.out.println(nombres);//me pondra Pablo, Luisa, Felipe. 
        
        //ordeno los nombres usando el metodo sort
        Collections.sort(nombres);
        
        System.out.println(nombres);//me pondra Pablo, Luisa, Felipe.
        //String[] miarray=new String[3];
        //miarray=(String[]) nombres.toArray();
        //System.out.println(miarray);    
    }   
}
