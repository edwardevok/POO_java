/**
 * La sub clase Cabaña permite instanciar una alojamiento de tipo Cabaña
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;
public class Cabaña extends Alojamiento
{
    private int nroHabitaciones;
    
    
    /**
     * Cabaña Constructor permite instanciar una cabaña
     *
     * @param p_nombre nombre de la cabaña
     * @param p_precio tarifa fija
     * @param p_dias cantidad de dias a alojarse
     * @param p_servicios coleccion de servicios
     * @param p_NroHabitaciones numero de habitaciones de la cabaña
     */
    Cabaña(String p_nombre, double p_precio, int p_dias, ArrayList <Servicio> p_servicios, int p_NroHabitaciones){
        super(p_nombre, p_precio, p_dias, p_servicios);
        this.setNroHabitacion(p_NroHabitaciones);
    }
    
    
    //setters 
    private void setNroHabitacion(int p_NroHabitaciones){
        this.nroHabitaciones = p_NroHabitaciones;
    }
    
    //getters
    public int getNroHabitacion(){
        return this.nroHabitaciones;
    }
    
    
    
    /**
     * Método costo calcula el costo total de la habitacion segun el numero de habitaciones y los dias a alojarse
     *
     * @return total de estadia
     */
    public double costo(){
        double adicional = 30 * this.getNroHabitacion() * this.getDiaAlquiler();
        return super.costo() + adicional;
    }
    
    /**
     * Método liquidar muestra la liquidacion del la habitacion con sus totales y los servicios
     *
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Cabaña con " + this.getNroHabitacion() + " habitaciones");
        System.out.println("Total: ------> $" + this.costo() + this.costoServicios());
    }
    
    /**
     * Método contar permite contar cuantas cabañas hay
     *
     * @param p_alojamiento tipo de alojamiento
     * @return 1 si coincide, 0 si nó.
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("cabaña")){
            return 1;
        }
        return 0;
    }
}