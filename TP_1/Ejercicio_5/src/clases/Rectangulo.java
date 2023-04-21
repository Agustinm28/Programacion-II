package clases;

public class Rectangulo implements FiguraGeometrica {
    private double x;
    private double y;
    private double base;
    private double altura;

    public Rectangulo(double x, double y, double base, double altura) throws ValorNegativoException {
        if (x < 0 || y < 0 || base < 0 || altura < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) throws ValorNegativoException {
        if (base < 0) {
            throw new ValorNegativoException("El valor no puede ser negativo");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws ValorNegativoException {
        if (altura < 0) {
            throw new ValorNegativoException("El valor no puede ser negativo");
        }
        this.altura = altura;
    }

    public double calcularPerimetro() throws ValorNegativoException {
        if (base < 0 || altura < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        return 2 * (base + altura);
    }

    public double calcularSuperficie() throws ValorNegativoException {
        if (base < 0 || altura < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + "]";
    }
}


