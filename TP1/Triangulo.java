public class Triangulo
{
   public static void main (String args[]){
       double a = Double.parseDouble(args[0]);
       double b = Double.parseDouble(args[1]);
       double c = Double.parseDouble(args[2]);
       
       double semiPerimetro = (a+b+c)/2;
       double area = Math.sqrt(semiPerimetro*(semiPerimetro - a)*(semiPerimetro - b)*
       (semiPerimetro -c));
       
       System.out.println("Semi perimetro: "+semiPerimetro);
       System.out.println("Area: "+area);
       
       
       
   }
}