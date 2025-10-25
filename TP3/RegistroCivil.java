import java.util.Scanner;

/**
 * Clase ejecutable que prueba las funcionalidades de clas clases Hombre y mujer
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class RegistroCivil
{
    public static void main (String args[]){
        //instanciamos un hombre
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un nombre (hombre)");
        String nombreH = teclado.nextLine();
        
        System.out.println("Ingresa un apellido (hombre)");
        String apellidoH = teclado.nextLine();
        
        System.out.println("Ingresa una edad (hombre)");
        int edadH = teclado.nextInt();
        
        teclado.nextLine();
        
        Hombre unHombre = new Hombre(nombreH,apellidoH,edadH);
        
        //instanciamos una mujer
        System.out.println("Ingresa un nombre (mujer)");
        String nombreM = teclado.nextLine();
        
        System.out.println("Ingresa un apellido (mujer)");
        String apellidoM = teclado.nextLine();
        
        System.out.println("Ingresa una edad (mujer)");
        int edadM = teclado.nextInt();
        
        teclado.nextLine();
        
        Mujer unaMujer = new Mujer(nombreM,apellidoM,edadM);
        
        //mostramos los datos del hombre y mujer y su estado civil
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
        
        System.out.println("\n");
        
        //hombre y mujer se casan! y mostramos 
        
        unHombre.casarseCon(unaMujer);
        
        
        unHombre.casadoCon();
        unaMujer.casadaCon();
        
        System.out.println("\n");
        
        //Triste! Hay divorcio! La mujer se quiere divorciar
        
        unaMujer.divorcio();
        
        unHombre.mostrarEstadoCivil();
        unaMujer.mostrarEstadoCivil();
        
        
        //INSTANCIAMOS OTRAS PERSONAS
        
        //instanciamos un hombre 
        System.out.println("Ingresa un nombre (hombre)");
        String nombreH2 = teclado.nextLine();
        
        System.out.println("Ingresa un apellido (hombre)");
        String apellidoH2 = teclado.nextLine();
        
        System.out.println("Ingresa una edad (hombre)");
        int edadH2 = teclado.nextInt();
        
        teclado.nextLine();
        
        Hombre otroHombre = new Hombre(nombreH2,apellidoH2,edadH2);
        
        //instanciamos una mujer
        System.out.println("Ingresa un nombre (mujer)");
        String nombreM2 = teclado.nextLine();
        
        System.out.println("Ingresa un apellido (mujer)");
        String apellidoM2 = teclado.nextLine();
        
        System.out.println("Ingresa una edad (mujer)");
        int edadM2 = teclado.nextInt();
        
        Mujer otraMujer = new Mujer(nombreM2,apellidoM2,edadM2);
        
        //mostramos los datos del hombre y mujer y su estado civil
        otroHombre.mostrarEstadoCivil();
        otraMujer.mostrarEstadoCivil();
        
        System.out.println("\n");
        
        //hombre y mujer se casan! y mostramos 
        
        otraMujer.casarseCon(otroHombre);
        
        otroHombre.casadoCon();
        otraMujer.casadaCon();
        
        System.out.println("\n");
        
        //Triste! Hay divorcio! El hombre se quiere divorciar
        
        otroHombre.divorcio();
        
        otroHombre.mostrarEstadoCivil();
        otraMujer.mostrarEstadoCivil();
    }
}