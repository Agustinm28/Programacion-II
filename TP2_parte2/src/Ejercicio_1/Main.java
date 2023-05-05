package Ejercicio_1;

/*
c- Ejecutar en la clase main 4 hilos de la clase definida en el punto a y 4 de hilos definidos
    en el punto b, y ver que todos se ejecuten simultáneamente.
 */

public class Main {
    public static void main(String[] args) {
        // Crear cuatro instancias de HiloA y cuatro instancias de HiloB
        HiloA hiloA1 = new HiloA("A1");
        HiloA hiloA2 = new HiloA("A2");
        HiloA hiloA3 = new HiloA("A3");
        HiloA hiloA4 = new HiloA("A4");

        HiloB hiloB1 = new HiloB("B1", 15, 500);
        HiloB hiloB2 = new HiloB("B2", 20, 250);
        HiloB hiloB3 = new HiloB("B3", 25, 750);
        HiloB hiloB4 = new HiloB("B4", 30, 100);

        Thread threadA1 = new Thread(hiloA1);
        Thread threadA2 = new Thread(hiloA2);
        Thread threadA3 = new Thread(hiloA3);
        Thread threadA4 = new Thread(hiloA4);

        Thread threadB1 = new Thread(hiloB1);
        Thread threadB2 = new Thread(hiloB2);
        Thread threadB3 = new Thread(hiloB3);
        Thread threadB4 = new Thread(hiloB4);

        threadA1.start();
        threadA2.start();
        threadA3.start();
        threadA4.start();

        threadB1.start();
        threadB2.start();
        threadB3.start();
        threadB4.start();
    }
}
