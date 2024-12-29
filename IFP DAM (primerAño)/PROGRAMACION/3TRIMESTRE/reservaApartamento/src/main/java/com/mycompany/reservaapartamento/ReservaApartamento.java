/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reservaapartamento;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge Wang Wang
 * @version 1.0.0
 * IMPORTANTE, la base de datos la cree directamente dentro de xampp por lo que no funcionara el programa si no esta creada la base de datos apartamentos.
 */
public class ReservaApartamento {

    public static void main(String[] args) {
        
        gestionReserva ge = new gestionReserva();
        ge.crearTabla();
        boolean bucle = true;//booleano para que funcione el bucle
        Scanner sc = new Scanner(System.in);
        ArrayList<reserva> aparta = new ArrayList<>();
        aparta = rellenarArray(aparta, ge);//rellena el arrayList de los datos anteriores
        
        while(bucle){
            //menu
        System.out.println("\nMenú de Opciones");
            System.out.println("1-Alta Reserva");
            System.out.println("2-Consultar Reserva");
            System.out.println("3-Cancelar Reserva");
            System.out.println("4-Salir");
            int elegir = sc.nextInt();//recoge el dato del usuario
            switch(elegir){
                case 1->{//alta
                    AltaReserva(sc, ge);//se realiza la funciones de reserva
                    aparta = rellenarArray(aparta, ge);//se rellena el arraylist con todos los datos nuevos
                }
                case 2->{//consultar
                    for (reserva r1 : aparta) {
                        System.out.println(r1.Consulta());
                    }
                }
                case 3->{//eliminar
                    System.out.println("Seleccione el numero de reserva que desea eliminar");
                    ge.ConsultarReserva();// saca una lista con el numero de reserva y sus datos
                    int numero_reser = sc.nextInt(); //recoge la eleccion del usuario
                    ge.EliminarReserva(numero_reser);//elimina el dato
                    aparta = rellenarArray(aparta, ge);//rellena el arrayList
                }
                case 4->{
                    System.out.println("Gracias por usar el programa");
                    bucle = false;// cambia el boleano para salir del bucle
                    
                }
                default->{//en caso que inserten otro numero
                    System.out.println("ERROR ese numero no esta en el menú");
                }
            }
        }
    }
/**
 * Metodo que sirve para actualizar el arrayList por cada cambio que haya en la base de datos
 * @param aparta arrayList para rellenarle los datos
 * @param ge objeto que sirve para acceder a sus metodos
 * @return devuelve el arrayList actualizado
 */
    public static ArrayList<reserva> rellenarArray(ArrayList<reserva> aparta, gestionReserva ge) {
        aparta.clear();
        aparta = ge.RellenarArrayList();//metodo que devuelve un arrayList actualizado
        return aparta;
    }
/**
 * Metodo la cual recoge los datos y los introduce en la base de datos
 * @param sc scanner para poder tener opciones de entrada
 * @param ge objeto de gestion de reserva la cual sirve para acceder a sus metodos
 */
    public static void AltaReserva(Scanner sc, gestionReserva ge) {
        //pone el nombre
        System.out.println("Inserte Nombre");
        String nombre = sc.next();
        
        //pone el apellido
        System.out.println("Inserte el Apellido");
        String apellido = sc.next();
        
        //Inserte el dni
        System.out.println("Inserte su DNI");
        String DNI = sc.next();
        Huesped h1 = new Huesped(nombre,apellido,DNI);//crea el objeto huesped
        
        //Inserte el numero de reserva
        System.out.println("Inserte el numero de apartamento que desee");
        int numeroReserva = sc.nextInt();
        
        //inserta el mes
        System.out.println("Inserte mes");
        String mes = sc.next();
        reserva r2 = new reserva(numeroReserva,mes,h1);
        ge.insertarReserva(r2);
        
        System.out.println("Se realizo correctamente la reserva");
    }
    
}
