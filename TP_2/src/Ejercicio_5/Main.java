package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        // Parte 1...

        // Creacion buffer.
        Buffer buffer = new Buffer(40);

        // Creacion del ExecutorService con 2 hilos
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Creacion lista Future
        List<Future<Integer>> futures = new ArrayList<>();

        // Creacion del hilo del Productor.
        Productor Productor1 = new Productor(buffer, "Productor1", 40);
        Future<Integer> futureProductor = executor.submit(Productor1);
        futures.add(futureProductor);

        // Creacion del hilo del Consumidor.
        Consumidor Consumidor1 = new Consumidor(buffer, "Consumidor1");
        Future<Integer> futureConsumidor = executor.submit(Consumidor1);
        futures.add(futureConsumidor);

        // Analisis de resultados
        for (Future<Integer> future : futures) {
            int result = future.get();
            System.out.println("Resultado: " + result);
            if (result > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
        }

        // Terminacion del ExecutorService
        executor.shutdown();

        // Parte 2...

        Buffer buffer2 = new Buffer(120);

        ExecutorService executor2 = Executors.newFixedThreadPool(5);

        List<Future<Integer>> futures2 = new ArrayList<>();

        Productor Productor2 = new Productor(buffer2, "Productor2", 220);
        Future<Integer> futureProductor2 = executor2.submit(Productor2);
        futures2.add(futureProductor2);

        Consumidor Consumidor2 = new Consumidor(buffer2, "Consumidor2");
        Future<Integer> futureConsumidor2 = executor2.submit(Consumidor2);
        futures2.add(futureConsumidor2);

        Consumidor Consumidor3 = new Consumidor(buffer2, "Consumidor3");
        Future<Integer> futureConsumidor3 = executor2.submit(Consumidor3);
        futures2.add(futureConsumidor3);

        Consumidor Consumidor4 = new Consumidor(buffer2, "Consumidor4");
        Future<Integer> futureConsumidor4 = executor2.submit(Consumidor4);
        futures2.add(futureConsumidor4);

        for (Future<Integer> future : futures2) {
            int result = future.get();
            System.out.println("Resultado: " + result);
            if (result > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
        }
        executor2.shutdown();
    }
}

