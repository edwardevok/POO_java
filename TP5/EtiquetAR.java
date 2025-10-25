import java.util.*;
public class EtiquetAR
{
    public static void main(String args[]){
       
    Premium etiquetaP = new Premium(200,10);
    Comun etiquetaC = new Comun(100,100);
    Premium etiquetaP2 = new Premium(200,7);
    
    Renglon unRenglon = new Renglon(7, 200, etiquetaP);
    Renglon unRenglon2 = new Renglon(57, 100, etiquetaC);
    Renglon unRenglon3 = new Renglon(94, 200, etiquetaP2);
    
    ArrayList<Renglon> renglones = new ArrayList();
    renglones.add(unRenglon);
    renglones.add(unRenglon2); 
    renglones.add(unRenglon3); 
    
    Pedido unPedido = new Pedido(renglones);
    
    unPedido.mostrar();
    }
}