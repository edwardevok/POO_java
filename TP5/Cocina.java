
/**
 * La sub clase cocina contiene los datos de una cocina
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
public class Cocina extends ArtefactoHogar
{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    /**
     * Cocina Constructor permite instanciar una cocina
     *
     * @param p_marca marca de la cocina
     * @param p_precio precio de la cocina
     * @param p_stock stock
     * @param p_hornallas cantidad de hornallas
     * @param p_calorias calorias de la cocina
     * @param p_dimensiones dimensiones de la cocina
     */
    Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    
    //setters
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones; 
    }
    
    //getters
    public int getHornallas(){
        return this.hornallas;
    }
    
    public int getCalorias(){
        return this.calorias;
    }
    
    public String getDimensiones(){
        return this.dimensiones;
    }
    
    /**
     * Método creditoConAdicional permite conocer el valor total de la cocina habiendola comprado a credito
     *
     * @param p_cuotas cantidad de cuotas
     * @param p_interes interes de cada cuota
     * @return total
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return this.cuotaCredito(p_cuotas,p_interes);
    }
    
    /**
     * Método imprimir permite ver la informacion de la cocina
     *
     */
    public void imprimir(){
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: " + this.getHornallas());
        System.out.println("Calorias: " + this.getCalorias());
        System.out.println("Dimensiones: " + this.getDimensiones());
        
    }
}