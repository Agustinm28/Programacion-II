package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import java.util.List;

public interface DomicilioRepositorio {
    public Domicilio get(int numero);
    public void add(Domicilio domicilio);
    public void remove(int numero);
    public void remove(Domicilio d);
    public List<Domicilio> getAll();
}
