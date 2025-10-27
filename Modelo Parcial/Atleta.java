
/**
 * Write a description of class Atleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Atleta
{
    private int id;
    private String nombre;
    private double kilos;
    
    Atleta(int p_id, String p_nombre, double p_kilos){
        this.setId(p_id);
        this.setNombre(p_nombre);
        this.setKilos(p_kilos);
    }
    
    private void setId(int p_id){
        this.id = p_id;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setKilos(double p_kilos){
        this.kilos = p_kilos;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getKilos(){
        return this.kilos;
    }
    
    public abstract String imprimirTipo();
    
    public String mostrarDatos(){
        return "Atleta: " + this.getId() + " - " + this.getNombre() + " - " + "Kilos movidos: " + this.getKilos();
    }
    
    
    
    
}