/**
 * La clase Cuadrado contiene el lado de un rectangulo. Se trata de un caso especial de un Rectangulo
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (19/10/2025)
 */
public class Cuadrado extends Rectangulo
{
    
    private double lado;
    
    /**
     * Cuadrado Constructor permite instanciar Cuadrados
     *
     * @param p_origen ubicacion en el eje x e y
     * @param p_lado lado del cuadrado
     */
    Cuadrado(Punto p_origen, double p_lado){
        super(p_origen, p_lado, p_lado);
        this.setLado(p_lado);
    }
    
    //setters
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    
    //getters
    
    public double getLado(){
        return this.lado;
    }
    
    /**
     * Método nombreFigura indica el nombre de la figura
     *
     * @return string con cuadrado
     */
    @Override
    public String nombreFigura(){
        return "******Cuadrado******";
    }
    
    /**
     * Método superficie calcula la superficie de un cuadrado
     *
     * @return superficie
     */
    @Override 
    public double superficie(){
        return this.getLado() * this.getLado();
    }
    
    /**
     * Método caracteristicas muestra todas las caracteristicas de un cuadrado
     *
     */
    @Override
    public void caracteristicas(){
        System.out.println(nombreFigura());
        System.out.println("Origen: " + this.origen.coordenadas() + " - " + "Alto: " + this.getAlto() + " - " + "Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - " + "Perimetro: " + this.perimetro());
    }
    
    
}