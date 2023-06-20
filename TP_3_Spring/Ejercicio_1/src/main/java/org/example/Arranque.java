package org.example;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Arranque {

    @Autowired
    private CalculadoraService calculadoraService;

    public void iniciar() {

        System.out.println("Iniciando la aplicación...");
        System.out.println("Potencia de 2 elevado a 3: " + calculadoraService.potencia(2, 3));
        System.out.println("Potencia de 4 elevado a 8: " + calculadoraService.potencia(4, 8));
        System.out.println("Potencia de 3 elevado al exponente por defecto: " + calculadoraService.potencia(3));
        System.out.println("Potencia de 6 elevado al exponente por defecto: " + calculadoraService.potencia(6));
        System.out.println("Raíz cuadrada de 16: " + calculadoraService.raiz(16, 2));
        System.out.println("Raíz cúbica de 27: " + calculadoraService.raiz(27, 3));
        System.out.println("Raíz del valor por defecto de 81: " + calculadoraService.raiz(81));
        System.out.println("Raíz del valor por defecto de 27: " + calculadoraService.raiz(27));
        System.out.println("Aplicación iniciada.");
    }
}
