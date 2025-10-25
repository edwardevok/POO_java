/**
 * La clase Circulo contiene el radio y el centro de un circulo
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class Circulo
{
    private double radio;
    private Punto centro;
    
    /**
     * El constructor Circulo permite instanciar un objeto de la clase circulo
     * @param p_radio radio del criculo
     * @param p_centro centro del circulo
     */
    Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * El constructor sobre cargado Circulo permite instanciar un objeto de la clase circulo pero con su radio en 0 y su centro en un
     * punto con las coordenadas x e y en 0.
     */
    Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto());
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    /**
     * Este metodo permite desplazar un circulo (desplazando su centro)
     * @param p_dx ubicacion del centro del circulo en el eje x
     * @param p_dy ubicacion del centro del circulo en el eje y
     */
    public void desplazar(double p_dx, double p_dy){
        centro.desplazar(p_dx,p_dy);
    }
    
    /**
     * Este metodo calcula el perimetro del circulo
     * @return perimetro
     */
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    /**
     * Este metodo calcula la superifice del circulo
     * @return superficie
     */
    public double superficie(){
        return this.getRadio() * Math.pow(this.getRadio(),2);
    }
    
    
    /**
     * Este metodo calcula la distancia que hay de un circulo a otro
     * @param otroCirculo es el circulo que queremos saber a qué distancia está
     * @return distancia que hay entre los dos circulos
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**
     * Este metodo compara la superficie de 2 circulos e indica cual es el mayor
     * @param otroCirculo es el circulo que queremos comparar
     * @return devuelve un circulo u otro dependiendo de cual superficie es mayor
     */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie()>otroCirculo.superficie()){
            return this;
        }else{
            return otroCirculo;
        }
    }
    
    /**
     * Este metodo muestra por pantalla las caracteristicas del circulo: su centro en forma de coordenadas, radio, superficie y perimetro
     */
    public void caracteristicas(){
        System.out.println("******Circulo******");
        System.out.println("Centro: " + this.centro.coordenadas() + "\t" + "-" + "Radio: " + this.getRadio());
        System.out.println("Superficie: " + superficie() + " - " + "Perimetro: " + perimetro());
    }
    
    
    
    
    
}