package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Productor productor = new Productor(queue);
        Consumidor consumidor = new Consumidor(queue, "Hilo");

        Thread productorThread = new Thread(productor);
        Thread consumidorThread = new Thread(consumidor);

        productorThread.start();
        consumidorThread.start();
    }
}
