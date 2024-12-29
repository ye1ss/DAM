 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package concesionario;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Realiza
 * @author yeism
 * @version 10
 * 
 * 
 */
public class Concesionario {

    public static void main(String[] args) {
        
        //Creamos una lista con los coches que tenemos en el concesionario
        ArrayList<Coche> Coches = new ArrayList<>();
        Coche c1= new Coche(1, "Mercedes Benz", "Clase A", 7, 30);
        Coche c2= new Coche(2, "Audi", "R8", 2 , 32);
        Coche c3= new Coche(3, "Volkswagen", "Golf", 5, 24);
        Coche c4= new Coche(4, "BMW", "X4", 5, 32);
        Coche c5= new Coche(5, "Ford", "E-Transit", 9, 19);
        Coche c6= new Coche(6, "Lexus", "NX 350", 5, 28);
        Coche c7= new Coche(7, "Seat", "Leon", 7, 25);
        Coche c8= new Coche(8, "Porsche", "911", 2, 45);
        Coche c9= new Coche(9, "Tesla", "Model S", 5, 38);
        Coche c10= new Coche(10, "Toyota", "Proace", 9, 28);
        
        //Añadimos todos los coches
        Coches.add(c1);
        Coches.add(c2);
        Coches.add(c3);
        Coches.add(c4);
        Coches.add(c5);
        Coches.add(c6);
        Coches.add(c7);
        Coches.add(c8);
        Coches.add(c9);
        Coches.add(c10);
        
        try {
            
        //Damos la bienvenida y preguntamos el número de plazas que quiere     
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Hola, bienvenido al concesionario YeisAuto"); 
        
        System.out.println("¿Que número de plazas necesitas para el coche que quieres arquilar?");
        num1=sc.nextInt();
        
        //Le mostramos los coches que estan disponibles con ese número de plazas
        System.out.println("  ");
        System.out.println("Estos son los coches que tienes con esas plazas:");
        System.out.println("  ");
        
            if ((num1)<=1){
                System.out.println("Elije otro número de plazas, no existen coches con cero plazas");
            }
            else {
                for(Coche o: Coches){
                if (o.getPlazas()>=num1){
                System.out.println(o);
            }
        }
        System.out.println("  ");
        
        //Escogemos el coche que queremos e indicamos cual ha sido el selecionado
        int num2;
        System.out.println("Escribe el número del coche que quieres");
        num2=sc.nextInt();
        System.out.println("  ");
        System.out.println("Has elegido el coche:");
        
        //Muestra por pantalla el coche que has elejido
        if(Coches.get(num2-1).getNumero()==num2) {
           System.out.println(Coches.get(num2-1).toString());
         }            
        System.out.println("  ");
        
        //Preguntamos por cuantas horas quiere alquilar el coche y le calculamos el precio
        int num3;
        System.out.println("¿Por cuantas horas deseas arquilar el coche?");
        num3=sc.nextInt();
        System.out.println("  ");
        
        //Esto servira para al poner num4 nos de el resultado de la operación
        double num4;
        num4=num3* (Coches.get(num2-1).getPrecio());
        
        System.out.println("El precio de tu alquiler sera de "+ num4 +" €");
        System.out.println("  ");
        
        //Indicamos que nos de los datos necesarios para alquilar
        System.out.println("Para poder reservar el coche introduce los siguientes datos, porfavor");
        System.out.println("  ");
        
        String num5;
        String num6;
        
        System.out.println("Introduce tu nombre, porfavor");
        num5=sc.next();
        
        System.out.println("Introduce el DNI, porfavor");
        num6=sc.next();
        System.out.println("  ");
        
        //Le enseñamos la factura del alquiler que ha hecho
        System.out.println("FACTURA DEL ALQUILER:");
        System.out.println(Coches.get(num2-1).toString());
        System.out.println("Nombre: " +num5);
        System.out.println("DNI: " +num6);
        System.out.println("Precio horas alquiladas: " +num4+ " €");
        }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        
        
    }    
}  
}