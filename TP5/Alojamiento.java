/**
 * La clase abstracta Alojamiento contiene la estructura que deben tener las clases que se extienden de ella
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;

public abstract class Alojamiento
{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicios;
    
    
    /**
     * Alojamiento Constructor permite construir un tipo de alojamiento en especifico
     *
     * @param p_nombre nombre del alojamiento
     * @param p_precio precio del alojamiento
     * @param p_dias dias a alojarse
     * @param p_servicios coleccion de servicios que tendrá
     */
    Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList <Servicio> p_servicios){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiaAlquiler(p_dias);
        this.setServicios(p_servicios);
    }
    
    /**
     * Alojamiento Constructor permite construir un tipo de alojamiento en especifico pero sin servicios 
     *
     * @param p_nombre nombre del alojamiento
     * @param p_precio precio del alojamiento
     * @param p_dias dias a alojarse
     */
    Alojamiento(String p_nombre, double p_precio, int p_dias){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precio);
        this.setDiaAlquiler(p_dias);
    }
    
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setPrecioBase(double p_precio){
        this.precioBase = p_precio;
    }
    
    private void setDiaAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }
    
    private void setServicios(ArrayList <Servicio> p_servicios){
        this.servicios = p_servicios;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecioBase(){
        return this.precioBase;
    }
    
    public int getDiaAlquiler(){
        return this.diasAlquiler;
    }
    
    public ArrayList<Servicio> getServicios(){
        return this.servicios;
    }
    
    /**
     * Método agregarServicios permite agregar un servicio a la coleccion
     *
     * @param p_servicio servicio a agregar
     * @return el servicio se agrega exitosamente a la coleccion
     */
    public boolean agregarServicios(Servicio p_servicio){
        return getServicios().add(p_servicio);
    }
    
    /**
     * Método quitarServicios permite quitar un servicio de la coleccion
     *
     * @param p_servicio servicio a eliminar
     * @return el servicio se elimina correctamente
     */
    public boolean quitarServicios(Servicio p_servicio){
        return getServicios().remove(p_servicio);
    }
    
    /**
     * Método contar cuenta la cantidad de un tipo de alojamiento
     *
     * @param p_alojamiento el tipo de alojamiento
     * @return la cantidad de alojamientos
     */
    public abstract int contar(String p_alojamiento);
    
    /**
     * Método costo calcular el precio del alojamiento por la cantidad de dias
     *
     * @return total
     */
    public double costo(){
        return this.getPrecioBase()*this.getDiaAlquiler();
    }
    
    /**
     * Método listarServicios lista todos los servicios
     *
     */
    public void listarServicios(){
        for(Servicio unServicio : this.getServicios()){
            System.out.println(unServicio.getDescripcion() + ": " + "$" + unServicio.getPrecio());
        }
    }
    
    /**
     * Método costoServicios muestra el total de todos los servicios
     *
     * @return total
     */
    public double costoServicios(){
        double acum = 0;
        for(Servicio unServicio : this.getServicios()){
            acum += unServicio.getPrecio();
        }
        
        return acum;
    }
    
    /**
     * Método liquidar muestra la informacion de costos de un alojamiento
     *
     */
    public void liquidar(){
        System.out.println("Alojamiento: " + this.getNombre());
        System.out.println("Costo por " + this.getDiaAlquiler() + " dias: $" + this.costo());
        this.listarServicios();
    }

}