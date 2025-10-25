
/**
 * La clase Renglon permite instanciar un renglon con los detalles de la cantidad y precio de etiquetas asi como
 * tambien su tipo
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    
    /**
     * Renglon Constructor permite instanciar un renglon con la informacion del precio cantidad y tipo de etiquetas
     *
     * @param p_cantidad cantidad de etiquetas
     * @param p_importe importe
     * @param p_item Un tipo de etiqueta
     */
    Renglon(int p_cantidad, double p_importe, Etiqueta p_item){
        this.setCantidad(p_cantidad);
        this.setImporte(p_importe);
        this.setItem(p_item);
    }
    
    //getters
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    
    private void setImporte(double p_importe){
        this.importe = p_importe;
    }
    
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    
    //setters
    public int getCantidad(){
        return this.cantidad;
    }
    
    public double getImporte(){
        return this.importe;
    }
    
    public Etiqueta getItem(){
        return this.item;
    }
    
    /**
     * Método mostrar imprime por pantalla la informacion de las eitiquetas
     *
     */
    public void mostrar(){
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
    }
    
    
}