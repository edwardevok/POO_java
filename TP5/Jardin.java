/**
 * La Clase jardin contiene el nombre del jardin de infantes y una coleccion de las figuras a pintar
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;

public class Jardin
{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    
    /**
     * Jardin Constructor que permite instanciar jardines
     *
     * @param p_nombre nombre del jardin
     * @param p_figuras coleccion de figuras geometricas
     */
    Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<FiguraGeometrica> getFiguras(){
        return this.figuras;
    }
    
    /**
     * Método cuantosMetros calcula cuantos metros totales hay que pintar de figuras sumando todas las superficies de las mismas
     *
     * @return total de metros
     */
    public double cuantosMetros(){
        double acum = 0;
        for(FiguraGeometrica unaFigura: this.getFiguras()){
            acum+=unaFigura.superficie();
        }
        return acum;
    }
    
    /**
     * Método cuantosLitros calcula cuantos litros de pintura se necesitarán para una determinada cantidad de metros
     *
     * @return total de litros
     */
    public double cuantosLitros(){
        return ((this.cuantosMetros()*4)/20);
    }
    
    /**
     * Método cuantasLatas calcula cuantas latas de pintura se necesitarán para una determinada cantidad de litros
     *
     * @return total de latas
     */
    public int cuantasLatas(){
        return(int)this.cuantosLitros()/4;
    }
    
    /**
     * Método detalleFiguras muestra el detalle de las figuras a pintar, su superficie, el total de metros, litros y latas de pintura
     * que se necesitan para pintar
     *
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre());
        System.out.println("\n");
        
        for(FiguraGeometrica unaFigura : this.getFiguras()){
            System.out.println(unaFigura.nombreFigura());
            System.out.println("Superficie: " + unaFigura.superficie());
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total A Cubrir: " + this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
    }
    
}