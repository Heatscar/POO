import java.util.Scanner;
/**
 * Created by hectormtz on 6/10/16.
 */
public class TestExamen {
        static int opcion;
        public static void main(String[] args){
            Scanner scanf = new Scanner(System.in);
            int d;
            int m;
            int a;
            do{
                System.out.println("MENU");
                System.out.println("0.- SALIR");
                System.out.println("1.- Nota");
                System.out.println("2.- Dia Siguiente");
                System.out.println("3.- Potencia");
                System.out.print("OPCION:");
                opcion = scanf.nextInt();
                switch(opcion){
                    case 0:
                        System.out.println("Programa finalizado\n");
                        break;
                    case 1:
                        System.out.println("Ingrese Califcacion: ");
                        d = scanf.nextInt();
                        System.out.println(Examen.calificacion(d));
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Ingrese dia/mes/año");
                        d = scanf.nextInt();
                        m = scanf.nextInt();
                        a = scanf.nextInt();
                        System.out.println(Examen.siguiente(d, m, a));
                        break;
                    case 3:
                        System.out.println("Numero/Potencia: ");
                        d = scanf.nextInt();
                        m = scanf.nextInt();
                        System.out.println(Examen.potencia(d, m));
                        break;}
            }while (opcion != 0);
        }
    }