/**
 * Created by hecto on 19/10/2016.
 */
public class Ferry extends Acuatico implements Motorizado {
    public String tamaño;

    public String gettamaño() {
        return this.tamaño;
    }
    public void settamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void enscenderse() {
        System.out.println("Estoy en el mar");
    }
    public void apagarse() {
        System.out.println("Estoy Anclado");
    }
}
