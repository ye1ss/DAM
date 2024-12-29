/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clubmontebd;



/**
 *
 * @author Alumno
 */
public class Socios {
        String name;
        String lastname;
        String actividad;

    public Socios(String name, String lastname, String actividad) {
        this.name = name;
        this.lastname = lastname;
        this.actividad = actividad;
    }
        
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getActividad() {
        return actividad;
    }
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }      
         
}
