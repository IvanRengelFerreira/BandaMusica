package dominio;

public class MusicoSocio extends Musico {

    private int nSocio;;
    
    public MusicoSocio(String nombre, String instrumento, int nSocio) {
        super(nombre, instrumento);
        this.nSocio = nSocio;
    }

    public void setInstrumento(String instrumento){
        this.instrumento = instrumento;
    }
    
    public String getInstrumento(){
        return instrumento;
    }
    
    public  void setNSocio(int nSocio){
        this.nSocio = nSocio;
    }
    
    public int getNSocio(){
        return nSocio;
    }

    public String toString(){
        return "Nombre del Musico: "+nombre+"Instrumento del Musico: "+instrumento+"Numero de socio del Musico: "+nSocio;
    }

    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

}
