import java.util.Date;
/**
 * Created by hectormtz on 7/10/16.
 */
public abstract class Persona{
    protected String nombre;
    protected Date nacimiento;
    protected float estatura;
    protected float peso;
    protected String domicilio;
    protected String telefono;
    public String nombre()
    {
        return this.nombre;
    }
    public void nombre(String nombre)
    {
        this.nombre = nombre;
    }
    public Date fecha_nacimiento()
    {
        return this.nacimiento;
    }
    public void fecha_nacimiento(Date fecha_nacimiento)
    {
        this.nacimiento = fecha_nacimiento;
    }
    public float estatura()
    {
        return this.estatura;
    }
    public void estatura(float estatura)
    {
        this.estatura = estatura;
    }
    public float peso()
    {
        return peso;
    }
    public void peso(float peso)
    {
        this.peso = peso;
    }
    public String domicilio()
    {
        return this.domicilio;
    }
    public void domicilio(String domicilio)
    {
        this.domicilio = domicilio;
    }
    public String telefono()
    {
        return this.telefono;
    }
    public void telefono(String telefono)
    {
        this.telefono = telefono;
    }
    public String concentrarse() 
    {
        return "Estoy concentrandome";
    }
    public String viajar(){
        return "Estoy viajando";
    }
}