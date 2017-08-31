/**
 * Created by hecto on 26/10/2016.
 */
public class Cuadrado implements FiguraGeometrica{
    private double lado;
    private double areaCuadrado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getareaCuadrado(){
        return areaCuadrado;
    }
    @Override
    public void area(){
        areaCuadrado = Math.pow(lado,2);
    }
}

