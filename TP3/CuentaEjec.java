/**
 * Clase ejecutable de la clase CuentaBancaria
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */

import java.util.Scanner;
public class CuentaEjec
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //instanciamos una persona
        System.out.println("Ingresa el dni de la persona");
        int dni = teclado.nextInt();
        
        teclado.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingresa el apellido");
        String apellido = teclado.nextLine();
        
        System.out.println("Ingresa el anio de nacimiento");
        int anio = teclado.nextInt();
        
        Persona unaPersona = new Persona(dni,nombre,apellido,anio);
        
        //mostramos los datos de la persona
        unaPersona.mostrar();
        System.out.println();
        
        System.out.println("\n");
        
        //instanciamos una cuenta bancaria
        System.out.println("Ingresa el numero de cuenta bancaria: ");
        int nCuenta = teclado.nextInt();
        
        CuentaBancaria unaCuenta = new CuentaBancaria(nCuenta, unaPersona);
        
        //mostramos su informacion
        unaCuenta.mostrar();
        
        System.out.println("\n");
        
        //depositamos saldo a la cuenta bancaria
        System.out.println("Depositamos saldo a la cuenta");
        unaCuenta.depositar(950000);
        System.out.println("Saldo actualizado: " + unaCuenta.getSaldo());
        
        System.out.println("\n");
        
        //extraemos saldo
        System.out.println("Extraemos saldo");
        unaCuenta.extraer(500000);
        System.out.println("Saldo actualizado: " + unaCuenta.getSaldo());
        
        /**Ahora instanciamos nuevas clases Persona y CuentaBancaria para probar el otro constructor **/
        //instanciamos otra persona y otra cuenta bancaria usando el segundo constructor
        System.out.println("Ingrese el dni de una persona");
        int dni2 = teclado.nextInt();
        
        teclado.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre2 = teclado.nextLine();
        
        System.out.println("Ingresa el apellido");
        String apellido2 = teclado.nextLine();
        
        System.out.println("Ingresa el anio de nacimiento");
        int anio2 = teclado.nextInt();
        
        Persona otraPersona = new Persona(dni,nombre2,apellido2,anio2);
        
        System.out.println("Ingresa una cuenta bancaria: ");
        int cuenta2 = teclado.nextInt();
        
        //mostramos sus datos
        CuentaBancaria otraCuenta = new CuentaBancaria(cuenta2, otraPersona, 1000000);
        otraCuenta.mostrar();
        
        //depositamos saldo en la 2da cuenta
        otraCuenta.depositar(90000);
        System.out.println("Saldo actualizado de la 2da cuenta: " + otraCuenta.getSaldo());
        
        
    }
}