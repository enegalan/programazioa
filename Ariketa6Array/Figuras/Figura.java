package Ariketa6Array.Figuras;

public abstract class Figura {
    private double area;
    private double perimetro;
    private static double totalArea;
    public Figura(){}

    public double getArea(){return this.area;}
    public double getPerimetro(){return this.perimetro;}

    public void addToArea(double area){
        totalArea = area;
    }

}
