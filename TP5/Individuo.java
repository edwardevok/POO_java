/**
 * La sub clase Indivudo contiene los datos de un individuo que visita el zoologico
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;

public class Individuo extends Visitante
{
  private Persona persona;
  
  /**
   * Individuo Constructor
   *
   * @param p_nombre nombre del individuo
   * @param p_fecha fecha de visita
   * @param p_persona la persona que visita el zoologico
   */
  Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre,p_fecha);
        this.setPersona(p_persona);
    }
    
//setters
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    //getters
    public Persona getPersona(){
        return this.persona;
    }
    
    /**
     * Método tipoVisitante muestra el tipo de visitante que visita el zoologico
     *
     * @return string con el tipo de visitante
     */
    public String tipoVisitante(){
        return "individuo";
    }
    
    /**
     * Método mostrar los datos de la persona
     *
     */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    /**
     * Método listarPersonas devuelve una coleccion con el invidivuo
     *
     * @return coleccion de personas
     */
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet();
        personas.add(this.getPersona());
        return personas;
    }
    
    /**
     * Método listarPorFecha muestra los idividuos que visitaron el zoologico en una fecha determinada
     *
     * @param p_fecha fecha
     * @param p_visitante tipo de visitante
     */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH) + 1;
        int anioHoy = hoy.get(Calendar.YEAR);
        
        int diaParam = p_fecha.get(Calendar.DAY_OF_MONTH);
        int mesParam = p_fecha.get(Calendar.MONTH) + 1;
        int anioParam = p_fecha.get(Calendar.YEAR) + 1;
        
        boolean sonDiasIguales = diaHoy == diaParam;
        boolean sonMesesIguales = mesHoy == mesParam;
        boolean sonAniosIguales = anioHoy == anioParam;
        
         
        if( (this.getFecha().equals(p_fecha))  && p_visitante.equalsIgnoreCase("individuo") ){
                this.getPersona().mostrar();
            }
        }
        
        /**
         * Método entrada indica el precio de la entrada
         *
         * @return precio
         */
        public double entrada(){
        return 10;
    }
    
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
