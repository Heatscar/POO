import java.util.Date;
/**
 * Created by hectormtz on 7/10/16.
 */
public abstract class CuentaBancaria {
    private String nombre = "";
    private int cuenta;
    private String clave;
    private Date fecha;
    private String telefono;
    protected double saldo;

    CuentaBancaria(int var1) {
        this.cuenta = var1;
        this.clave = "";
        this.fecha = new Date();
        this.telefono = "";
        this.saldo = 0.0D;
    }
    public void nombre(String var1) {
        this.nombre = var1;
    }
    public String nombre() {
        return this.nombre;
    }
    public void cuenta(int var1) {
        this.cuenta = var1;
    }
    public int cuenta() {
        return this.cuenta;
    }
    public void clave(String var1) {
        this.clave = var1;
    }
    public String clave() {
        return this.clave;
    }
    public void fechaAlta(Date var1) {
        this.fecha = var1;
    }
    public Date fecha() {
        return this.fecha;
    }
    public void telefono(String var1) {
        this.telefono = var1;
    }
    public String telefono() {
        return this.telefono;
    }
    public double saldo() {
        return this.saldo;
    }
    public void saldo(double var1) {
        this.saldo = var1;
    }
}

