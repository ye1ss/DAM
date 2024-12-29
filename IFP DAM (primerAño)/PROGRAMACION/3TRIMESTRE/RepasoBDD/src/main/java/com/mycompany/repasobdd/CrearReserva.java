/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasobdd;

/**
 *
 * @author yeism
 */
class CrearReserva {
     int id;
     String nombre;
     String apellido;
     int nPersonas;
     int diaReserva;

    public CrearReserva(int id, String nombre, String apellido, int nPersonas, int diaReserva) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nPersonas = nPersonas;
        this.diaReserva = diaReserva;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getnPersonas() {
        return nPersonas;
    }
    
    public int getdiaReserva(){
        return diaReserva;
    }
    
    @Override
    public String toString() {
       return (" Id: " +id+ " Nombre: " +nombre+ " Apellido: " +apellido+ " Numero de personas: " +nPersonas+ " Dia reserva: " +diaReserva);
    }
}