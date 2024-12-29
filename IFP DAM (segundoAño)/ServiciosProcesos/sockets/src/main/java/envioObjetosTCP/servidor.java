/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package envioObjetosTCP;

/**
 *
 * @author Alumno
 */
public class servidor {
    try{
        int puerto= 6000;
        ServidorSocket servidor= new ServerSocket(puerto);
        
            System.out.println("Escuchando en el puerto: "+servidor.getLocalPort());
            System.out.println("Esperando al cliente");
    }
}
