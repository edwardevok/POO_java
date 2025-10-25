//importamos la clase scanner para poder ingresar datos por teclado 

import java.util.*;
/**
 * clase ejecutable de la clase Empleado.
 * 
 * @author (Eduardo Lopez)
 * @author (Joan Mauri) 
 * @version (22/08/25)
 */
public class EmpleadoEjec
{
   
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //ingreso de datos por teclado
        System.out.println("Ingresa el cuil de la persona: ");
        long cuil = teclado.nextLong();
        
        teclado.nextLine();
        System.out.println("Ingresa el apellido");
        String apellido = teclado.nextLine();
        
        System.out.println("Ingresa el nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingresa el sueldo basico");
        double sueldo = teclado.nextDouble();
        
        System.out.println("Ingresa el dia de entrada");
        int dia = teclado.nextInt();
        
        System.out.println("Ingresa el mes de entrada");
        int mes = teclado.nextInt();
        
        System.out.println("Ingresa el anio de entrada");
        int anio = teclado.nextInt();
        
        Calendar fecha = new GregorianCalendar(anio,mes,dia);
        
        //instancia de clase
        Empleado unEmpleado = new Empleado(cuil, apellido, nombre, sueldo, fecha);
        
        //metodo mostrar()
        unEmpleado.mostrar();
        
        //metodo mostrarLinea()
        System.out.println(unEmpleado.mostrarLinea());
        
        if(unEmpleado.esAniversario()){
            System.out.println("Tenes el dia libre");
        }
        
        
        
        
    }
}