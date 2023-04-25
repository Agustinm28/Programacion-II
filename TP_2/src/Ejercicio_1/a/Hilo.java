/*
a. Crear un hilo extendiendo la clase Thread.
El hilo debe mostrar el mensaje “Este es el hilo NOMBRE y esta es la iteración XX” XX
cantidad de veces. Debe de haber una demora de YYY milisegundos entre iteración e
iteración.
El valor NOMBRE debe ser manejado como atributo de la clase.
El valor XX de la iteración debe ser un número aleatorio de 10 a 40.
El valor YYY de demora es un valor en milisegundos que va de 50 a 999 ms.
 */

package Ejercicio_1.a;
import java.util.Random;

public class Hilo extends Thread {
    private String nombre;

    public Hilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int iteracion = rand.nextInt(31) + 10; // Genera un número aleatorio de 10 a 40
            int demora = rand.nextInt(950) + 50; // Genera un número aleatorio de 50 a 999

            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + iteracion);

            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Hilo hilo = new Hilo("Nuevo hilo");
        hilo.start();
    }
}
