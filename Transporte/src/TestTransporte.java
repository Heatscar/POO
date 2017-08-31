import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Created by hecto on 19/10/2016.
 */
public class TestTransporte {
    public static ArrayList<Vehiculo> vehiculos = new ArrayList();
    public static void main(String[] args) {
        Automovil a = new Automovil();
        Bicicleta b = new Bicicleta();
        Avion i = new Avion();
        Planeador p = new Planeador();
        Ferry f = new Ferry();
        Lancha l = new Lancha();
        boolean opcion = false;
        Scanner lector = new Scanner(System.in);
        int opcion1;
        label67:
        do{
            System.out.println("SELECION");
            System.out.println("Opcion: ");
            System.out.println("0. Salir");
            System.out.println("1. Auto");
            System.out.println("2. Bicicleta");
            System.out.println("3. Avion");
            System.out.println("4. Planeador");
            System.out.println("5. Ferry");
            System.out.println("6. Lancha");
            System.out.println("7. Mostrar bicicleta");
            System.out.println("8. Mostrar automovil");
            System.out.println("9. Mostrar avion");
            System.out.println("10. Mostrar Ferry");
            System.out.println("11. Mostrar lancha");
            System.out.println("12. Mostrar planeador");
            opcion1 = lector.nextInt();
            Iterator var7;
            Vehiculo v;
            switch(opcion1) {
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1:
                    System.out.println("kilometraje: ");
                    a.setKilometraje(lector.next());
                    System.out.println("luces : ");
                    a.setLuces(lector.next());
                    System.out.println("K/H: ");
                    a.setKph(lector.next());
                    System.out.println("Capacidad: ");
                    a.setCapacidaddegas(lector.next());
                    vehiculos.add(a);
                    break;
                case 2:
                    System.out.println("kilometraje: ");
                    b.setKilometraje(lector.next());
                    System.out.println("luces: ");
                    b.setLuces(lector.next());
                    System.out.println("K/H: ");
                    b.setKph(lector.next());
                    System.out.println("intermitentes: ");
                    b.setIntermitentes(lector.next());
                    vehiculos.add(b);
                    break;
                case 3:
                    System.out.println("kilometraje: ");
                    i.setKilometraje(lector.next());
                    System.out.println("luces: ");
                    i.setLuces(lector.next());
                    System.out.println("Millas por horaa: ");
                    i.setMph(lector.next());
                    System.out.println("Horas de vuelo: ");
                    i.sethrv(lector.next());
                    vehiculos.add(i);
                    break;
                case 4:
                    System.out.println("kilometraje: ");
                    p.setKilometraje(lector.next());
                    System.out.println("Luces: ");
                    p.setLuces(lector.next());
                    System.out.println("M/H: ");
                    p.setMph(lector.next());
                    System.out.println("planear: ");
                    p.setplanear(lector.next());
                    vehiculos.add(p);
                    break;
                case 5:
                    System.out.println("Tamaño: ");
                    f.settamaño(lector.next());
                    System.out.println("Luces : ");
                    f.setLuces(lector.next());
                    vehiculos.add(f);
                    break;
                case 6:
                    System.out.println("Kilometraje: ");
                    l.setKilometraje(lector.next());
                    System.out.println("luces : ");
                    l.setLuces(lector.next());
                    System.out.println("Tamaño: ");
                    l.setTamaño(lector.next());
                    vehiculos.add(l);
                    break;
                case 7:
                    var7 = vehiculos.iterator();
                    while(true) {
                        if(!var7.hasNext()) {
                            continue label67;}
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Bicicleta) {
                            System.out.println("intermitentes: " + ((Bicicleta)v).getIntermitentes());
                            System.out.println("K/H: " + ((Terrestre)v).getKph());
                            b.agarrarVuelo();
                            System.out.println(((Terrestre)v).manejar());
                            System.out.println(((Terrestre)v).estacionar());
                        }
                        System.out.println("");
                    }
                case 8:
                    var7 = vehiculos.iterator();
                    while(var7.hasNext()) {
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Automovil) {
                            System.out.println("Capacidad: " + ((Automovil)v).getCapacidaddegas());
                            a.enscenderse();
                            System.out.println("K/H: " + ((Terrestre)v).getKph());
                            System.out.println(((Terrestre)v).manejar());
                            System.out.println(((Terrestre)v).estacionar());
                            a.apagarse();}
                    }
                    System.out.println("");
                    break;
                case 9:
                    var7 = vehiculos.iterator();
                    while(true) {
                        if(!var7.hasNext()) {
                            continue label67;}
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Avion) {
                            i.enscenderse();
                            System.out.println("Horas de vuelo: " + ((Avion)v).gethrv());
                            System.out.println("M/H: " + ((Aereo)v).getMph());
                            System.out.println(((Aereo)v).despegar());
                            System.out.println(((Aereo)v).volar());
                            System.out.println(((Aereo)v).aterrizar());
                            i.apagarse();}
                        System.out.println("");
                    }
                case 10:
                    var7 = vehiculos.iterator();
                    while(var7.hasNext()) {
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Ferry) {
                            System.out.println("Tamaño: " + ((Ferry)v).gettamaño());
                            System.out.println(((Acuatico)v).manejar());
                            System.out.println(((Acuatico)v).estacionar());}
                    }
                    System.out.println("");
                    break;
                case 11:
                    var7 = vehiculos.iterator();
                    while(var7.hasNext()) {
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Lancha) {
                            System.out.println("Tamaño: " + ((Lancha)v).getTamaño());
                            System.out.println(((Acuatico)v).manejar());
                            System.out.println(((Acuatico)v).estacionar());
                        }
                    }
                    System.out.println("");
                    break;
                case 12:
                    for(var7 = vehiculos.iterator(); var7.hasNext(); System.out.println("")) {
                        v = (Vehiculo)var7.next();
                        System.out.println("kilometraje: " + v.getKilometraje());
                        System.out.println("luces : " + v.getLuces());
                        if(v instanceof Planeador){
                            p.agarrarVuelo();
                            System.out.println(((Aereo)v).despegar());
                            System.out.println(((Aereo)v).volar());
                            System.out.println("M/H: " + ((Aereo)v).getMph());
                            System.out.println("Planeando: " + ((Planeador)v).getplanear());
                            System.out.println(((Aereo)v).aterrizar());
                            p.bajarse();}
                    }
            }
        } while(opcion1 != 0);
    }
}