package aplicacion;

// Importaciones necesarias
import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;

// Clase principal de la aplicación
public class Principal {

    public static void main(String[] args) {
        // Creación de la banda de música
        BandaMusica bd = new BandaMusica("Banda de Música de Villar del Monte");

        // Creación y configuración de la primera actuación
        Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
        bd.annadirActuacion(act1);

        // Añadir participantes a la primera actuación
        Director dir = new Director("José García López");
        act1.annadirParticipante(dir);
        MusicoSocio msc1 = new MusicoSocio("Antonio López Suárez", "clarinete", (28534));
        act1.annadirParticipante(msc1);
        MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal(121));
        act1.annadirParticipante(msr1);

        // Creación y configuración de la segunda actuación
        Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
        bd.annadirActuacion(act2);

        // Añadir participantes a la segunda actuación
        MusicoRefuerzo msr2 = new MusicoRefuerzo("María López Gil", "oboe", new BigDecimal(130));
        act2.annadirParticipante(dir);
        act2.annadirParticipante(msc1);
        act2.annadirParticipante(msr2);

        // Imprimir detalles de la banda
        System.out.println(bd);
    }
}
