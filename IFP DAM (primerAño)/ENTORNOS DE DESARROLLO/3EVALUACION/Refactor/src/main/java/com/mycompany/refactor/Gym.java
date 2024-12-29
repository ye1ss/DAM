/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.refactor;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Gym {

    public static void main(String[] args) {
       
        String[][] array = new String[20][3];
        String[][] array2 = {
            {"Pilates", "0", "10"},
            {"Yoga", "0", "4"},
            {"Natacion", "0", "10"},
            {"Powerlifting", "0", "4"},
            {"Crossfit", "0", "2"}
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Escoge la acción deseada: \n");
            System.out.println("Alta\nMostrar\nSalir\n");
            String x = sc.nextLine().toLowerCase().trim();
            while (!x.equals("alta")
                    && !x.toLowerCase().equals("mostrar")
                    && !x.toLowerCase().equals("salir")) {

                System.out.println("\nMal input, opciones válidas: ");
                System.out.println("Alta\nMostrar\nSalir\n");
                x = sc.nextLine().toLowerCase().trim();
            }
            if (x.equals("salir")) {
                break;
            } else if (x.equals("alta")) {

                String[][][] array3 = {array, array2};
                String[][] otroarray = array3[0];
                String[][] array4 = array3[1];
                Scanner sc1 = new Scanner(System.in);
                System.out.println("\nIntroduce el nombre del cliente:\n");
                String aa = sc1.nextLine();
                while (aa.equals("") || !aa.matches(".*[A-za-z].*")) {
                    System.out.println("Un nombre no puede estar en blanco y solo puede contener letras (sin tildes)");
                    aa = sc1.nextLine();
                }
                System.out.println("Introduce hasta dos actividades:");
                System.out.println("(Puedes dejarlo en blanco si no quieres apuntarte a ninguna)\n");
                System.out.println("Actividades posibles:\nPilates\nYoga\nNatacion\nPowerlifting\nCrossfit\n");
                System.out.println("Actividad 1:\n");
                String y = metodo2(array4);
                while (y == null) {
                    y = metodo2(array4);
                }
                System.out.println("Actividad 2:\n");
                String z = metodo2(array4);
                while (z == null || (y.equals(z) && !y.equals(""))) {
                    System.out.println("\nError: Has introducido dos veces la misma actividad!\n");
                    System.out.println("Actividad 2:\n");
                    for (int i = 0; i < array4.length; i++) {
                        
                        if (array4[i][0].toLowerCase().equals(z)) {
                            array4[i][1] = String.valueOf(Integer.parseInt(array4[i][1]) - 1);
                        }
                    }
                    z = metodo2(array4);
                }
                for (int i1 = 0; i1 < otroarray.length; i1++) {
                    boolean added = false;
                    //si no hay un nombre, esta vacio
                    if (otroarray[i1][0] == null) {
                        otroarray[i1][0] = aa;
                        otroarray[i1][1] = y;
                        otroarray[i1][2] = z;
                        System.out.println("Cliente " + aa + " dado de alta, \nActividades: " + y + " " + z + "\n");
                        added = true;
                        break;
                    }
                    if (i1 == 19 && added == false) {
                        System.out.println("Parece que no hay hueco para dar de alta a mÃ¡s clientes, disculpa las molestias!");
                        break;
                    }
                }
                String[][][] array5 = {otroarray, array4};
                String[][][] arry6 = array5;
                array = arry6[0];
                array2 = arry6[1];
            } else if (x.equals("mostrar")) {
                for (int i = 0; i < array.length; i++) {
                    //guardia
                    if (array[i][0] == null) {
                        continue;
                    }
                    System.out.println("\nCliente " + array[i][0]);
                    System.out.println("Actividad 1: " + array[i][1]);
                    System.out.println("Monitor asociado: " + metodo(array[i][1]));
                    System.out.println("Actividad 2: " + array[i][2]);
                    System.out.println("Monitor asociado: " + metodo(array[i][2]) + "\n");
                }
            }
        }
        System.out.println("Gracias por usar nuestros servicios");
        System.exit(0);
    }


    public static String metodo(String paramarray) {
        if (paramarray.equals("")) {
            return "Nadie";
        } else if (paramarray.equals("pilates")) {
            return "Elena";
        } else if (paramarray.equals("yoga")) {
            return "Juan";
        } else if (paramarray.equals("natacion")) {
            return "Carlos";
        } else if (paramarray.equals("powerlifting")) {
            return "Laura";
        } else if (paramarray.equals("crossfit")) {
            return "Lucas";
        }
        return null;
    }




    public static String metodo2(String[][] paramarray) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase().trim();
        while (!a.equals("pilates")
                && !a.equals("yoga")
                && !a.equals("natacion")
                && !a.equals("powerlifting")
                && !a.equals("crossfit")
                && !a.equals("")) {
            System.out.println("\nMal input");
            System.out.println("Actividades posibles:\nPilates\nYoga\nNatacion\nPowerlifting\nCrossfit\n");
            System.out.println("(Puedes dejarlo en blanco si no quieres apuntarte a ninguna)\n");
            a = sc.nextLine().toLowerCase().trim();
        }
        if (a.equals("")) {
            return a;
        }
        for (int i = 0; i < paramarray.length; i++) {
            System.out.println(paramarray[i][0]);
            if (a.equals(paramarray[i][0].toLowerCase())) {
                if (Integer.parseInt(paramarray[i][1]) < Integer.parseInt(paramarray[i][2])) {
                    paramarray[i][1] = String.valueOf(Integer.parseInt(paramarray[i][1]) + 1);
                    System.out.println("\nActividad " + paramarray[i][0] + "\nCliente nÃºmero: " + paramarray[i][1] + "\n");
                    return a;
                } else {
                    System.out.println("Parece que no hay hueco en esa actividad\nPrueba con otra:");
                    return null;
                }
            }
        }
        return null;
    }
}
    

