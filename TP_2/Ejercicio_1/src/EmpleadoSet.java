public class EmpleadoSet extends Empleado {
    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    // Sobrescribir equals() y hashCode() para comparar empleados por legajo y aniosTrabajados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpleadoSet)) return false;
        EmpleadoSet empleado = (EmpleadoSet) o;
        return getLegajo() == empleado.getLegajo() &&
                getAniosTrabajados() == empleado.getAniosTrabajados();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLegajo(), getAniosTrabajados());
    }
}
