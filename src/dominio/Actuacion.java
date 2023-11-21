package dominio;


import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion  {

    private ArrayList<Participante> participantes;
    private LocalDate fecha;
    

    public Actuacion(LocalDate fecha) {
    this.fecha = fecha;
    participantes = new ArrayList<Participante>();
}

    public void annadirParticipante(Participante p) {
    participantes.add(p);
    }

    public  void setfecha(LocalDate fecha){
    this.fecha = fecha;
    }

    public LocalDate getfecha(){
    return fecha;
}

    public void mostrarParticipantes(){
        for(Participante participante: participantes){
            System.out.println(participante);
        }
    }

    public String toString() {
        String result = "Fecha de la actuacion: " + fecha + "\n";
        for (Participante participante : participantes) {
            result += participante.toString() + "\n";
        }
        return result;
    }
    
}
