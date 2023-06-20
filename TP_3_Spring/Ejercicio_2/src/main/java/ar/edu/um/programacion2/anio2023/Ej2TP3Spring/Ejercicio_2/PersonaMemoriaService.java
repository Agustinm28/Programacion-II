package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
@Service
public class PersonaMemoriaService implements PersonaRepositorio {
    protected Map<Integer,Persona> personas;
    public PersonaMemoriaService () { this.personas = new HashMap<>(); }

    @Override
    public Persona get(int codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @Override
    public void add(Persona p) {
        this.personas.put(p.getCodigo(), p);
    }

    @Override
    public void remove(int codigo) {

    }

    @Override
    public void remove(Persona p) {

    }

    @Override
    public List<Persona> getAll() {
        List<Persona> personas;
        personas = this.personas.values().stream().collect(Collectors.toCollection (ArrayList::new));
        return personas;
    }
}
