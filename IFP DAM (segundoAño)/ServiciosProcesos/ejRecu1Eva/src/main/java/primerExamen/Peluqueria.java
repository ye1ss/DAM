/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerExamen;

/**
 *
 * @author yeismil
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Peluqueria {
    public static void main(String[] args) {
        int numClientes = 30;
        GestorSillas gestorSillas = new GestorSillas();
        Barbero barbero1 = new Barbero(gestorSillas);
        Barbero barbero2 = new Barbero(gestorSillas);

        barbero1.start();
        barbero2.start();

        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = new Cliente(gestorSillas);
            cliente.start();
        }

        // Esperar a que todos los clientes finalicen
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }

        System.out.println("Cerramos la peluquería.");
    }
}

class Barbero extends Thread {
    private GestorSillas gestorSillas;

    public Barbero(GestorSillas gestorSillas) {
        this.gestorSillas = gestorSillas;
    }

    @Override
    public void run() {
        while (true) {
            int silla = gestorSillas.asignarCliente();
            if (silla != -1) {
                System.out.println("Barbero atendiendo cliente en silla " + silla);
                // Simular tiempo de corte
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                gestorSillas.liberarSilla(silla);
            } else {
                // Si no hay clientes, el barbero descansa un momento
                System.out.println("Barbero descansando.");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Cliente extends Thread {
    private GestorSillas gestorSillas;

    public Cliente(GestorSillas gestorSillas) {
        this.gestorSillas = gestorSillas;
    }

    @Override
    public void run() {
        int silla = gestorSillas.getSillaLibre();
        if (silla != -1) {
            System.out.println("Cliente sentado en silla " + silla);
            gestorSillas.asignarClienteEnSilla(silla);
        } else {
            System.out.println("Cliente se va porque no hay sillas disponibles.");
        }
    }
}

class GestorSillas {
    private static final int NUM_SILLAS = 4;
    private boolean[] sillasLibres;
    private boolean[] clienteAtendido;
    private Lock lock;

    public GestorSillas() {
        this.sillasLibres = new boolean[NUM_SILLAS];
        this.clienteAtendido = new boolean[NUM_SILLAS];
        this.lock = new ReentrantLock();
        // Inicializar todas las sillas como libres
        for (int i = 0; i < NUM_SILLAS; i++) {
            sillasLibres[i] = true;
        }
    }

    public synchronized int getSillaLibre() {
        for (int i = 0; i < NUM_SILLAS; i++) {
            if (sillasLibres[i]) {
                sillasLibres[i] = false;
                return i;
            }
        }
        return -1; // No hay sillas libres
    }

    public void liberarSilla(int silla) {
        lock.lock();
        try {
            sillasLibres[silla] = true;
            clienteAtendido[silla] = false;
            System.out.println("Cliente de silla " + silla + " ha sido atendido y se va.");
        } finally {
            lock.unlock();
        }
    }

    public int asignarCliente() {
        lock.lock();
        try {
            for (int i = 0; i < NUM_SILLAS; i++) {
                if (!clienteAtendido[i]) {
                    clienteAtendido[i] = true;
                    return i;
                }
            }
            return -1; // No hay clientes esperando
        } finally {
            lock.unlock();
        }
    }

    public synchronized void asignarClienteEnSilla(int silla) {
        clienteAtendido[silla] = true;
    }
}

