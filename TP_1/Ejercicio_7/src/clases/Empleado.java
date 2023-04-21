package clases;

import clases.InvalidDataException;
import java.util.Objects;

public class Empleado {

    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;
    public Empleado() {
    }
    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " con legajo " + legajo + " ha trabajado " + aniosTrabajados + " años.";
    }

    public static Empleado fromString(String empleadoString) throws InvalidDataException{
        Empleado empleado = null;                               // por ejemplo: empleadoString = "nombre=Pablo,apellido=Marquez,legajo=E001,aniosTrabajados=10"
        String[] atributos = empleadoString.split(",");   // entonces atributos = ["nombre=Pablo", "apellido=Marquez", "legajo=E001", "aniosTrabajados=10"]
        if (atributos.length != 4) {
            throw new InvalidDataException("No están todos los campos presentes");
        }
        String nombre = "";
        String apellido = "";
        String legajo = "";
        int aniosTrabajados = 0;
        for (String atributo : atributos) {                           // por ejemplo; atributos = ["nombre=Pablo", "apellido=Marquez", "legajo=E001", "aniosTrabajados=10"]
            String[] partes = atributo.split("=");              // partes = [["nombre", "Pablo"], ["apellido", "Marquez"], ...]
            if (partes.length != 2) {
                throw new InvalidDataException("El atributo " + partes[0].trim() + " no tiene valor");
            }

            String nombreAtributo = partes[0].trim().toLowerCase();   // si se tiene la cadena " Hola, mundo! ", y se aplica la función .trim(), el resultado sería la cadena
            String valorAtributo = partes[1].trim();                  // "Hola, mundo!", eliminando los espacios en blanco que existen antes y después del texto.
            switch (nombreAtributo) {
                case "nombre":
                    nombre = valorAtributo;
                    break;
                case "apellido":
                    apellido = valorAtributo;
                    break;
                case "legajo":
                    legajo = valorAtributo;
                    break;
                case "aniostrabajados":
                    try {
                        aniosTrabajados = Integer.parseInt(valorAtributo);  // "Integer.parseInt()" es un método estático de la clase "Integer",
                                                                            // que se utiliza para convertir una cadena de caracteres que contiene un valor numérico en su representación numérica correspondiente.
                        if (aniosTrabajados <= 0) {
                            throw new InvalidDataException("El valor de aniosTrabajados debe ser un numero mayor a cero");
                        }
                    } catch (NumberFormatException e) {
                        throw new InvalidDataException("El valor de aniosTrabajados debe ser un numero entero");
                    }
                    break;
            }
        }
        empleado = new Empleado(nombre, apellido, legajo, aniosTrabajados);
        return empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // son la misma instancia
        if (o == null || getClass() != o.getClass()) return false; // son de clases diferentes
        Empleado empleado = (Empleado) o; // cast a Empleado
        return Objects.equals(nombre, empleado.nombre) && // comparación de atributos
                Objects.equals(apellido, empleado.apellido) &&
                Objects.equals(legajo, empleado.legajo) &&
                aniosTrabajados == empleado.aniosTrabajados;
    }
}

