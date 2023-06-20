package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/persona/" )
public class PersonaController {
    @Autowired
    PersonaRepositorio personas;

    // Metodo GET que modifica una persona en particular basado en su codigo
    @PutMapping("/{codigo}")
    public Persona put(@PathVariable int codigo, @RequestBody Persona persona) {
        // Buscar la persona por el código
        Persona p = this.personas.get(codigo);
        // Si existe, actualizar sus atributos con los del cuerpo de la petición
        if (p != null) {
            p.setNombre(persona.getNombre());
            p.setApellido(persona.getApellido());
            // Devolver la persona actualizada
            return p;
        } else {
            // Si no existe, devolver null o lanzar una excepción
            return null;
        }
    }

    // Metodo POST para agregar una nueva entidad Persona a la lista de personas
    @PostMapping
    public Persona post(@RequestBody Persona persona) {
        this.personas.add(persona);
        return persona;
    }

    // Metodo GET que elimina una persona en particular basado en su codigo
    @DeleteMapping("/{codigo}")
    public void delete(@PathVariable int codigo) {
        this.personas.remove(codigo);
    }

    // Metodo GET que trae una persona en particular basado en su codigo
    @GetMapping("/{codigo}")
    public Persona get(@PathVariable int codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    // Metodo GET que trae a todas la personas
    @GetMapping
    public List<Persona> getAll() {
        List<Persona> personas = this.personas.getAll();
        return personas;
    }
}
