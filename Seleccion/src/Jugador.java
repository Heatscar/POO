/**
 * Created by hectormtz on 7/10/16.
 */
public class Jugador extends Persona{
	private int numero;
	private String posicion;
	public int numero_camisa()
	{
		return this.numero;
	}
	public void numero_camisa(int numero_camisa)
	{
		this.numero = numero_camisa;
	}
	public String posicion()
	{
		return this.posicion;
	}
	public void posicion(String posicion)
	{
		this.posicion = posicion;
	}
	public String jugar()
	{
		return "Estoy Jugando";
	}
	public String entrenar()
	{
		return "Estoy Entrenando";
	}
}