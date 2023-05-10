package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;
import Ejercicio_3.Buffer;


public class Productor implements Runnable {

    private Buffer buffer;
    private String nombre;
    private int cantidad;

    public Productor(Buffer buffer, String nombre, int cantidad) {
        this.buffer = buffer;
        this.nombre = nombre;
        this.cantidad = cantidad;
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
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            // Añade un valor entre 3 y 15 al buffer.
            int value = (int) (Math.random() * 13) + 3;
            buffer.produce(value);
        }
    }
}
