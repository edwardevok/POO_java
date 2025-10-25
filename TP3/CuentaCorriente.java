/**
 * La clase CuentaCorriente contiene los datos de un una cuenta corriente: nro de cuenta, saldo, limite y titular
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(7/9/2025)
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Este constructor permite instanciar un objeto de la clase CuentaCorriente con el saldo en $0 y el limite descubierto en $500
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular de la cuenta
     * 
     */
    CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    /**
     * Este constructor sobre cargado permite instanciar un objeto de la clase CuentaCorriente con un saldo determinado
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular de la cuenta
     * @param p_saldo el saldo de la cuenta
     */
    CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setLimiteDescubierto(500);
    }
    
    //setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setTitular(Persona p_persona){
        this.titular = p_persona;
    }
    
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    //getters
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Este metodo deposita saldo a la cuenta (sumando al que ya se encontraba)
     * @param p_importe importe a depositar
     * @return saldo actualizado de la cuenta
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Este metodo extrae saldo de la cuenta
     * @param p_importe importe a ser extraído
     * @return saldo actualizado de la cuenta
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Este metodo indica si es posible extraer o nó dinero de la cuenta, analizando si el importe a extraer no supera la suma entre
     * el saldo actual y el limite
     * @param p_importe importe a extraer
     * @return devuelve true si se puede extraer el monto solicitado y false, si nó.
     */
    private boolean puedeExtraer(double p_importe){
        return p_importe <= this.getSaldo() + this.getLimiteDescubierto();
    }
    
    
    /**
     * Este metodo coordina la extraccion. Si el metodo puedeExtraer() devuelve true, entonces se procede con la extraccion. Sino, se muestra un mensaje
     * @param p_importe importe a extraer
     */
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el limite descubierto");
        }
    }
    
    /**
     * Este metodo muestra por pantalla los datos de la cuenta corriente: el numero, saldo, titular y limite
     */
    public void mostrar(){
        System.out.println("- Cuenta Corriente -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
    
    
    
    
    
    
    }