/**
 * La clase Curso contiene los datos de un curso de un colegio: el nombre del curso y sus alumnos (los mismos, en una colección)
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(21/09/2025)
 */

import java.util.*;

public class Curso
{
    private String nombre;
    private HashMap<Integer,Alumno> alumnos;
    
    
    /**
     * Constructor para instanciar un objeto de la clase Curso
     * @param p_nombre el nombre del curso
     */
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap());
    }
    
    /**
     * Constructor para instanciar un objeto de la clase Curso
     * @param p_nombre el nombre del curso
     * @param p_alumnos son los estudiantes del curso (coleccion de estudiantes)
     */
    public Curso(String p_nombre, HashMap<Integer,Alumno> p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlumnos(HashMap<Integer,Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public HashMap<Integer,Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    /**
     * Este metodo permite incorporar un alumno a la coleccion de alumnos. Permite agregar el alumno al curso
     * @param p_alumno es el alumno a añadir
     */
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(),p_alumno);
    }
    
    /**
     * Este metodo permite quitar un alumno de la coleccion de alumnos. Permite quitar un alumno del curso
     * @param p_alumno es el alumno a quitar
     */
    public void quitarAlumno(int p_lu){
        
        this.getAlumnos().remove(p_lu);
        
    }
    
    /**
     * Este metodo permite saber la cantidad de alumnos que hay en el curso. (La cantidad de alumnos en la coleccion)
     */
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    /**
     * Este metodo permite conocer si un alumno esta inscripto en el curso o nó (segun su numero de libreta universitaria)
     * @param p_lu es el numero de libreta universitaria del alumno
     * @return true si el alumno esta inscripto
     * @return false si el alumno no esta inscripto
     */
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**
     * Este metodo permite conocer si un alumno esta inscripto en el curso o nó (segun sus datos)
     * @param p_alumnos es el alumno a saber si esta inscripto o nó
     * @return true si el alumno esta inscripto
     * @return false si el alumno no esta inscripto
     */
    public boolean estaInscripto(Alumno p_alumnos){
        return this.getAlumnos().containsValue(p_alumnos);
    }
    
    /**
     * Este metodo permite buscar un alumno y devolverlo
     * @param p_lu es la libreta universitaria del alumno
     * @return alumno
     */
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
    /**
     * Este metodo permite mostrar el promedio de un alumno en especifico
     * @param p_lu es el numero de la libreta universitaria del alumno
     * @return promedio del alumno
     */
    public void imprimirPromedioDelAlumno(int p_lu){
        Alumno alumno = this.buscarAlumno(p_lu);
        if(alumno != null){
            System.out.println("El promedio del alumno " + alumno.nomYApe() + " es: " + alumno.promedio());
        } else {
            System.out.println("No existe un alumno con LU " + p_lu + " en este curso.");
        }
    }
    
    /**
     * Este metodo permite mostrar todos los alumnos inscriptos de un curso
     */
    public void mostrarInscriptos(){
        System.out.println("***--Cantidad de inscriptos: "+this.cantidadDeAlumnos());
        for(Map.Entry<Integer,Alumno> unAlumno : alumnos.entrySet()){
            System.out.println(unAlumno.getKey() + "   " + unAlumno.getValue().nomYApe());
        }
    }
    
    
    
    
    
    
    
    
    
    
}

