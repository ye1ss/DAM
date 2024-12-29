/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservaapartamento;

/**
 *
 * @author JorgeWang Wang
 */
public class Huesped implements consulten{
    protected String nombre;
    protected String apellido;
    protected String DNI;

    public Huesped(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String Consulta() {
        return "Nombre Huesped: " +nombre +" ,Apellido " + apellido + " ,DNI: " + DNI;
    }
    
}
