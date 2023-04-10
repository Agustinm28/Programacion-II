/*
Mejorar al ejercicio anterior agregando las siguientes excepciones.
Una excepción para la función 7 si el indice es mas grande que la cantidad de elementos de la lista.
Una excepción para la función 8 si el indice es mayor a la cantidad de elementos en la lista.
Una excepción para la función 9 y 10 si la lista de elementos es vacía.
Una excepción para la función 10 si el elemento en la lista no existe.
 */

import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        
        ListaGenerica<Empleado> lista = new ListaGenerica<>();

        // Agregar elementos a la lista
        Empleado e1 = new Empleado("Agustin", "Montaña", 60160, 4);
        Empleado e2 = new Empleado("Bruno", "Orbelli", 61011, 4);
        Empleado e3 = new Empleado("Pedro", "Rodríguez", 65044, 2);
        lista.agregar(e1);
        lista.agregar(e2);
        lista.agregar(e3);

        // Obtener lista y cantidad de elementos
        List<Empleado> listaEmpleados = lista.getList();
        System.out.println("Lista de empleados: " + listaEmpleados);
        System.out.println("Cantidad de empleados: " + lista.cantidadElementos());

        // Agregar un elemento al principio de la lista
        Empleado e4 = new Empleado("Mauro", "Sarmiento", 61033, 7);
        lista.agregarAlInicio(e4);
        System.out.println("Lista con nuevo empleado al principio: " + lista.getList());

        // Ordenar la lista
        lista.ordenarLista();
        System.out.println("Lista de empleados ordenada: " + lista.getList());

        // Desordenar la lista
        lista.desordenar();
        System.out.println("Lista de empleados desordenada: " + lista.getList());

        // Agregar un elemento en una posición particular
        Empleado e5 = new Empleado("Julian", "López", 5, 3);
        lista.agregarEnPosicion(e5, 2);
        System.out.println("Lista de empleados con nuevo empleado en posicion 2: " + lista.getList());

        // Obtener el elemento en una posición particular
        Empleado empleadoEnPosicion = lista.getElementoEnPosicion(3);
        System.out.println("Empleado en posición 3: " + empleadoEnPosicion.getNombre() + " " + empleadoEnPosicion.getApellido());

        // Obtener el primer elemento de la lista
        Empleado primerEmpleado = lista.getPrimero();
        System.out.println("Primer empleado de la lista: " + primerEmpleado.getNombre() + " " + primerEmpleado.getApellido());

        // Obtener el último elemento de la lista
        Empleado ultimoEmpleado = lista.getUltimo();
        System.out.println("Último empleado de la lista: " + ultimoEmpleado.getNombre() + " " + ultimoEmpleado.getApellido());

        // Remover un elemento de la lista
        lista.remover(1);
        System.out.println("Lista de empleados con empleado removido: " + lista.getList());
    }
}
 
