/**
 * Created by hecto on 19/10/2016.
 */
public class Acuatico extends Vehiculo {
    public String tnav;

    public String getTnav() {
        return this.tnav;
    }
    public void setTnav(String kph) {
        this.tnav = tnav;
    }
    public String manejar() {
        return "Estoy navegando";
    }
    public String estacionar() {
        return "Estoy anclado";
    }
}
