import java.util.*;

/**
 * La clase EmpleadoConJefe contiene los datos personales de un empleado, ademas de su sueldo basico y el anio de ingreso al trabajo
 * Esta clase nos permite instanciar 2 roles: jefe y empleado; tambien podemos hacer que un empleado dependa de un jefe
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(22/08/2025)
 */
public class EmpleadoConJefe
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * Este constructor permite instanciar un empleado con jefe, ya que el ultimo parametro que recibe el constructor, es un jefe
     * @param p_cuil numero de cuil del empleado
     * @param p_apellido apellido del empleado
     * @param p_nombre nombre del empleado
     * @param p_importe sueldo del empleado
     * @param p_fecha fehca de ingreso del empleado a la empresa
     * @param p_jefe jefe del que depende el empleado
     */
    EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFecha(p_fecha);
        this.setJefe(p_jefe);
    }
    
    /**
     * Este constructor permite instanciar un jefe, ya que no recibe ningun parametro de jefe
     * @param p_cuil numero de cuil del jefe
     * @param p_apellido apellido del jefe
     * @param p_nombre nombre del jefe
     * @param p_importe sueldo del jefe
     * @param p_fecha fehca de ingreso del jefe a la empresa
     */
    EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFecha(p_fecha);
    }
    
    /**
     * Este constructor permite instanciar un empleado con jefe, ya que el ultimo parametro que recibe el constructor, es un jefe. Aqui pasamos como parametro
     * un anio en vez de la fecha completa
     * @param p_cuil numero de cuil del empleado
     * @param p_apellido apellido del empleado
     * @param p_nombre nombre del empleado
     * @param p_importe sueldo del empleado
     * @param p_anio anio de ingreso del empleado a la empresa
     * @param p_jefe jefe del que depende el empleado
     */
    EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
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
    
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setFecha(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    private void setAnioIngreso(int p_anio){
        this.fechaIngreso = new GregorianCalendar(p_anio,0,1);
    }
    
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
     //getters
    public long getCuil(){
        return this.cuil;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
       return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    public EmpleadoConJefe getJefe(){
        return this.jefe;
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
        return anioActual - this.getAnioIngreso();
    }
    
    /**
     * Este metodo calcula el descuento de la obra social(2% de su sueldo) y seguro de vida(1500) que se le hace al sueldo basico del empleado
     * @return descuento total que incluye la obra social y el seguro de vida
     */
    private double descuento(){
        double oS = this.getSueldoBasico() * 0.02;
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
            return this.getSueldoBasico()*0.02;
        }else if(this.antiguedad() >= 2 && this.antiguedad() <10){
            return this.getSueldoBasico()*0.04;
        }else{
            return this.getSueldoBasico()*0.06;
        }
    }
    
    /**
     * Este metodo calcula el monto adicional que se suma al sueldo basico del empleado segun su antiguedad
     * @return si la antiguedad es menor a 2, se devuelve el 2% del sueldo del empleado
     * @return si la antiguedad es menor o igual a 2 y menor a 10, se devuelve el 4% del sueldo del empleado
     * @return si la antiguedad es mayor o igual a 10, se devuelve el 6% del sueldo del empleado
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() + this.adicional() - this.descuento();
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
    
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad());
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
        if(this.getJefe() == null){
            System.out.println("GERENTE GENERAL");
        }else{
            System.out.println("Responde a: " + this.getJefe().apeYNom());
        }
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