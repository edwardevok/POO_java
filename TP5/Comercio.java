import java.util.*;

public class Comercio
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int op = 0;
        
        do{
            
            System.out.println("1_Comprar una cocina");
            System.out.println("2_Comprar un lavarropas");
            
            op = teclado.nextInt();
            
            teclado.nextLine();
            
            switch(op){
                case 1:{
                    System.out.println("Ingresa la marca de la cocina");
                    String marca = teclado.nextLine();
                
                    System.out.println("Ingresa el precio de la cocina");
                    float precio = teclado.nextFloat();
                    
                    System.out.println("Ingresa el stock de la cocina");
                    int stock = teclado.nextInt();
                    
                    System.out.println("Ingresa la cantidad de hornallas de la cocina");
                    int hornallas = teclado.nextInt();
                    
                    System.out.println("Ingresa las calorias de la cocina");
                    int calorias = teclado.nextInt();
                    
                    teclado.nextLine();
                    
                    System.out.println("Ingresa las dimensiones de la cocina");
                    String dim = teclado.nextLine();
                    
                    System.out.println("Ingresa la cantidad de cuotas a pagar");
                    int cuotas = teclado.nextInt();
                    
                    System.out.println("Ingresa el interes");
                    float interes = teclado.nextFloat();
                    
                    
                    Cocina unaCocina = new Cocina(marca, precio, stock, hornallas, calorias, dim);
                    unaCocina.imprimir();
                    System.out.println("Cuotas: " + cuotas + " Interes: " + interes + "%");
                    System.out.println("Valor cuota: " + unaCocina.cuotaCredito(cuotas,interes));
                    System.out.println("Valor cuota con adicionales: " + unaCocina.creditoConAdicional(cuotas, interes));
                    
                    
                }
                
                case 2:{
                    System.out.println("Ingresa la marca del lavarropas");
                    String marca = teclado.nextLine();
                
                    System.out.println("Ingresa el precio del lavarropas");
                    float precio = teclado.nextFloat();
                    
                    System.out.println("Ingresa el stock del lavarropas");
                    int stock = teclado.nextInt();
                    
                    System.out.println("Ingresa la cantidad de programas del lavarropas");
                    int programas = teclado.nextInt();
                    
                    System.out.println("Ingresa los kilos del lavarropas");
                    float kilos = teclado.nextFloat();
                    
                    System.out.println("¿El lavarropas es automático? (si/no)");
                    teclado.nextLine();
                    String respuesta = teclado.nextLine();
                    boolean tieneOno = respuesta.equalsIgnoreCase("si");
                    
                    System.out.println("Ingresa la cantidad de cuotas a pagar");
                    int cuotas = teclado.nextInt();
                    
                    System.out.println("Ingresa el interes");
                    float interes = teclado.nextFloat();
                    
                    
                    Lavarropas unLavarropas = new Lavarropas(marca, precio, stock, programas, kilos, tieneOno);
                    unLavarropas.imprimir();
                    System.out.println("Cuotas: " + cuotas + " Interes: " + interes + "%");
                    System.out.println("Valor cuota: " + unLavarropas.cuotaCredito(cuotas,interes));
                    System.out.println("Valor cuota con adicionales: " + unLavarropas.creditoConAdicional(cuotas, interes));
                    
                }
                
                case 3:{
                    System.out.println("Ingresa la marca de la heladera");
                    String marca = teclado.nextLine();
                
                    System.out.println("Ingresa el precio de la heladera");
                    float precio = teclado.nextFloat();
                    
                    System.out.println("Ingresa el stock de la heladera");
                    int stock = teclado.nextInt();
                    
                    System.out.println("Ingresa los pies de la heladera");
                    int pies = teclado.nextInt();
                    
                    System.out.println("Ingresa la cantidad de puertas de la heladera");
                    int puertas = teclado.nextInt();
                    
                    System.out.println("¿Tiene compresor? (si/no)");
                    teclado.nextLine();
                    String respuesta = teclado.nextLine();
                    boolean tieneOno = respuesta.equalsIgnoreCase("si");
                    
                    System.out.println("Ingresa la cantidad de cuotas a pagar");
                    int cuotas = teclado.nextInt();
                    
                    System.out.println("Ingresa el interes");
                    float interes = teclado.nextFloat();
                    
                    
                    Heladera unaHeladera = new Heladera(marca, precio, stock, pies, puertas, tieneOno);
                    unaHeladera.imprimir();
                    System.out.println("Cuotas: " + cuotas + " Interes: " + interes + "%");
                    System.out.println("Valor cuota: " + unaHeladera.cuotaCredito(cuotas,interes));
                    System.out.println("Valor cuota con adicionales: " + unaHeladera.creditoConAdicional(cuotas, interes));
                }
                    
            }
        }while(op != 0);
    }
    
    
    
}