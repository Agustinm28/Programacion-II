package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;

class Productor implements Runnable {
    private final Queue<Integer> queue;

    public Productor(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            int valor = (int) (Math.random() * 13) + 3; // Generar número aleatorio entre 3 y 15
            synchronized (queue) { // Asegurar que la cola sea modificada por un solo hilo a la vez
                queue.add(valor);
                queue.notify(); // Notificar a los hilos en espera que hay un nuevo elemento en la cola
            }
        }
    }
}
