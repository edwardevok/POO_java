/**
 * La clase Paciente contiene los datos de un paciente: su nro de historia clinica, nombre, domicilio, localidad natal y localidad de residencia actual
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * Este constructor permite instanciar un objeto de la clase Paciente
     * @param p_historia numero de historia clinica
     * @param p_nombre nombre del paciente
     * @param p_domicilio domicilio del paciente
     * @param p_nacido localidad donde nació
     * @param p_vive localidad donde vive
     */
    Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_nacido, Localidad p_vive){
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_nacido);
        this.setVive(p_vive);
    }
    
    //setters
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    
    //getters
    public int getHistoria(){
        return this.historiaClinica;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    /**
     * Este metodo muestra los datos del paciente por pantalla
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + " " + "Historia Clinica: " + this.getHistoria() + " " + "Domicilio: " + this.getDomicilio());
        System.out.println(this.localidadNacido.mostrar());
    }
    
    /**
     * Este metodo muestra los datos del paciente pero en una sola linea
     */
    public String cadenaDeDatos(){
        return(this.getNombre() + "....." + this.getHistoria() + "....." + this.getDomicilio() + " - " + this.localidadNacido.mostrar());
    }
}