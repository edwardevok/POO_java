public class TrianguloRectangulo
{
    public static void main (String args[]){
        int hipotenusa = Integer.parseInt(args[0]);
        int cateto1 = Integer.parseInt(args[1]);
        int cateto2 = Integer.parseInt(args[2]);
        
        double h = (Math.pow(hipotenusa,2));
        double sumaCatetos = ((Math.pow(cateto1,2))+(Math.pow(cateto2,2)));
        
        if(h == sumaCatetos){
            System.out.println("Es un triangulo rectangulo");
        }else{
            System.out.println("No es un triangulo rectangulo");
        }
        
    }
}