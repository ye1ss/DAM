package Abstracto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Alumno
 */
public abstract class FiguraAbstracta {
    private String color;

    public FiguraAbstracta(String color){
        this.color= color;
    }
    public abstract double calcularArea();

    public String getColor(){
        return color;
    }
}