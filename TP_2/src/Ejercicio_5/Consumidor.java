package Ejercicio_5;

import java.util.concurrent.Callable;
public class Consumidor implements Callable<Long> {

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
    public Long call() throws Exception {
        long result = 0;
        int value;
        do {
            value = buffer.consume();
            if (value != -1) {
                result = calcularFactorial(value);
                System.out.println("Consumidor " + nombre + " consumiendo valor: " + value + " con resultado: " + result);
            }
        } while (value != -1);
        return result;
    }

    private long calcularFactorial(int value) {
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
