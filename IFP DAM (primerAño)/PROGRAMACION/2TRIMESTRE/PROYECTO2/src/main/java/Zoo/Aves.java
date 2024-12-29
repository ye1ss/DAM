/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Zoo;

/**
 *
 * @author Alumno
 */

//decir número de huevos que ponen que tiempo de vuelo
// hacer ave rapaz y acuatica ponerle caracteristicas HACERLO EN DOS CLASES MAS Y QUE VENGAN DE AVES

public class Aves extends Animales {
    public int nHuevos;
    public String tipoPatas;
    
    private void volar(){
    }
    
    public Aves(int nHuevos, String tipoPatas, String especie, String nombre, int edad) {
        super(especie, nombre, edad);
        this.nHuevos = nHuevos;
        this.tipoPatas = tipoPatas;
    }

    public int getnHuevos() {
        return nHuevos;
    }
    public void setnHuevos(int nHuevos) {
        this.nHuevos = nHuevos;
    }
    public String getTipoPatas() {
        return tipoPatas;
    }
    public void setTipoPatas(String tipoPatas) {
        this.tipoPatas = tipoPatas;
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void morir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
