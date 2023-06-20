package org.example;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import lombok.*;

@Configuration
@PropertySource("classpath:config.properties")
public class ApplicationConfig {
    // Usar @Value para inyectar los valores de las propiedades
    @Value("${exponente.por.defecto}")
    private int exponentePorDefecto;

    @Value("${raiz.por.defecto}")
    private int raizPorDefecto;

    // Usar @Bean para crear un objeto de la clase @Service
    @Bean
    public CalculadoraService calculadoraService() {
        return new CalculadoraService(exponentePorDefecto, raizPorDefecto);
    }

    @Bean
    public Arranque arranque() {
        return new Arranque();
    }

}
