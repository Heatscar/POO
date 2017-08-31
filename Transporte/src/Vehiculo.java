/**
 * Created by hecto on 19/10/2016.
 */
public class Vehiculo {
    public String luces;
    public String kilometraje;

    public String getKilometraje() {
        return this.kilometraje;
    }
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
    public String getLuces() {
        return this.luces;
    }
    public void setLuces(String luces) {
        this.luces = luces;
    }
    public String avanzar() {
        return "Estoy avanzando";
    }
}

