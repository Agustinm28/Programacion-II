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
        Empleado empleado = null;                               
        String[] atributos = empleadoString.split(",");   
        if (atributos.length != 4) {
            throw new InvalidDataException("No están todos los campos presentes");
        }
        String nombre = "";
        String apellido = "";
        String legajo = "";
        int aniosTrabajados = 0;
        for (String atributo : atributos) {                           
            String[] partes = atributo.split("=");              
            if (partes.length != 2) {
                throw new InvalidDataException("El atributo " + partes[0].trim() + " no tiene valor");
            }

            String nombreAtributo = partes[0].trim().toLowerCase();   
            String valorAtributo = partes[1].trim();                  
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
                        aniosTrabajados = Integer.parseInt(valorAtributo);  
                                                                            
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
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        Empleado empleado = (Empleado) o; 
        return Objects.equals(nombre, empleado.nombre) && 
                Objects.equals(apellido, empleado.apellido) &&
                Objects.equals(legajo, empleado.legajo) &&
                aniosTrabajados == empleado.aniosTrabajados;
    }
}

