/*
Modificar el ejercicio 1 parte b, se debe convertir la clase que implementa Runnable por una
que implementa Callable y los hilos deben ejecutarse con un ExceutorService.
 */

package Ejercicio_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Se crea un ExecutorService con un hilo unico
        HiloCallable hiloCallable = new HiloCallable("nombre", 5, 500);

        // Se crea un objeto Callable
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Se ejecuta el Callable usando el ExecutorService, devolviendo future
        Future<Integer> future = executor.submit(hiloCallable);

        // Se obtiene el resultado del Callable
        int resultado = future.get();
        System.out.println("El resultado de la suma de las iteraciones es: " + resultado);

        // Se liberan los recursos del ExecutorService
        executor.shutdown();
    }

}
