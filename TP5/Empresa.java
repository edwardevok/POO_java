import java.util.*;

public class Empresa
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        Persona unaPersona = new Persona(41412903, "Eduardo", "Lopez", 1998);
        unaPersona.mostrar();
        
        System.out.println("\n");
        
        Empleado unEmpleado = new Empleado(37890753, "Mauri", "Joan", 2020, 2037890753, 4000000);
        unEmpleado.mostrar();
        
    }
}