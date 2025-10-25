/**
 * La clase Facultad contiene los datos de una facultad
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
import java.util.*;

public class Facultad
{
    private String nombre;
    private HashMap<Integer,Profesor> profesores;
    
    /**
     * Facultad Constructor permite instanciar una facultad con una coleccion de profesores
     *
     * @param p_nombre nombre de la facultad
     * @param p_profesores coleccion de profesores
     */
    Facultad(String p_nombre, HashMap p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    /**
     * Facultad Constructor permite instanciar una facultad con un solo profesor
     *
     * @param p_nombre nombre de la facultad
     * @param p_profesor el profesor a agregar
     */
    Facultad (String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.agregarProfesor(p_profesor);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProfesores(HashMap<Integer, Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    public void agregarProfesor(Profesor p_profesor){
        this.getProfesores().put(p_profesor.getDNI(),p_profesor);
    }
    
    
    
    //getters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Integer,Profesor> getProfesores(){
        return this.profesores;
    }
    
    /**
     * Método nominaProfesores permite mostrar el listado de todos los profesores y la suma de todos sus sueldos
     *
     */
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: FaCENA");
        System.out.println("------------------------------------------------------------------");
        for(Map.Entry<Integer,Profesor> unProfesor: profesores.entrySet()){
            System.out.println(unProfesor.getValue().mostrarLinea());
            System.out.println("\n");
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a pagar: $" + this.totalAPagar()); 
        System.out.println("\n");
        
    }
    
    /**
     * Método totalAPagar permite acumular los sueldos de todos los profesores
     *
     * @return El valor de retorno
     */
    public double totalAPagar(){
        double total = 0;
        for(Map.Entry<Integer,Profesor> unProfesor: profesores.entrySet()){
            total += unProfesor.getValue().sueldoTotal();
        }
        return total;
    }
    
    /**
     * Método listarProfesorCargos muestra todos los profesores y sus cargos. Tambien la cantidad total de profesores que hay en 
     * una facultad
     *
     */
    public void listarProfesorCargos(){
        int contador = 0;
        System.out.println("***** Detalle de Profesores y cargos de Facultad: " + this.getNombre() + "*****");
        System.out.println("--------------------------------------------------------------------------------");
        for(Map.Entry<Integer,Profesor> unProfesor: profesores.entrySet()){
            unProfesor.getValue().mostrar();
            contador += 1;
            System.out.println("\n");
            System.out.println("------------------ **** -------------------");
        }
        System.out.println("Hay: " + contador + " profesores");
    }
}