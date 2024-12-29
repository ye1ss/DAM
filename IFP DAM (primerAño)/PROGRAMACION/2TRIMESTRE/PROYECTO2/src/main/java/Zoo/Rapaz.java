/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */
public class Rapaz extends Aves {
    private String presa;
    private boolean carroñero;
    
    private void ceñirse(){
    }

    public Rapaz(String presa, boolean carroñero, int nHuevos, String tipoPatas, String especie, String nombre, int edad) {
        super(nHuevos, tipoPatas, especie, nombre, edad);
        this.presa = presa;
        this.carroñero = carroñero;
    }

    public String getPresa() {
        return presa;
    }
    public void setPresa(String presa) {
        this.presa = presa;
    }
    public boolean isCarroñero() {
        return carroñero;
    }
    public void setCarroñero(boolean carroñero) {
        this.carroñero = carroñero;
    }

    
    
}
