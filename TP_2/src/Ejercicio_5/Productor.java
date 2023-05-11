package Ejercicio_5;

import java.util.concurrent.Callable;
import Ejercicio_5.Buffer;
public class Productor implements Callable<Integer> {

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
    public Integer call() throws Exception {
        int value = 0; // Variable que guarda el valor producido
        for (int i = 0; i < cantidad; i++) {
            // Añade un valor entre 3 y 15 al buffer.
            value = (int) (Math.random() * 13) + 3;
            buffer.produce(value);
        }
        return value;
    }
}

