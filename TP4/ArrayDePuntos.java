import java.util.*;

public class ArrayDePuntos
{
    
    public static void main(String args[]){
    Punto[] vectorPuntos = new Punto[6];
    Scanner teclado = new Scanner(System.in);
    
    //ingresamos puntos por teclado
    for(int i = 0; i < vectorPuntos.length; i++){
        System.out.println("Ingrese el valor del punto en el eje x");
        int ejeX = teclado.nextInt();
        
        System.out.println("Ingrese el valor del punto en el eje y");
        int ejeY = teclado.nextInt();
        
        //almacenamos los puntos en cada posicion del array
        vectorPuntos[i] = new Punto(ejeX,ejeY);
    }
    
    //mostramos la coordenadas
    System.out.println("Coordenadas:");
    for(Punto unPunto: vectorPuntos){
        System.out.println(unPunto.coordenadas());
    }
    
    //mostramos la distancia entre dos puntos consecutivos
    System.out.println("Distancias entre puntos:");
    for(int i = 0; i<vectorPuntos.length-1; i++){
        System.out.println("La distancia entre " + vectorPuntos[i].coordenadas() + " y " + vectorPuntos[i+1].coordenadas() + " es: " + vectorPuntos[i].distanciaA(vectorPuntos[i+1]));
    }
        
    }
    
    
}