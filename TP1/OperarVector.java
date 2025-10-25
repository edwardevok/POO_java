import java.util.Scanner;

public class OperarVector
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int [] notas = new int [5];
        int mayor = Integer.MAX_VALUE;
        int sumaNotas = 0;
        double promedio = 0;
        
        //ingreso de datos
        for(int i = 0; i<notas.length; i++){
            System.out.println("Ingresa la nota: "+ (i+1));
            notas[i] = teclado.nextInt();
            
            //acumluador
            sumaNotas = sumaNotas + notas[i];
            
            //calculo nota mayor
            if(notas[i]>mayor){
                mayor = notas[i];
            }
            
        }
        
        //calculo promedio (con cast)
        promedio = (double) sumaNotas / notas.length;
        
        //mostrar notas
        for(int i=0; i<notas.length; i++){
            System.out.println("La nota "+(i+1) + " es: "+notas[i]);
        }
        
        //promedio y nota mayor
        System.out.println("El promedio de las notas es: "+promedio);
        System.out.println("La nota mayor es: "+mayor);
    }
}