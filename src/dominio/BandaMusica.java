package dominio;

import java.util.ArrayList;

public class BandaMusica {

    private String nombre;
    private ArrayList<BandaMusica> banda;


    public BandaMusica(String nombre) {

        this.nombre = nombre;
        banda = new ArrayList<BandaMusica>();

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getNombre(){
        return nombre;
    }

    public void annadirActuacion(Actuacion act1) {
    }

}
