/**
 * La sub clase Delegacion contiene los datos de una delegacion que visita el zoologico
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;
public class Delegacion extends Visitante
{
    private HashSet<Individuo> integrantes;
    
    /**
     * Delegacion Constructor
     *
     * @param p_nombre nombre de la delegacion
     * @param p_fecha fecha de visita
     * @param p_integrantes coleccion de invididuos que forman la delegacion
     */
    Delegacion(String p_nombre, Calendar p_fecha, HashSet<Individuo> p_integrantes){
        super(p_nombre,p_fecha);
        this.setVisitantes(p_integrantes);
        
    }
    
    //setters
    private void setVisitantes(HashSet<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    //getters
    public HashSet<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    /**
     * Método tipoVisitante muestra el tipo de visitante que visita el zoologico
     *
     * @return string con el tipo de visitante
     */
    public String tipoVisitante(){
        return "Delegacion";
    }
    
    
    /**
     * Método inscribirIndividuo agregar individuo a la delegacion
     *
     * @param p_individuo individuo a agregar
     */
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    /**
     * Método quitarIntegrante de la delegacion
     *
     * @param p_individuo individuo a eliminar
     * @return se quita el individuo
     */
    public boolean quitarIntegrante(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    /**
     * Método cantidadIntegrantes indica la cantidad de integrantes de la delegacion
     *
     * @return cantidad de integrantes
     */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    /**
     * Método listarPersonas devuelve una coleccion de personas que conforman la delegacion
     *
     * @return Ecoleccion de personas
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet();
        for(Individuo unIndividuo : this.getIntegrantes()){
            personas.add(unIndividuo.getPersona());
        }
        
        return personas;
    }
    
    /**
     * Método entrada calcula el precio de la entrada de la delegacion segun la cantidad de personas
     *
     * @return El valor de retorno
     */
    public double entrada(){
        return (this.getIntegrantes().size()*10) - ((this.getIntegrantes().size()*10)*0.10);
    }
    
    /**
     * Método listarPorFecha muestra los idividuos que visitaron el zoologico en una fecha determinada
     *
     * @param p_fecha fecha
     * @param p_visitante tipo de visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        
         for(Individuo unIndividuo : this.getIntegrantes()){
            if(this.getFecha().equals(p_fecha) && this.tipoVisitante().equalsIgnoreCase(p_visitante)){
                System.out.println("Nombre y Apellido: " + unIndividuo.getPersona().nomYApe());
                System.out.println("DNI: " + unIndividuo.getPersona().getDNI() + " Edad: " + unIndividuo.getPersona().edad() + " años");
            }
        }
        
    }
    
    /**
     * Método mostrar muestra los integrantes de la delegacion y su cantidad
     *
     */
    public void mostrar(){
        System.out.println("Delegacion: " + this.getNombre());
        System.out.println("Integrantes");
        for(Individuo unIndividuo : this.getIntegrantes()){
            unIndividuo.mostrar();
        }
        System.out.println("Cantidad de integrantes: " + this.cantidadIntegrantes());
    }

    }