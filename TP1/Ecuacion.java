public class Ecuacion
{
   public static void main(String args[]){
       int a = Integer.valueOf(args[0]);
       int b = Integer.valueOf(args[1]);
       int c = Integer.valueOf(args[2]);
       
       double d = Math.pow(b,2)-4*a*c;
        
       
       if(d>0){
           double r1 = (((-b)+((Math.sqrt(d))))/(2*a));
           double r2 = (((-b)-((Math.sqrt(d))))/(2*a));

           System.out.println("La primer raiz es: "+r1);
           System.out.println("La segunda raiz es: "+r2);
       }else if(d==0){
           double r3 = (-b/(2*1));
           System.out.println("La raiz es "+r3 + ". Ambas raices son iguales");
           
       }else{
           System.out.println("Solucion compleja");
       }
   }
}