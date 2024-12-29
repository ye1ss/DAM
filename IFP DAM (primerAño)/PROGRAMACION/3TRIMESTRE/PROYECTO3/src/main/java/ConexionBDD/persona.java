/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBDD;

import java.time.LocalDate;

/**
 *
 * @author Alumno
 */
public class persona {
        String name;
        String lastname;
        String phone;
        LocalDate create_at;

    public persona() {
    }

        
    public persona(String name, String lastname, String phone, LocalDate create_at) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.create_at = create_at;
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

    public LocalDate getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDate create_at) {
        this.create_at = create_at;
    }
    
    
}
