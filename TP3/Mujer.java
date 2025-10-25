/**
 * La clase Hombre contiene los datos de una persona del sexo femenito: nombre, apellido, edad, estado civil y su esposo
 * @author(Eduardo López)
 * @author(Joan Mauri)
 * @version(7/9/2025)
 */
public class Mujer
{
  private String nombre;
  private String apellido;
  private int edad;
  private String estadoCivil;
  private Hombre esposo;
  
  /**
     * Este constructor permite instanciar un objeto de la clase Mujer. El estado del atributo estadoCivil por defecto será "Soltera"
     * @param p_nombre nombre de la persona
     * @param p_apellido apellido de la persona
     * @param p_edad edad de la persona
     */
  Mujer(String p_nombre, String p_apellido, int p_edad){
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setEdad(p_edad);
      this.setEstadoCivil("Soltera");
  }
  
    /**
     * Este constructor permite instanciar un objeto de la clase Mujer.
     * @param p_nombre nombre de la persona
     * @param p_apellido apellido de la persona
     * @param p_edad edad de la persona
     * @param p_esposo esposo de la mujer
     */
  Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
      this.setNombre(p_nombre);
      this.setApellido(p_apellido);
      this.setEdad(p_edad);
      this.setEsposo(p_esposo);
      
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
  
  private void setEsposo(Hombre p_esposo){
      this.esposo = p_esposo;
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
  
  public Hombre getEsposo(){
      return this.esposo;
  }
  
  public String getEstadoCivil(){
      return this.estadoCivil;
  }
  
  /**
   * Este metodo hace que la mujer se case con el hombre, actualizando el estado civil del hombre también
   * @param p_hombre persona con la que la mujer se casará
   */
  public void casarseCon(Hombre p_hombre){
      
      this.setEsposo(p_hombre);
      this.setEstadoCivil("Casada");
      
      if(p_hombre.getEsposa()==null){
          p_hombre.casarseCon(this);
      }
  }
  
  /**
   * Este metodo hace que la mujer se divorcie del hombre. Se actualiza su estado civil y tambien el del hombre
   */
  public void divorcio(){
     if(this.getEsposo() != null){
         Hombre esposoActual = this.getEsposo();
         this.setEsposo(null);
         this.setEstadoCivil("Divorciada");
         
         if(esposoActual.getEsposa() != null){
             esposoActual.divorcio();
         }
         
     }
  }
  
  /**
   * Este metodo muestra por pantalla los datos de la mujer
   * @return un string con el nombre, apellido y edad de la mujer
   */
  public String datos(){
      return(this.getNombre() + " " + this.getApellido() + " de " + this.getEdad() + " años");
  }
  
  /**
   * Este metodo uestra el estado civil de la mujer
   */
  public void mostrarEstadoCivil(){
      System.out.println(this.datos() + " - " + this.getEstadoCivil());
  }
  
  /**
   * Este metodo devuelve con qué hombre está casada la mujer
   */
  public void casadaCon(){
      System.out.println(this.datos() + " esta casada con " + this.getEsposo().datos());
  }
  
  
  
}

