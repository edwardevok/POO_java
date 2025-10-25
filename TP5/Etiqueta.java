/**
 * La clase abstracta Etiqueta contiene la estructura que deben tener las clases que se extienden de ella
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */
public abstract class Etiqueta
{
    private double costo;
    
    /**
     * Etiqueta Constructor permite instanciar una etiqueta
     *
     * @param p_costo costo de la etiqueta
     */
    Etiqueta(double p_costo){
        this.setCosto(p_costo);
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Método precio permite calcular el precio total segun una cantidad
     *
     * @param q cantidad
     * @return precio total
     */
    public abstract double precio(int q);
    
    /**
     * Método tipo devuelve el tipo de la etiqueta
     *
     * @return string con la palabra del tipo de etiqueta
     */
    protected abstract String tipo();
    
    
    /**
     * Método toString devuelve informacion comun a todos los tipos de etiquetas
     *
     * @return devuelve el tipo de etiqueta y su costo
     */
    public String toString(){
        return " tipo: " + this.tipo() + " - Costo: $" + this.getCosto();
    }
}