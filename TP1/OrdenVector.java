import java.util.Scanner;
public class OrdenVector
{
   public static void main(String args[]){
       Scanner teclado = new Scanner (System.in);
       double [] vector = new double [4];
       double menor = Integer.MAX_VALUE;
       double aux = 0;
       
       
       //ingreso de datosS
       for(int i = 0; i<vector.length; i++){
           System.out.println("Ingresa un valor: ");
           vector[i] = teclado.nextDouble();
           
           //calculo de menor
           if(vector[i]<menor){
               menor = vector[i];
           }
       }
       
       //bubble sort
       for(int i = 0; i<=3; i++){
           for(int j = 0; j<3; j++){
               if(vector[j]>vector[j+1]){
                   aux = vector[j];
                   vector[j] = vector[j+1];
                   vector[j+1] = aux;
               }
           }
           
        }
       
        System.out.print("El vector ordenado es: ");
        //mostrar vector ordenado
        for(int i = 0; i<=3; i++){
            System.out.print("\t"+vector[i]);
        }
        
        
       System.out.println("El menor numero es: "+(double)menor);
   }
}