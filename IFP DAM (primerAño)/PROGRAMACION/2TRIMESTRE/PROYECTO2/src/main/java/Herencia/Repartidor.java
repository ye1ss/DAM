package Herencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alumno
 */
public class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String zona, String nombre, String apellido, int edad, int salario) {
        super(nombre, apellido, edad, salario);
        this.zona = zona;
    }

    
    public Repartidor() {
        this.zona="";
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public String toString(){
    return "Repartidor [getZona()=" + getZona()+ ", getNombre()=" + getNombre()+ ", getApellido()=" + getApellido()+ ", getEdad()=" + getEdad()+
                ", getSalario()=" + getSalario()+"]";
    }
}
