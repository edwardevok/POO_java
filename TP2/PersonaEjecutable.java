/**
 * Clase ejecutable de la clase Persona
 * @author (Eduardo Lopez)
 * @author(Joan Mauri)
 * @version (22/08/2025)
 */
public class PersonaEjecutable
{
    
    
  public static void main(String args[]){
      //instancia de la clase persona
      Persona unaPersona = new Persona(41412903, "Eduardo", "Lopez", 1998);
      Persona otraPersona = new Persona (37890753, "Joan", "Mauri", 1993);
      
      //implementaciion del metodo mostrar() 
      unaPersona.mostrar();
      
      otraPersona.mostrar();
      
      
      System.out.println("\n");
      //implementacion del metodo apeYNom();
      System.out.println(unaPersona.apeYNom());
      System.out.println(otraPersona.apeYNom());
      
      
  }
}