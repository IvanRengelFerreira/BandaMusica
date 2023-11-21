package dominio;

import java.io.Serializable;

public abstract class Participante implements Serializable {
    protected String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public abstract String toString();
    
    public abstract void setNombre(String nombre);
    
    public abstract String getNombre();
}
