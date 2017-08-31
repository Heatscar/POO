/**
 * Created by hecto on 26/10/2016.
 */
public class Circulo implements FiguraGeometrica{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;
    public Circulo(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getAreaRadio(){
        return areaRadio;
    }
    @Override
    public void area(){
        areaRadio = pi * Math.pow(radio,2);
    }
}
