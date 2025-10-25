/**
 * La la clase abstracta Visitante contiene la estructura que tendran las clases que se extiendan de ella
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;

public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;
    
    
    /**
     * Visitante Constructor
     *
     * @param p_nombre nombre
     * @param p_fecha fecha de visita
     */
    Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFecha(p_fecha);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFecha(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public Calendar getFecha(){
        return this.fechaVisita;
    }
    
    /**
     * Método mostrar muestra informacion de los visitantes
     *
     */
    public abstract void mostrar();
    
    /**
     * Método entrada costo total de la entrada
     *
     * @return total
     */
    public abstract double entrada();
    
    /**
     * Método listarPorFecha lista todos los visitantes en una fecha determinada
     *
     * @param p_fecha fecha a mostrar
     * @param p_visitante tipo de visitante
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    /**
     * Método tipoVisitante muestra el tipo de visitante
     *
     * @return string con el tipo de visitante
     */
    public abstract String tipoVisitante();
    
    /**
     * Método listarPersonas lista los individuos
     *
     * @return lista de personas
     */
    public abstract HashSet<Persona> listarPersonas();
    
    
    
}