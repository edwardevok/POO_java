/**
 * La clase Localidad contiene los datos de una localidad: nombre, provincia de la que forma parte
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    /**
     * Este constructor permite instanciar un objeto de la clase Localidad
     * @param p_nombre nombre de la localidad
     * @param p_provincia nombre la provincia
     */
    Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Este metodo muestra por pantalla el nombre de la localidad con su respectiva provincia
     * @return string con el nombre de la localidad y su correspondiente provincia
     */
    public String mostrar(){
        return ("Localidad: " + this.getNombre() + " " + "Provincia: " + this.getProvincia());
    }

}