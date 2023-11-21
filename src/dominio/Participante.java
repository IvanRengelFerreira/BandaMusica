package dominio;

public abstract class Participante {
    protected String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    public abstract String toString();
    
    public abstract void setNombre(String nombre);
    
    public abstract String getNombre();
}
