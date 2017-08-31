import java.io.Serializable;
/**
 * Created by Jessica on 14/06/2016.
 */
public class Cuentas implements Serializable{
    public String Nombre1;
    public String ApePaterno;
    public String ApeMaterno;
    public int nCuenta;
    public float dinero;
    public int contraseñaNIP;

    public String getNombre1() {
        return Nombre1;
    }

    public void setNombre1(String nombre1) {
        Nombre1 = nombre1;
    }

    public String getApePaterno() {
        return ApePaterno;
    }

    public void setApePaterno(String apePaterno) {
        ApePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return ApeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        ApeMaterno = apeMaterno;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public int getContraseñaNIP() {
        return contraseñaNIP;
    }

    public void setContraseñaNIP(int contraseñaNIP) {
        this.contraseñaNIP = contraseñaNIP;
    }
}
