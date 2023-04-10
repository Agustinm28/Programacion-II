/*
Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
Crear una clase generica ListaGenerica que permita mantener una lista de objetos que implementan la interfaz comparable.
1. Definir un método que permita agregar un elemento a la lista. -
2. Definir un método que devuelva la lista de objetos. -
3. Definir un método que devuelva la cantidad de elementos almacenados en la lista.
4. Definir un método que permita agregar un elemento al principio de la lista.
5. Definir un método que permita ordenar la lista.
6. Definir un método que permita desordenar (barajar) la lista.
7. Definir un método que permita almacenar un elemento en una posición particular de la lista, los parámetros que recibe son el objeto a almacenar y la posición en la lista.
8. Definir un método que devuelva el objeto en una posición específica de la lista
9. Definir un método que devuelva el objeto en la primer posición de la lista
10. Definir un método que devuelva el objeto en la ultima posición posición de la lista
11. Definir un método que remueva un objeto en una posición particular de la lista.
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
 
