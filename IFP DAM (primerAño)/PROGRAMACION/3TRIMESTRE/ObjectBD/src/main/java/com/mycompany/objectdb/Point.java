/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectdb;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Alumno
 */
@Entity
@NamedQueries({@NamedQuery(name="Point.buscar8", query= "SELECT p FROM Point p WHERE p.x=8")})
public class Point {

//Present Fields
private int x;
private int y;

//Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

//String
    @Override
    public String toString (){
    return String.format("(%d, %d)", this.x, this.y);
        
    }
}
