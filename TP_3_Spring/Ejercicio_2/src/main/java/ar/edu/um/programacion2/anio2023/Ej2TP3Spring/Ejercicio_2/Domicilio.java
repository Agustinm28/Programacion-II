package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import lombok.*;

@Data
public class Domicilio {

    private String calle;
    private int numero;
    private String localidad;
    private String provincia;

    public Domicilio(String calle, int numero, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}