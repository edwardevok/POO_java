/**
 * La clase Zollogico contiene los datos de un zoologico, su nombre y sus visitantes
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
import java.util.*;
public class Zoologico
{
    private String nombre;
    private HashSet<Visitante> visitantes;
    
    /**
     * Zoologico Constructor permite instanciar un zoologico con una coleccion de visitantes
     *
     * @param p_nombre nombre del zoologico
     * @param p_visitantes coleccion de visitantes
     */
    Zoologico(String p_nombre, HashSet<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    /**
     * Zoologico Constructor permite instanciar un zoologico sin una coleccion de visitantes
     *
     * @param p_nombre nombre del zoologico
     */
    Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes(new HashSet<Visitante>());
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setVisitantes(HashSet<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    //getters 
    public String getNombre(){
        return this.nombre;
    }
    
    public HashSet<Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    /**
     * Método nuevoVisitante permite agregar un visitante a la coleccion
     *
     * @param p_visitante visitante a agregar
     */
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    /**
     * Método quitarVisitante permite quitar un visitante de la coleccion
     *
     * @param p_visitante visitante a quitar
     */
    public void quitarVisitante(Visitante p_visitante){
        this.getVisitantes().remove(p_visitante);
    }
    
    /**
     * Método listarTipoVisitantePorFecha permite listar un determinado tipo de visitante en una determinada fecha
     *
     * @param p_fecha fecha
     * @param p_tipoVisitante tipo de visitante
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
        for(Visitante unVisitante : this.getVisitantes()){
            if(unVisitante.getFecha().equals(p_fecha) && unVisitante.tipoVisitante().equalsIgnoreCase(p_tipoVisitante)){
                unVisitante.mostrar();
                System.out.println("\n");
            }
        }
    }
    
    /**
     * Método listarVisitantePorFecha permite visitar todos los visitantes en una determinada fecha
     *
     * @param p_fecha fecha
     */
    public void listarVisitantePorFecha(Calendar p_fecha){
        for(Visitante unVisitante : this.getVisitantes()){
            if(unVisitante.getFecha().equals(p_fecha)){
                unVisitante.mostrar();
                System.out.println("\n");
            }
        }
    }
    
    /**
     * Calcula la recaudación total entre dos fechas.
     * @param p_fechaDesde fecha inicial
     * @param p_fechaHasta fecha final
     * @return recaudacion de las entradas vendidas entre las fechas
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
        double recaudacion = 0;
        for (Visitante unVisitante : this.getVisitantes()) {
            if ((unVisitante.getFecha().compareTo(p_fechaDesde) >= 0) &&
                (unVisitante.getFecha().compareTo(p_fechaHasta) <= 0)) {
                recaudacion += unVisitante.entrada();
            }
        }
        return recaudacion;
    }
    
    /**
     * Método listarPersonasQueVisitaronElZoo lista todas las personas que visitaron el zoo, sean individuos o sean delegaciones
     *
     * @return personas que visitaron
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> personasDelZoo = new HashSet();
        for(Visitante unVisitante : this.getVisitantes()){
            personasDelZoo.addAll(unVisitante.listarPersonas());
            
        }
        
        return personasDelZoo;
    }
    
}
