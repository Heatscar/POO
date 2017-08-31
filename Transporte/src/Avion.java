/**
 * Created by hecto on 19/10/2016.
 */
public class Avion extends Aereo implements Motorizado {
    public String hrv;

    public String gethrv() {
        return this.hrv;
    }
    public void sethrv(String hrv) {
        this.hrv = hrv;
    }
    public void enscenderse() {
        System.out.println("Encendido");
    }
    public void apagarse() {
        System.out.println("Apagado");
    }
}