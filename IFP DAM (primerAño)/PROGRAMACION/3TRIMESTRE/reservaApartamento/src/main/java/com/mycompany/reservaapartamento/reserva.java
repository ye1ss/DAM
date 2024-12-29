/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reservaapartamento;

/**
 *
 * @author Jorge Wang Wang
 */
public class reserva implements consulten{
    protected int numero;
    protected String mes;
    protected Huesped huesped;

    public reserva(int numero, String mes, Huesped huesped) {
        this.numero = numero;
        this.mes = mes;
        this.huesped = huesped;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
    
    @Override
    public String Consulta() {
        return "Numero de apartamento: " + numero + " ,mes: "+ mes + " ,Nombre Huesped: " +huesped.getNombre() +" ,Apellido " + huesped.getApellido() + " ,DNI: " + huesped.getDNI();
    }
    
}
