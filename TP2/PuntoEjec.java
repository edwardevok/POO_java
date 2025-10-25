//importar la clase scanner
import java.util.Scanner;
/**
 * clase ejecutable de la clase Punto.
 * 
 * @author (Eduardo Lopez)
 * @author (Joan Mauri)
 * @version (22/08/2025)
 */
public class PuntoEjec
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        //Instanciamos un punto usando un constructor
        Punto unPunto = new Punto();
        
        //Mostramos sus valores. Usando este constructor por defecto los valores se inicializan en 0
        unPunto.mostrar();
        //mostramos el mismo punto en forma de coordenadas
        System.out.println(unPunto.coordenadas());
        
        //desplazamos el punto en el eje usando el metodo desplazar()
        unPunto.desplazar(5,9);
        
        //mostramos el punto desplazado con sus nuevos valores de x e y
        System.out.println("\n");
        unPunto.mostrar();
        System.out.println(unPunto.coordenadas());
    }
}