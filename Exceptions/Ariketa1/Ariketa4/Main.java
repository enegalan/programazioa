package Exceptions.Ariketa1.Ariketa4;

public class Main {


    public static void main(String[] args) throws FractionException {

        try {
            Fracción fracción1 = new Fracción(1,2);
            Fracción fracción2 = new Fracción(0,3);
            Fracción fracción3=new Fracción(12,6);
            System.out.println("Suma: "+fracción1.sumar(fracción3));
            System.out.println("Resta: "+fracción1.restar(fracción2));
            System.out.println("División: "+fracción1.dividir(fracción2));
            System.out.println("Multiplicación: "+fracción1.multiplicar(fracción3));

        }
        catch (FractionException e){
            System.out.println(e.getMessage());
        }
    }
}
