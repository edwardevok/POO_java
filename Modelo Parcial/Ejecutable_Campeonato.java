import java.util.*;
public class Ejecutable_Campeonato
{
    public static void main(String args[]){
        Scaled atleta = new Scaled(1, "Eduardo Lopez", 100, 40);
        Advanced atleta2 = new Advanced(2, "Joan Mauri", 200, 50);
        Rx atleta3 = new Rx(3, "Vago Mancedo", 300, 60);
        
        Scaled atleta4 = new Scaled(4, "Alejandro Gimenez", 100, 50);
        Advanced atleta5 = new Advanced(5, "Luciano Pedottti", 100, 5);
        Rx atleta6 = new Rx(6, "Nahiara Meza", 100, 500);
        
        HashMap<Integer,Atleta> team1 = new HashMap();
        team1.put(atleta.getId(),atleta);
        team1.put(atleta2.getId(),atleta2);
        team1.put(atleta3.getId(),atleta3);
        
        HashMap<Integer,Atleta> team2 = new HashMap();
        team2.put(atleta4.getId(),atleta4);
        team2.put(atleta5.getId(),atleta5);
        team2.put(atleta6.getId(),atleta6);
        
        
        Equipo mostachosBeibi = new Equipo("Mostachos Beibi", "Corrientes", team1);
        Equipo losWachiturros = new Equipo("Los Wachiturros", "Mansilla", team2);
        
        HashSet<Equipo> conjuntoDeEquipos = new HashSet();
        conjuntoDeEquipos.add(mostachosBeibi);
        conjuntoDeEquipos.add(losWachiturros);
        
        Campeonato ponele = new Campeonato("El gran Premio de tu Vieja", conjuntoDeEquipos);
        
        ponele.determinarGanador();
        
        
    }
}