/**
 * La sub clase SemiExclusivo contiene los datos de un cargo del tipo semi exclusivo
 * @author(Joan Mauri)
 * @author(Eduardo López)
 * @version(22/08/2025)
 */
public class SemiExclusivo extends Cargo
{
    private int horasDeInvestigacion;
    
    /**
     * SemiExclusivo Constructor
     *
     * @param p_nombre nombre del cargo
     * @param p_sueldo sueldo del cargo
     * @param p_anio anio del cargo
     * @param p_horasD horas de docencia
     * @param p_horasI horas de investigacion
     */
    SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasD, int p_horasI){
        super(p_nombre, p_sueldo, p_anio);
        this.setHorasDeDocencia(this.getHorasDeDocencia() + p_horasD);
        this.setHorasDeInvestigacion(p_horasI);
    }
    
    //setter
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    
    //getter
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    /**
     * Método mostrarCargo muestra la informacion del cargo
     *
     */
    @Override
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas investigacion: " + this.getHorasDeInvestigacion());
    }
}