package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Parte 1...

        // Creacion buffer.
        Buffer buffer = new Buffer(40);

        // Creacion del hilo del Productor.
        Productor Productor1 = new Productor(buffer, "Productor1", 40);
        Thread producer = new Thread(Productor1);

        // Creacion del hilo del Consumidor.
        Consumidor Consumidor1 = new Consumidor(buffer, "Consumidor1");
        Thread consumer = new Thread(Consumidor1);

        // Se inician los hilos.
        producer.start();
        consumer.start();

        // Se espera a que terminen.
        producer.join();
        consumer.join();

        // Parte 2...

        Buffer buffer2 = new Buffer(120);

        Productor Productor2 = new Productor(buffer2, "Productor2", 120);
        Thread producer2 = new Thread(Productor2);

        Consumidor Consumidor2 = new Consumidor(buffer2, "Consumidor2");
        Thread consumer2 = new Thread(Consumidor2);
        Consumidor Consumidor3 = new Consumidor(buffer2, "Consumidor3");
        Thread consumer3 = new Thread(Consumidor3);

        Consumidor Consumidor4 = new Consumidor(buffer2, "Consumidor4");
        Thread consumer4 = new Thread(Consumidor4);

        producer2.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();

        producer2.join();
        consumer2.join();
        consumer3.join();
        consumer4.join();


    }
}
