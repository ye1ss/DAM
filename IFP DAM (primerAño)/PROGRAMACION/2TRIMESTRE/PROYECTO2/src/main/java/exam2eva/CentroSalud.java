/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam2eva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class CentroSalud {

    /**
     * @param args the command line arguments
     */
    
 
    public static ArrayList <Trabajadores> empleados= new ArrayList();
    public static void main(String[] args) {
        
        int opcion;
        
        Scanner sc= new Scanner(System.in);
         
        while(true){
            opcion = mostrarMenu(sc);
            
            switch(opcion){
                case 0:
                    dardealta();
                break;
                
                case 1:
                    listartrabajadores();
                break;
                
                case 2:
                    listarporturnos();
                break;
                
                //El salir lo hago aqui como una opcion mas simple
                case 3:
                    System.out.println("Has salido de la web del centro de salud");
                    System.exit(0);
                break;
            }
        }
        
    }
    //Esto lo he echo con un refactor, introduce y method
    private static int mostrarMenu(Scanner sc) {
        int opcion;
        System.out.println("Hola, Bienvenido a la web de nuestro centro de salud.");
        System.out.println("Escoge el número de la tarea que deseas realizar: ");
        System.out.println("0. Dar de Alta a un trabajador.");
        System.out.println("1. Seleccionar un tipo de trabajador y listar los trabajadores de ese tipo, incluyendo toda su información asociada.");
        System.out.println("2. Selecionar un turno y ver los trabajadores disponibles en dicho turno.");
        System.out.println("3. Salir");
        System.out.println("Escoge la opción que deseas: ");
        opcion = sc.nextInt();
        return opcion;
    }
    //Preguntamos cual quiere dar de alta lo escribe y lo imprimimos
        private static void dardealta(){
          Scanner scc= new Scanner(System.in);    
            String nombre;
            String apellido;
            String dni;
            
            System.out.println("Para dar de alta necesitamos que des los datos de Nombre, Apellido y DNI, porfavor. ");
            
            System.out.println("Nombre: ");nombre=scc.next();
            System.out.println("Apellido: ");apellido=scc.next();
            System.out.println("DNI: ");dni=scc.next();
            
            String n =nombre;
            String a=apellido;
            String d=dni;
            
            System.out.println("Se ha dado de alta al trabajador: ");
            System.out.println( nombre+ ", " +apellido+ "y " +dni );
            System.exit(0);
        }
        //Con el array creamos a los trabajadores y luego les asignamos un número para imprimirlo segun queramos
        private static void listartrabajadores(){
        Medicos m1= new Medicos("Mañana", "Operaciones", "Juan", "Flores", "47808633L");
        Enfermeros e1= new Enfermeros("Tarde", "Natalia", "Avilés", "53285599G");
        Administrativos a1= new Administrativos("Luis", "Foco", "44932650J");
        empleados.add(m1);
        empleados.add(e1);
        empleados.add(a1);
        
            Scanner trabajador= new Scanner(System.in);
            int trabajadoor;
            System.out.println("Selecciona el tipo de trabajador, para ver los trabajadores con sus datos.");
            System.out.println("El Médico es 1 , Enfermero es 2 y Administrativos es 3.");
            System.out.println("Número del tipo de trabajador: ");trabajadoor=trabajador.nextInt();
            if ((trabajadoor)==1){
                System.out.println(m1);
            }
            if((trabajadoor)==2){
                System.out.println(e1);
            }
            else{
                System.out.println(a1);
            }
            System.exit(0);
            
        }
        //Usamos el mismo array de antes, ponemos número a los turnos de por la tarde o mañana y lo imprimimos segun lo que seleccionemos
        private static void listarporturnos(){
        
        Medicos m1= new Medicos("Mañana", "Operaciones", "Juan", "Flores", "47808633L");
        Enfermeros e1= new Enfermeros("Tarde", "Natalia", "Avilés", "53285599G");
        Administrativos a1= new Administrativos("Luis", "Foco", "44932650J");
        empleados.add(m1);
        empleados.add(e1);
        empleados.add(a1); 
        
           Scanner turno= new Scanner(System.in);
            int turnoo;
            System.out.println("Selecciona el turno de un trabajador, para ver los trabajadores disponibles de ese turno.");
            System.out.println("El turno de mañana es 1 y el turno de tarde es 2.");
            System.out.println("Número del turno: ");turnoo=turno.nextInt();
            if ((turnoo)<=1){
                System.out.println(m1);
            }
            else{
                System.out.println(e1);
            }
            System.exit(0);
        }
}            
    
    

