import java.util.Scanner;
import java.util.*;

/**
 * Clase ejecutable que prueba las funcionalidades de clas clases CajaDeAhorro, CuentaCorriente, CuentaBancaria y Persona
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class Banco
{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //creacion de una persona
        System.out.println("Ingresa el dni de la persona");
        int dni = teclado.nextInt();
        
        teclado.nextLine();
        System.out.println("Ingresa el nombre de la persona");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingresa el apellido de la persona");
        String apellido = teclado.nextLine();
    
        System.out.println("Ingresa el dia de nacimiento");
        int dia = teclado.nextInt();
        
        System.out.println("Ingresa el mes de nacimiento");
        int mes = teclado.nextInt();
        
        System.out.println("Ingresa el anio de nacimiento");
        int anio = teclado.nextInt();
        
        Calendar fechaNac = new GregorianCalendar(anio, mes, dia);
        
        Persona unaPersona = new Persona(dni,nombre,apellido,fechaNac);
        
        //creacion de una cuenta corriente para la persona
        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(44854,unaPersona);
        
        //creacion de una caja de ahorro para la persona
        CajaDeAhorro unaCajaDeAhorro = new CajaDeAhorro(46128,unaPersona);
        
        //Mostramos los datos de su caja y cuenta sin ninguna modificacion
        unaCuentaCorriente.mostrar();
        System.out.println("-------------------------------------------------------------");
        unaCajaDeAhorro.mostrar();
        
        System.out.println("\n");
        
        //depositamos dinero en cuenta corriente y caja de ahorro
        unaCuentaCorriente.depositar(5000);
        unaCajaDeAhorro.depositar(10000);
        
        //Mostramos el nuevo saldo de la caja y la cuenta
        System.out.println("El nuevo saldo de la cuenta corriente es: " + unaCuentaCorriente.getSaldo());
        System.out.println("El nuevo saldo de la caja de ahorro es: " + unaCajaDeAhorro.getSaldo());
        
        System.out.println("\n");
        
        //Extraemos exitosamente saldo de la cuenta corriente y lo mostramos
        unaCuentaCorriente.extraer(4500);
        System.out.println("El nuevo saldo de la cuenta corriente es: " + unaCuentaCorriente.getSaldo());
        
        //Extraemos de forma erronea dinero de la cuenta corriente
        unaCuentaCorriente.extraer(8000);
        
        System.out.println("\n");
        
        //extraemos de forma exitosa dinero de la caja de ahorro y lo mostramos
        unaCajaDeAhorro.extraer(2500);
        System.out.println("El nuevo saldo de la caja de ahorro es: " + unaCajaDeAhorro.getSaldo());
        System.out.println("Podes retirar " + unaCajaDeAhorro.getExtraccionesPosibles() + " veces mas");
        
        System.out.println("\n");
        
        //extraemos de forma fallida dinero de la caja de ahorro (error 1)
        unaCajaDeAhorro.extraer(100000);
        
        //extraemos de forma fallida dinero de la caja de ahorro
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        unaCajaDeAhorro.extraer(1);
        
        if(unaPersona.esCumpleaños()){
            System.out.println("Feliz cumpleanios!");
        }
        
        
        //AHORA INSTANCIAREMOS OTRO OBJETO
        
        System.out.println("Ingresa el dni de la persona");
        int dni2 = teclado.nextInt();
        
        teclado.nextLine();
        System.out.println("Ingresa el nombre de la persona");
        String nombre2 = teclado.nextLine();
        
        System.out.println("Ingresa el apellido de la persona");
        String apellido2 = teclado.nextLine();
        
        System.out.println("Ingresa el anio de nacimiento");
        int anio2 = teclado.nextInt();
        
        
        
        Persona otraPersona = new Persona(dni2,nombre2,apellido2,anio2);
        
        //creacion de una cuenta corriente para la persona
        CuentaCorriente otraCuentaCorriente = new CuentaCorriente(44854,otraPersona);
        
        //creacion de una caja de ahorro para la persona
        CajaDeAhorro otraCajaDeAhorro = new CajaDeAhorro(46128,otraPersona);
        
        //Mostramos los datos de su caja y cuenta sin ninguna modificacion
        otraCuentaCorriente.mostrar();
        System.out.println("-------------------------------------------------------------");
        otraCajaDeAhorro.mostrar();
        
        System.out.println("\n");
        
        //depositamos dinero en cuenta corriente y caja de ahorro
        otraCuentaCorriente.depositar(5000);
        otraCajaDeAhorro.depositar(10000);
        
        //Mostramos el nuevo saldo de la caja y la cuenta
        System.out.println("El nuevo saldo de la cuenta corriente es: " + otraCuentaCorriente.getSaldo());
        System.out.println("El nuevo saldo de la caja de ahorro es: " + otraCajaDeAhorro.getSaldo());
        
        System.out.println("\n");
        
        //Extraemos exitosamente saldo de la cuenta corriente y lo mostramos
        otraCuentaCorriente.extraer(4500);
        System.out.println("El nuevo saldo de la cuenta corriente es: " + otraCuentaCorriente.getSaldo());
        
        //Extraemos de forma erronea dinero de la cuenta corriente
        otraCuentaCorriente.extraer(8000);
        
        System.out.println("\n");
        
        //extraemos de forma exitosa dinero de la caja de ahorro y lo mostramos
        otraCajaDeAhorro.extraer(2500);
        System.out.println("El nuevo saldo de la caja de ahorro es: " + otraCajaDeAhorro.getSaldo());
        System.out.println("Podes retirar " + otraCajaDeAhorro.getExtraccionesPosibles() + " veces mas");
        
        System.out.println("\n");
        
        //extraemos de forma fallida dinero de la caja de ahorro (error 1)
        otraCajaDeAhorro.extraer(100000);
        
        //extraemos de forma fallida dinero de la caja de ahorro
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        otraCajaDeAhorro.extraer(1);
        
        
    }
}