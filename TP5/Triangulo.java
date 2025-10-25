
/**
 * La clase trinagulo contiene los datos de un triangulo como su base y altura
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    
    /**
     * Triangulo Constructor que permite instanciar triangulos
     *
     * @param p_origen ubicacion del triangulo en un eje x e y
     * @param p_base base del triangulo
     * @param p_altura altura del triangulo
     */
    Triangulo(Punto p_origen, double p_base, double p_altura){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    //setters
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    //getters
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    /**
     * Método superficie calcula la superficie de un triangulo
     *
     * @return superficie
     */
    @Override
    public double superficie(){
        return ((this.getBase() * this.getAltura())/2);
    }
    
    /**
     * Método nombreFigura devuelve el nombre de la figura
     *
     * @return string con el nombre de la figura
     */
    @Override
    public String nombreFigura(){
        return "******Triangulo******";
    }
    
    
}