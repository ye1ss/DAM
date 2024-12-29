package Herencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Herencia {

    public static void main(String[] args) {
        ArrayList <Empleado> Empleados = new ArrayList<>();
        
        Repartidor r1 = new Repartidor ("Norte", "Jose", "Luis", 20, 600);
        Comercial c1 = new Comercial ("Sandra", "Sol", 41, 650, 2);
        
        Empleados.add(r1);
        Empleados.add(c1);
        
        for(int i=0; i < Empleados.size(); i++){
            Empleados.get(i).plus(300);
            System.out.println(Empleados.get(i));
        }
        //System.out.println(c1.toString());
        
    }
}
