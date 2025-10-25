/**
 * La clase gerencia permite instanciar una gerencia con su nombre y una coleccion de alojamientos
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;

public class Gerencia{
   
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

    
    /**
     * Gerencia Constructor permite instanciar una gerencia
     *
     * @param p_nombre nombre de la gerencia
     * @param p_alojAlquilados coleccion de alojamientos que tiene a cargo la gerencia
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojAlquilados){
        this.setNombre(p_nombre);
        this.setAlojamientos(p_alojAlquilados);
    }
    
    /**
     * Gerencia Constructor permite instanciar una gerencia sin ningun alojamiento a cargo
     *
     * @param p_nombre nombre de la gerencia
     */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
    }
    
    //setter
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientos(ArrayList<Alojamiento> p_alojAlquilados){
        this.alojamientosAlquilados = p_alojAlquilados;
    }
    
    //getter
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Alojamiento> getAlojamientos(){
        return this.alojamientosAlquilados;
    }
    
    /**
     * Método agregarAlojamiento permite agregar un alojamiento a la coleccion
     *
     * @param p_alojamiento alojamiento a agregar
     * @return el alojamiento es agregado exitosamente
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().add(p_alojamiento);
    }
    
    /**
     * Método quitarAlojamiento quita un alojamiento de la coleccion
     *
     * @param p_alojamiento una coleccion
     * @return el alojamiento es eliminado correctamente
     */
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientos().remove(p_alojamiento);
    }
    
    /**
     * Método contarAlojamiento cuenta cuantos alojamientos (de un determinado tipo) hay
     *
     * @param p_tipoAlojamiento el tipo de alojamiento a contar
     * @return total de alojamientos de un determinado tipo
     */
    public int contarAlojamiento(String p_tipoAlojamiento){
        int total = 0;
        
        for(Alojamiento unAloj: this.getAlojamientos()){
            total += unAloj.contar(p_tipoAlojamiento);
        }
        
        return total;
    }
    
    /**
     * Método liquidar muestra un resumen de la estadia en un alojamiento desglosando el tipo, tamanio de 
     * habitaciones, costo total por dias, servicios y sus precios
     *
     */
    public void liquidar(){
        for(Alojamiento unAloj: this.getAlojamientos()){
            unAloj.liquidar();
            System.out.println("\n");
        }
    }
    
    /**
     * Método mostrarLiquidacion muestra la liquidacion de toda la gerencia incluyendo todos los tipos de alojamientos
     * y servicios en un solo recibo
     *
     */
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidacion----------------------");
        System.out.println("");
        this.liquidar();
        System.out.println("");
        System.out.println("Alojamiento tipo Cabaña -----> " + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel -----> " + this.contarAlojamiento("Hotel"));
    }
}