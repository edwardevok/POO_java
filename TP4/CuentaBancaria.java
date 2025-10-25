/**
 * La clase CuentaBancaria contiene los datos de una cuentaBancaria
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Este costructor permite instanciar un objeto de la clase CuentaBancaria con el saldo en $0
     * @param p_nroCuenta el numero de cuenta de la cuenta bancaria
     * @param p_titular el titular de la cuenta bancaria
     */
    CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
    }
    
    /**
     * Este constructor sobre cargado permite instanciar un objeto de la clase CuentaBancaria (con determinado estando en el atributo saldo)
     * @param p_nroCuenta el numero de cuenta de la cuenta bancaria
     * @param p_titular el titular de la cuenta bancaria
     * @param p_saldo el saldo de la cuenta bancaria
     */
    CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    //setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    //getters
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Este metodo deposita saldo a la cuenta (sumando al que ya se encontraba)
     * @param p_importe importe a depositar
     * @return saldo actualizado de la cuenta
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo()+p_importe);
        return this.getSaldo();
    }
    
    /**
     * Este metodo extrae saldo de la cuenta
     * @param p_importe importe a ser extraído
     * @return saldo actualizado de la cuenta
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo()-p_importe);
        return this.getSaldo();
    }
    
    /**
     * Este metodo muestra por pantalla los datos de la cuenta bancaria: los datos del titular y el saldo
     */
    public void mostrar(){
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: " +this.getTitular().nomYApe() + " (" + this.getTitular().edad() + ")");
        System.out.println("Saldo: "+this.getSaldo());
    }
}
