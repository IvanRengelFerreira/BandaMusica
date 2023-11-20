package dominio;

public abstract class Participante {
    protected String nombre;

    public abstract Vehiculo(String nombre) {
        this.nombre = nombre;
    }
}
