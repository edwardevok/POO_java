import java.util.*;
public class Biblioteca
{
    private String nombre;
    private ArrayList<Libro> libros;
    private HashMap<Integer,Socio> socios;
    
    Biblioteca(String p_nombre, ArrayList<Libro> p_libros, HashMap<Integer,Socio> p_socios){
        this.setNombre(p_nombre);
        this.setLibros(p_libros);
        this.setSocios(p_socios);
    }
    
    Biblioteca(String p_nombre){
        this.setNombre(p_nombre);
        this.setLibros(new ArrayList());
        this.setSocios(new HashMap());
    }
    
    //getters
    
    
    //setters
    
    
}