import java.util.Scanner;
/**
 * Created by hecto on 25/11/2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        String nuevo;
        palindromo2 objclass=new palindromo2();
        System.out.println("Ingresa la palabra");
        nuevo = teclado.nextLine();
        if(objclass.espalindromo(nuevo)){
            System.out.println("Palindromo");
        }
        else{
            System.out.println("No Palindromo");
        }
    }
}
