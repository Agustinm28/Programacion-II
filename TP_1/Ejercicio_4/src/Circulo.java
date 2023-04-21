public class Circulo implements FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }

    public String toString() {
        return "Círculo de radio " + radio;
    }
}

