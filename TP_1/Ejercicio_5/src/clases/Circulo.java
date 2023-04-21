package clases;

public class Circulo implements FiguraGeometrica {
    private double x;
    private double y;
    private double radio;

    public Circulo(double x, double y, double radio) throws ValorNegativoException {
        if (x < 0 || y < 0 || radio < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws ValorNegativoException {
        if (radio < 0) {
            throw new ValorNegativoException("El valor no puede ser negativo");
        }
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }

    public String toString() {
        return "Circulo en (" + x + ", " + y + ") con radio " + radio;
    }
}

