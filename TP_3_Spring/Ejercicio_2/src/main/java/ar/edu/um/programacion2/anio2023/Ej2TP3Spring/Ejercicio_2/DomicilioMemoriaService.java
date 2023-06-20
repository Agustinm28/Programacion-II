package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class DomicilioMemoriaService implements DomicilioRepositorio {
    protected Map<Integer,Domicilio> domicilios;
    public DomicilioMemoriaService() { this.domicilios = new HashMap<>(); }

    @Override
    public Domicilio get(int numero) {
        Domicilio d = this.domicilios.get(numero);
        return d;
    }

    @Override
    public void add(Domicilio d) {
        this.domicilios.put(d.getNumero(), d);
    }

    @Override
    public void remove(int numero) {
        this.domicilios.remove(numero);
    }

    @Override
    public void remove(Domicilio d) {
        this.domicilios.remove(d.getNumero());
    }

    @Override
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios;
        domicilios = this.domicilios.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return domicilios;
    }
}
