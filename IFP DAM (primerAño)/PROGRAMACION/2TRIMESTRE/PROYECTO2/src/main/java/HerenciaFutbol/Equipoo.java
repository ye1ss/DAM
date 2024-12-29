/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaFutbol;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Equipoo {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList <ClubF> plantilla= new ArrayList();
    
    public static void main(String[] args) {
        
        Futbolista f1= new Futbolista(10," Delantero", 100,"Lionel", "Messi |", 26);
        Futbolista f2= new Futbolista(3," Defensa", 30,"Sal", "Pike |", 28);
        Entrenador e1= new Entrenador("FCAlcobendas", 001,"Carlos","Esperanza |",32);
        Masajista m1= new Masajista("Quiromasajista", 4,007, "Pedro", "Pin |", 34);
        
        plantilla.add(f1);
        plantilla.add(f2);
        plantilla.add(e1);
        plantilla.add(m1);  
        
        
        //System.out.println(plantilla.get(0)); "ESTO ES PARA IMPRIMIR SOLO 1"
        
        System.out.println("\nIntegrantes del equipo");
        for(ClubF integrante: plantilla){
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"->");
            integrante.Viajar();
        }
        System.out.println(" ");
        System.out.println("Futbolistas del equipo");
        for(ClubF integrante: plantilla){
            if(integrante instanceof Futbolista)
            System.out.println(integrante.toString());     
        }
        
        
        
        
        
    }
    
}
