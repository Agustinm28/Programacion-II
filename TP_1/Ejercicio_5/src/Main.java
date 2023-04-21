import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        figuras.add(new Circulo(5));
        figuras.add(new Triangulo(3, 4, 5));
        figuras.add(new Rectangulo(2, 6));
        figuras.add(new Circulo(10));
        figuras.add(new Rectangulo(4, 5));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }

        try {
            Figura figura1 = new Figura(1, 2, 3, -4);
        } catch (ValorNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        Figura figura2 = new Figura(5, 6, 7, 8);
        
        try {
            figura2.setParametro1(-9);
        } catch (ValorNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        

    }
}
