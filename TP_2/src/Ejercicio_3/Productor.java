package Ejercicio_3;

import java.util.LinkedList;
import java.util.Queue;
import Ejercicio_3.Buffer;


public class Productor implements Runnable {

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
    public void run() {
        for (int i = 3; i <= 15; i++) {
            // Añade un valor entre 3 y 15 al buffer.
            buffer.produce(i);
        }
    }
}
