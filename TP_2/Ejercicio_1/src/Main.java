import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet<>();

        Empleado empleado1 = new Empleado("Agustin", "Montaña", 60160, 4);
        Empleado empleado2 = new Empleado("Bruno", "Orbelli", 60144, 4);
        Empleado empleado3 = new Empleado("Mauro", "Sarmiento", 60344, 3);
        Empleado empleado4 = new Empleado("Franco", "Gutierrez", 60544, 3);
        Empleado empleado5 = new Empleado("Henry", "Cavill", 60000, 5);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        System.out.println("Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        Set<EmpleadoSet> empleadosSet = new HashSet<>();

        EmpleadoSet empleadoSet1 = new EmpleadoSet("Agustin", "Montaña", 60160, 4);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Bruno", "Orbelli", 60144, 4);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Mauro", "Sarmiento", 60344, 3);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Franco", "Gutierrez", 60544, 3);
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Henry", "Cavill", 60000, 5);
        // Empleado repetido
        EmpleadoSet empleadoSet6 = new EmpleadoSet("Henry", "Cavill", 60000, 5);

        empleadosSet.add(empleadoSet1);
        empleadosSet.add(empleadoSet2);
        empleadosSet.add(empleadoSet3);
        empleadosSet.add(empleadoSet4);
        empleadosSet.add(empleadoSet5);
        empleadosSet.add(empleadoSet6);

        System.out.println("Empleados Set:");
        for (EmpleadoSet empleadoSet : empleadosSet) {
            System.out.println(empleadoSet);
        }
    }
}