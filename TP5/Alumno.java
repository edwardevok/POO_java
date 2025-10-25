/**
 * La clase Alumno contiene los datos personales de un alumno, incluyendo: 
 * libreta universitaria (lu), nombre, apellido y sus dos notas.
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
public class Alumno extends Persona
{
    private int lu;
    private double nota1;
    private double nota2;

    /**
     * Constructor que permite inicializar un objeto de la clase Alumno.
     * @param p_lu la libreta universitaria del alumno
     * @param p_nombre el nombre del alumno
     * @param p_apellido el apellido del alumno
     */
    Alumno(int p_dni, String p_nombre, String p_apellido, int p_anio, int p_lu){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    // ================= SETTERS =================
    private void setLu(int p_lu){
        this.lu = p_lu;
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
        return (promedio() >= 7 && (this.getNota1() >= 6 && this.getNota2() >= 6));
    }
    
    /**
     * Devuelve una leyenda de aprobación según el resultado de aprueba().
     * @return "APROBADO" si aprueba() devuelve true
     * @return "DESAPROBADO" si aprueba() devuelve false
     */
    private String leyendaAprueba(){
        if(aprueba()){
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
    
    /**
     * Muestra por pantalla los datos del alumno, sus notas,
     * promedio y leyenda de aprobación.
     */
    @Override
    public void mostrar(){
        super.mostrar();
        
        System.out.println("LU: " + this.getLu() + "\t" + " Notas: " + this.getNota1() + " - " + this.getNota2());
        System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
    }
}
