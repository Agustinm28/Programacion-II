import java.util.Objects;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    // Metodo que compara dos objetos para determinar si son iguales
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof EmpleadoSet)) // Se verifica que el objeto no sea una instancia de EmpleadoSet
            return false;
        EmpleadoSet empleado = (EmpleadoSet) o; // Convierte el objeto en una instancia de EmpleadoSet
        return getLegajo() == empleado.getLegajo() && // Los compara
                getAniosTrabajados() == empleado.getAniosTrabajados();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLegajo(), getAniosTrabajados());
    }
}
