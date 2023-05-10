package Ejercicio_5;

import java.util.Random;
import java.util.concurrent.Callable;
public class Productor implements Callable<Integer> {

    private Buffer buffer;
    private String nombre;

    public Productor(Buffer buffer, String nombre) {
        this.buffer = buffer;
        this.nombre = nombre;
    }

    public Buffer getBuffer() {
        return buffer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer call() {
        Random rand = new Random();
        int value = rand.nextInt(41-10) + 10;
        System.out.println("Productor " + nombre + " produciendo valor: " + value);
        buffer.produce(value);
        return value;
    }
}
