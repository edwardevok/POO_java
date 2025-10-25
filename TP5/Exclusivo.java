/**
 * La sub clase Exclusivo contiene los datos de un cargo del tipo exclusivo
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */

public class Exclusivo extends Cargo
{
    private int horasDeInvestigacion;
    private int horasDeExtension;
    
    /**
     * Exclusivo Constructor
     *
     * @param p_nombre nombre del cargo
     * @param p_sueldo sueldo por el cargo
     * @param p_anio anio del cargo
     * @param p_horasDeDocencia horas de docencia
     * @param p_horasDeInvestigacion horas de investigacion
     * @param p_horasDeExtension horas de extension
     */
    Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDeDocencia, int p_horasDeInvestigacion, int p_horasDeExtension){
        super(p_nombre, p_sueldo, p_anio);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeExtension(p_horasDeExtension);
    }
    
    //setter
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    
    private void setHorasDeExtension(int p_horasDeExtension){
        this.horasDeExtension = p_horasDeExtension;
    }
    //getter
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    
    /**
     * Método mostrarCargo muestra la informacion del cargo
     *
     */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigacion: " + this.getHorasDeInvestigacion());
        System.out.println("Horas extension: " + this.getHorasDeExtension());
        
    }
}