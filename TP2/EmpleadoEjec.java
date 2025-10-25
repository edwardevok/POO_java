//importamos la clase scanner para poder ingresar datos por teclado 
import java.util.Scanner;
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
        
        System.out.println("Ingresa el anio de ingreso");
        int anio = teclado.nextInt();
        
        //instancia de clase
        Empleado unEmpleado = new Empleado(cuil, apellido, nombre, sueldo, anio);
        
        //metodo mostrar()
        unEmpleado.mostrar();
        
        //metodo mostrarLinea()
        System.out.println(unEmpleado.mostrarLinea());
        
    
        
        
        
    }
}