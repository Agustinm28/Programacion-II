/*
b- Crear un hilo implementando la interfaz Runnable.
Debe manejar la misma funcionalidad del hilo anterior y se tiene que agregar la posibilidad
de manejar los valores de XX de iteraciones y de YYY de demora como atributos de la clase
y poder asignarlos desde un constructor.
 */

package Ejercicio_1.b;

import java.util.concurrent.ThreadLocalRandom;

public class HiloRunnable implements Runnable {
    private String nombre;
    private int iteraciones;
    private int demora;

    public HiloRunnable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            int iteracion = ThreadLocalRandom.current().nextInt(10, 41);
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + iteracion);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public int getDemora() {
        return demora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }
}

