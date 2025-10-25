/**
 * La Clase Pedido contiene una coleccion de renglones en los cuales estará detallado el tipo de producto y la cantidad
 * 
 * @author (Lopez Eduardo, Mauri Joan) 
 * @version (18/10/2025)
 */

import java.util.*;
public class Pedido
{
    private ArrayList<Renglon> renglones;
    
    /**
     * Pedido Constructor que permite instanciar un renglon del pedido
     *
     * @param p_renglones coleccion de renglones
     */
    Pedido(ArrayList<Renglon> p_renglones){
        this.setRenglones(p_renglones);
    }
    
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    
    /**
     * Método mostrar detalla el pedido y totales
     *
     */
    public void mostrar(){
        int contadorEtiquetas = 0;
        int contadorI = 1;
        double acumPrecio = 0;
        System.out.println("Pedido:");
        System.out.println("Cantidad de Items: " + this.getRenglones().size());
        
        for(Renglon unRenglon : this.getRenglones()){
            System.out.print("Item " + contadorI + ": ");
            unRenglon.mostrar();
            
            System.out.println("Precio: $" + unRenglon.getItem().precio(unRenglon.getCantidad()));
            
            contadorEtiquetas+=unRenglon.getCantidad();
            acumPrecio+=unRenglon.getItem().precio(unRenglon.getCantidad());
            contadorI+=1;
        }
        
        System.out.println("---Total pedido: " + contadorEtiquetas + " Etiquetas por un importe total de: $" + acumPrecio);
 
    }
    
}