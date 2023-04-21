package clases;

public class ValorNegativoException extends Exception{
    public ValorNegativoException() {
        super("El valor no puede ser negativo");
    }
    public ValorNegativoException(String message) {
        super(message);
    }
}