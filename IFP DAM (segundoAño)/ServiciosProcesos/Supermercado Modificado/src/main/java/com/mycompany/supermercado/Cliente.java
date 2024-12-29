/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercado;

/**
 *
 * @author yeismil del rosario
 */
public class Cliente {
    //Nombre de los clientes
    String nombre;
    //Array de String para la lista de la compra, llamarlo (carro de la compra)
    String[] carroCompra;
    
    public Cliente(String nombre, String[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getCarroCompra() {
        return carroCompra;
    }
}
//    public Cliente(String nombre, String[] carroCompra){
//        this.nombre = nombre;
//        this.CarroCompra = carroCompra;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setCarroCompra(String[] carroCompra) {
//        CarroCompra = carroCompra;
//    }
//
//    @Override
//    public String toString(){
//        String carro = String.join(", ", CarroCompra);
//        return "Nombre del cliente: "+nombre+", Carro de la compra: "+carro;
//    }


