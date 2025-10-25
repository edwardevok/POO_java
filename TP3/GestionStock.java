/**
 * Clase ejecutable para probar la funcionalidad de las clases Producto y Laboratorio
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class GestionStock
{
    public static void main(String args[]){
        //Instanciamos un laboratorio
        Laboratorio unLab= new Laboratorio("Colgate S.A", "Scalabrini Ortiz 5524", "54-11 -4239-8447");
        
        //Instanciamos un producto
        Producto unProducto = new Producto(001, "Perfumeria", "Jabon deluxe", 8000, unLab);
        
        //Ajustamos el stock agregando 500 unidades y mostramos la info del producto
        unProducto.ajuste(500);
        unProducto.mostrar();
        
        //Ajustamos el stock quitando 200 unidades y mostramos la info del producto
        unProducto.ajuste(-200);
        unProducto.mostrar();
        
        //Mostramos la info del producto en linea
        System.out.println(unProducto.mostrarLinea());
        
        //Instanciamos otro producto usando el otro constructor
        Producto otroProducto = new Producto(002, "Cuidado personal", "Cepillo de dientes", 3250, 10.4, 40, unLab);
        
        //Verificamos que el estado de los atributos sea 0
        System.out.println(otroProducto.getPorcPtoRepo());
        otroProducto.getExistMinima();
        
        System.out.println("\n");
        
        //mostramos sus datos
        otroProducto.mostrar();
        
        
        
        
        
        

        
        
        
        
        
        
        
    }
}