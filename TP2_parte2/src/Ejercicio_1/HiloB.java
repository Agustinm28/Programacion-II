package Ejercicio_1;

//b- Crear un hilo implementando la interfaz Runnabl
public class HiloB implements Runnable {
    private String nombre;
    private int iteraciones;
    private int demora;

    public HiloB(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public void run() {
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

