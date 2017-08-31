import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Created by hecto on 19/10/2016.
 */
public class TestBanco{
    public static void CuentaBancaria(CuentaBancaria scann) throws ParseException {
        Scanner var1 = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese Nombre");
        scann.nombre(var1.next());
        System.out.println("Ingrese Contraseña");
        scann.clave(var1.next());
        System.out.println("Ingrese telefono");
        scann.telefono(var1.next());
        System.out.println("Ingrese saldo");
        scann.saldo((double) var1.nextInt());
        System.out.println("Ingrese fecha de alta (dd/MM/yyyy)");
        try{
            scann.fechaAlta(date.parse(var1.next()));
        } catch (ParseException cuenta){
            System.out.println(cuenta);
        }
    }
    public static void main(String[] scann) throws ParseException {
        int menu = 0;
        Scanner scanf = new Scanner(System.in);
        CuentaBancaria cuenta = null;
        ArrayList list = new ArrayList();
        do {
            System.out.println("MENU");
            System.out.println("0.- SALIR");
            System.out.println("1.- Nomina");
            System.out.println("2.- Inversion");
            System.out.println("3.- Cuentas");
            System.out.println("4.- Acceder");
            System.out.println("");
            System.out.print("OPCION: ");
            menu = scanf.nextInt();
            label65:
            switch (menu) {
                case 0:
                    System.out.println("Programa finalizado\n");
                    break;
                case 1:
                    CuentaNomina nomi = new CuentaNomina(menu++);
                    CuentaBancaria(nomi);
                    System.out.println("Ingrese Empresa");
                    nomi.empresa(scanf.next());
                    System.out.println("Ingrese NIP");
                    nomi.nip(scanf.nextInt());
                    list.add(nomi);
                    break;
                case 2:
                    CuentaInversion inver = new CuentaInversion(menu++);
                    CuentaBancaria(inver);
                    System.out.println("Ingrese Interes");
                    inver.interes(scanf.nextInt());
                    System.out.println("Ingrese Dias de Plazo");
                    inver.Plazo(scanf.nextInt());
                    list.add(inver);
                    break;
                case 3:
                    System.out.println("Cuentas: ");
                    System.out.println("");
                    Iterator var12 = list.iterator();
                    while (true){
                        if (!var12.hasNext()){
                            break label65;}
                        CuentaBancaria cbanc = (CuentaBancaria) var12.next();
                        System.out.println("Nº Cuenta: " + cbanc.cuenta());
                        System.out.println("Nombre:" + cbanc.nombre());
                    }
                case 4:
                    System.out.println("Ingrese Numero De Cuenta: ");
                    try {
                        cuenta = (CuentaBancaria) list.get(scanf.nextInt());
                        System.out.println("Ingrese Contraseña: ");
                        String var8 = scanf.next();
                        if (cuenta.clave().equals(var8)){
                            System.out.println("Contraseña Correcta ");
                        } else{
                            System.out.println("Contraseña InCorrecta ");
                            cuenta = null;}
                    } catch (Exception var10){
                        System.out.println("Cuenta incorrecta ");}
            }
            if (cuenta instanceof CuentaNomina) {
                System.out.println("Bienvenido: " + cuenta.nombre());
                System.out.println("¿Que desea hacer?");
                System.out.println("1.- Depositar");
                System.out.println("2.- Retirar");
                System.out.println("3.- Regresar");
                System.out.println("Opcion:");
                menu = scanf.nextInt();
                if (menu != 3){
                    System.out.println("Ingrese el NIP");
                    if (scanf.nextInt() != ((CuentaNomina) cuenta).nip()){
                        System.out.println("");
                        System.out.println("NIP InCorrecto");
                        System.out.println("");
                        continue;}
                }
                switch (menu){
                    case 1:
                        System.out.println("Saldo Actual: " + cuenta.saldo() + " Ingrese cantidad a Depositar");
                        ((CuentaNomina) cuenta).depositar((double) scanf.nextInt());
                        System.out.println("Nuevo Saldo: " + cuenta.saldo());
                        break;
                    case 2:
                        System.out.println("Saldo Actual: " + cuenta.saldo() + " Ingrese cantidad a Retirar");
                        int retiro = scanf.nextInt();
                        if ((double) retiro <= cuenta.saldo() && retiro > 0){
                            ((CuentaNomina) cuenta).retirar((double) retiro);
                            System.out.println("Nuevo Saldo: " + cuenta.saldo());
                        } else{
                            System.out.println("Cantidad Invalida: " + cuenta.saldo());
                        }
                        break;
                    case 3:
                        cuenta = null;
                }
            } else if (cuenta instanceof CuentaInversion) {
                System.out.println("Bienvenido: " + cuenta.nombre());
                cuenta = null;
                continue;
            }
            System.out.println("");
        }while (menu != 0);
    }
}