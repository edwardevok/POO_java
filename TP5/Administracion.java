import java.util.*;

public class Administracion {
    
    public static void main(String[] args) {
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList();
        Punto origen = new Punto(1,2);
        Scanner teclado = new Scanner(System.in);
        Jardin jardin = null;
        int op;
        
        do{
            System.out.println("1_Crear Jardin");
            System.out.println("2_Crear un cuadrado");
            System.out.println("3_Crear un triangulo");
            System.out.println("4_Crear un circulo");
            System.out.println("5_Crear un elipse");
            System.out.println("6_Mostrar Presupuesto");
            
            op = teclado.nextInt();
            teclado.nextLine();
            
            
            switch(op){
                case 1:{
                    if(jardin == null){
                       System.out.println("Ingresa el nombre del jardin");
                        String nombre = teclado.nextLine();
                        jardin = new Jardin(nombre,figuras);
                        System.out.println("Jardin creado exitosamente: " + nombre);
                        System.out.println("\n");
                        break; 
                    }else{
                        System.out.println("Ya existe un jardin");
                        System.out.println("\n");
                        break;
                    }
                    
                }
                
                case 2:{
                    if(jardin != null){
                        System.out.println("Ingresa el lado del cuadrado");
                        double lado = teclado.nextDouble();
                        
                        Cuadrado unCuadrado = new Cuadrado(origen,lado);
                        figuras.add(unCuadrado);
                        System.out.println("EL cuadrado fue agregado");
                        System.out.println("\n");
                        break;
                    }else{
                        System.out.println("Crea un jardin primero");
                        break;
                    }
                }
                
                case 3:{
                    if(jardin != null){
                        System.out.println("Ingresa la base del triangulo");
                        double base = teclado.nextDouble();
                        
                        System.out.println("Ingresa la altura del triangulo");
                        double altura = teclado.nextDouble();
                        
                        
                        Triangulo unTriangulo = new Triangulo(origen,base,altura);
                        figuras.add(unTriangulo);
                        System.out.println("EL triangulo fue agregado");
                        System.out.println("\n");
                        break;
                    }else{
                        System.out.println("Crea un jardin primero");
                        break;
                    }
                    
                }
                
                case 4:{
                    if(jardin != null){
                        System.out.println("Ingresa el radio del circulo");
                        double radio = teclado.nextDouble();
                        
                        Circulo unCirculo = new Circulo(origen,radio);
                        figuras.add(unCirculo);
                        System.out.println("EL circulo fue agregado");
                        System.out.println("\n");
                        break;
                    }else{
                        System.out.println("Crea un jardin primero");
                        break;
                    }
                    
                    
                }
                
                case 5:{
                    if(jardin != null){
                        System.out.println("Ingresa el semieje mayor de la elipse");
                        double sMayor = teclado.nextDouble();
                        
                        System.out.println("Ingresa el semieje menor de la elipse");
                        double sMenor = teclado.nextDouble();
                        
                        Elipse unaElipse = new Elipse(origen, sMayor, sMenor);
                        
                        figuras.add(unaElipse);
                        System.out.println("La elipse fue agregada");
                        System.out.println("\n");
                        break;
                    }else{
                        System.out.println("Crea un jardin primero");
                        break;
                    }
                    
                }
                
                case 6:{
                    jardin.detalleFiguras();
                }
            }
        }while(op != 0);
        
    }    
}
