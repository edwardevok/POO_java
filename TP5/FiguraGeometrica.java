/**
 * La clase FiguraGeometrica es una clase abstracta que contiene la ubicacion en el eje x e y de cualquier figura geometrica
 * extiendan de ella
 * @author(Joan Mauri, Lopez Eduardo)
 * @version(18/10/2025)
 */
public abstract class FiguraGeometrica
{
    protected Punto origen;
    
    /**
     * FiguraGeometrica Constructor que indica la estructura que deben tener las clases que se extienden de la clase
     *
     * @param p_origen punto de origen de la figura
     */
    FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    
    //setters
    protected void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    //getters
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * Método abstracto que devuelve un string con el nombre de la figura
     *
     * @return string con el nombre de la figura
     */
    public abstract String nombreFigura();
    
    
    /**
     * Método superficie que calcula la superficie de la figura
     *
     * @return superficie de la figura
     */
    public abstract double superficie();
    
    /**
     * Método mostrarSuperficie muestra la superficie de la figura
     *
     */
    public void mostrarSuperficie(){
        System.out.println("Superficie: " + this.superficie());
    }
    
    
    
}