/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionreservas;

/**
 *
 * @author Alumno
 */
public class Reserva implements Consulta{
    int nreserva;
    int napartamento;
    int mes;
    Huesped huesped;

    public Reserva(int nreserva, int napartamento, int mes, Huesped huesped) {
        this.nreserva = nreserva;
        this.napartamento = napartamento;
        this.mes = mes;
        this.huesped = huesped;
    }

    public int getNreserva() {
        return nreserva;
    }

    public void setNreserva(int nreserva) {
        this.nreserva = nreserva;
    }

    public int getNapartamento() {
        return napartamento;
    }

    public void setNapartamento(int napartamento) {
        this.napartamento = napartamento;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    @Override
    public String consulta() {
       return (" Numero de la reserva: " +nreserva+ " Numero de apartamento: " +napartamento+ " Numero del mes: " +mes+ " Huesped: " +huesped.consulta());
    }
    
    
            
}
