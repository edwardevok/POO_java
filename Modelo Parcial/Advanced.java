
/**
 * Write a description of class Advanced here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advanced extends Atleta
{
    private int barMuscleUps;
    
    Advanced(int p_id, String p_nombre, double p_kilos, int p_bar){
        super(p_id, p_nombre, p_kilos);
        this.setBar(p_bar);
    }
    
    private void setBar(int p_bar){
        this.barMuscleUps = p_bar;
    }
    
    public int getBar(){
        return this.barMuscleUps;
    }
    
    public String imprimirTipo(){
        return "advanced";
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos() + "** - barMuscleUps Realizados: " + this.getBar() + " (" + this.imprimirTipo() + ")";
    }
}