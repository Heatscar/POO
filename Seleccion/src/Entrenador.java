/**
 * Created by hectormtz on 7/10/16.
 */
public class Entrenador extends Persona{
    private String historial;
    private int experiencia;
    private String especialidad;

    public String historial() 
    {
        return this.historial;
    }
    public void historial(String historial) 
    {
        this.historial = historial;
    }
    public int anios_experiencia() 
    {
        return this.experiencia;
    }
    public void anios_experiencia(int anios_experiencia) 
    {
        this.experiencia = anios_experiencia;
    }
    public String especialidad() 
    {
        return this.especialidad;
    }
    public void especialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }
    public String dirigirEntrenamiento() 
    {
        return "Dirigiendo El Entrenamiento";
    }
    public String dirigirPartido() 
    {
        return "Dirigiendo El Partido";
    }
}