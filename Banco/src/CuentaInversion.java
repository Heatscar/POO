/**
 * Created by hectormtz on 7/10/16.
 */
public class CuentaInversion extends CuentaBancaria {
    private int interes = 0;
    private int Plazo = 0;

    CuentaInversion(int var1) {
        super(var1);
    }
    public double interes() {
        return 0.0D;
    }
    public double estimar() {
        return 0.0D;
    }
    public void interes(int var1) {
        this.interes = var1;
    }
    public void Plazo(int var1) {
        this.Plazo = var1;
    }
}
