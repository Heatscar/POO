/**
 * Created by hecto on 19/10/2016.
 */
public class Terrestre extends Vehiculo {
    public String kph;

    public String getKph() {
        return this.kph;
    }
    public void setKph(String kph) {
        this.kph = kph;
    }
    public String manejar() {
        return "Estoy manejando";
    }
    public String estacionar() {
        return "Estoy estacionandome";
    }
}