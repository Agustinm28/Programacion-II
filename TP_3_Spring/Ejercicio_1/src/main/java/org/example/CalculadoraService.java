package org.example;
import org.springframework.stereotype.*;
import lombok.*;

@Service
@RequiredArgsConstructor
public class CalculadoraService {

    @NonNull
    private int exponentePorDefecto;

    @NonNull
    private int raizPorDefecto;

    // Potencia con dos parámetros: base y exponente
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    // Potencia con un solo parámetro: base. El exponente es el valor por defecto
    public double potencia(double base) {
        return potencia(base, exponentePorDefecto);
    }

    // Raíz con dos parámetros: valor e índice
    public double raiz(double valor, double indice) {
        return Math.pow(valor, 1.0 / indice);
    }

    // Raíz con un solo parámetro: valor. El índice es el valor por defecto
    public double raiz(double valor) {
        return raiz(valor, raizPorDefecto);
    }
}
