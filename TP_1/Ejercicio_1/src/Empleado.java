import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private int legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Legajo: " + legajo + ", Años Trabajados: " + aniosTrabajados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return legajo == empleado.legajo &&
                aniosTrabajados == empleado.aniosTrabajados;
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, aniosTrabajados);
    }
}
