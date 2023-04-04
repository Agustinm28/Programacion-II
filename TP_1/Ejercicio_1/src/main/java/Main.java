import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Agustin", "Montaña", 22);
        persona.agregarNombre("Ana");
        persona.agregarNombre("Pedro");
        persona.agregarNombre("Maria");
        persona.agregarNombre("Luis");
        persona.agregarNombre("Laura");

        persona.agregarApellido("Nuñez");
        persona.agregarApellido("Gutierrez");
        persona.agregarApellido("Orbelli");
        persona.agregarApellido("Sarmiento");
        persona.agregarApellido("Sanchez");

        Random rand = new Random();
        List<Persona> listaPersonas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String nombre = persona.getListaNombres().get(i-1);
            String apellido = persona.getListaApellidos().get(i-1);
            int edad = rand.nextInt((50 - 20) + 1) + 20;
            Persona nuevaPersona = new Persona(nombre, apellido, edad);
            listaPersonas.add(nuevaPersona);
        }

        System.out.println(persona.toString());

        for (Persona p : listaPersonas) {
            System.out.println(p.toString());
        }

        Persona personaMayor = listaPersonas.get(0);
        for (Persona p : listaPersonas) {
            if (p.getEdad() > personaMayor.getEdad()) {
                personaMayor = p;
            }
        }
        System.out.println("La persona más grande es: " + personaMayor.toString());
    }
}