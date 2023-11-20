package dominio;

public abstract class  Musico {
    
    protected String nombre;
    protected String instrumento;
    protected double salario;

    public Musico(String nombre, String instrumento, double salarioBase) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.salario = salarioBase;
    }

}
