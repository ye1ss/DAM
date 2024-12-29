package ConexionBDD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




/**
 *
 * @author Alumno
 */
public class Conectar {

    /**
     * @param args the command line arguments
     */
        String irl= "jbc:mysql://";
        String user= "root";
        String pass= "";       
        Conection conection= null;
        
    public Conection conectar(){
        // TODO code application logic here
        try{
            System.out.println("Intenta conectar a la BDD");
            
        }catch(SQLException ex){
            System.out.println("Se ha producido un error");
            
        }
    }
    
}
