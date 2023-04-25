package Ejercicio_1.b;
import Ejercicio_1.b.HiloRunnable;
public class Main {
    public static void main(String[] args) {
        HiloRunnable hiloRunnable = new HiloRunnable("nombre", 5, 500);
        Thread thread = new Thread(hiloRunnable);
        thread.start();
    }

}
