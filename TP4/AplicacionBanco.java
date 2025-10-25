import java.util.*;

public class AplicacionBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear banco desde el inicio
        System.out.println("Ingrese el nombre del banco:");
        String nombreBanco = teclado.nextLine();

        System.out.println("Ingrese la localidad del banco:");
        String nombreLoc = teclado.nextLine();

        System.out.println("Ingrese la provincia:");
        String prov = teclado.nextLine();

        Localidad loc = new Localidad(nombreLoc, prov);

        System.out.println("Ingrese el número de sucursal:");
        int nroSucursal = teclado.nextInt();

        // inicializamos el banco sin empleados ni cuentas
        Banco banco = new Banco(nombreBanco, loc, nroSucursal, new ArrayList<Empleado>(), new ArrayList<CuentaBancaria>());

        int opcion;
        do {
            System.out.println("1. Dar de alta un empleado");
            System.out.println("2. Dar de baja un empleado");
            System.out.println("3. Dar de alta una cuenta bancaria");
            System.out.println("4. Dar de baja una cuenta bancaria");
            System.out.println("5. Listar sueldos y total a pagar");
            System.out.println("6. Listar cuentas con saldo cero");
            System.out.println("7. Mostrar titulares de cuentas");
            System.out.println("8. Mostrar información del banco");
            System.out.println("9. Mostrar resumen del banco");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: {
                    System.out.println("CUIL del empleado:");
                    long cuil = teclado.nextLong();
                    teclado.nextLine();

                    System.out.println("Apellido:");
                    String apellido = teclado.nextLine();

                    System.out.println("Nombre:");
                    String nombre = teclado.nextLine();

                    System.out.println("Sueldo básico:");
                    double sueldo = teclado.nextDouble();

                    System.out.println("Año de ingreso:");
                    int anio = teclado.nextInt();

                    Empleado nuevoEmp = new Empleado(cuil, apellido, nombre, sueldo, anio);
                    banco.agregarEmpleado(nuevoEmp);
                    System.out.println("Empleado agregado con éxito.");
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el CUIL del empleado a eliminar:");
                    long cuil = teclado.nextLong();
                    Empleado aEliminar = null;
                    for (Empleado e : banco.getEmpleados()) {
                        if (e.getCUIL() == cuil) {
                            aEliminar = e;
                            break;
                        }
                    }
                    if (aEliminar != null && banco.quitarEmpleado(aEliminar)) {
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No se encontró el empleado.");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Número de cuenta:");
                    int nroCuenta = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("DNI del titular:");
                    int dni = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Nombre del titular:");
                    String nombre = teclado.nextLine();

                    System.out.println("Apellido del titular:");
                    String apellido = teclado.nextLine();

                    System.out.println("Año de nacimiento:");
                    int anioNac = teclado.nextInt();

                    Persona titular = new Persona(dni, nombre, apellido, anioNac);

                    System.out.println("Saldo inicial:");
                    double saldo = teclado.nextDouble();

                    CuentaBancaria cuenta = new CuentaBancaria(nroCuenta, titular, saldo);
                    banco.agregarCuentaBancaria(cuenta);

                    System.out.println("Cuenta agregada con éxito.");
                    break;
                }
                case 4: {
                    System.out.println("Número de cuenta a eliminar:");
                    int nroCuenta = teclado.nextInt();
                    CuentaBancaria aEliminar = null;
                    for (CuentaBancaria c : banco.getCuentasBancarias()) {
                        if (c.getNroCuenta() == nroCuenta) {
                            aEliminar = c;
                            break;
                        }
                    }
                    if (aEliminar != null && banco.quitarCuentaBancaria(aEliminar)) {
                        System.out.println("Cuenta eliminada.");
                    } else {
                        System.out.println("No se encontró la cuenta.");
                    }
                    break;
                }
                case 5: {
                    banco.listarSueldos();
                    break;
                }
                case 6: {
                    banco.listarCuentasConSaldoCero();
                    break;
                }
                case 7: {
                    System.out.println("Titulares de cuentas:");
                    for (Persona p : banco.listaDeTitulares()) {
                        System.out.println(p.apeYNom());
                    }
                    break;
                }
                case 8: {
                    banco.mostrar();
                    break;
                }
                case 9: {
                    banco.mostrarResumen();
                    break;
                }
                case 0: {
                    System.out.println("Saliendo del sistema...");
                    break;
                }
                default: {
                    System.out.println("Opción inválida.");
                }
            }
        } while (opcion != 0);

        teclado.close();
    }
}
