import java.util.*;

/**
 * clase ejecutable de la clase EmpleadoConJefe.
 * 
 * @author (Eduardo Lopez)
 * @author (Joan Mauri) 
 * @version (7/9/25)
 */
public class EmpleadoEjec2
{
    
        public static void main (String args[]){
            
            Scanner teclado = new Scanner(System.in);
            //instanciamos a un gerente general
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
            EmpleadoConJefe unGerente = new EmpleadoConJefe(cuil, apellido, nombre, sueldo, fecha);
            
            //mostramos los datos del gerente
            unGerente.mostrarPantalla();
            
            System.out.println("\n");
            
            //creamos un empleado que tiene como jefe al gerente instanciado anteriormente
            System.out.println("Ingresa el cuil de la persona: ");
            long cuil2 = teclado.nextLong();
        
            teclado.nextLine();
            System.out.println("Ingresa el apellido");
            String apellido2 = teclado.nextLine();
        
            System.out.println("Ingresa el nombre");
            String nombre2 = teclado.nextLine();
        
            System.out.println("Ingresa el sueldo basico");
            double sueldo2 = teclado.nextDouble();
        
            System.out.println("Ingresa el dia de entrada");
            int dia2 = teclado.nextInt();
        
            System.out.println("Ingresa el mes de entrada");
            int mes2 = teclado.nextInt();
        
            System.out.println("Ingresa el anio de entrada");
            int anio2 = teclado.nextInt();
            
            Calendar fecha2 = new GregorianCalendar(anio2,mes2,dia2);
            EmpleadoConJefe unEmpleado = new EmpleadoConJefe(cuil2, apellido2, nombre2, sueldo2, fecha2, unGerente);
            
            //mostramos los datos 
            unEmpleado.mostrarPantalla();
            
            if(unEmpleado.esAniversario()){
                System.out.println("Feliz aniversaio! Tenes el dia libre. Atentamente: "+unEmpleado.getJefe().apeYNom());
            }
            
        }
        
    
}