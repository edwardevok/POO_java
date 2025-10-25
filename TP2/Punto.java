/**
 * La clase punto contiene los valores en el eje x y eje y de un punto
 * 
 * @author (Eduardo Lopez) 
 * @author(Joan Mauri)
 * @version (22/08/2025)
 */
public class Punto
{
    private double x;
    private double y;
    
    /**
     * El constructor Punto permite instanciar un objeto de la clase Punto. Los valores de x e y por defecto se inicializan en 0
     */
    Punto(){
        this.setX(0);
        this.setY(0);
    }
    
    /**
     * El constructor Punto permite instanciar un objeto de la clase Punto
     * @param p_x valor de x
     * @param p_y valor de y
     */
    Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    //setters
    private void setX(double p_x){
        this.x = p_x;
    }
    
    private void setY(double p_y){
        this.y = p_y;
    }
    
    //getters
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    /**
     * Este metodo cambia la posicion del punto en el eje
     * @param p_dx es el valor de desplazamiento de x
     * @param p_dy es el valor de desplazamiento de y
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    
    /**
     * Este metodo muestra al punto en formato de coordenadas
     * @return se muestra al punto con el formato (x,y)
     */
    public String coordenadas(){
        return("(" + this.getX() + ", " + this.getY()+")");
    }
    
    
    /**
     * Este metodo muestra el valor del punto en el eje x y el eje y
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    
    
    
    
    
    
    
    
    
}