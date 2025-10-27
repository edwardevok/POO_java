import java.util.*;

public class Campeonato
{
    private String nombre;
    private HashSet<Equipo> equipos;
    
    Campeonato(String p_nombre, HashSet<Equipo> p_equipos){
        this.setNombre(p_nombre);
        this.setEquipos(p_equipos);
    }
    
    Campeonato(String p_nombre, Equipo p_equipo){
        this.setNombre(p_nombre);
        this.setEquipos(new HashSet());
        this.agregarEquipo(p_equipo);
    }
    
    //accsessorssn
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setEquipos(HashSet<Equipo> p_equipos){
        this.equipos = p_equipos;
    }
    
    public HashSet<Equipo> getEquipos(){
        return this.equipos;
    }
    
    private boolean agregarEquipo(Equipo p_equipo){
        return this.getEquipos().add(p_equipo);
    }
    
    private boolean quitarEquipo(Equipo p_equipo){
        if(this.getEquipos().size()>1){
            return this.getEquipos().remove(p_equipo);
        }
        
        return false;
    }
    
    
    public void determinarGanador(){
        double comparador = 0.0;
        Equipo elGanador = null;
        for(Equipo unEquipo : this.getEquipos()){
            if(comparador < unEquipo.totalKilos()){
                comparador = unEquipo.totalKilos();
                elGanador = unEquipo;
            }
        }
        
        System.out.println("El ganador del torneo llamado " + this.getNombre() + "es.......");
        System.out.println("*********** " + elGanador.getNombre() + "**************");
        System.out.println("Ahora vamos a mostrar todos sus integrantes!!");
        elGanador.mostrar();
    }
    
    
    
    
    
}