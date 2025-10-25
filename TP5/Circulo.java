/**
 * La clase Circulo contiene el radio de un circulo
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (19/10/2025)
 */
public class Circulo extends Elipse
{
    private double radio;
    
    /**
     * Circulo Constructor permite instanciar un Circulo
     *
     * @param p_origen Un parámetro
     * @param p_radio Un parámetro
     */
    Circulo(Punto p_origen, double p_radio){
        super(p_origen,p_radio,p_radio);
        this.setRadio(p_radio);
    }
    
    //setters
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    //getters
    public double getRadio(){
        return this.radio;
    }
    
    /**
     * Método superficie calcula la superficie de un circulo
     *
     * @return superficie
     */
    @Override
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    
    @Override
    public String nombreFigura(){
        return "******Circulo******";
    }
}