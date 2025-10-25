/**
 * Clase ejecutable para probar la funcionalidad de las clases Circulo, Rectangulo y Circulo
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
import java.util.Random;
import java.util.Scanner;

public class CreaFigura
{
    public static void main (String args[]){
    //creamos un numero random
    Random unNumero = new Random();
    double radio = unNumero.nextDouble() * 100.0;
    
    Scanner teclado = new Scanner(System.in);
    
    //creamos un punto
    Punto unPunto = new Punto();
    
    //mostramos los datos del punto
    unPunto.mostrar();
    unPunto.coordenadas();
    
    System.out.println("\n");
    
    //creamos un circulo
    Circulo unCirculo = new Circulo(radio,unPunto);
    
    //desplazamos el circulo y mostramos su sdatos
    unCirculo.desplazar(-240,-230); 
    unCirculo.caracteristicas();
    
    //Instanciamos otro punto y otro circulo
    System.out.println("------------------------------");
    double otroRadio = unNumero.nextDouble() * 100.0;
    System.out.println("Ingresa un numero para la variable x (5.2)");
    double x = teclado.nextDouble();
    System.out.println("Ingresa un numero para la variable y (0.5)");
    double y = teclado.nextDouble();
    
    Punto otroPunto = new Punto(x,y);
    Circulo otroCirculo = new Circulo(otroRadio,otroPunto);
    
    //mostramos las caracts del otro circulo
    otroCirculo.caracteristicas();
    
    //vemos cual circulo es mayor y lo imprimimos
    System.out.println("El circulo mayor es: ");
    unCirculo.elMayor(otroCirculo).caracteristicas();
    
    //calculamos la distancia entre ambos circulos
    System.out.println("La distancia entre ambos circulos es: "+unCirculo.distanciaA(otroCirculo));
    
    
    System.out.println("-----------EJERCICIO 4-----------");
    System.out.println("\n");
    
    //instanciamos un punto y un rectangulo
    Punto origenRec = new Punto();
    double anchoRandom = unNumero.nextDouble()*100;
    double altoRandom = unNumero.nextDouble()*100;
    Rectangulo unRectangulo = new Rectangulo(origenRec,anchoRandom,altoRandom);
    
    //mostramos los datos del recntagulo
    System.out.println("Datos del primer rectangulo creado");
    unRectangulo.caracteristicas();
    
    System.out.println("\n");
    
    //desplazamos el rectangulo y mostramos las caracts para ver el cambio
    unRectangulo.desplazar(40,-20);
    System.out.println("Rectangulo desplazado");
    unRectangulo.caracteristicas();
    
    //Instanciamos otro punto y rectangulo
    System.out.println("Ingresa un valor para el origen en x del rectangulo (7,4) ");
    double x2 = teclado.nextDouble();
    
    System.out.println("Ingresa un valor para el origen en y del rectangulo: (4,5) ");
    double y2 = teclado.nextDouble();
    
    Punto origenRect = new Punto(x2,y2);
    double otroAlto = unNumero.nextDouble() * 100;
    double otroAncho = unNumero.nextDouble() * 100;
    Rectangulo otroRectangulo = new Rectangulo(origenRect,otroAncho,otroAlto);
    
    System.out.println("\n");
    
    //mostramos las caracts del 2do rectangulo
    otroRectangulo.caracteristicas();
    
    //calculcamos el amyor y mostramos sus caracts
    System.out.println("El mayor rectangulo");
    unRectangulo.elMayor(otroRectangulo).caracteristicas();
    
    System.out.println("\n");
    
    //calculamos la distancia entre los dos rectangulos
    System.out.println("Distancia entre rectangulos: " + unRectangulo.distanciaA(otroRectangulo));
    
    System.out.println("\n");
    
    //calculamos la distancia entre los dos origenes de los dos rectangulos
    System.out.println("Distancia entre los dos origenes de los rectangulos: "+origenRec.distanciaA(origenRect));
    
    System.out.println("\n");
    
    //mostramos la info de esos dos origenes
    origenRec.mostrar();
    origenRect.mostrar();
}

}