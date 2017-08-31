/**
 * Created by hecto on 19/10/2016.
 */
public class Planeador extends Aereo implements NoMotorizado {
    public String planear;

    public String getplanear() {
        return this.planear;
    }
    public void setplanear(String planear) {
        this.planear = planear;
    }
    public void agarrarVuelo() {
        System.out.println("Despegando");
    }
    public void bajarse() {
        System.out.println("Aterrizando");
    }
}

