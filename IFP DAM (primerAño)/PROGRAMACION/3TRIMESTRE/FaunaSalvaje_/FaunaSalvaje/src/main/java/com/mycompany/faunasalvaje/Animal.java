/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faunasalvaje;

/**
 *
 * @author Yeismil
 */
public class Animal {
    public String Nombre, fechaEntrada, especie, tipoLesion, gravedad;
    public String peso;

    public Animal(String Nombre, String fechaEntrada, String especie, String tipoLesion, String gravedad, String peso) {
        this.Nombre= Nombre;
        this.fechaEntrada = fechaEntrada;
        this.especie = especie;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
        this.peso = peso;
    }
    
        public String getNombre() {
        return Nombre;
    }

    public void setNombre(String fechaEntrada) {
        this.Nombre = fechaEntrada;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    @Override
    public String toString(){
    return "Nombre: "+ getNombre()+" Fecha de entrada: "+ getFechaEntrada()+ " Especie: "+ getEspecie()+ " Tipo de lesión: "+ getTipoLesion()+ " Gravedad: "+ getGravedad()+ " Peso: "+ getPeso()+"";
}
    
}
