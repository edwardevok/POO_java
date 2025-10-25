/**
 * La clase Hospital contiene los datos de un hospital: su nombre y el director
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Hospital
{
    private String nombreHospital;
    private String nombreDirector;
    
    /**
     * Este consttructor permite instanciar un objeto de la clase Hospital
     * @param p_nombre nombre del hosptial
     * @param p_director objeto que contiene los datos del director
     */
    Hospital(String p_nombre, String p_director){
        this.setNombre(p_nombre);
        this.setDirector(p_director);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombreHospital = p_nombre;
    }
    
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    //getters
    public String getNombre(){
        return this.nombreHospital;
    }
    
    public String getDirector(){
        return this.nombreDirector;
    }
    
    /**
     * Este metodo muestra por pantalla los datos del hospital y los del paciente
     * @param p_paciente paciente cuyos datos se mostrarán
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombre() + " " + "Director: " + this.getDirector());
        System.out.println("----------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
   
    
}