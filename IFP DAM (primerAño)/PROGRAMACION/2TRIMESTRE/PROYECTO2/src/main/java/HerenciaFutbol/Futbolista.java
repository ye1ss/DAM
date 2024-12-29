/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaFutbol;

/**
 *
 * @author Alumno
 */
public class Futbolista extends ClubF {

    private int Dorsal;
    private String Demarcacion;

    //Hay que tener constructor en la case madre para que se me genere este constructor aqui
    //con el super y eso
    public Futbolista(int Dorsal, String Demarcacion, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.Dorsal = Dorsal;
        this.Demarcacion = Demarcacion;
    }
    //constructor, getter y setter
    public int getDorsal() {
        return Dorsal;
    }
    public void setDorsal(int Dorsal) {
        this.Dorsal = Dorsal;
    }
    public String getDemarcacion() {
        return Demarcacion;
    }
    public void setDemarcacion(String Demarcacion) {
        this.Demarcacion = Demarcacion;
    }

    @Override
    public String toString(){
        return"Futbolista= [Nombre y apellido: "+getNombre()+" "+ getApellidos()+" Edad: "+getEdad()+" ID: "+getId()+" Dorsal: "+getDorsal()+" Demarcación: "+getDemarcacion()+"]";
    }

    public void jugarPartido(){

    }
    public void entrenar(){

    }

}
