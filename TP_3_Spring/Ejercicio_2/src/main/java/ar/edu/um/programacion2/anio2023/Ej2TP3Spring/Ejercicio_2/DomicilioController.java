package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/domicilio/")
public class DomicilioController {
    @Autowired
    DomicilioRepositorio domicilios;

    // Metodo GET que trae un domicilio en particular basado en su numero
    @GetMapping("/{numero}")
    public Domicilio get(@PathVariable int numero) {
        Domicilio d = this.domicilios.get(numero);
        return d;
    }

    // Metodo GET que trae todos los domicilios
    @GetMapping
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios = this.domicilios.getAll();
        return domicilios;
    }

    // Metodo POST para agregar una nueva entidad Domicilio a la lista de domicilios
    @PostMapping
    public Domicilio post(@RequestBody Domicilio domicilio) {
        this.domicilios.add(domicilio);
        return domicilio;
    }

    // Metodo PUT para reemplazar una entidad Domicilio de la lista de domicilios en base a su numero
    @PutMapping("/{numero}")
    public Domicilio put(@PathVariable int numero, @RequestBody Domicilio domicilio) {
        Domicilio d = this.domicilios.get(numero);
        if (d != null) {
            d.setCalle(domicilio.getCalle());
            d.setLocalidad(domicilio.getLocalidad());
            d.setProvincia(domicilio.getProvincia());
            return d;
        } else {
            return null;
        }
    }

    // Metodo DELETE para eliminar una entidad Domicilio de la lista de domicilios en base a su numero
    @DeleteMapping("/{numero}")
    public void delete(@PathVariable int numero) {
        this.domicilios.remove(numero);
    }
}
