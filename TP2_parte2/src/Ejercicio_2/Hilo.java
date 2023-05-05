package Ejercicio_2;

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

import java.util.List;

public class Hilo extends Thread {

    private String nombre;
    private List<Integer> lista;

    public Hilo(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lista) { // Se bloquea la lista para que no sea accedida por otro hilo
                if (!lista.isEmpty()) {
                    int valor = lista.remove(0); // Se quita el primer elemento de la lista
                    int resultado = factorial(valor); // Se calcula el factorial
                    int elementosRestantes = lista.size();
                    System.out.println("Hilo " + nombre + " procesando la lista. Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + elementosRestantes + " elementos en la lista por procesar.");
                } else {
                    break; // Si la lista está vacía, se finaliza el hilo
                }
            }
            try {
                Thread.sleep(5000); // esperamos 5 segundos antes de procesar el siguiente numero
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


