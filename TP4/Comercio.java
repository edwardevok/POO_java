/**
 * La clase Comercio contiene los datos de un comercio: el nombre y sus empleados (los mismos, en una colección)
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(21/09/2025)
 */

import java.util.*;

public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Constructor para instanciar un objeto de la clase Comercio
     * @param p_nombre el nombre del comercio
     */
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap());
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Comercio
     * @param p_nombre el nombre del comercio
     * @param p_empleados son los empleados(coleccion de empleados)
     */
    public Comercio(String p_nombre, HashMap p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    //setters 
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap<Long,Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Long,Empleado> getEmpleados(){
        return this.empleados;
    }
    
    /**
     * Este metodo permite incorporar un empleado al comercio
     * @param p_empleado es el empleado que queremos añadir a la coleccion
     */
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCUIL(),p_empleado);
    }
    
    /**
     * Este metodo permite despedir a un empleado del comercio
     * @param p_empleado es el empleado a eliminar de la coleccion
     */
    public Empleado bajaEmpleado(long p_cuil){
       return this.getEmpleados().remove(p_cuil);
    }
    
    /**
     * Este metodo permite saber la cantidad de empleados que hay en el comercio. (La cantidad de empleados en la coleccion)
     */
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    /**
     * Este metodo permite conocer si un empleado trabaja en el comercio o nó (segun su numero de CUIL)
     * @param p_cuil es el numero de cuil del empleado
     * @return true si el empleado trabaja en el comercio
     * @return false si nó trabaja
     */
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    /**
     * Este metodo permite buscar un empleado y devolverlo
     * @param p_cuil es el cuil del empleado
     * @return empleado
     */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    /**
     * Este metodo permite mostrar el sueldo de un empleado en especifico
     * @param p_cuil es el numero de cuil del empleado
     * @return sueldo del alumno
     */
    public void sueldoNeto(long p_cuil){
        this.getEmpleados().get(p_cuil).sueldoNeto();
    }
    
    /**
     * Este metodo permite mostrar los datos de todos los empleados que trabajan en el comercio
     */
    public void nomina(){
        System.out.println("Nomina de empleados de Avanti SRL");
        for(Map.Entry<Long,Empleado> unEmpleado : empleados.entrySet()){
            System.out.println(unEmpleado.getValue().mostrarLinea());
        }
    }
}