
/**
 * La clase abstracta artefactoHogar define la estructura que deben tener las clases que se extiendan de ella
 * 
 * @author (Lopez Eduardo, Mauri Joan)
 * @version (18/10/2025)
 */
public abstract class ArtefactoHogar
{
    private String marca;
    private float precio;
    private int stock;
    
    /**
     * ArtefactoHogar Constructor permite instanciar un objeto del tipo ArtefactoHogar
     *
     * @param p_marca marca del artefacto
     * @param p_precio precio del artefacto
     * @param p_stock cantidad de stock
     */
    ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    //setters
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    //getters
    public String getMarca(){
        return this.marca;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Método imprimir informa marca precio y stock del artefacto
     *
     */
    public void imprimir(){
        System.out.println("Marca: " + this.getMarca() + "\t" + " - " + "\t" + "Precio: " + this.getPrecio() + "\t" + " - " + "\t" + "Stock: " + this.getStock());
    }
    
    /**
     * Método cuotaCredito permite calcular el precio financiado en cuotas
     *
     * @param p_cuotas cantidad de cuotas
     * @param p_interes interes de las cuotas
     * @return valor total
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        return (this.getPrecio() + (this.getPrecio() * p_interes / 100)) / p_cuotas;
    }
    
    /**
     * Método creditoConAdicional indica el precio final segun adicionales del artefacto en cuestion
     *
     * @param p_cuotas cantidad de cuotas
     * @param p_interes interes
     * @return costo total
     */
    protected abstract float creditoConAdicional(int p_cuotas, float p_interes);

}