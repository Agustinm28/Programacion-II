package clases;

public interface FiguraGeometrica {
    double calcularPerimetro() throws ValorNegativoException;
    double calcularSuperficie() throws ValorNegativoException;
}
