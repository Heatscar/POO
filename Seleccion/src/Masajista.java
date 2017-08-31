/**
 * Created by hectormtz on 7/10/16.
 */
public class Masajista extends Persona{
	private String especialidad;
	public String especialidad()
	{
		return this.especialidad;
	}
	public void especialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}
	public String dar_masaje()
	{
		return "Doy Masaje";
	}
}