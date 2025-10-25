/**
 * La clase laboratorio contiene los datos de un laboratorio: su nombre, domicilio, telefono, monto de compra minima y dia de entrega
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor que permite instanciar un objeto de la clase Laboratorio
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio direccion de laboratorio
     * @param p_telefono numero telefonico del laboratorio
     * @param p_compraMin monto de compra minimo permitido
     * @param P_diaEnt dia de entrega del laboratorio
     */
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    
    /**
     * Constructor sobre cargado que permite instanciar un objeto de la clase Laboratorio
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio direccion de laboratorio
     * @param p_telefono numero telefonico del laboratorio
     */
    Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    public void nuevoDiaEntrega(int p_dia){
        this.diaEntrega = p_dia;
    }
    
    public void nuevaCompraMinima(int p_min){
        this.compraMinima = p_min;
    }
    
    /**
     * Este metodo muestra los datos del laboratorio: nombre, domicilio y telefono
     */
    public String mostrar(){
        return("Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " + this.getDomicilio() + "\t" + "Telefono: " + this.getTelefono());
    }
    
    
}