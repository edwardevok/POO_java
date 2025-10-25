/**
 * Clase ejecutable de la clase Cliente
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (22/08/2025)
 */
public class ClienteEjec
{
    public static void main(String args[]){
        //los parametros son ingresados a traves del metodo main
        int dni = Integer.valueOf(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        double saldo = Double.parseDouble(args[3]);

        //instancias de clase
        Cliente unCliente = new Cliente(dni, nombre, apellido, saldo);

        //implementacion de metodo mostrar
        unCliente.mostrar();

        System.out.println("\n");

        //metodo nuevoSaldo()
        unCliente.nuevoSaldo(1000);
        System.out.println("Saldo actualizado: "+unCliente.getImporte());

        //metodo agregaSaldo()
        unCliente.agregaSaldo(5000);
        System.out.println("Sumamos 5000 al saldo: "+unCliente.getImporte());
        
        System.out.println("\n");
        //metodo apeYnom()
        System.out.println("Apellido y nombre: "+unCliente.apeYnom());

    }
}