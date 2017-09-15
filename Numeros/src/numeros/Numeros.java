/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//primos, amigos, perfectos y calcular la sumatoria de los primeron N

package numeros;
import java.util.Scanner;
/**
 *
 * @author heatscar
 */
public class Numeros {
    /**
     * @param args the command line arguments
     */
    static int opcion;
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner in = new Scanner(System.in);
        Scanner scanf = new Scanner(System.in);
        
        
        do{
            System.out.println("MENU");
            System.out.println("0.- SALIR");
            System.out.println("1.- Primos");
            System.out.println("2.- Amigos");
            System.out.println("3.- Perfectos");
            System.out.println("4.- Sumatoria");
            System.out.print("OPCION:");
            opcion = scanf.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Programa finalizado\n");
                    break;
                case 1:
                    System.out.println("Ingrese numero");
                    int x = scanf.nextInt();
                    boolean result = Primos.det(x);
                    System.out.println("Es:" + result); 
                    break;
                case 2:
                    int numero1, numero2;
                    System.out.print("Introduzca el primer número: ");
                    numero1 = scanf.nextInt();
                    System.out.print("Introduzca el segundo número: ");
                    numero2 = scanf.nextInt();
                    Amigos amigos = new Amigos(numero1, numero2);
                    if(amigos.sonAmigos()) {
                        System.out.println("Los números "+numero1+" y "+numero2+" si son amigos.");
                    } else {
                        System.out.println("Los números "+numero1+" y "+numero2+" no son amigos.");
                    }
                    break;
                case 3:
                    int n;
                    System.out.println("Introduce un número: ");
                    n = scanf.nextInt();
                    if (Perfectos.Perfecto(n)) {
                        System.out.println("Perfecto");
                    } 
                    else {
                        System.out.println("No es perfecto");
                    }
                    break;
                case 4:
                    int sum=0;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("ingrese un numero");
                    int Num=sc.nextInt(); 
                    for(int i=0;i<=Num;i++){
                        sum=sum+i;
                    }
                    System.out.println(sum);
                    break;}
        }
        while (opcion != 0);
    }    
}
