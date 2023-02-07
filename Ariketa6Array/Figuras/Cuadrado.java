package Ariketa6Array.Figuras;

public class Cuadrado extends Figura{
    private double lado;
    private static double totalArea;
    public Cuadrado(double lado){
        super();
        this.lado = lado;
        totalArea = getArea() + totalArea;
    }
}
