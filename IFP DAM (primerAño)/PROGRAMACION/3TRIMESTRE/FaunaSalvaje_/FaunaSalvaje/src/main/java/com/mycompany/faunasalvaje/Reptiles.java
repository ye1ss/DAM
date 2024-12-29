/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faunasalvaje;

/**
 *
 * @author Yeismil
 */
public class Reptiles extends Animal{
    public boolean infeccionBacteriana;

    public Reptiles(boolean infeccionBacteriana, String Nombre, String fechaEntrada, String especie, String tipoLesion, String gravedad, String peso) {
        super(Nombre, fechaEntrada, especie, tipoLesion, gravedad, peso);
        this.infeccionBacteriana = infeccionBacteriana;
    }

    public boolean isInfeccionBacteriana() {
        return infeccionBacteriana;
    }

    public void setInfeccionBacteriana(boolean infeccionBacteriana) {
        this.infeccionBacteriana = infeccionBacteriana;
    }
    
    
}
