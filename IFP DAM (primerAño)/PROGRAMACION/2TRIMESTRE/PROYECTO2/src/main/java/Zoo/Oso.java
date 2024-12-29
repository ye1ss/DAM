/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */
public class Oso extends Mamiferos {
    private String raza;
    
    private void grunido(){
    }

    public Oso(String raza, String pelo, int meses, String especie, String nombre, int edad) {
        super(pelo, meses, especie, nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
