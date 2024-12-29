/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJHerencia;

/**
 *
 * @author yeism
 */
public class pFresco extends Almacen {
    private String fechaEnvasado;
    private String pais;
    
    public pFresco(){
        super();
        this.fechaEnvasado= null;
        this.pais= null;
    }
    public pFresco(String nombre, String fechaCad, int codigo, String fechaEnvasado, String pais){
        super(nombre, fechaCad, codigo);
        this.fechaEnvasado= fechaEnvasado;
        this.pais= pais;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
    return "Producto Fresco= [Nombre: "+getNombre()+" ,Fecha Caducidad: "+getFechaCad()+" ,Código: "+getCodigo()+" ,Fecha Envasado: "+getFechaEnvasado()+" ,Pais: "+getPais()+"]";
}
    
}
