package clases;

public class InvalidDataException extends Exception{
    public InvalidDataException() {
        super("Texto genérico de excepción");
    }
    public InvalidDataException(String message) {
        super(message);
    }
}

