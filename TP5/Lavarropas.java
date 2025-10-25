
/**
 * La sub clase Lavarropas contiene los datos de un lava ropas
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
public class Lavarropas extends ArtefactoHogar
{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    /**
     * Lavarropas Constructor
     *
     * @param p_marca marca del lavarropas
     * @param p_precio precio del lavarropas
     * @param p_stock stock
     * @param p_programas cantidad de programas del lavarropas
     * @param p_kilos peso en kilos del lavarropas
     * @param p_automatico si es automático o nó
     */
    Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    
    //setters
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico; 
    }
    
     //getters
    public int getProgramas(){
        return this.programas;
    }
    
    public float getKilos(){
        return this.kilos;
    }
    
    public boolean getAutomatico(){
        return this.automatico;
    }
    
    /**
     * Método creditoConAdicional permite conocer el valor total del lavarropas habiendolo comprado a credito y sumando un 
     * adicional por ser automático o nó.
     *
     * @param p_cuotas numero de cuotas
     * @param p_interes interes de cada cuota
     * @return total
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float cuotaBase = this.cuotaCredito(p_cuotas,p_interes);
        if(!this.getAutomatico()){
          cuotaBase = cuotaBase - (cuotaBase * 0.02f);
        }
        return cuotaBase;
    }
    
    /**
     * Método imprimir que permite visualizar la informacion del lavarropas
     *
     */
    public void imprimir(){
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: " + this.getProgramas());
        System.out.println("Kilos: " + this.getKilos());
        System.out.println("Automatico: " + this.getAutomatico());
        
    }
    
    
    
}