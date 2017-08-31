import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by Jessica on 02/06/2016.
 */
public class Main {
    public static ArrayList<Cuentas> nueva=new ArrayList<Cuentas>();

    public static void main(String[] args) {
        try{
            FileInputStream File=new FileInputStream("XDXD.txt");
            ObjectInputStream Object=new ObjectInputStream(File);
            nueva=(ArrayList<Cuentas>)Object.readObject();

        }
        catch (Exception A){
            System.out.print("");
        }
        Banco baquito = new Banco();
    }
}
