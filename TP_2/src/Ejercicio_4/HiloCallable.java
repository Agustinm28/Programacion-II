/*
Modificar el ejercicio 1 parte b, se debe convertir la clase que implementa Runnable por una
que implementa Callable y los hilos deben ejecutarse con un ExceutorService.
 */

package Ejercicio_4;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class HiloCallable implements Callable<Integer> {
    private String nombre;
    private int iteraciones;
    private int demora;

    public HiloCallable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public Integer call() throws Exception {
        int suma = 0;
        for (int i = 1; i <= iteraciones; i++) {
            int iteracion = ThreadLocalRandom.current().nextInt(10, 41);
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + iteracion);
            suma += iteracion;
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return suma;
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

