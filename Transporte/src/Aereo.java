/**
 * Created by hecto on 19/10/2016.
 */
public class Aereo extends Vehiculo {
    public String mph;

    public String getMph() {
        return this.mph;
    }
    public void setMph(String mph) {
        this.mph = mph;
    }
    public String despegar() {
        return "Estoy despegando";
    }
    public String volar() {
        return " ";
    }
    public String aterrizar() {
        return "Estoy aterrizando";
    }
}
