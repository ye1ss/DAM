/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faunasalvaje;
/**
 *
 * @author Yeismil
 */
public class Aves extends Animal{
    public boolean cazaFurtiva;

    public Aves(boolean cazaFurtiva, String Nombre, String fechaEntrada, String especie, String tipoLesion, String gravedad, String peso) {
        super(Nombre, fechaEntrada, especie, tipoLesion, gravedad, peso);
        this.cazaFurtiva = cazaFurtiva;
    }

    public boolean isCazaFurtiva() {
        return cazaFurtiva;
    }

    public void setCazaFurtiva(boolean cazaFurtiva) {
        this.cazaFurtiva = cazaFurtiva;
    }

    
    
}
