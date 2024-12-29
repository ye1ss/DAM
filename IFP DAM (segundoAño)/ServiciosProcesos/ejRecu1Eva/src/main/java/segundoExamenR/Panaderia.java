/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundoExamenR;


/**
 *
 * @author yeismil
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Panaderia {
    private static final int TOTAL_PANES = 200;
    private static final int MAX_CLIENTES = 30;

    private int panesDisponibles = TOTAL_PANES;
    private List<Cliente> clientesEsperando = new ArrayList<>();

    public synchronized int getPanesDisponibles() {
        return panesDisponibles;
    }

    public synchronized void venderPan(Dependiente dependiente) {
        if (!clientesEsperando.isEmpty()) {
            Cliente cliente = clientesEsperando.remove(0);

            // Verificar si hay suficientes panes para el cliente
            if (cliente.getPanesDeseados() <= panesDisponibles) {
                panesDisponibles -= cliente.getPanesDeseados();
                System.out.println("Dependiente " + dependiente.getId() + " atiende a Cliente " + cliente.getId() +
                        " y vende " + cliente.getPanesDeseados() + " panes. Quedan " + panesDisponibles + " panes.");
            } else {
                System.out.println("No hay suficientes panes para Cliente " + cliente.getId() +
                        ". Se va sin comprar.");
            }
        }
    }

    public synchronized void agregarCliente(Cliente cliente) {
        clientesEsperando.add(cliente);
    }

    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        Gestor gestor = new Gestor(panaderia);

        // Lanzar hilos de dependientes
        Thread dependiente1 = new Thread(new Dependiente(gestor, 1));
        Thread dependiente2 = new Thread(new Dependiente(gestor, 2));
        Thread dependiente3 = new Thread(new Dependiente(gestor, 3));

        dependiente1.start();
        dependiente2.start();
        dependiente3.start();

        // Crear clientes en un bucle
        for (int i = 1; i <= MAX_CLIENTES; i++) {
            Cliente cliente = new Cliente(gestor, i);
            gestor.agregarCliente(cliente);

            // Agregar un intervalo de tiempo aleatorio antes de crear el próximo cliente
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Dependiente implements Runnable {
    private Gestor gestor;
    private int id;

    public Dependiente(Gestor gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void run() {
        while (true) {
            //gestor.agregarCliente(this);
            gestor.despacharPan(this);
        }
    }
}

class Cliente {
    private Gestor gestor;
    private int id;
    private int panesDeseados;

    public Cliente(Gestor gestor, int id) {
        this.gestor = gestor;
        this.id = id;
        this.panesDeseados = new Random().nextInt(4) + 1;
    }

    public int getId() {
        return id;
    }

    public int getPanesDeseados() {
        return panesDeseados;
    }
}

class Gestor {
    private Panaderia panaderia;

    public Gestor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    public synchronized void despacharPan(Dependiente dependiente) {
        panaderia.venderPan(dependiente);
    }

    public synchronized void agregarCliente(Cliente cliente) {
        panaderia.agregarCliente(cliente);
    }
}

