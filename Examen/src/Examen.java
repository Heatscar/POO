/**
 * Created by hectormtz on 6/10/16.
 */
public class Examen{
    public static String calificacion(int result){
        switch (result){
            case 10:
                return "A";
            case 9:
                return "B";
            case 8:
                return "C";
            case 7:
                return "D";
            case 6:
                return "E";
            default:
                return "F";}
    }
    public static String siguiente(int d, int m, int a){
        if(d < 31)
            d++;
        else{
            d = 1;
            m++;}
        if(m > 12){
            m = 1;
            a++;}
        return d + "/" + m + "/" + a;}
    public static int potencia(int n, int p){
        int aux = n;
        for (int i=1; i<p; i++)
            n*= aux;
        return n;}
}
