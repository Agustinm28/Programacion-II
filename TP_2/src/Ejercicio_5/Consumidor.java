package Ejercicio_5;

import java.util.concurrent.Callable;
public class Consumidor implements Callable<Integer> {

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
    public Integer call() throws Exception {
        int factorial = 0; // Variable en la que se guardara el factorial
        while (!buffer.isEmpty()) {
            // Obtiene el siguiente valor del buffer.
            int value = 0;
            synchronized (buffer) {
                value = buffer.consume();
            }

            // Calcula el factorial.
            factorial = 1;
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
        return factorial;
    }
}
