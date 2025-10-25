/**
 * La clase persona contiene los datos personales de una persona
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */

//Importamos la clase calendar para poder trabajar con fechas
import java.util.*;

public class Persona{
    
    //variables de instancia de la clase persona
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    /**
     * Constructor para instanciar un objeto de la clase Persona
     * @param p_dni el dni de la persona
     * @param p_nombre el nombre de la persona
     * @param p_apellido el apellido de la persona
     * @param p_anio el anio de nacimiento de la persona
     */
    Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
    this.setDNI(p_dni);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setAnioNacimiento(p_anio);
    }
    
    //setters
    private void setDNI(int p_DNI){
        this.nroDni = p_DNI;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    
    //getters
    public int getDNI(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    
    /**
     * Calcula la edad actual de la persona
     * @return: edad al dia de hoy
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy-this.getAnioNacimiento();
    }
    
    /**
     * Devuelve el nombre y apellido de la persona
     * @return: nombre y apellido (en ese orden)
     */
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    
    /**
     * Devuelve el nombre y apellido de la persona
     * @return: apellido y nombre (en ese orden)
     */
    public String apeYNom(){
        return(this.getApellido() + " " + this.getNombre());
    }
    
    /**
     * Mostramos por pantalla el nombre, apellido, dni y edad actual de la persona
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.print("DNI: "+this.getDNI() + "\t" + "Edad: " + this.edad() + " anios");
    }
    
    
}

