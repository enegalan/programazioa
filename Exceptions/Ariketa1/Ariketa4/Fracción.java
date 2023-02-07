package Exceptions.Ariketa1.Ariketa4;

public class Fracción {
    private int numerador;
    private int denominador;

    public Fracción(int num, int den) throws FractionException {
        numerador = num;
        if (den == 0){
            throw new FractionException("No se puede crear una instancia de una fracción con denominador 0");
        }
        else {
            denominador = den;
        }

    }
    @Override
    public String toString(){

        return numerador + "/" + denominador;
    }
    public Fracción sumar(Fracción f) throws FractionException{
        try {
            int n_den = denominador * f.denominador;
            int n_num1 = (n_den * numerador) / denominador;
            int n_num2 = (n_den * f.numerador) / f.denominador;
            int n_num = n_num1 + n_num2;
            Fracción res1 = new Fracción(n_num,n_den);
            Fracción res = simplificar(res1);
            return res;
        } catch (ArithmeticException e) {
            throw new FractionException("Esta operación da como resultado una fracción no válida");
        }

    }
    public Fracción restar(Fracción f) throws FractionException{
        int n_den = denominador * f.denominador;
        try {
            int n_num1 = (n_den * numerador) / denominador;
            int n_num2 = (n_den * f.numerador) / f.denominador;
            int n_num = n_num1 - n_num2;
            Fracción res1 = new Fracción(n_num,n_den);
            Fracción res = simplificar(res1);
            return res;
        }
        catch (ArithmeticException e){
            throw new FractionException("Error matematico");
        }

    }
    public Fracción dividir(Fracción f) throws FractionException {
        int n_num = numerador * f.denominador;
        int n_den = denominador * f.numerador;

        if (n_den == 0){
            throw new FractionException("Error: Denominador es igual a 0");
        }
        else{
            Fracción res1 = new Fracción(n_num,n_den);
            Fracción res = simplificar(res1);
            return res;
        }

    }
    public Fracción multiplicar(Fracción f) throws FractionException {
        int n_num = numerador * f.numerador;
        int n_den = denominador * f.denominador;
        Fracción res1 = new Fracción(n_num,n_den);
        Fracción res = simplificar(res1);
        if (n_den == 0){
            throw new FractionException("Error: Denominador es igual a 0");
        }
        return res;
    }
    public Fracción simplificar(Fracción f) throws FractionException {
        try{
            int numerator = f.numerador;
            int denominator = f.denominador;
            int gcd = 1;
            for (int i = 2; i <= numerator && i <= denominator; i++) {
                if (numerator % i == 0 && denominator % i == 0) {
                    gcd = i;
                }
            }
            numerator /= gcd;
            denominator /= gcd;
            Fracción res = new Fracción(numerator, denominator);

            return res;
        }
        catch (ArithmeticException e){
            throw new FractionException("Error matemático.");
        }
    }
}
