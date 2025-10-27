
/**
 * Write a description of class Rx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rx extends Atleta
{
    private int ringMuscleUps;
    
    Rx(int p_id, String p_nombre, double p_kilos, int p_ring){
        super(p_id, p_nombre, p_kilos);
        this.setRing(p_ring);
    }
    
    private void setRing(int p_ring){
        this.ringMuscleUps = p_ring;
    }
    
    public int getRing(){
        return this.ringMuscleUps;
    }
    
    public String imprimirTipo(){
        return "rx";
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos() + "** - RingMuscleUps Realizados: " + this.getRing() + " (" + this.imprimirTipo() + ")";
    }
}