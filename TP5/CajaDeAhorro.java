/**
 * La clase CajaDeAhorro contiene los datos de una caja de ahorro: numero de cuenta, saldo, cantidad de extracciones y titular
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class CajaDeAhorro extends CuentaBancaria
{
    
    private int extraccionesPosibles;
    
    /**
     * Este constructor permite instanciar un objeto de la clase CajaDeAhorro. Por defecto el saldo de la cuenta será $0 y la cantidad de extraciones, 10
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular de la cuenta
     */
    CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    
    /**
     * Este constructor permite instanciar un objeto de la clase CajaDeAhorro. Por defecto, la cantidad de extraciones sera 10 y esta vez el saldo
     * lo define el usuario
     * @param p_nroCuenta numero de cuenta
     * @param p_titular titular de la cuenta
     * @param p_saldo saldo de la cuenta
     */
    CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular,p_saldo);
       
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
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
     * Este metodo indica si es posible extraer o nó dinero de la caja de ahorro, analizando si el importe a extraer no supera la suma entre
     * el saldo actual y la cantidad de extracciones posibles
     * @param p_importe importe a extraer
     * @return devuelve true si se puede extraer el monto solicitado y false, si nó.
     */
    public boolean puedeExtraer(double p_importe){
        return p_importe <= this.getSaldo() && this.getExtraccionesPosibles() != 0;
    }
    
    /**
     * Este metodo extrae saldo de la caja de ahorro y ademas resta una extraccion del total de extracciones por dia
     * @param p_importe importe a ser extraído
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Este metodo coordina la extraccion. Si el metodo puedeExtraer() devuelve true, entonces se procede con la extraccion. Sino, se muestra un mensaje
     * @param p_importe importe a extraer
     */
    public void extraer(double p_importe){
        if(puedeExtraer(p_importe)){
            extraccion(p_importe);
        }else if(this.getExtraccionesPosibles()==0){
            System.out.println("No tiene habilitadas mas extracciones!");
        }else{
            System.out.println("No puede extraer mas que el saldo!");
        }
    }
    
    /**
     * Este metodo muestra por pantalla los datos de la cuenta corriente: el numero, saldo, titular y limite
     */
    public void mostrar(){
        System.out.println(" - Caja de Ahorro -");
        System.out.println("Nro Cuenta: " + this.getNroCuenta() + " - " + "Saldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
        
    }
    
    
}