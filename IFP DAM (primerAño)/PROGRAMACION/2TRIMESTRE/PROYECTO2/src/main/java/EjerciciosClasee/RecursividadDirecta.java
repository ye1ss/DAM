/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosClasee;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class RecursividadDirecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]array={0,1,2,3,4,5,6,7,8,9,10};
        int[]array2={9,7,5,3,1,10,8,6,4,2,0};
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero =entrada.nextInt();
        
        int posicionElemento=busca(array, numero,0);
        
        if (posicionElemento==-1)
            System.out.println("El array no contiene el elemento soliciotado");
        else
            System.out.println("El elemento se encuentra en la posición "+posicionElemento);
    }
    
    public static int busca(int[]array, int elementoBuscar, int indice){
        if(indice==array.length || array[indice]==elementoBuscar){
                
            if (indice==array.length){
                return -1;
            }else{
                return indice;
            }
            }else{
                return busca(array, elementoBuscar,indice+1); 
            }
    }
    }


