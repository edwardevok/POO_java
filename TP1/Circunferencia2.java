import java.util.Scanner;

public class Circunferencia2
{
   public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
       int radio = 1;
       double perimetro;
       while(radio != 0){
             radio = teclado.nextInt();
             perimetro = 2 * Math.PI * radio;
             System.out.println("El perimetro para el radio "+radio+ " es: "+ perimetro);
       }
       
       
}

}