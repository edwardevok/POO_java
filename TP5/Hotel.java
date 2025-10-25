/**
 * La sub clase Hotel permite instanciar una alojamiento de tipo Hotel
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;
public class Hotel extends Alojamiento
{
    private String tipoHabitacion;
    
    //setters
    private void setTipo(String p_tipo){
         this.tipoHabitacion = p_tipo;
    }
    
    //getters
    public String getTipo(){
        return this.tipoHabitacion;
    }
    
    /**
     * Hotel Constructor permite instanciar un Hotel
     *
     * @param p_nombre nombre del hotel
     * @param p_precio tarifa fija
     * @param p_dias cantidad de dias
     * @param p_tipo Un tipo de habitacion
     * @param p_servicios coleccion de servicios
     */
    Hotel(String p_nombre, double p_precio, int p_dias, String p_tipo, ArrayList <Servicio> p_servicios){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setTipo(p_tipo);
    }
    
    /**
     * Método costo permite calcular el costo de la habitacion segun sea double o single
     *
     * @return costo total con el adicional incluido
     */
    public double costo(){
        double adicSingle = 20 * this.getDiaAlquiler();
        double adicDouble = 35 * this.getDiaAlquiler();
        
        if(this.getTipo().equalsIgnoreCase("single")){
            return super.costo() + adicSingle;
        }else{
            return super.costo() + adicDouble;
        }
    }
    
    /**
     * Método liquidar muestra la liquidacion del la habitacion con sus totales y los servicios
     *
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion " + this.getTipo());
        System.out.println("Total: ------> $" + this.costo() + this.costoServicios());
    }
    
    /**
     * Método contar permite contar cuantos hoteles hay
     *
     * @param p_alojamiento tipo de alojamiento
     * @return 1 si coincide, 0 si nó.
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("hotel")){
            return 1;
        }
        return 0;
    }
        
}