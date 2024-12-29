/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.envioobjetostcp;

/**
 *
 * @author Alumno
 */
public class numeros implements java.io.Serializable{
    
    private int numero;
    private long cuadrado;
    private long cubo;

    // Constructor con parámetros
    public numeros(int numero) {
        this.numero = numero;
        this.cuadrado = numero * numero;
        this.cubo = numero * numero * numero;
    }

    // Constructor sin parámetros
    public numeros() {
        this.numero = 0;
        this.cuadrado = 0;
        this.cubo = 0;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        this.cuadrado = numero * numero;
        this.cubo = numero * numero * numero;
    }

    public long getCuadrado() {
        return cuadrado;
    }

    public long getCubo() {
        return cubo;
    }
}
