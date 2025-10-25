/**
 * La clase Elipse contiene el eje mayor y menor de una elipse. Estructura que tendrán los casos especiales (sub clases)
 * que se extenderán de Elipse
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (19/10/2025)
 */
public class Elipse extends FiguraGeometrica
{
    private double rEjeMayor;
    private double sEjeMenor;
    
    
    /**
     * Elipse Constructor permite instanciar una elipse
     *
     * @param p_origen ubicacion en el eje x e y
     * @param p_ejeMayor semieje mayor
     * @param p_ejeMenor semieje menor
     */
    Elipse(Punto p_origen, double p_ejeMayor, double p_ejeMenor){
        super(p_origen);
        
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
    }
    
    private void setEjeMayor(double p_ejeMayor){
        this.rEjeMayor = p_ejeMayor;
    }
    
    private void setEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }
    
    public double getEjeMayor(){
        return this.rEjeMayor;
    }
    
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    
    /**
     * Este metodo permite desplazar una elipse (desplazando su centro)
     * @param p_dx ubicacion del centro de la elipse en el eje x
     * @param p_dy ubicacion del centro de la elipse en el eje y
     */
    public void desplazar(double p_dx, double p_dy){
        origen.desplazar(p_dx,p_dy);
    }

    /**
     * Este metodo calcula la superifice de la elipse
     * @return superficie
     */
    @Override
    public double superficie(){
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    
    
    /**
     * Este metodo calcula la distancia que hay de una elipse a otra
     * @param otraElipse es la elipse que queremos saber a qué distancia está
     * @return distancia que hay entre ambas elipses
     */
    public double distanciaA(Elipse otraElipse){
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }
    
    /**
     * Este metodo compara la superficie de 2 elipses e indica cual es la mayor
     * @param otraElipse es la elipse que queremos comparar
     * @return devuelve una elipse u otra dependiendo de cual superficie es mayor
     */
    public Elipse elMayor(Elipse otraElipse){
        if(this.superficie()>otraElipse.superficie()){
            return this;
        }else{
            return otraElipse;
        }
    }
    
    /**
     * Este metodo muestra por pantalla las caracteristicas de la elipse: su centro en forma de coordenadas, semiejes y superficie
     */
    public void caracteristicas(){
        System.out.println(nombreFigura());
        System.out.println("Centro: " + this.origen.coordenadas() + "\t" + "-" + "Semieje Mayor: : " + this.getEjeMayor() + " - " + "Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }
    
    
    /**
     * Método nombreFigura devuelve el nombre de la figura
     *
     * @return string elipse
     */
    public String nombreFigura(){
        return "******Elipse******";
    }
}