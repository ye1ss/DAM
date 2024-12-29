/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */
public class Perro extends Mamiferos {
    private String raza;
    private boolean peligroso;
    
    private void ladrar(){      
    }

    public Perro(String raza, boolean peligroso, String pelo, int meses, String especie, String nombre, int edad) {
        super(pelo, meses, especie, nombre, edad);
        this.raza = raza;
        this.peligroso = peligroso;
    }
    
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public boolean isPeligroso() {
        return peligroso;
    }
    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }
    
    
}
