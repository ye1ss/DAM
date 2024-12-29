/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Zoo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */

public class DatosZOO {
    static String[] menu={"DardeAlta ", "DardeBaja ", "ListadoAnimales ", "Salir"};
    public static ArrayList<Animales> animales= new ArrayList();
    
    public static void main(String[] args) {
    
        int opcion;
        while(true){
            opcion =JOptionPane.showOptionDialog(null, "Elije opción", "Web Zoo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (opcion){
//                case 0:
//                    DardeAlta();
//                    break;
//                case 1:
//                    DardeBaja();
//                    break;
                case 2:
                    ListadoAnimales();
                    break;
                case 3:
                    //salir();
                    System.out.println("Has salido de la web del Zoo");
                    System.exit(0);
                    break;
            }
        }
        
//        private static void DardeAlta(){
//            
//        }
        public static ArrayList<animaless> animaleszoo= new ArrayList();
        private static void ListadoAnimales(){
            animales a1= new animales();
            animaleszoo.add(a1);
        }
    }


