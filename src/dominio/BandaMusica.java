package dominio;

import java.util.ArrayList;

public class BandaMusica  {

    private String nombre;
    private ArrayList<Actuacion> act;
    
    
    public BandaMusica(String nombre) {
        
        this.nombre = nombre;
        act = new ArrayList<Actuacion>();
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void annadirActuacion(Actuacion a) {
        act.add(a);
    }

    public void mostrarActuacion(){
        for(Actuacion a: act){
            System.out.println(a);
        }
    }

    public String toString() {
        String result = nombre + "\n";
        for (Actuacion a : act) {
            result += a.toString() + "\n";
        }
        return result;
    }

    public Actuacion getActuacion(int i){
        if (i >= 0 && i < act.size()) {
            return act.get(i);
        } else {
            System.out.println("Índice fuera de rango");
            return null;
        }
    }

    public int size() {
        return act.size();
    }
    
    
}
