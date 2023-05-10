package Ejercicio_5;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Parte 1...

        // Creacion buffer.
        Buffer buffer = new Buffer(40);
        Future<Long> future;

        // Creacion ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Creacion del hilo del Productor.
        Productor Productor1 = new Productor(buffer, "Productor1");
        Callable<Integer> producer = Productor1;

        // Creacion del hilo del Consumidor.
        Consumidor Consumidor1 = new Consumidor(buffer, "Consumidor1");
        Callable<Long> consumer = Consumidor1;

        // Ejecución de los hilos Callable.
        Future<Integer> futureValue = executorService.submit(producer);
        Future<Long> futureFactorial = executorService.submit(consumer);

        try {
            // Obtener resultado del Productor.
            int value = futureValue.get();
            System.out.println("Valor producido por Productor1: " + value);

            // Obtener resultado del Consumidor.
            long factorial = futureFactorial.get();
            System.out.println("Resultado de Consumidor1: " + factorial);

            // Verificar si el resultado del Consumidor es mayor a 30.000.000.
            long result = factorial;
            if (result > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Parte 2...

        // Creacion buffer.
        Buffer buffer2 = new Buffer(20);

        // Creacion del hilo del Productor.
        Productor Productor2 = new Productor(buffer2, "Productor2");
        Future<Integer> futureValue2 = executorService.submit(Productor2);

        // Creacion del hilo del Consumidor.
        Consumidor Consumidor2 = new Consumidor(buffer2, "Consumidor2");
        Future<Long> futureFactorial2 = executorService.submit(Consumidor2);

        try {
            // Obtener resultado del Productor.
            int value2 = futureValue2.get();
            System.out.println("Valor producido por Productor2: " + value2);

            // Obtener resultado del Consumidor.
            long factorial2 = futureFactorial2.get();
            System.out.println("Resultado de Consumidor2: " + factorial2);

            // Verificar si el resultado del Consumidor es mayor a 30.000.000.
            long result = factorial2;
            if (result > 30000000) {
                System.out.println("El resultado es mayor a 30.000.000");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Cierre del ExecutorService.
        executorService.shutdown();
    }
}

