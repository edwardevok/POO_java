import java.util.Scanner;
/**
 * Clase ejecutable que prueba las funcionalidades de clas clases Hospital, Paciente y Localidad
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (7/9/2025)
 */
public class GestionHospital
{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        
        //instanciamos un hospital
        System.out.println("Ingresa el nombre de un hospital");
        String nombreHosp = teclado.nextLine();
        
        System.out.println("Ingresa el nombre del director del hospital");
        String nombreDir = teclado.nextLine();
        
        Hospital unHospital = new Hospital(nombreHosp,nombreDir);
        
        //Instanciamos las localidades
        Localidad nac = new Localidad("Curuzu Cuatia", "Corrientes");
        Localidad vive = new Localidad("Feliciano","Entre Rios");
        
        //Instanciamos un paciente
        System.out.println("Ingresa el numero de la historia clinica");
        int nroHistoria = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Ingresa el nombre completo de la persona");
        String nombreCompleto = teclado.nextLine();
        
        System.out.println("Ingresa el domicilio");
        String domicilio = teclado.nextLine();
        
        Paciente unPaciente = new Paciente(nroHistoria,nombreCompleto,domicilio,nac,vive);
        
        //mostramos por pantalla los datos del paciente
        unHospital.consultaDatosFiliatorios(unPaciente);
        
        
        //INSTANCIAMOS OTRO HOSPITAL, LOCALIDAD Y PACIENTE
        
        
        //instanciamos un hospital
        System.out.println("Ingresa el nombre de un hospital");
        String nombreHosp2 = teclado.nextLine();
        
        System.out.println("Ingresa el nombre del director del hospital");
        String nombreDir2 = teclado.nextLine();
        
        Hospital otroHospital = new Hospital(nombreHosp2,nombreDir2);
        
        //Instanciamos las localidades
        Localidad nac2 = new Localidad("Curuzu Cuatia", "Corrientes");
        Localidad vive2 = new Localidad("Feliciano","Entre Rios");
        
        //Instanciamos un paciente
        System.out.println("Ingresa el numero de la historia clinica");
        int nroHistoria2 = teclado.nextInt();
        
        teclado.nextLine();
        
        System.out.println("Ingresa el nombre completo de la persona");
        String nombreCompleto2 = teclado.nextLine();
        
        System.out.println("Ingresa el domicilio");
        String domicilio2 = teclado.nextLine();
        
        Paciente otroPaciente = new Paciente(nroHistoria2,nombreCompleto2,domicilio2,nac2,vive2);
        
        //mostramos por pantalla los datos del paciente
        otroHospital.consultaDatosFiliatorios(otroPaciente);
        
        
    }
}