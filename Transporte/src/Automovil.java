/**
 * Created by hecto on 19/10/2016.
 */
public class Automovil extends Terrestre implements Motorizado {
    public String capacidaddegas;

    public String getCapacidaddegas() {
        return this.capacidaddegas;
    }
    public void setCapacidaddegas(String capacidaddegas) {
        this.capacidaddegas = capacidaddegas;
    }
    public void enscenderse() {
        System.out.println("El carro se esta enscendiendo");
    }
    public void apagarse() {
        System.out.println("El carro se esta apagando");
    }
}
