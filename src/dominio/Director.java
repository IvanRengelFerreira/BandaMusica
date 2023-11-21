package dominio;

public class Director extends Participante   {

    public Director(String nombre) {
        super(nombre);
    }

    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return "Nombre del Director: "+ nombre;
    }
}
