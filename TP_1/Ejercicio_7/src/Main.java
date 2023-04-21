import clases.Empleado;
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
            Empleado empleado6 = Empleado.fromString("nombre=Agustin, apellido=Montaña, legajo=60160, aniosTrabajados=");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Agustin,legajo=60160,aniosTrabajados=6");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Agustin, apellido=Montaña, legajo=60160, aniosTrabajados=a6");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }

        try {
            Empleado empleado6 = Empleado.fromString("nombre=Agustin, apellido=Montaña, legajo=60160, aniosTrabajados=-6");
        } catch (Exception e) {
            System.out.println("\n" + e);
        }
    }
}


