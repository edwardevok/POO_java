/**
 * Clase ejecutable de la clase Laboratorio
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (22/08/2025)
 */
public class LabEjec
{
    public static void main(String args[]){
        //instancias de la clase laboratorio usando un 
        Laboratorio unLab = new Laboratorio("Colgate S.A", "Junín 5204", "54-11 -4239-8447");
        Laboratorio otroLab = new Laboratorio("Lopez", "Jujuy 456", "3774568500", 2500, 8);
        
        //implementacion del metodo msotrar()
        System.out.println(unLab.mostrar());
        
        System.out.println("\n");
        
        //mostrar dia de entrega y compra minima
        System.out.println("Compra minima: "+otroLab.getCompraMinima());
        System.out.println("Dia de entrega: "+otroLab.getDiaEntrega());
        
        System.out.println("\n");
        
        //implementacion de metodos restantes por probar
        otroLab.nuevoDiaEntrega(31);
        otroLab.nuevaCompraMinima(10000);
        
        //mostramos los cambios
        System.out.println("Nueva compra minima: "+otroLab.getCompraMinima());
        System.out.println("Nuevo dia de entrega: "+otroLab.getDiaEntrega());
        
       
        
        
    }

}