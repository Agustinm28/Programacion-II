import java.util.ArrayList;
import java.util.List;

public class Persona
{
	private String nombre;
	private String apellido;
	private int edad;
	private List<String> listaNombres;
	private List<String> listaApellidos;
	private List<Persona> listaPersonas;
	
	public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        listaNombres = new ArrayList<>();
        listaApellidos = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public List<String> getListaNombres() {
        return listaNombres;
    }
    
    public void setListaNombres(List<String> listaNombres) {
        this.listaNombres = listaNombres;
    }
    
    public List<String> getListaApellidos() {
        return listaApellidos;
    }
    
    public void setListaApellidos(List<String> listaApellidos) {
        this.listaApellidos = listaApellidos;
    }
    
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void agregarNombre(String nombre) {
        listaNombres.add(nombre);
    }
    
    public void agregarApellido(String apellido) {
        listaApellidos.add(apellido);
    }

    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s %s, Edad: %d", nombre, apellido, edad);
    }
	
}