import java.util.*;

public class AplicacionFacultad {
    public static void main(String[] args) {
        HashMap<Integer,Profesor> profesores = new HashMap();
        
        Cargo cargo1 = new Cargo("Programación OO", 800, 10); 
        Cargo cargo2 = new SemiExclusivo("Titular-TFA", 1400, 12, 10, 0); 
        Cargo cargo3 = new SemiExclusivo("Análisis de Sistemas", 800, 20, 0, 10); 

        Cargo cargo4 = new Cargo("JTP-II", 1200, 11);
        Cargo cargo5 = new Exclusivo("JTP-Ing.Soft", 1800, 10, 10, 20, 10); 

        
        
        ArrayList<Cargo> cargosJuan = new ArrayList<>();
        cargosJuan.add(cargo1);
        cargosJuan.add(cargo2);
        cargosJuan.add(cargo3);

        ArrayList<Cargo> cargosMirta = new ArrayList<>();
        cargosMirta.add(cargo4);
        cargosMirta.add(cargo5);
        
        Profesor juan = new Profesor(21859361, "Juan", "Perez", 1987, "Lic. en Sistemas de Información", cargosJuan);
        Profesor mirta = new Profesor(23451992, "Mirta", "Lopez", 1994, "Lic. en Sistemas de Información", cargosMirta);
        
        profesores.put(21859361,juan);
        profesores.put(23451992,mirta);

        Facultad facena = new Facultad("FaCENA", profesores);


        facena.nominaProfesores();
        facena.listarProfesorCargos();
    }
}
