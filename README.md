# BandaMusica

package dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actuacion {

    private ArrayList<Participante> participantes;
    private String nombre;

    public Actuacion(LocalDate of) {
    }

    public void annadirParticipante(Participante p) {
        participantes.add(p);
    }

    public abstract void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract getNombre(){
        return nombre;
    }

}
ackage dominio;

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

package dominio;

public class Director extends Participante  {

    public Director(String nombre) {
        super(nombre);
    }

    
}

package dominio;

public abstract class Musico extends Participante {

    protected String instrumento;
    protected double salario;

    public Musico(String nombre, String instrumento, double salarioBase) {
        super(nombre);
        this.instrumento = instrumento;
        this.salario = salarioBase;
    }

    public abstract void setInstrumento(String Instrumento){
        this.instrumento = instrumento;
    }

    public abstract getInstrumento(){
        return instrumento;
    }

    public abstract void setSalario(double salario){
        this.salario = salario;
    }

    public abstract getSalario(){
        return salario;
    }

}

package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo {

    public MusicoRefuerzo(String string, String string2, BigDecimal bigDecimal) {
    }

}

package dominio;

public class MusicoSocio {

    public MusicoSocio(String string, String string2, int i) {
    }

}

package dominio;

public abstract class Participante {
    protected String nombre;

    public abstract Participante(String nombre) {
        this.nombre = nombre;
    }

    public abstract void setNombre(String nombre){
        this.nombre = nombre;
    }

    public abstract getNombre(){
        return nombre;
    }
}


