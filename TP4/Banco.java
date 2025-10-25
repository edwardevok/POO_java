/**
 * La clase Banco contiene los datos de un banco: su nombre, nro de sucursal, localidad, empleados y las cuentas bancarias en forma de colección
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(21/09/2025)
 */

import java.util.*;

public class Banco
{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    /**
     * Constructor para instanciar un objeto de la clase Banco
     * @param p_nombre el nombre del banco
     * @param p_localidad es la localidad del banco
     * @param p_nroSucursal es el nro de la sucursal del banco
     * @param p_empleado es un empleado del banco (uno solo)
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.agregarEmpleado(p_empleado);
        
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Banco
     * @param p_nombre el nombre del banco
     * @param p_localidad es la localidad del banco
     * @param p_nroSucursal es el nro de la sucursal del banco
     * @param p_empleado es una coleccion de empleados
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Banco
     * @param p_nombre el nombre del banco
     * @param p_localidad es la localidad del banco
     * @param p_nroSucursal es el nro de la sucursal del banco
     * @param p_empleado es una coleccion de empleados
     * @param p_cuentas es una coleccion de cuentas bancarias de clientes
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }
    
    
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    
    private void setEmpleados(ArrayList p_empleados){
        this.empleados = p_empleados;
    }
    
    private void setCuentas(ArrayList p_cuentas){
        this.cuentasBancarias = p_cuentas;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public ArrayList<CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    
    /**
     * Este metodo permite agregar un empleado a la coleccion de empleados
     * @param p_empleado
     * @return el empleado es agregado a la coleccion
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Este metodo permite quitar un empleado de la coleccion de empleados
     * @param p_empleado
     * @return el empleado es agregado a la coleccion
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() > 1){
            return this.getEmpleados().remove(p_empleado);
        }
        
        return false;
    }
    
    /**
     * Este metodo permite agregar una cuenta bancaria a la coleccion de cuentas bancarias
     * @param p_cuenta es una cuenta bancaria a agregar
     * @return la cuenta bancaria es agregada a al coleccion
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    /**
     * Este metodo permite quitar una cuenta bancara de la coleccion de cuentas bancarias
     * @param p_cuenta es la cuenta a quitar
     * @return la cuenta bancaria es eliminada de la coleccion
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        if(this.getCuentasBancarias().size() > 1){
            return this.getCuentasBancarias().remove(p_cuenta);
        }
        
        return false;
    }
    
    /**
     * Este metodo muestra la suma de todos los sueldos de los empleados del banco
     * @return la suma de todos los sueldos a pagar de los empleados
     */
    public double sueldosAPagar(){
        double acumSueldo = 0;
        for(Empleado unEmpleado: getEmpleados()){
            acumSueldo = acumSueldo + unEmpleado.sueldoNeto();
        }
        
        return acumSueldo;
    }
    
    /**
     * Este metodo lista a todos los empleados y su sueldo
     */
    public void listarSueldos(){
        for(Empleado unEmpleado: getEmpleados()){
            System.out.println(unEmpleado.getCUIL() + "\t" + unEmpleado.apeYNom() + ",---------------------------$" + unEmpleado.sueldoNeto());
        }
        
        System.out.println("Total a Pagar--------------------------------------------$"+this.sueldosAPagar());
    }
    
    /**
     * Este metodo lista todas las cuentas bancarias cuyo saldo sea $0
     */
    public void listarCuentasConSaldoCero(){
        System.out.println("Cuentas sin saldo:");
        System.out.println("---Cuenta---------Apellido y Nombre----------------");
        
        for(CuentaBancaria unaCuenta: getCuentasBancarias()){
            if(unaCuenta.getSaldo() == 0){
                System.out.println(unaCuenta.getNroCuenta() + " \t " + unaCuenta.getTitular().apeYNom() + " \t ");
            }
        }
    }
    
    /**
     * Este metodo lista a todos los titulares de las cuentas bancarias
     * @return devuelve un HashSet de todos los titulares
     */
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> personas = new HashSet();
        for(CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            personas.add(unaCuenta.getTitular());
        }
        
        return personas;
    }
    
    /**
     * Este metodo indica la cantidad de cuentas bancarias con un saldo distinto a $0
     * @return numero total de cuentas bancarias con saldo distinto a $0
     */
    private int cuentasConSaldoActivo(){
        int contador = 0;
        for(CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            if(unaCuenta.getSaldo()!=0){
               contador = contador + 1;
            }
        }
        
        return contador;
    }
    
    /**
     * Este metodo muestra la informacion del banco y lista la informacion de todos sus empleados
     */
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + "\t" + "Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + localidad.getNombre() + "\t" + "Provincia: " + localidad.getProvincia());
        
        this.listarSueldos();
    }
    
    /**
     * Este metodo muestra la informacion del banco y varios datos de las cuentas bancarias. Haciendo uso de los metodos anteriormente mencionados
     */
    public void mostrarResumen(){
        System.out.println("Banco: " + this.getNombre() + "\t" + "Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + localidad.getNombre() + "\t" + "Provincia: " + localidad.getProvincia());
        System.out.println("*******************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("*******************************************************************");
        System.out.println("Número total de Cuentas Bancarias: " + this.getCuentasBancarias().size());
        System.out.println("Cuentas Activas: " + this.cuentasConSaldoActivo());
        System.out.println("Cuentas Saldo Cero: "+ (this.getCuentasBancarias().size() - this.cuentasConSaldoActivo()));
        System.out.println("-------------------------------------------------------------------");
        this.listarCuentasConSaldoCero();
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Listado de clientes: ");
        for(Persona unaPersona: this.listaDeTitulares()){
            System.out.print(unaPersona.apeYNom() + "; ");
        }
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------");
        
    }
}