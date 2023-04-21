import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Agustin", "Montaña", 60160, 5));
        empleados.add(new Empleado("Bruno", "Orbelli", 53678, 10));
        empleados.add(new Empleado("Mauro", "Sarmiento", 90132, 3));
        empleados.add(new Empleado("Nicolas", "Sanchez", 34356, 7));
        empleados.add(new Empleado("Luis", "Garcia", 78930, 2));

        Map<String, Empleado> mapaEmpleados = new HashMap<>();
        for (Empleado emp : empleados) {
            String clave = emp.getApellido() + ", " + emp.getNombre();
            mapaEmpleados.put(clave, emp);
        }

        for (Map.Entry<String, Empleado> entry : mapaEmpleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue().toString());
        }        


    }
}
