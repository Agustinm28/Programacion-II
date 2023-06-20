package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@Configuration
public class PersonaConfiguration {

    @Autowired
    PersonaRepositorio personas;

    @PostConstruct
    public void init() {
        Persona p1 = new Persona("Agustin", "Montaña", 60160);
        Persona p2 = new Persona("Bruno", "Orbelli", 61140);
        Persona p3 = new Persona("Martin", "Reyes", 60880);
        this.personas.add(p1);
        this.personas.add(p2);
        this.personas.add(p3);
    }
}
