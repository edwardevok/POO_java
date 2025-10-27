
public class Scaled extends Atleta
{
    private int pullUps;
    
    Scaled(int p_id, String p_nombre, double p_kilos, int p_pull){
        super(p_id, p_nombre, p_kilos);
        this.setPull(p_pull);
    }
    
    private void setPull(int p_pull){
        this.pullUps = p_pull;
    }
    
    public int getPull(){
        return this.pullUps;
    }
    
    public String imprimirTipo(){
        return "scaled";
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos() + "** - PullUps Realizados: " + this.getPull() + " (" + this.imprimirTipo() + ")";
    }
}