import java.util.Scanner;

/**
 * Clase ejecutable que prueba las funcionalidades de clas clases Escuela y Docente
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class Secretaria
{
    public static void main (String args[]){
       Scanner teclado = new Scanner(System.in); 
       
       //instanciamos una escuela
       System.out.println("Ingresa el nombre de la escuela");
       String nombreEscuela = teclado.nextLine();
       
       System.out.println("Ingresa el domicilio de la escuela");
       String domicilioEscuela = teclado.nextLine();
       
       System.out.println("Ingresa el nombre del director");
       String nombreDir = teclado.nextLine();
       
       Escuela unaEscuela = new Escuela(nombreEscuela,domicilioEscuela,nombreDir);
       
       //instancuamos un docente
       System.out.println("Ingresa el nombre del docente");
       String nombreDoc = teclado.nextLine();
       
       System.out.println("Ingresa el grado");
       String gradoDoc = teclado.nextLine();
       
       System.out.println("Ingresa el sueldo basico");
       double sueldoDoc = teclado.nextDouble();
       
       System.out.println("Ingresa la asignacion fliar");
       double asig = teclado.nextDouble();
       
       Docente unDocente = new Docente(nombreDoc,gradoDoc,sueldoDoc,asig);
       
       unaEscuela.imprimirRecibo(unDocente);
       
       //INSTANCIAMOS OTRA ESCUELA Y OTRO DOCENTE
       
       //instanciamos una escuela
       System.out.println("Ingresa el nombre de la escuela");
       String nombreEscuela2 = teclado.nextLine();
       
       System.out.println("Ingresa el domicilio de la escuela");
       String domicilioEscuela2 = teclado.nextLine();
       
       System.out.println("Ingresa el nombre del director");
       String nombreDir2 = teclado.nextLine();
       
       Escuela otraEscuela = new Escuela(nombreEscuela2,domicilioEscuela2,nombreDir2);
       
       //instancuamos un docente
       System.out.println("Ingresa el nombre del docente");
       String nombreDoc2 = teclado.nextLine();
       
       System.out.println("Ingresa el grado");
       String gradoDoc2 = teclado.nextLine();
       
       System.out.println("Ingresa el sueldo basico");
       double sueldoDoc2 = teclado.nextDouble();
       
       System.out.println("Ingresa la asignacion fliar");
       double asig2 = teclado.nextDouble();
       
       Docente otroDocente = new Docente(nombreDoc2,gradoDoc2,sueldoDoc2,asig2);
       
       otraEscuela.imprimirRecibo(otroDocente);
    }
}