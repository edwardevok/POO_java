/**
 * La clase Hombre contiene los datos de una persona del sexo masculino: nombre, apellido, edad, estado civil y su esposa
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * Este constructor permite instanciar un objeto de la clase Hombre. El estado del atributo estadoCivil por defecto será "Soltero"
     * @param p_nombre nombre de la persona
     * @param p_apellido apellido de la persona
     * @param p_edad edad de la persona
     */
    Hombre(String p_nombre, String p_apellido, int p_edad){
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setEdad(p_edad);
      this.setEstadoCivil("Soltero");
  }
  
  
      /**
     * Este constructor permite instanciar un objeto de la clase Hombre.
     * @param p_nombre nombre de la persona
     * @param p_apellido apellido de la persona
     * @param p_edad edad de la persona
     * @param p_esposa esposa del hombre
     */
    Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setEdad(p_edad);
      this.setEsposa(p_esposa);
      
  }
  
  //setters
  private void setNombre(String p_nombre){
      this.nombre = p_nombre;
  }
  
  private void setApellido(String p_apellido){
      this.apellido = p_apellido;
  }
  
  private void setEdad(int p_edad){
      this.edad = p_edad;
  }
  
  private void setEsposa(Mujer p_esposa){
      this.esposa = p_esposa;
  }
  
  private void setEstadoCivil(String p_estado){
      this.estadoCivil = p_estado;
  }
  
  
  //getters
  public String getNombre(){
      return this.nombre;
  }
  
  public String getApellido(){
      return this.apellido;
  }
  
  public int getEdad(){
      return this.edad;
  }
  
  public Mujer getEsposa(){
      return this.esposa;
  }
  
  public String getEstadoCivil(){
      return this.estadoCivil;
  }
  
  /**
   * Este metodo hace que el hombre se case con la mujer, actualizando el estado civil de la mujer también
   * @param p_mujer persona con la que el hombre se casará
   */
  public void casarseCon(Mujer p_mujer){
      
      this.setEsposa(p_mujer);
      this.setEstadoCivil("Casado");
      
      if(p_mujer.getEsposo()==null){
          p_mujer.casarseCon(this);
      }
      
  }
  
  /**
   * Este metodo hace que el hombre se divorcie de su mujer. Se actualiza su estado civil y tambien el de la mujer
   */
  public void divorcio(){
     if(this.getEsposa() != null){
         Mujer esposaActual = this.getEsposa();
         this.setEsposa(null);
         this.setEstadoCivil("Divorciado");
         
         if(esposaActual.getEsposo() != null){
             esposaActual.divorcio();
         }
         
     }
  }
  
  /**
   * Este metodo muestra por pantalla los datos del hombre
   * @return un string con el nombre, apellido y edad del hombre
   */
  public String datos(){
      return(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años");
  }
  
  /**
   * Este metodo uestra el estado civil del hombre
   */
  public void mostrarEstadoCivil(){
      System.out.println(this.datos() + " - " + this.getEstadoCivil());
  }
  
  /**
   * Este metodo devuelve con qué mujer está casado el hombre
   */
  public void casadoCon(){
      System.out.println(this.datos() + " esta casado con " + this.getEsposa().datos());
  }

}