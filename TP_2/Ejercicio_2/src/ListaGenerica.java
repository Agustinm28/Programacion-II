/*
Crear una clase Empleado con atributo nombre, apellido, legajo, aniosTrabajados
Crear una clase generica ListaGenerica que permita mantener una lista de objetos que implementan la interfaz comparable.
1. Definir un método que permita agregar un elemento a la lista. -
2. Definir un método que devuelva la lista de objetos. -
3. Definir un método que devuelva la cantidad de elementos almacenados en la lista. - 
4. Definir un método que permita agregar un elemento al principio de la lista. -
5. Definir un método que permita ordenar la lista. - 
6. Definir un método que permita desordenar (barajar) la lista. -
7. Definir un método que permita almacenar un elemento en una posición particular de la lista, los parámetros que recibe son el objeto a almacenar y la posición en la lista.
8. Definir un método que devuelva el objeto en una posición específica de la lista
9. Definir un método que devuelva el objeto en la primer posición de la lista
10. Definir un método que devuelva el objeto en la ultima posición posición de la lista
11. Definir un método que remueva un objeto en una posición particular de la lista.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<T>();
    }

    // Metodo para agregar elemento a la lista
    public void agregar(T elemento) {
        lista.add(elemento);
    }

    // Metodo que devuelve la lista
    public List<T> getList() {
        return lista;
    }

    // Metodo que devuelve la cantidad de elementos en la lista
    public int cantidadElementos() {
        return lista.size();
    }
    
    // Metodo que agrega un elemento al principio de la lista
    public void agregarAlInicio(T elemento) {
        lista.add(0, elemento);
    }
    
    // Metodo que ordena la lista
    public void ordenarLista() {
        Collections.sort(lista);
    }

    // Metodo para desordenar la lista
    public void desordenar() {
        Collections.shuffle(lista);
    }

    // Metodo para almacenar objeto en posicion particular
    public void agregarEnPosicion(T objeto, int posicion) {
        if (posicion < 0 || posicion > lista.size()) {
            throw new IndexOutOfBoundsException("Posición especificada fuera de los límites de la lista");
        }
    
        // Si la posición es 0, se agrega al principio
        if (posicion == 0) {
            agregarAlInicio(objeto);
        } else {
            // Se crea un nuevo nodo con el objeto a agregar
            T nuevoObjeto = objeto;
            
            // Se inserta el nuevo objeto en la posición indicada
            lista.add(posicion, nuevoObjeto);
        }
    }

    // Metodo que devuelve el elemento de una posicion particular
    public T getElementoEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= lista.size()) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
        return lista.get(posicion);
    }

    // Metodo que devuelve el primer objeto de la lista
    public T getPrimero() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía");
        }
        return lista.get(0);
    }
    
    // Metodo que devuelve el ultimo objeto de la lista
    public T getUltimo() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía");
        }
        return lista.get(lista.size() - 1);
    }
    
    // Metodo para remover objeto de la lista
    public void remover(int indice) {
        lista.remove(indice);
    }
    

}
