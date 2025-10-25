import java.util.*;

public class Escuela
{
    
    private static HashMap<Integer,Persona> hashPersonas = new HashMap<>();
    private static HashMap<Integer,Alumno> hashAlumnos = new HashMap<>();
    
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do{
            System.out.println("1_Crear una persona");
            System.out.println("2_Crear un alumno");
            System.out.println("3_Mostrar todas las personas");
            System.out.println("4_Mostrar todos los alumnos");
            
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:{
                    
                    System.out.println("Ingresa el dni de la persona");
                    int dni = teclado.nextInt();
                    
                    teclado.nextLine();
                    
                    System.out.println("Ingresa el nombre de la persona");
                    String nombre = teclado.nextLine();
                    
                    System.out.println("Ingresa el apellido de la persona");
                    String apellido = teclado.nextLine();
                    
                    System.out.println("Ingresa el anio de la persona");
                    int anio = teclado.nextInt();
                    
                    Persona unaPersona = new Persona(dni,nombre,apellido,anio);
                    hashPersonas.put(dni,unaPersona);
                    
                    break;
                    
                }
                
                case 2:{
                    
                    System.out.println("Ingresa el dni del alumno");
                    int dni = teclado.nextInt();
                    
                    System.out.println("Ingresa la lu del alumno");
                    int lu = teclado.nextInt();
                    
                    System.out.println("Ingresa el nombre del alumno");
                    String nombre = teclado.nextLine();
                    
                    System.out.println("Ingresa el apellido del alumno");
                    String apellido = teclado.nextLine();
                    
                    System.out.println("Ingresa el anio del alumno");
                    int anio = teclado.nextInt();
                    
                    Alumno unAlumno = new Alumno(dni,nombre,apellido,anio,lu);
                    
                    unAlumno.setNota1(9.50);
                    unAlumno.setNota2(6);
                    
                    hashAlumnos.put(lu,unAlumno);
                    
                    break;
                }
                
                case 3:{
                    System.out.println("***** TODAS LAS PERSONAS *****");
                    for(Map.Entry<Integer,Persona> unaPersona : hashPersonas.entrySet()){
                        unaPersona.getValue().mostrar();
                    }
                }
                
                case 4:{
                    System.out.println("***** TODAS LOS ALUMNOS *****");
                    for(Map.Entry<Integer,Alumno> unaPersona : hashAlumnos.entrySet()){
                        unaPersona.getValue().mostrar();
                    }
                }
                
                break;
            }
            
        }while(opcion != 0);
        
       
        
        
    }
    
    
}