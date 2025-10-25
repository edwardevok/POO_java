/**
 * La clase cliente contiene sus datos personales ademas de su saldo 
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */

public class Cliente
{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor para instanciar un objeto de la clase Cliente
     * @param p_dni el dni del cliente
     * @param p_apellido el apellido del cliente
     * @param p_nombre el nombre del cliente
     * @param p_importe el saldo del cliente
     */
    Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe){
        this.setDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setImporte(p_importe);
    }
    
    //setters
    private void setDNI(int p_dni){
        this.nroDNI = p_dni;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setImporte(double p_importe){
        this.saldo = p_importe;
    }
    
    //getters
    public int getDNI(){
        return this.nroDNI;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getImporte(){
        return this.saldo;
    }
    
    /**
     * Actualizar el saldo del cliente
     * @param p_importe nuevo saldo a actualizar
     * @return: nuevo saldo del cliente
     */
    public double nuevoSaldo(double p_importe){
        this.saldo = p_importe;
        return this.saldo;
    }
    
    /**
     * Actualizar el saldo del cliente realizando una suma
     * @param p_importe saldo que será sumado al importe actual
     * @return: nuevo saldo del cliente
     */
    public double agregaSaldo(double p_importe){
        this.saldo = this.saldo + p_importe;
        return this.saldo;
    }
    
    /**
     * Devuelve el nombre y apellido del cliente
     * @return: apellido y nombre (en ese orden)
     */
    public String apeYnom(){
        return(this.getApellido() + " " + this.getNombre());
    }
    
    /**
     * Devuelve el nombre y apellido del cliente
     * @return: nombre y apellido (en ese orden)
     */
    public String nomYape(){
        return(this.getNombre() + " " + this.getApellido());
    }
    
    /**
     * Mostramos por pantalla el nombre, apellido, dni y saldo del cliente
     */
    public void mostrar(){
        System.out.println("-Cliente-");
        System.out.println("Nombre y Apellido: " + this.nomYape() + " " + "(" + this.getDNI() + ")");
        System.out.println("Saldo: $" + this.getImporte());
    }
}