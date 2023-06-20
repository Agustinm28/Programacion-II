package ar.edu.um.programacion2.anio2023.Ej2TP3Spring.Ejercicio_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
public class DomicilioConfiguration {

    @Autowired
    DomicilioRepositorio domicilios;

    @Bean
    public void domicilio_init() {
        Domicilio d1 = new Domicilio("San Martin", 123, "Cordoba", "Cordoba");
        Domicilio d2 = new Domicilio("Colon", 456, "Rosario", "Santa Fe");
        Domicilio d3 = new Domicilio("Rivadavia", 789, "Mendoza", "Mendoza");
        this.domicilios.add(d1);
        this.domicilios.add(d2);
        this.domicilios.add(d3);
    }
}