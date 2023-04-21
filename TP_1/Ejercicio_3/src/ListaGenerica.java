/*
Mejorar al ejercicio anterior agregando las siguientes excepciones.
Una excepción para la función 7 si el indice es mas grande que la cantidad de elementos de la lista.
Una excepción para la función 8 si el indice es mayor a la cantidad de elementos en la lista.
Una excepción para la función 9 y 10 si la lista de elementos es vacía.
Una excepción para la función 10 si el elemento en la lista no existe.
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
        if (posicion < 0 || posicion > lista.size()) {
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
        } else if (lista.size() == 1) {
            return lista.get(0);
        } else {
            return lista.get(lista.size() - 1);
        }
    }
    
    // Metodo para remover objeto de la lista
    public void remover(int indice) {
        if (indice >= lista.size()) {
            throw new IndexOutOfBoundsException("El índice especificado es mayor o igual que el tamaño de la lista");
        }
        lista.remove(indice);
    }

}
