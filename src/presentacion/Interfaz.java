package presentacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import dominio.*;

public class Interfaz  {
    
    private BandaMusica bd = new BandaMusica("Los reales");
    private Scanner sc = new Scanner(System.in);

   
        public Actuacion seleccionarActuacion() {

         for (int i = 0; i < bd.size(); i++) {
        System.out.println((i + 1) + ". " + bd.getActuacion(i));
         }
        System.out.println("Seleccione una actuación (número): ");
        int eleccion = sc.nextInt() - 1;
        sc.nextLine(); 

        if (eleccion >= 0 && eleccion < bd.size()) {
            return bd.getActuacion(eleccion);
        } else {
            System.out.println("Selección inválida");
            return null;
        }
}

        
        public Actuacion anadirActuacion() {
        
            System.out.println("Fecha de la Actuacion");

            System.out.print("Dia: ");
            int dia = sc.nextInt();
        
            System.out.print("Mes: ");
            int mes = sc.nextInt();
        
            System.out.print("Año: ");
            int ano = sc.nextInt();
        
            LocalDate fecha = LocalDate.of(ano, mes, dia);
        
            Actuacion t = new Actuacion(fecha);
            bd.annadirActuacion(t);
        
            return t;
        }

        public Director anadirDirector(){
            Actuacion actuacion = seleccionarActuacion();

            System.out.println("Escribe el nombre del Director");
            String nombre = sc.nextLine();

            Director d = new Director(nombre);
           actuacion.annadirParticipante(d);
            return d;
        }

        public MusicoSocio anadirMusicoS(){
            Actuacion actuacion = seleccionarActuacion();
            System.out.println("Escribe el nombre del MusicoSocio");
            String nombre = sc.nextLine();

            System.out.println("Escribe el instrumento del MusicoSocio");
            String instrumento = sc.nextLine();

            System.out.println("Escribe el nombre del MusicoSocio");
            int numeroSocio = sc.nextInt();

            MusicoSocio s = new MusicoSocio(nombre,instrumento,numeroSocio);
           actuacion.annadirParticipante(s);
            return s;
        }

         public MusicoRefuerzo anadirMusicoR(){
            Actuacion actuacion = seleccionarActuacion();
            System.out.println("Escribe el nombre del MusicoRefuerzo");
            String nombre = sc.nextLine();

            System.out.println("Escribe el instrumento del MusicoRefuerzo");
            String instrumento = sc.nextLine();

            System.out.println("Escribe el salario del MusicoRefuerzo");
            BigDecimal salario = sc.nextBigDecimal();

            MusicoRefuerzo r = new MusicoRefuerzo(nombre,instrumento,salario);
           actuacion.annadirParticipante(r);
            return r;
        }


        
        public  boolean procesarPeticion(String peticion){
           
            String[] p = peticion.trim().split("\\s+");

            if (p.length > 0) {
                if (p[0].equalsIgnoreCase("addMS")) {
                    anadirMusicoS();
                }else if(p[0].equalsIgnoreCase("addMR")){
                    anadirMusicoR();
                }else if(p[0].equalsIgnoreCase("addDir")){
                    anadirDirector();
                }else if (p[0].equalsIgnoreCase("addAct")) {
                    anadirActuacion();
                 }else if (p[0].equalsIgnoreCase("list")) {
                   mostrarActuacion();
                } else if (p[0].equalsIgnoreCase("help")) {
                    System.out.println("Introduzca una de las siguientes peticiones: \n Anadir Actuacion = addAct \n " + //
                            " Anadir Director = addDir  \n Añadir Musico Socio = addMS \n" + 
                            " Añadir Musico Refuerzo = addMR  \n Mostrar participantes = list \n salir de anadir participantes = exit ");
                } else if (p[0].equalsIgnoreCase("exit")) {
                    grabar();
                    return false;
                } else {
                    System.out.println("Peticion erronea");
                    
                }
            } else {
                System.out.println("Peticion erronea");
               
            }
            // Mostrar ayuda si hubo un error en la petición.
            System.out.println("Introduzca 'help' para obtener una lista de comandos validos.");
            return true;
        }

        public void mostrarActuacion(){
            bd.mostrarActuacion();
        }

        public Interfaz(){
            File f=new File("BandaMusica.txt");
            try {
                ObjectInputStream obj=new ObjectInputStream(new FileInputStream(f));
                bd =(BandaMusica)obj.readObject();
                obj.close();
            } catch (Exception e) {
                bd = new BandaMusica("Los reales");
            }
        }
        

        public String leerPeticion() {
            System.out.print("?>");
            String cadena = sc.nextLine();
            return cadena;
        }

        public void grabar(){
            File f = new File("BandaMusica.txt");
            try{
                ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f));
                obj.writeObject(bd);
                obj.close();
            
            }catch (Exception e){
                System.out.println("Error al grabar");
            }

        }



}
