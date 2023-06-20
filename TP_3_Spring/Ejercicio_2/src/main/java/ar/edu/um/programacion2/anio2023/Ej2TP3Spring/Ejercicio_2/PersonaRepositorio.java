package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import java.util.List;

public interface PersonaRepositorio {
    public Persona get(int codigo);
    public void add(Persona persona);
    public void remove(int codigo);
    public void remove(Persona p);
    public List<Persona> getAll();
}
