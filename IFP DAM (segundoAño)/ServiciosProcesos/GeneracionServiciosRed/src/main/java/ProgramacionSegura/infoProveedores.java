/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramacionSegura;

import java.security.Provider;
import java.security.Security;


/**
 *
 * @author Alumno
 */
public class infoProveedores {
    
    public static void main(String[] args) {
        System.out.println("Proveedores instalados en el sistema.");
        Provider[] listaProveedores= Security.getProviders();
        for (int i =0;i < listaProveedores.length; i++){
            System.out.println("Número proveedor: " +(i +1));
            System.out.println("Nombre: " +listaProveedores[i].getName());
            System.out.println("Versión: " +listaProveedores[i].getVersionStr());
            System.out.println("Información: " +listaProveedores[i].getInfo());
            System.out.println("-------------------------------");
        }
    }
}
