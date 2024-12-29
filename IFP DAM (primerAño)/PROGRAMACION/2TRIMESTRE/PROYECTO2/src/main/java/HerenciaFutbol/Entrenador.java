/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaFutbol;

/**
 *
 * @author Alumno
 */
public class Entrenador extends ClubF{
    
    private String idFederacion;
   
    //constructor, getter y setter

    public Entrenador(String idFederacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    @Override
    public String toString(){
        return"Entrenador= [Nombre y apellido: "+getNombre()+" "+ getApellidos()+" Edad: "+getEdad()+" ID: "+getId()+" IdFederación: "+getIdFederacion()+"]";
    }
    
    public void dirigirPartido(){

    }
    public void dirigirEntreno(){

    }
    
}
