/**
 * La clase Cargo contiene los datos del cargo de un profesor
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
import java.util.*;

public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    
    /**
     * Cargo Constructor permite instanciar un Cargo
     *
     * @param p_nombre nombre del cargo
     * @param p_sueldo sueldo a pagar por el cargo
     * @param p_anio anio del cargo
     */
    Cargo(String p_nombre, double p_sueldo, int p_anio){
        this.setNombre(p_nombre);
        this.setSueldo(p_sueldo);
        this.setAnio(p_anio);
        this.setHorasDeDocencia(10);
    }
    
    //setters 
    private void setNombre(String p_nombre){
        this.nombreCargo = p_nombre;
    }
    
    private void setSueldo(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAnio(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    protected void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia = p_horasDeDocencia;
    }
    
    //getters
    public String getNombre(){
        return this.nombreCargo;
    }
    
    public double getSueldo(){ 
        return this.sueldoBasico;
    }
    
    public int getAnio(){
        return this.anioIngreso;
    }
    
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }
    
    /**
     * Método antiguedad calcula el valor de antiguedad del cargo
     *
     * @return valor de antiguedad
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);  
        return anioActual - this.getAnio();
    }
    
    /**
     * Método adicionalXAntiguedad calcula el adicional por la antiguedad del cargo
     *
     * @return adicional total
     */
    private double adicionalXAntiguedad(){
        return (this.getSueldo() * this.antiguedad())/100;
    }
    
    /**
     * Método sueldoDelCargo que suma el adicional por antiguedad
     *
     * @return El valor de retorno
     */
    public double sueldoDelCargo(){
        return this.antiguedad() + this.adicionalXAntiguedad();
    }
    
    /**
     * Método mostrarCargo muestra la informacion del cargo
     *
     */
    public void mostrarCargo(){
        System.out.println(this.getNombre() + " - " + "Sueldo Basico: " + this.getSueldo() + " - " + "Sueldo Cargo: " + this.sueldoDelCargo() + " - " + "Antiguedad: " + this.antiguedad());
        System.out.println("Horas Docencia: " + this.getHorasDeDocencia());
        
    }
    
    
}