package Ariketa6Array.Figuras;

public class Rectangulo extends Figura {
    private double lado1;
    private double lado2;
    private static double totalArea;
    public Rectangulo(double lado1, double lado2){
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        totalArea = getArea() + totalArea;

    }

}
