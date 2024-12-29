/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bbdd;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Alumno
 */
public class Persona {
    
    String name;
    String lastname;
    String phone;
    LocalDate created_at;

    public Persona() {
    }

    public Persona(String name, String lastname, String phone, LocalDate created_at) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.created_at = created_at;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
    
    
    
}
