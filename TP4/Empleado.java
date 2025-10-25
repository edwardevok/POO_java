/**
 * La clase Empleado contiene los datos personales de un empleado, ademas de su sueldo basico y el anio de ingreso al trabajo 
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(22/08/2025)
 */

//Importamos la clase calendar para poder trabajar con fechas
import java.util.*;


public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    
    /**
     * Constructor para instanciar un objeto de la clase Empleado
     * @param p_cuil el cuil del Empleado
     * @param p_apellido el apellido del Empleado
     * @param p_nombre el nombre del Empleado
     * @param p_importe el sueldo del Empleado
     * @param p_anio el anio de ingreso a la compania del Empleado
     */
    Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setAnio(p_anio);
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Empleado pasando como ultimo parametro la fecha de ingreso
     * @param p_cuil el cuil del Empleado
     * @param p_apellido el apellido del Empleado
     * @param p_nombre el nombre del Empleado
     * @param p_importe el sueldo del Empleado
     * @param p_anio el anio de ingreso a la compania del Empleado
     */
    Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
        this.setFecha(p_fecha);
    }
    
    //setters
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setImporte(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setAnio(int p_anio){
        this.fechaIngreso = new GregorianCalendar(p_anio,0,1);
    }
    
    private void setFecha(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    //getters
    public long getCUIL(){
        return this.cuil;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getImporte(){
        return this.sueldoBasico;
    }
    
    public int getAnio(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    public Calendar getFecha(){
        return this.fechaIngreso;
    }
    
    /**
     * Este metodo calcula cuanto tiempo lleva trabajando el empleado en la compañia restando el anio actual con el anio de ingreso del mismo
     * @return tiempo en anios de cuanto lleva trabajando el empleando
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return anioActual - this.getAnio();
    }
    
    /**
     * Este metodo calcula el descuento de la obra social(2% de su sueldo) y seguro de vida(1500) que se le hace al sueldo basico del empleado
     * @return descuento total que incluye la obra social y el seguro de vida
     */
    private double descuento(){
        double oS = this.getImporte() * 0.02;
        return oS + 1500;
    }
    
    /**
     * Este metodo calcula el monto adicional que se suma al sueldo basico del empleado segun su antiguedad
     * @return si la antiguedad es menor a 2, se devuelve el 2% del sueldo del empleado
     * @return si la antiguedad es menor o igual a 2 y menor a 10, se devuelve el 4% del sueldo del empleado
     * @return si la antiguedad es mayor o igual a 10, se devuelve el 6% del sueldo del empleado
     */
    private double adicional(){
        
        if (this.antiguedad()<2){
            return this.getImporte()*0.02;
        }else if(antiguedad() >= 2 && antiguedad() <10){
            return this.getImporte()*0.04;
        }else{
            return this.getImporte()*0.06;
        }
    }
    
    /**
     * Este metodo calcula el monto adicional que se suma al sueldo basico del empleado segun su antiguedad
     * @return si la antiguedad es menor a 2, se devuelve el 2% del sueldo del empleado
     * @return si la antiguedad es menor o igual a 2 y menor a 10, se devuelve el 4% del sueldo del empleado
     * @return si la antiguedad es mayor o igual a 10, se devuelve el 6% del sueldo del empleado
     */
    public double sueldoNeto(){
        return this.getImporte() + this.adicional() - this.descuento();
    }
    
    /**
     * Devuelve el nombre y apellido del empleado
     * @return: nombre y apellido (en ese orden)
     */
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    
    /**
     * Devuelve el nombre y apellido del empleado
     * @return: apellido y nombre (en ese orden)
     */
    public String apeYNom(){
        return(this.getApellido() + ", " + this.getNombre());
    }
    
    /**
     * Este metodo muestra por pantalla los datos del empleado: su nombre y apellido, cuil, antiguedad y su sueldo neto
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCUIL() + "\t" + "Antiguedad: " + this.antiguedad() + " anios de servicio");
        System.out.println("Sueldo neto: $" + this.sueldoNeto());
    }
    
    /**
     * Este metodo muestra por pantalla y en un solo renglon el cuil, apellido y nombre y el sueldo del empleado
     * @return: cuil, apellido y nombre y sueldo neto
     */
    public String mostrarLinea(){
        return (this.getCUIL() + "\t" + this.apeYNom() + "…………… $" + this.sueldoNeto());
    }
    
    /**
     * Este metodo indica si el dia actual es el dia en el cual la persona ingresó a trabajar a la empresa.
     * @return true si el dia y mes actual coinciden
     * @return false si no coinciden
     */
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        
        int diaEntrada = this.getFecha().get(Calendar.DAY_OF_MONTH);
        int mesEntrada = this.getFecha().get(Calendar.MONTH);
        
        return diaActual == diaEntrada && mesActual == mesEntrada;
        
    }
}