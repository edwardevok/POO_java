import java.util.*;
/**
 * Clase ejecutable que prueba la funcionalidad del Zoológico.
 * Crea visitantes individuales y delegaciones, y muestra listados y recaudación.
 * 
 * Autor: Domingo Ybaldo Ibalo Correa
 * Autor: Gomez Selenia Agustina
 * Versión: 11/10/2025
 */
public class EjecutableZoologico {
    public static void main(String[] args) {
        // a) Instanciar un zoológico con el nombre “El Caribú”
        Zoologico zoo = new Zoologico("El Caribú");

        // b) Instanciar tres individuos que asistieron al zoológico
        Calendar fechaVisita = new GregorianCalendar(2024, Calendar.SEPTEMBER, 22);

        Persona p1 = new Persona(12345678, "Juan", "Perez", 1980);
        Persona p2 = new Persona(87654321, "pepe", "ramires", 1975);
        Persona p3 = new Persona(11223344, "luka", "Gomez", 1990);

        // Individuo que viene solo
        Individuo ind1 = new Individuo("Juan",fechaVisita,p1);

        // c) Crear la delegación “PAMI” e inscribir a los otros dos individuos
        Individuo ind2 = new Individuo("Pepe",fechaVisita,p2);
        Individuo ind3 = new Individuo("Caro",fechaVisita,p3);

        HashSet<Individuo> integrantesPAMI = new HashSet<Individuo>();
        integrantesPAMI.add(ind2);
        integrantesPAMI.add(ind3);

        Delegacion pami = new Delegacion("PAMI", fechaVisita, integrantesPAMI);

        // Añadir todos los visitantes al zoológico
        zoo.nuevoVisitante(ind1);
        zoo.nuevoVisitante(pami);

        // d) Listar todos los visitantes que acudieron al zoológico el día 22/09/2024
        System.out.println("Visitantes del 22/09/2024:");
        zoo.listarVisitantePorFecha(fechaVisita);

         Calendar fechaActual = Calendar.getInstance();
        double recaudacionUltimoMes = zoo.recaudacion(fechaVisita, fechaActual);
        System.out.println("Recaudación del último mes: $" + recaudacionUltimoMes);
        // f) Listar las delegaciones que acudieron el día 22/09/2024
        System.out.println("\nDelegaciones que asistieron el 22/09/2024:");
        zoo.listarTipoVisitantePorFecha(fechaVisita, "delegacion");
    }
}