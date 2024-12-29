/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJClaseAbstracta;

/**
 *
 * @author Alumno
 */
public abstract class  Operacion {
    public double dato1, dato2, resultado;
    
public Operacion(double dato1, double dato2){
   this.dato1=dato1;
   this.dato2=dato2;
}
public Operacion(){
    this.dato1=10;
    this.dato2=20;
}
public abstract void operar();
    
    public void imprimir(){
          System.out.println(resultado);
        }
}