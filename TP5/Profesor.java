/**
 * La sub clase Profesor contiene los datos de un profesor
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */

import java.util.*;
public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> cargos;
    
    /**
     * Profesor Constructor permite instanciar un profesor
     *
     * @param p_dni dni del profesor
     * @param p_nombre nombre del profesor
     * @param p_apellido apellido del profesor
     * @param p_anio anio de inicio del profesor
     * @param p_titulo titulo del profesor
     * @param p_cargos coleccion de cargos del profesor
     */
    Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    
    //setters
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList p_cargos){
        this.cargos = p_cargos;
    }
    
    //getters
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    /**
     * Método agregarCargo a la coleccion de cargos del profesor
     *
     * @param p_cargo cargo a agregar
     * @return se agrega el cargo
     */
    public boolean agregarCargo(Cargo p_cargo){
        return this.getCargos().add(p_cargo);
    }
    
    /**
     * Método eliminarCargo elimina un cargo de la coleccion de un profesor
     *
     * @param p_cargo cargo a eliminar
     * @return se quita el cargo
     */
    public boolean eliminarCargo(Cargo p_cargo){
        if(this.getCargos().size() > 1){
            return this.getCargos().remove(p_cargo);
        }
        
        return false;
    }
    
    /**
     * Método listarCargos lista todos los cargos que el profesor tiene asignado
     *
     */
    public void listarCargos(){
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        for(Cargo unCargo : getCargos()){
            unCargo.mostrarCargo();
            System.out.println("\n");
        }
    }
    
    /**
     * Método sueldoTotal calcula el sueldo total del profesor con todos sus cargos
     *
     * @return sueldo total
     */
    public double sueldoTotal(){
        double total = 0;
        for(Cargo unCargo : getCargos()){
            total+=unCargo.sueldoDelCargo();
        }
        
        return total;
    }
    
    /**
     * Método mostrar muestra los datos del profesor
     *
     */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("\n");
        this.listarCargos();
        System.out.println("\n");
        System.out.println("**Sueldo Total: " + this.sueldoTotal() + " **");
    }
    
    /**
     * Método mostrarLinea muestra los datos del profesor en una sola linea
     *
     * @return devuelve el string con todos los datos del profesor en una sola linea
     */
    public String mostrarLinea(){
        return("DNI: " + this.getDNI() + " - " + "Nombre: " + this.nomYApe() + "Sueldo Total: " + this.sueldoTotal());
    }
    
}