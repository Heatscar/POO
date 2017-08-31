import java.util.Scanner;
/**
 * Created by hecto on 26/10/2016.
 */
public class TestFiguras{
    static int opcion;
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        double l;
        double r;
        double iArista;
        double iVolumen;
        do{
            System.out.println("MENU");
            System.out.println("0.- SALIR");
            System.out.println("1.- Circulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Esfera");
            System.out.println("4.- Cubo");
            System.out.print("OPCION:");
            opcion = scanf.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Programa finalizado\n");
                    break;
                case 1:
                    System.out.println("Ingrese radio: ");
                    r = scanf.nextDouble();
                    Circulo circulo = new Circulo(r);
                    circulo.area();
                    System.out.println("Área del círculo: " + circulo.getAreaRadio());
                    break;
                case 2:
                    System.out.println("Ingrese lado: ");
                    l = scanf.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(l);
                    cuadrado.area();
                    System.out.println("Área del cuadrado: " + cuadrado.getareaCuadrado());
                    break;
                case 3:
                    System.out.print("Introduzca radio de la esfera: ");
                    r = scanf.nextDouble();
                    System.out.println("Volumen de la esfera de radio " + r + " = " + (4.0/3)* Math.PI * Math.pow(r,3));
                    break;
                case 4:
                    System.out.println("Introduce el valor de la arista del cubo");
                    iArista = scanf.nextDouble();
                    iVolumen = Math.pow(iArista, 3);
                    System.out.println("El volumen de un cubo con arista " + Double.toString(iArista) + " es de " + Double.toString(iVolumen));
                    break;}
        }while (opcion != 0);
    }
}

