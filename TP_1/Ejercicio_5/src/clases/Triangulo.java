package clases;

public class Triangulo implements FiguraGeometrica {
    private double x;
    private double y;
    private double base;
    private double altura;

    public Triangulo(double x, double y, double base, double altura) throws ValorNegativoException {
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
        double lado1 = Math.sqrt(Math.pow(base/2, 2) + Math.pow(altura, 2));
        double lado2 = Math.sqrt(Math.pow(base/2, 2) + Math.pow(altura, 2));
        double lado3 = base;
        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        return lado1 + lado2 + lado3;
    }

    public double calcularSuperficie() throws ValorNegativoException {
        if (base < 0 || altura < 0) {
            throw new ValorNegativoException("Los valores no pueden ser negativos");
        }
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + ", x=" + x + ", y=" + y + "]";
    }
}


