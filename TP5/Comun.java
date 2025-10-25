/**
 * La clase Comun contiene el monto que se adiciona al precio de etiquetas comunes
 * @author(Joan Mauri, Lopez Eduardo)
 * @version(18/10/2025)
 */
public class Comun extends Etiqueta
{
    private double plus;
    
    
    /**
     * Comun Constructor: permite construir una etiqueta del tipo comun 
     *
     * @param p_costo es el costo de la etiqueta
     * @param p_plus es el costo del adicional que se suma al precio de la etiqueta
     */
    Comun(double p_costo, double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }
    
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    
    public double getPlus(){
        return this.plus;
    }
    
    /**
     * Método precio que calcula el precio de cada etiqueta segun la cantidad y resta el descuento (tambien por cantidad)
     *
     * @param q cantidad de etiquetas
     * @return devuelve el precio total
     */
    public double precio(int q){
        return this.getCosto() * q + this.getPlus() - this.descuento(q);
    }
    
    
    /**
     * Método descuento que devuelve el valor del descuento según la cantidad de etiquetas
     *
     * @param q cantidad de etiquetas
     * @return descuento total segun el numero de etiquetas
     */
    private double descuento(int q){
        if(q <= 10 && q >= 1){
            return 0;
        }else if(q >= 11 && q <= 50){
            return (this.getCosto() * q + this.getPlus()) * 0.02;
        }else if(q >= 51 && q <= 100){
            return (this.getCosto() * q + this.getPlus()) * 0.05;
        }else{
            return (this.getCosto() * q  + this.getPlus()) * (0.01 * Math.floor(q/10));
        }
    }
    
    /**
     * Método tipo que indica el tipo de etiqueta
     *
     * @return string "comun"
     */
    protected String tipo(){
        return "comun";
    }
    
    public String toString(){
        return super.toString() + " - Diseño: " + this.getPlus();
    }
}