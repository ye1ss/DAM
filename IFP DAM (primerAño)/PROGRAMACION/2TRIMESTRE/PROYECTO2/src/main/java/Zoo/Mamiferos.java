/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */

//decir pelo(y que sea boleano), meses gestacion, y dos clases de mamifero perro y tigre
//de perro y tigure decir si son peligrosos o no la raza, peso, que comen... HACER OTRAS DOS CLASES DE PERRO Y TIGURE QUE VENGAN DE MAMIFERO

public class Mamiferos extends Animales {
    public String pelo;
    public int meses;
    
    private void correr(){
    }

    public Mamiferos(String pelo, int meses, String especie, String nombre, int edad) {
        super(especie, nombre, edad);
        this.pelo = pelo;
        this.meses = meses;
    }

    public String getPelo() {
        return pelo;
    }
    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public void comer() {
        System.out.println("Come");
    }

    @Override
    public void morir() {
        
    }
    
    
}
