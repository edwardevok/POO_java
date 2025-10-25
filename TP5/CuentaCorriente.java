/**
 * La clase CuentaCorriente contiene los datos de un una cuenta corriente: nro de cuenta, saldo, limite y titular
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(7/9/2025)
 */
public class CuentaCorriente extends CuentaBancaria
{
    
    private double limiteDescubierto;
   
    
    /**
     * Este constructor permite instanciar un objeto de la clase CuentaCorriente con el saldo en $0 y el limite descubierto en $500
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular de la cuenta
     * 
     */
    CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
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
        super(p_nroCuenta, p_titular, p_saldo);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    //setters
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    
    //getters
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * Este metodo deposita saldo a la cuenta (sumando al que ya se encontraba)
     * @param p_importe importe a depositar
     * @return saldo actualizado de la cuenta
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
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
    public boolean puedeExtraer(double p_importe){
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