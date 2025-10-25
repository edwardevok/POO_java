
/**
 * La sub clase Heladera contiene los datos de una heladera
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
public class Heladera extends ArtefactoHogar
{
    private int pies;
    private int puertas;
    private boolean compresor;
    
    /**
     * Heladera Constructor permite instanciar una heladera
     *
     * @param p_marca marca de heladera
     * @param p_precio precio
     * @param p_stock stock
     * @param p_pies pies de la heladera
     * @param p_puertas cantidad de puertas
     * @param p_compresor indica si tiene o no compresor
     */
    Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    
    //setters
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor; 
    }
    
    //getters
    public int getPies(){
        return this.pies;
    }
    
    public int getPuertas(){
        return this.puertas;
    }
    
    public boolean getCompresor(){
        return this.compresor;
    }
    
    /**
     * Método creditoConAdicional permite conocer el valor total de la heladera habiendola comprado a credito y sumando un 
     * adicional por la existencia (o ausencia) del compresor.
     *
     * @param p_cuotas numero de cuotas
     * @param p_interes interes de cada cuota
     * @return total
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float cuotaBase = this.cuotaCredito(p_cuotas,p_interes);
        if(this.getCompresor()){
          cuotaBase+= 50;
        }
        return cuotaBase;
    }
    
    /**
     * Método imprimir permite visualizar la informacion de la heladera
     *
     */
    public void imprimir(){
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: " + this.getPies());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Compresor: " + this.getCompresor());
        
    }
}