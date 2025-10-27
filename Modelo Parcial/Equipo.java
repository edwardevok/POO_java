import java.util.*;
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    private String nombre;
    private String procedencia;
    private HashMap<Integer,Atleta> atletas;
    
    Equipo(String p_nombre, String p_procedencia, HashMap<Integer,Atleta> p_atletas){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);
        this.setAtletas(p_atletas);
    }
    
    Equipo(String p_nombre, String p_procedencia, Atleta p_atleta){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);
        this.setAtletas(new HashMap<Integer,Atleta>());
        this.agregarAtleta(p_atleta);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProcedencia(String p_pro){
        this.procedencia = p_pro;
    }
    
    private void setAtletas(HashMap p_atletas){
        this.atletas = p_atletas;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProcedencia(){
        return this.procedencia;
    }
    
    public HashMap<Integer,Atleta> getAtletas(){
        return this.atletas;
    }
    
    public void agregarAtleta(Atleta p_atleta){
        this.getAtletas().put(p_atleta.getId(),p_atleta);
    }
    
    public void quitarAtleta(Atleta p_id){
        if(this.getAtletas().size() > 1){
            this.getAtletas().remove(p_id);
        }else{
            System.out.println("No se puede quitar el atleta");
        }
    }
    
    public void listarEquipo(){
        for(Atleta unAtleta : this.getAtletas().values()){
            unAtleta.mostrarDatos();
        }
    }
    
    public void mostrar(){
        System.out.println("Nombre del equipo: " + this.getNombre());
        System.out.println("Vienen de: " + this.getProcedencia());
        
        this.listarEquipo();
    }
    
    public double totalKilos(){
        double acum = 0;
        for(Atleta unAtleta : this.getAtletas().values()){
            acum+=unAtleta.getKilos();
        }
        
        return acum;
    }
    
    public int cantInt(){
        
        return this.getAtletas().size();
    }
    
    
    
    
    
    
    
    
}