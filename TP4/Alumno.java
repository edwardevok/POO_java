/**
 * La clase Alumno contiene los datos personales de un alumno, incluyendo: 
 * libreta universitaria (lu), nombre, apellido y sus dos notas.
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    /**
     * Constructor que permite inicializar un objeto de la clase Alumno.
     * @param p_lu la libreta universitaria del alumno
     * @param p_nombre el nombre del alumno
     * @param p_apellido el apellido del alumno
     */
    Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    // ================= SETTERS =================
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }
    
    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    // ================= GETTERS =================
    public int getLu(){
        return this.lu;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public double getNota2(){
        return this.nota2;
    }
    
    /**
     * Calcula el promedio de las dos notas del alumno.
     * @return el valor del promedio
     */
    public double promedio(){
        return ((this.getNota1() + this.getNota2()) / 2);
    }
    
    /**
     * Verifica si el alumno aprueba en base a su promedio y notas.
     * @return true si el promedio es mayor o igual a 7 y ambas notas son mayores o iguales a 6.
     * @return false en caso contrario.
     */
    private boolean aprueba(){
        return (this.promedio() >= 7 && (this.getNota1() >= 6 && this.getNota2() >= 6));
    }
    
    /**
     * Devuelve una leyenda de aprobación según el resultado de aprueba().
     * @return "APROBADO" si aprueba() devuelve true
     * @return "DESAPROBADO" si aprueba() devuelve false
     */
    private String leyendaAprueba(){
        if(this.aprueba()){
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
    
    /**
     * Devuelve el nombre y apellido del alumno.
     * @return nombre + apellido
     */
    public String nomYApe(){
        return (this.getNombre() + " " + this.getApellido());
    }
    
    /**
     * Devuelve el apellido y nombre del alumno.
     * @return apellido + nombre
     */
    public String apeYNom(){
        return (this.getApellido() + " " + this.getNombre());
    }
    
    /**
     * Muestra por pantalla los datos del alumno, sus notas,
     * promedio y leyenda de aprobación.
     */
    public void mostrar(){
        System.out.println("Nombre y apellido: " + this.nomYApe());
        System.out.println("LU: " + this.getLu() + "\t" + "Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}
