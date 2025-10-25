/**
 * La clase Premium contiene el color de la etiqueta premium
 * @author(Joan Mauri, Lopez Eduardo)
 * @version(10/10/2025)
 */
public class Premium extends Etiqueta
{
    private int colores;
    
    
    /**
     * Premium Constructor: permite instanciar una etiqueta del tipo premium
     *
     * @param p_costo es el costo de la etiqueta
     * @param p_colores es la cantidad de colores
     */
    Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    
    public int getColores(){
        return this.colores;
    }
    
    
    
    /**
     * Método adicional que retorna el valor adicional que se suma al precio segun la cantidad de colores que tenga la etiqueta
     *
     * @return valor adicional que segun el numero de colores
     */
    private double adicional(){
        switch(this.getColores()){
            case 1:
                return 0;
            case 2: 
                return this.getCosto()*0.10; 
            case 3:
                return this.getCosto()*0.21;
            default:
                return this.getColores() * this.getCosto() * 0.03;
        }
    }
    
    
    /**
     * Método tipo que devuelve un string con el tipo de etiqueta
     *
     * @return "premium"
     */
    protected String tipo(){
        return "Premium";
    }
    
    /**
     * Método precio que devuelve el precio total de las etiquetas multiplicando por la cantidad
     *
     * @param q cantidad de etiquetas
     * @return costo total de la etiqueta
     */
    public double precio(int q){
        return (this.getCosto() + this.adicional()) * q;
    }
    
    public String toString(){
        return super.toString() + " - Colores: " + this.getColores();
    }
    
    
    
}