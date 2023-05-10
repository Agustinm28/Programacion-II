package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;

class Consumidor implements Runnable {
    private final Queue<Integer> queue;
    private final String nombre;

    public Consumidor(Queue<Integer> queue, String nombre) {
        this.queue = queue;
        this.nombre = nombre;
    }

    private long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    @Override
    public void run() {
        int valor;
        synchronized (queue) { // Asegurar que la cola sea modificada por un solo hilo a la vez
            while (queue.isEmpty()) { // Esperar si la cola está vacía
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            valor = queue.poll(); // Tomar el primer elemento de la cola
        }
        long resultado = calcularFactorial(valor);
        System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + queue.size() + " elementos en la lista por procesar.");
        try {
            Thread.sleep(5000); // Esperar 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
