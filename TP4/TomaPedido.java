import java.util.*;
public class TomaPedido

{
    private static HashMap<Integer,Cliente> clientes = new HashMap<>();
    private static HashMap<Integer,Laboratorio> labs = new HashMap<>();
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static HashMap<Integer,Pedido> pedidos = new HashMap();
    
    private static int nextLabId = 1; // contador de ids
    private static int nextPedidoId = 1;
    
    public static void main(String args[]){
        
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Menu de Pedidos");
            System.out.println("1_Crear Cliente");
            System.out.println("2_Crear laboratorio");
            System.out.println("3_Crear producto");
            System.out.println("4_Crear pedido");
            System.out.println("5_Agregar producto a un pedido");
            System.out.println("6_Quitar producto");
            System.out.println("7_Mostrar Pedido");
            opcion=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:{
                    
                    System.out.println("Ingresa el dni de un cliente");
                    int dni = teclado.nextInt();
        
                    teclado.nextLine();
        
                    System.out.println("Ingresa el apellido de un cliente");
                    String apeCli = teclado.nextLine();
        
                    System.out.println("Ingresa el nombre de un cliente");
                    String nombreCli = teclado.nextLine();
        
                    System.out.println("Ingresa el saldo de un cliente");
                    double saldoCli = teclado.nextDouble();
                    
                    Cliente unCliente = new Cliente(dni,apeCli,nombreCli,saldoCli);
                    
                    clientes.put(dni,unCliente);
                    System.out.println("Cliente creado con exito");
                    
                    break;
                }
                
                case 2:{
                    
                    System.out.println("Ingresa el nombre de un laboratorio");
                    String nombreLab = teclado.nextLine();
            
                    System.out.println("Ingresa la direccion de un laboratorio");
                    String domicilioLab = teclado.nextLine();
        
                    System.out.println("Ingresa el telefono de un laboratorio");
                    String telefonoLab = teclado.nextLine();
        
                    Laboratorio lab = new Laboratorio(nombreLab, domicilioLab, telefonoLab);
                    labs.put(nextLabId, lab);
                    System.out.println("Laboratorio creado con id " + nextLabId);
                    nextLabId++;
                    break;
                    
                    
                }
                
                case 3:{
                    if(labs.isEmpty()){
                       System.out.println("Debe existir un lab primero"); 
                       return;
                    }
                    
                    System.out.println("Ingresa el codigo del producto");
                    int cod1 = teclado.nextInt();
        
                    teclado.nextLine();
        
                    System.out.println("Ingresa el rubro del producto");
                    String rubro1 = teclado.nextLine();
        
                    System.out.println("Ingresa la descripcion del producto");
                    String desc1 = teclado.nextLine();
        
                    System.out.println("Ingresa el costo del producto");
                    double costo1 = teclado.nextDouble();
        
                    teclado.nextLine();
                    
                    System.out.println("Asigná un laboratorio a este producto (elegi uno de la lista)");
                    for(Map.Entry<Integer,Laboratorio> unLab : labs.entrySet()){
                        System.out.println(unLab.getKey() + " " + unLab.getValue().getNombre());
                    }
                    int labElegido = teclado.nextInt();
                    Laboratorio labEleg = labs.get(labElegido);
                    
                    Producto unProducto = new Producto(cod1,rubro1,desc1,costo1,labEleg);
                    productos.add(unProducto);
                    break;
                }
                
                case 4:{
                    System.out.println("Quien hace el pedido? ingresa su dni");
                    for(Map.Entry<Integer,Cliente> unGente : clientes.entrySet()){
                        System.out.println(unGente.getKey() + " " + unGente.getValue().getNombre());
                    }
                    
                    int dniElegido = teclado.nextInt();
                    Cliente cli = clientes.get(dniElegido);
                    
                    Calendar fechaHoy = new GregorianCalendar();
                    
                    Pedido unPedido = new Pedido(fechaHoy, cli, productos);
                    pedidos.put(nextPedidoId,unPedido);
                    System.out.println("pedido creado!");
                    nextPedidoId++;
                    break;
                }
                
                case 5:{
                    System.out.println("A que pedido le queres agregar un producto?");
                    int numPed = teclado.nextInt();
                    Pedido pedidoElegido = pedidos.get(numPed);
                    
                    System.out.println("Ingresa el codigo del producto que queres agregar al pedido");
                    int numProd = teclado.nextInt();
                    Producto prodElegido = productos.get(numProd);
                    
                    
                    pedidoElegido.agregarProducto(prodElegido);
                    System.out.println("Producto agregado");
                    break;
                }
                
                case 6: {
                    System.out.println("¿De qué pedido querés quitar un producto?");
                    int numPed = teclado.nextInt();
                    Pedido pedidoElegido = pedidos.get(numPed);

                        if (pedidoElegido == null) {
                            System.out.println("Ese pedido no existe.");
                            break;
                            }

                    System.out.println("Ingresa el código del producto que querés quitar del pedido:");
                    int codProducto = teclado.nextInt();

                    Producto prodElegido = null;
                    for (Producto p : pedidoElegido.getProductos()) { // recorres el array del pedido
                        if (p.getCodigo() == codProducto) {           // comparás por código
                            prodElegido = p;
                            break; // lo encontraste, salís del loop
                        }
                    }

                    if (prodElegido == null) {
                    System.out.println("Ese producto no está en el pedido.");
                    } else {
                    if (pedidoElegido.quitarProducto(prodElegido)) {
                        System.out.println("Producto quitado con éxito.");
                        } else {
                            System.out.println("No se pudo quitar el producto.");
                        }
                        }
                    break;
}

                
                case 7:{
                    System.out.println("Que pedido queres mostrar?");
                    int numPed = teclado.nextInt();
                    Pedido pedidoElegido = pedidos.get(numPed);
                    
                    pedidoElegido.mostrarPedido();
                }
            }
            
        }while(opcion != 0);
     
    }
    
    
    
}