/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJHerencia;

/**
 *
 * @author yeism
 */
//LO DE ABSTRACT A LA CLASE SE LO ACABO DE PONER YO SI NO VA EN CASA QUITARLO
public abstract class Almacen {
    private String nombre;
    private String fechaCad;
    private int codigo;

public Almacen(String nombre, String fechaCad, int codigo ){
    this.nombre= nombre;
    this.fechaCad= fechaCad;
    this.codigo= codigo;
        }

    public Almacen() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaCad() {
        return fechaCad;
    }
    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}