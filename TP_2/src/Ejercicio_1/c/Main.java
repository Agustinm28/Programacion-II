package Ejercicio_1.c;

import Ejercicio_1.a.Hilo;
import Ejercicio_1.b.HiloRunnable;

public class Main {
    public static void main(String[] args) {
        // Crear 4 hilos de la clase definida en el punto a
        for (int i = 1; i <= 4; i++) {
            Hilo hilo = new Hilo("Hilo A" + i);
            hilo.start();
        }

        // Crear 4 hilos de la clase definida en el punto b
        for (int i = 1; i <= 4; i++) {
            HiloRunnable hiloRunnable = new HiloRunnable("Hilo B" + i, 20, 500);
            Thread thread = new Thread(hiloRunnable);
            thread.start();
        }
    }
}

