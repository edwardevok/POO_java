/**
 * La clase Docente contiene los datos de un docente: nombre, grado, sueldo basico y asigancion familiar
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Docente
{
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * Este cosntructor permite instanciar un objeto de la clase Docente
     * @param p_nombre nombre del docente
     * @param p_grado grado del docente
     * @param p_sueldo sueldo del docente
     * @param p_asignacion asignacion familiar del docente
     */
    Docente(String p_nombre, String p_grado, double p_sueldo, double p_asignacion){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldo(p_sueldo);
        this.setAsignacion(p_asignacion);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    private void setSueldo(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAsignacion(double p_asignacion){
        this.asignacionFamiliar = p_asignacion;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    public double getSueldo(){
        return this.sueldoBasico;
    }
    
    public double getAsignacion(){
        return this.asignacionFamiliar;
    }
    
    /**
     * Este metodo calcula el sueldo del empleado, sumando el sueldo basico con la asignacion familiar
     * @return sueldo del docente
     */
    public double calcularSueldo(){
        return this.getSueldo() + this.getAsignacion();
    }
    
}