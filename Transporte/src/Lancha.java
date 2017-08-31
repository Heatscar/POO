/**
 * Created by hecto on 19/10/2016.
 */
public class Lancha extends Acuatico implements Motorizado {
    public String tamaño;
    public String tea;

    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getTea() {
        return tea;
    }
    public void setTea(String tea) {
        this.tea = tea;
    }
    public void enscenderse() {
        System.out.println("Estoy en el mar");
    }
    public void apagarse() {
        System.out.println("Estoy Anclado");
    }
}
