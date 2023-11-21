package dominio;
public abstract class Musico extends Participante {
    
    protected String instrumento;
    
    public Musico(String nombre, String instrumento) {
        super(nombre);
        this.instrumento = instrumento;
    }
    
    public abstract void setInstrumento(String Instrumento);
    
    public abstract String getInstrumento();
       
   
    

}
