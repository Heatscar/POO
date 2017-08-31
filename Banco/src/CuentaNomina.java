/**
 * Created by hectormtz on 7/10/16.
 */
public class CuentaNomina extends CuentaBancaria {
    private String empresa = "";
    private int nip = 0;

    CuentaNomina(int var1) {
        super(var1);
    }
    public void depositar(double var1) {
        this.saldo += var1;
    }
    public void retirar(double var1) {
        this.saldo -= var1;
    }
    public void empresa(String var1) {
        this.empresa = var1;
    }
    public String empresa() {
        return this.empresa;
    }
    public void nip(int var1) {
        this.nip = var1;
    }
    public int nip() {
        return this.nip;
    }
}