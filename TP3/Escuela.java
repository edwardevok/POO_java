/**
 * La clase Escuela contiene los datos de una escuela: nombre, domicilio y director
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Escuela
{
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Este constructor permite instanciar un objeto de la clase Escuela
     * @param p_nombre nombre de la escuela
     * @param p_domicilio domicilio de la escuela
     * @param p_director nombre del director
     */
    Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    /**
     * Este metodo muestra por pantalla el recibo de sueldo de un docente
     * @param p_docente docente cuyo recibo de sueldo se mostrará
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: "+this.getNombre() + "\n" + "Domicilio: " + this.getDomicilio() + "\n" + "Director: " + this.getDirector());
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Docente: " + p_docente.getNombre());
        System.out.println("Sueldo: ..................." + "$" + p_docente.getSueldo());
        System.out.println("Sueldo basico: ............" + "$" + p_docente.calcularSueldo());
        System.out.println("Asignacion familiar........" + "$" + p_docente.getAsignacion());
    }
    
    
}