import clases.Empleado
import clases.InvalidDataException;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Empleado empleado1 = Empleado.fromString("nombre=Agustin, apellido=Montaña, legajo=60160, aniosTrabajados=6");
        Empleado empleado2 = Empleado.fromString("nombre=Agustin,apellido=Montaña,legajo=60160,aniosTrabajados=6");
        Empleado empleado3 = Empleado.fromString("nombre=Agustin ,apellido=Montaña ,legajo=60160, aniosTrabajados=6");
        Empleado empleado4 = Empleado.fromString("Nombre=Agustin,apellidO=Montaña ,LEGAJO=60160, ANIOStrabajados=6");
        Empleado empleado5 = Empleado.fromString("nombre=Agustin,legajo=60160,aniosTrabajados=6,apellido=Montaña");

        // Ejemplo de objeto con datos incompletos
        try {
            Empleado emp1 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        // Ejemplo de objeto con campo aniosTrabajados no numérico
        try {
            Empleado emp2 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=xyz");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        // Ejemplo de objeto con campo aniosTrabajados negativo
        try {
            Empleado emp3 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=-10");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        // Ejemplo de objeto con todos los datos correctos
        try {
            Empleado emp4 = Empleado.fromString("nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

        }
}
