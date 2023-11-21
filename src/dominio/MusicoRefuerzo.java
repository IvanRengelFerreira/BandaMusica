package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico{

    private BigDecimal salario;

    public MusicoRefuerzo(String instrumento, String nombre, BigDecimal salario) {
        super(nombre, instrumento);
        this.salario = salario;
    }

    public void setInstrumento(String instrumento){
        this.instrumento = instrumento;
    }
    
    public String getInstrumento(){
        return instrumento;
    }
    
    public  void setSalario(BigDecimal salario){
        this.salario = salario;
    }
    
    public BigDecimal getSalario(){
        return salario;
    }

    public  void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String toString(){
        return "Nombre del Musico: "+nombre+"Instrumento del Musico: "+instrumento+"Salario del Musico: ";
    }


}
