/*
Crear una clase hilo que sea capaz de calcular el factorial de un número utilizando un bucle
for, la fuente de datos para el cálculo es una lista de valores enteros.
El hilo debe tomar cada uno de los valores de la lista, quitarlo, calcular el valor, esperar 5
segundos y tomar el siguiente.
Una vez terminada la lista el hilo debe finalizar
Cada hilo tiene un identificador (nombre) y al procesar el valor debe mostrar por pantalla lo
siguiente:
“Hilo NOMBRE procesando la lista. Valor a calcular: VALOR. Resultado: RESULTDO.
Quedan XX elementos en la lista por procesar.”
 */

package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class FactorialThread extends Thread {
    private String nombre;
    private List<Integer> lista;

    public FactorialThread(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            Integer valor;
            synchronized (lista) {
                if (lista.isEmpty()) {
                    break;
                }
                valor = lista.remove(0);
            }
            int factorial = factorial(valor);
            int restantes;
            synchronized (lista) {
                restantes = lista.size();
            }
            System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor +
                    ". Resultado: " + factorial + ". Quedan " + restantes + " elementos en la lista por procesar.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }


}

