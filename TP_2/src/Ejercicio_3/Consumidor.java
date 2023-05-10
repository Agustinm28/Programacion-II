package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;
import Ejercicio_3.Buffer;

public class Consumidor implements Runnable {

    private Buffer buffer;
    private String nombre;

    public Consumidor(Buffer buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    public Buffer getBuffer() {
        return buffer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (!buffer.isEmpty()) {
            // Obtiene el siguiente valor del buffer.
            int value = buffer.consume();

            // Calcula el factorial.
            long factorial = 1;
            for (int i = 1; i <= value; i++) {
                factorial *= i;
            }

            // Imprime resultados.
            System.out.println("Hilo " + Thread.currentThread().getName() + " procesando la lista. Valor a calcular: " + value + ". Resultado: " + factorial);

            // Espera de 5 segundos.
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
