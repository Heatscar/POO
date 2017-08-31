import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Created by hectormtz on 7/10/16.
 */
public class Main {
    public static void persona(Persona p) throws ParseException {
        Scanner scanf = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String s_date;
        System.out.println("Nombre: ");
        p.nombre(scanf.next());
        System.out.println("Domicilio: ");
        p.domicilio(scanf.next());
        System.out.println("Telefono: ");
        p.telefono(scanf.next());
        System.out.println("Estatura: ");
        p.estatura(scanf.nextFloat());
        System.out.println("Peso: ");
        p.peso(scanf.nextFloat());
        System.out.println("Fecha de Nacimiento: formato(dd/M/yyyy)");
        s_date = scanf.next();
        try{
            p.fecha_nacimiento(sdf.parse(s_date));}
        catch(ParseException pe){
            System.out.println(pe);
            p.fecha_nacimiento(sdf.parse("0/0/0"));}
    }
    public static void main(String[] args) throws ParseException{
        int menu = 0;
        Scanner scanf = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<Persona>();
        do{
            System.out.println("MENU");
            System.out.println("0.- SALIR");
            System.out.println("1.- Agregar Jugador");
            System.out.println("2.- Agregar Masajista");
            System.out.println("3.- Agregar Entrenador");
            System.out.println("4.- Mostrar Personas");
            System.out.print("\nOPCION: ");
            menu = scanf.nextInt();
            switch(menu){
                case 0:
                    System.out.println("Programa finalizado\n");
                    break;
                case 1:
                    Jugador j = new Jugador();
                    persona(j);
                    System.out.println("Numero De Camisa: ");
                    j.numero_camisa(scanf.nextInt());
                    System.out.println("Posicion: ");
                    j.posicion(scanf.next());
                    personas.add(j);
                    break;
                case 2:
                    Masajista m = new Masajista();
                    persona(m);
                    System.out.println("Especialidad: ");
                    m.especialidad(scanf.next());
                    personas.add(m);
                    break;
                case 3:
                    Entrenador e = new Entrenador();
                    persona(e);
                    System.out.println("Historial: ");
                    e.historial(scanf.next());
                    System.out.println("Especialidad: ");
                    e.especialidad(scanf.next());
                    System.out.println("Años de experiencia: ");
                    e.anios_experiencia(scanf.nextInt());
                    personas.add(e);
                    break;
                case 4:
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
                    for(Persona persona: personas){
                        System.out.println("Nombre: " + persona.nombre());
                        System.out.println("Domcilio: " + persona.domicilio());
                        System.out.println("Telefono: " + persona.telefono());
                        System.out.println("Fecha de nacimiento: " + sdf.format(persona.fecha_nacimiento()));
                        System.out.println("Estatura: " + persona.estatura());
                        System.out.println("Peso: " + persona.peso());
                        System.out.println(persona.concentrarse());
                        System.out.println(persona.viajar());
                        if(persona instanceof Entrenador){
                            System.out.println("Historial: " + ((Entrenador)persona).historial());
                            System.out.println("Experiencia: " + ((Entrenador)persona).anios_experiencia());
                            System.out.println("Especialidad: " + ((Entrenador)persona).especialidad());
                            System.out.println("Entrenamiento: " + ((Entrenador)persona).dirigirEntrenamiento());
                            System.out.println("Partido: " + ((Entrenador)persona).dirigirPartido());}
                        if(persona instanceof Jugador){
                            System.out.println("Numero: " + ((Jugador)persona).numero_camisa());
                            System.out.println("Posicion: " + ((Jugador)persona).posicion());
                            System.out.println("Jugar: " + ((Jugador)persona).jugar());
                            System.out.println("Entrenar: " + ((Jugador)persona).entrenar());}
                        if(persona instanceof Masajista){
                            System.out.println("Especialidad: " + ((Masajista)persona).especialidad());
                            System.out.println("Dar Masaje: " + ((Masajista)persona).dar_masaje());}
                        System.out.println("");
                    }
                    break;}
        } while (menu != 0);
    }
}