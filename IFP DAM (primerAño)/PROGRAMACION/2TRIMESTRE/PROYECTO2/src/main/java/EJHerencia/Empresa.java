/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJHerencia;

import java.util.ArrayList;

/**
 *
 * @author yeism
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista= new ArrayList();
        pFresco f1= new pFresco("Aguacate", "14/3/2023", 23, "13/2/2023", "España");
        
        lista.add(f1);
        
        System.out.println(lista.get(0));
    }
    
}
