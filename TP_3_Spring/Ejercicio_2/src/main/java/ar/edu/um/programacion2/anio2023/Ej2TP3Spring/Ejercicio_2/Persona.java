package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import lombok.Data;

@Data
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int codigo;

    public Persona(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
}