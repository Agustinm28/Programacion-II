/*
Crear una lista de 40 valores enteros de entre 3 y 15.
1- Crear un objeto de la clase hilo para que procese los valores de la lista.
2- Crear 3 objetos de la clase hilo para que procese los valores de la lista, los 3 hilos deben
trabajar sobre la misma lista
 */

package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaValores = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            listaValores.add((int) (Math.random() * 13) + 3);
        }

        FactorialThread hilo1 = new FactorialThread("Hilo 1", listaValores);
        hilo1.start();

        FactorialThread hilo2 = new FactorialThread("Hilo 2", listaValores);
        hilo2.start();

        FactorialThread hilo3 = new FactorialThread("Hilo 3", listaValores);
        hilo3.start();
    }
}
