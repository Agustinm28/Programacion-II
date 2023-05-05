package Ejercicio_1;

// a- Crear un hilo extendiendo la clase Thread.
public class HiloA extends Thread {
    private String nombre;

    public HiloA(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int iteraciones = (int) (Math.random() * 31) + 10;
        int demora = (int) (Math.random() * 950) + 50;

        for (int i = 1; i <= iteraciones; i++) {
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

