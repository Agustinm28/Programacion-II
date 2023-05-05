package Ejercicio_2;

/*
Crear una lista de 40 valores enteros de entre 3 y 15.
1- Crear un objeto de la clase hilo para que procese los valores de la lista.
2- Crear 3 objetos de la clase hilo para que procese los valores de la lista, los 3 hilos deben
trabajar sobre la misma lista
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 40; i++) {
            int valor = rand.nextInt(13) + 3; // Genera un número aleatorio de 3 a 15
            lista.add(valor);
        }

        // Crear un objeto de la clase hilo para procesar los valores de la lista
        Hilo hilo1 = new Hilo("1", lista);
        hilo1.start();

        // Crear tres objetos de la clase hilo para procesar los valores de la lista,
        // los tres hilos trabajan sobre la misma lista
        Hilo hilo2 = new Hilo("2", lista);
        Hilo hilo3 = new Hilo("3", lista);
        Hilo hilo4 = new Hilo("4", lista);
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}



