/**
 * La clase Pedido contiene los datos de un pedido de una persona: la fecha, el cliente y los productos (estos ultimos, en una colección)
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(21/09/2025)
 */

import java.util.*;
public class Pedido
{
    private Calendar fecha;
    private ArrayList productos;
    private Cliente cliente;
    
    /**
     * Constructor para instanciar un objeto de la clase Pedido
     * @param p_fecha la fecha en el que se realizo el pedido
     * @param p_cliente el cliente (objeto) que recibe el pedido
     * @param p_productos son los productos que incluye el pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Pedido.
     * @param p_fecha la fecha en el que se realizo el pedido
     * @param p_cliente el cliente (objeto) que recibe el pedido
     * @param p_producto es el producto a agregar al pedido
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList());
        this.agregarProducto(p_producto);
    }
    
    //setters
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setProductos(ArrayList p_productos){
        this.productos = p_productos;
    }
    
    //getters
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    /**
     * Este metodo perimite agregar un producto al pedido. (A la colección de pedidos).
     * @param p_producto es el producto a agregar
     * @return se agrega el pedido a la coleccion
     */
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**
     * Este metodo perimite quitar un producto al pedido. (Quitarlo de la coleccion)
     * @param p_producto es el producto a quitar
     * @return se quita el pedido de la coleccion
     */
    public boolean quitarProducto(Producto p_producto){
        if(this.getProductos().size() > 1){
            return this.getProductos().remove(p_producto);
            
        }
        
        return false;
    }
    
    /**
     * Este metodo permite mostrar la suma del precio al contado de todos los productos
     * @return el total del precio al contado de los productos
     */
    public double totalAlContado(){
        double total = 0;
        for(Object unProducto : this.getProductos()){
            Producto producto = (Producto)unProducto;
            total += producto.precioContado();
        }
        
        return total;
    }
    
    /**
     * Este metodo permite mostrar la suma del precio financiado de todos los productos
     * @return el total del precio financiado de los productos
     */
    public double totalFinanciado(){
        double total = 0;
        for(Object unProducto: this.getProductos()){
            Producto productoUnboxing = (Producto)unProducto;
            total = total + productoUnboxing.precioLista();
        }
        
        return total;
    }
    
    /**
     * Este metodo muestra el detalle del pedido. Tambien muestra a todos los productos del mismo con sus respectivos datos
     */
    public void mostrarPedido(){
        System.out.println("****** Detalle del pedido ******" + "Fecha: " +this.getFecha().get(Calendar.DAY_OF_MONTH) + "/" + this.getFecha().get(Calendar.MONTH +1) + "/" + this.getFecha().get(Calendar.YEAR));
        System.out.println("Producto \t" + "Precio Lista \t" + "Precio contado");
        System.out.println("------------------------------------------------------------------------");
        for(Producto unProducto: getProductos()){
            System.out.println(unProducto.mostrarLinea());
            System.out.println("\n");
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("***Total: ------" + this.totalFinanciado() + "\t" + this.totalAlContado());
        
    }
    
    
    
    
    
    
}