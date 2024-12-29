/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaFutbol;

/**
 *
 * @author Alumno
 */
public class Masajista extends ClubF{
        
    private String Titulacion;
    private int AniosExperiencia;
    
    //constructor, getter y setter
    public Masajista(String Titulacion, int AniosExperiencia, int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.AniosExperiencia = AniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }
    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }
    public int getAniosExperiencia() {
        return AniosExperiencia;
    }
    public void setAniosExperiencia(int AniosExperiencia) {
        this.AniosExperiencia = AniosExperiencia;
    }
    
    
    
    @Override
    public String toString(){
        return"Masajista= [Nombre y apellido: "+getNombre()+" "+ getApellidos()+" Edad: "+getEdad()+" ID: "+getId()+" Titulacón: "+getTitulacion()+" Años de experiencia: "+getAniosExperiencia()+"]";
    }
    
    public void darMasaje(){
        
    }
    
}
