package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Crear una cola de valores enteros
        Queue<Integer> colaValores = new LinkedList<>();

        // Agregar 40 valores aleatorios entre 3 y 15 a la cola
        for (int i = 0; i < 40; i++) {
            int valor = (int) (Math.random() * (15 - 3 + 1) + 3);
            colaValores.add(valor);
        }

        // Crear objeto monitor para sincronizar la cola
        Object monitor = new Object();

        // Crear objeto productor y objeto consumidor
        Productor productor = new Productor(colaValores, monitor);
        Consumidor consumidor = new Consumidor(colaValores, monitor);

        // Crear los hilos y ejecutarlos
        Thread hiloProductor = new Thread(productor);
        Thread hiloConsumidor = new Thread(consumidor);

        hiloProductor.start();
        hiloConsumidor.start();
    }
}
