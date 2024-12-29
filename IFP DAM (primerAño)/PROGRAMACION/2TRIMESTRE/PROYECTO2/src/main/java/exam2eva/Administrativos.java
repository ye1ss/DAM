/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2eva;

/**
 *
 * @author Alumno
 */
public class Administrativos extends Trabajadores{

    public Administrativos(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }
    
    @Override
    public String toString(){
        return "Administrativo= [Nombre y apellido: "+getNombre()+" "+ getApellido()+" DNI: "+getDni()+"]";
    }
}
