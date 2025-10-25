import java.util.*;

public class AdministracionGerencia {
    
    public static void main(String[] args) {
        
        Servicio serv1 = new Servicio("servicio de spa", 50);
        Servicio serv2 = new Servicio("sala de conferencias", 100);
        Servicio serv3 = new Servicio("lavanderia", 20);
        Servicio serv4 = new Servicio("mucama con final feliz",200);
        
        ArrayList<Servicio> serviciosHotel = new ArrayList();
        serviciosHotel.add(serv1);
        serviciosHotel.add(serv2);
        
        ArrayList<Servicio> serviciosCabaña = new ArrayList();
        serviciosCabaña.add(serv3);
        serviciosCabaña.add(serv4);
        
        Hotel hotel1 = new Hotel("Marriot",90,7,"single", serviciosHotel);
        Cabaña cabaña1 = new Cabaña("La alondra",100,7,serviciosCabaña,4);
        
        Hotel hotel2 = new Hotel("Hilton",140,14,"doble", serviciosHotel);
        Cabaña cabaña2 = new Cabaña("La alondra",100,14,serviciosCabaña,2);

        ArrayList<Alojamiento> alojamientos = new ArrayList();
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(cabaña1);
        alojamientos.add(cabaña2);
        
        Gerencia gerencia1 = new Gerencia("Gerencia Lopez - Mauri y asociados", alojamientos);
        
        gerencia1.mostrarLiquidacion();
        
       
    }
}
