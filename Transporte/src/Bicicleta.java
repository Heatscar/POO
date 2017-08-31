/**
 * Created by hecto on 19/10/2016.
 */
public class Bicicleta extends Terrestre implements NoMotorizado {
    public String intermitentes;

    public String getIntermitentes() {
        return this.intermitentes;
    }
    public void setIntermitentes(String intermitentes) {
        this.intermitentes = intermitentes;
    }
    public void agarrarVuelo() {
        System.out.println("Avanzando");
    }
    public void bajarse() {
        System.out.println("Detenido");
    }
}
