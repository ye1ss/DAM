/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJClaseAbstracta;

/**
 *
 * @author Alumno
 */
public class ClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma suma1= new Suma(8,5);
        suma1.operar();
        
        Resta resta1= new Resta(10,5);
        resta1.operar();
        
        Multiplicar multiplicar1= new Multiplicar(7,7);
        multiplicar1.operar();
        
        Division division1= new Division(81,9);
        division1.operar();
    }
}

        class Suma extends Operacion{
        public Suma(double dato1, double dato2) {
        super(dato1, dato2);
                }  
            public void operar(){
                resultado= dato1 +dato2;
                System.out.println("La suma de los números es "+resultado);
            }
        }

        class Resta extends Operacion{
        public Resta(double dato1, double dato2) {
        super(dato1, dato2);
                }
            public void operar(){
                resultado= dato1 -dato2;
                System.out.println("La resta de los números es "+resultado);
            }
        }      
        
        class Multiplicar extends Operacion{
        public Multiplicar(double dato1, double dato2) {
        super(dato1, dato2);
                }
            public void operar(){
                resultado= dato1 *dato2;
                System.out.println("La multiplicación de los números es "+resultado);
            }
        }    
        
 
        class Division extends Operacion{

    public Division(double dato1, double dato2) {
        super(dato1, dato2);
                }
            public void operar(){
                resultado= dato1 /dato2;
                System.out.println("La división de los números es "+resultado);
            }    
        }
        
    
   

