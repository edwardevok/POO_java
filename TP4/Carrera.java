import java.util.*;
public class Carrera
{
    
    public static HashMap<Integer,Alumno> alumnos = new HashMap<>();
    public static HashMap<Integer,Curso> cursos = new HashMap<>();
    
    private static int idCurso = 1;
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("1_Crear un alumno");
            System.out.println("2_Crear un curso");
            System.out.println("3_Inscribir un alumno");
            System.out.println("4_Ver inscriptos de un curso");
            System.out.println("5_Quitar alumno");
            System.out.println("6_Buscar un alumno");
            System.out.println("7_Mostrar promedio de alumno");
            System.out.println("8_Cantidad de inscriptos");
            
            opcion = teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:{
                    System.out.println("Ingresá la libreta universitaria del alumno");
                    int lu = teclado.nextInt();
                    
                    System.out.println("Ingresa el nombre del alumno");
                    String nombre = teclado.nextLine();
                    
                    teclado.nextLine();
                    
                    System.out.println("Ingresa el apellido del alumno");
                    String apellido = teclado.nextLine();
                    
                    System.out.println("Ingresa la nota 1");
                    double nota1 = teclado.nextDouble();
                    
                    System.out.println("Ingresa la nota 2");
                    double nota2 = teclado.nextDouble();
                    
                    Alumno unAlumno = new Alumno(lu,nombre,apellido);
                    unAlumno.setNota1(nota1);
                    unAlumno.setNota2(nota2);
                    
                    alumnos.put(lu,unAlumno);
                    
                    System.out.println("Alumno creado con exito. Sus datos son:");
                    System.out.println("\n");
                    unAlumno.mostrar();
                    System.out.println("\n");
                    break;
                }
                
                case 2:{
                    
                    System.out.println("\n");
                    System.out.println("Ingresa el nombre del curso");
                    String nombre = teclado.nextLine();
                    
                    Curso unCurso = new Curso(nombre);
                    cursos.put(idCurso,unCurso);
                    
                    
                    System.out.println("Se creo el curso: "+unCurso.getNombre() + "con id: "+idCurso);
                    idCurso++;
                    break;
                    
                }
                
                case 3:{
                    if(cursos.isEmpty()){
                        System.out.println("No hay ningun curso creado. Crea uno primero");
                        break;
                    }
                    System.out.println("\n");
                    System.out.println("A qué curso queres agregar un alumno? Escribi su id");
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    System.out.println("Elegiste el curso: "+cursoElegido.getNombre() + ".Que alumno queres agregarle?");
                    for(Map.Entry<Integer,Alumno> unAlumno : alumnos.entrySet()){
                        System.out.println(unAlumno.getKey() + " " + unAlumno.getValue().getApellido());
                    }
                    int opAlumno = teclado.nextInt();
                    Alumno alumnoAgregar = alumnos.get(opAlumno);
                    
                    if(cursoElegido.estaInscripto(alumnoAgregar)){
                        System.out.println("Este alumno ya esta incripto en el curso!!");
                        System.out.println("\n");
                        break;
                    }else{
                        cursoElegido.inscribirAlumno(alumnoAgregar);
                        System.out.println("El alumno: " + alumnoAgregar.getApellido() + " fue agregado al curso: "+cursoElegido.getNombre() + " con exito");
                        System.out.println("\n");
                    }
                    
                    System.out.println("EL curso tiene los siguientes alumnos:");
                    cursoElegido.mostrarInscriptos();
                    System.out.println("\n");
                    
                    break;
                    
                    
                }
                
                case 4:{
                    System.out.println("Los inscriptos de que curso queres ver? Elegi");
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    cursoElegido.mostrarInscriptos();
                    
                    break;
                }
                
                case 5:{
                    System.out.println("De que curso queres eliminar un alumno?");
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    System.out.println("Vas a eliminar un alumno del curso: " + cursoElegido.getNombre() + "Elegi el alumno a eliminar: ");
                    cursoElegido.mostrarInscriptos();
                    
                    int op2 = teclado.nextInt();
                    Alumno alumnoEliminar = alumnos.get(op2);
                    
                    if(cursoElegido.estaInscripto(alumnoEliminar)){
                        System.out.println("El alumno " +cursoElegido.buscarAlumno(alumnoEliminar.getLu()).getNombre() + " abandono el curso");
                        cursoElegido.quitarAlumno(alumnoEliminar.getLu());
                        System.out.println("El curso queda con los siguentes alumnos:");
                        System.out.println("\n");
                        cursoElegido.mostrarInscriptos();
                        System.out.println("\n");
                    }else{
                        System.out.println("Parace que no se pudo eliminar al alumno. Seguro no esta inscripto en el curso");
                    }
                    
                    break;
                }
                
                case 6:{
                    
                    System.out.println("En que curso esta el alumno que queres buscar?");
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    System.out.println("Ingresa la libreta universitaria del alumno que queres buscar");
                    int op2 = teclado.nextInt();
                    
                    cursoElegido.buscarAlumno(op2).mostrar();
                    break;
                }
                
                case 7:{
                    System.out.println("En que curso esta el alumno que queres saber el promedio??");
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    System.out.println("Ingresa la libreta universitaria del alumno que queres saber el promedio");
                    int op2 = teclado.nextInt();
                    
                    cursoElegido.imprimirPromedioDelAlumno(op2);
                    break;
                    
                }
                
                case 8:{
                    System.out.println("De que curso queres saber la cantidad?");
                    
                    for(Map.Entry<Integer,Curso> unCurso : cursos.entrySet()){
                        System.out.println(unCurso.getKey() + " " + unCurso.getValue().getNombre());
                    }
                    int op = teclado.nextInt();
                    Curso cursoElegido = cursos.get(op);
                    
                    System.out.println(cursoElegido.cantidadDeAlumnos());
                }
                    
        
                
            }
            
            
            
        }while(opcion != 0);
        
        
        
    }
    
}