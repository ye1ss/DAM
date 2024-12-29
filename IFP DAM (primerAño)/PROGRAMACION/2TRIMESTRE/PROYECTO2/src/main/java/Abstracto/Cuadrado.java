package Abstracto;


import Abstracto.FiguraAbstracta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Cuadrado extends FiguraAbstracta {
    private double lado;
    
    public Cuadrado(String color, double lado){
        super(color);
        this.lado= lado;
    }
    @Override
    public double calcularArea(){
        return lado* lado;
    }
}
class Triangulo extends FiguraAbstracta{
    private double base;
    private double altura;

public Triangulo(String color, double base, double altura){
    super(color);
    this.base= base;
    this.altura= altura;
}
    @Override
    public double calcularArea(){
        return(base* altura)/2;
    }
}