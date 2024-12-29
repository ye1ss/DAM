/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */
public class Acuatica extends Aves{
    private String habitat;
    
    private void bucear(){
    }

    public Acuatica(String habitat, int nHuevos, String tipoPatas, String especie, String nombre, int edad) {
        super(nHuevos, tipoPatas, especie, nombre, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
