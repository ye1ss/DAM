/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author yeism
 */

public class Coche {
        
        private int numero;
        private String marca;
        private String modelo;
        private int plazas;
        private double precio;
 
    public Coche(int numero, String marca, String modelo, int plazas, double precio) {
        
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
        this.plazas = plazas;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getPlazas() {
        return plazas;
    }
    public double getPrecio() {
        return precio;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Metodo que convierte los datos en una cadena para después poder imprimir
     * @return devuelve la cadena con los datos para depues usar e imprimir
     */
    @Override
    public String toString(){
        return "Coche("+"Numero=" +numero+ ", Marca=" + marca + ", Modelo=" + modelo + ", Plazas=" + plazas + ", Precio=" + precio + ")";
    }
    
 }
