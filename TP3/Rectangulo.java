/**
 * La clase Rectangulo contiene el origen, ancho y alto de un rectangulo
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;
    
    /**
     * Este constructor permite instanciar un objeto de la clase Rectangulo
     * @param el punto donde estara ubicado el rectangulo en el eje x e y
     * @param p_ancho ancho del rectangulo
     * @param p_alto alto del rectangulo
     */
    Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
     /**
     * Este constructor sobre cargado permite instanciar un objeto de la clase Rectangulo pero con su ubicacion en el eje x e y en el punto (0,0)
     * @param p_ancho ancho del rectangulo
     * @param p_alto alto del rectangulo
     */
    Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto());
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    //setters
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    //getters
    public double getAlto(){
        return this.alto;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * Este metodo permite desplazar el rectangulo en los ejes x e y
     * @param p_dx ubicacion del rectangulo en el eje x
     * @param p_dy ubicacion del rectangulo en el eje y
     */
    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx,p_dy);
    }
    
    /**
     * Este metodo permite calcular la superficie de un rectangulo
     * @return superficie del rectangulo
     */
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }
    
    /**
     * Este metodo permite calcular el perimetro de un rectangulo
     * @return perimetro de un rectangulo
     */
    public double perimetro(){
         return 2 * (this.getAlto() + this.getAncho());
    }
    
    /**
     * Este metodo permite calcular cuanta distancia hay entre un rectangulo y otro
     * @param otroRectangulo el otro rectangulo que queremos calcular su distancia
     * @return distancia entre ambos rectangulos
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * Este metodo indica cual rectangulo es mayor comparando sus superficies
     * @param otro rectangulo el otro rectangulo a comparar
     * @return devuelve uno u otro rectangulo dependiendo de qué superficie es mayor
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie()>otroRectangulo.superficie()){
            return this;
        }else{
            return otroRectangulo;
        }
    }
    
    /**
     * Este metodo muestra por pantalla las caracterisitcas de un rectangulo: su origen, alto, ancho, superifice y perimetro
     */
    public void caracteristicas(){
        System.out.println("******* Rectangulo ******");
        System.out.println("Origen: " + this.origen.coordenadas() + " - " + "Alto: " + this.getAlto() + " - " + "Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - " + "Perimetro: " + this.perimetro());
        
    }
    
    
    
}    