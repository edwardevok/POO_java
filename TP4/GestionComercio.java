import java.util.*;

public class GestionComercio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del comercio:");
        String nombre = teclado.nextLine();
        Comercio comercio = new Comercio(nombre);

        int opcion;
        do {
            
            System.out.println("1_Alta de empleado");
            System.out.println("2_Baja de empleado");
            System.out.println("3_Buscar un empleado");
            System.out.println("4_Ver sueldo neto de un empleado");
            System.out.println("5_Cantidad de empleados");
            System.out.println("6_Mostrar nómina completa");
            System.out.println("0_Salir");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el CUIL del empleado:");
                    long cuil = teclado.nextLong();
                    teclado.nextLine();

                    System.out.println("Ingrese el apellido del empleado:");
                    String apellido = teclado.nextLine();

                    System.out.println("Ingrese el nombre del empleado:");
                    String nombreEmp = teclado.nextLine();

                    System.out.println("Ingrese el sueldo básico:");
                    double sueldoBasico = teclado.nextDouble();

                    System.out.println("Ingrese el año de ingreso:");
                    int anioIngreso = teclado.nextInt();

                    Empleado nuevo = new Empleado(cuil, apellido, nombreEmp, sueldoBasico, anioIngreso);
                    comercio.altaEmpleado(nuevo);

                    System.out.println("Empleado agregado con éxito.");
                    break;
                }

                case 2: {
                    System.out.println("Ingrese el CUIL del empleado a eliminar:");
                    long cuil = teclado.nextLong();

                    Empleado eliminado = comercio.bajaEmpleado(cuil);
                    if (eliminado != null) {
                        System.out.println("Empleado eliminado:");
                        eliminado.mostrar();
                    } else {
                        System.out.println("No existe un empleado con ese CUIL.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Ingrese el CUIL del empleado a buscar:");
                    long cuil = teclado.nextLong();

                    Empleado buscado = comercio.buscarEmpleado(cuil);
                    if (buscado != null) {
                        System.out.println("Empleado encontrado:");
                        buscado.mostrar();
                    } else {
                        System.out.println("No se encontró un empleado con ese CUIL.");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Ingrese el CUIL del empleado:");
                    long cuil = teclado.nextLong();

                    if (comercio.esEmpleado(cuil)) {
                        Empleado e = comercio.buscarEmpleado(cuil);
                        System.out.println("El sueldo neto de " + e.apeYNom() + " es: " + e.sueldoNeto());
                    } else {
                        System.out.println("No existe un empleado con ese CUIL.");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Cantidad total de empleados: " + comercio.cantidadDeEmpleados());
                    break;
                }

                case 6: {
                    comercio.nomina();
                    break;
                }

                case 0: {
                    System.out.println("Saliendo del sistema...");
                    break;
                }

                default: {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            }

        } while (opcion != 0);

        teclado.close();
    }
}
