public class Figuras
{
    public static void main(String args[]){
        
        System.out.println("\n");
        
        Punto unPunto = new Punto(5,8);
        Cuadrado unCuadrado = new Cuadrado(unPunto, 13);
        unCuadrado.caracteristicas();
        
        System.out.println("\n");
        
        Elipse unaElipse = new Elipse(unPunto, 10,14);
        unaElipse.caracteristicas();
        
        System.out.println("\n");
        
        Circulo unCirculo = new Circulo(unPunto, 12);
        unCirculo.caracteristicas();
        
    }
}