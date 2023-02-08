package Ejercicios1Secuencias.Ariketa3;

public class TeléfonoMovil {


    private String num;



    private double credito;
    public TeléfonoMovil(String num, double credito){
        this.num = num;
        this.credito = credito;
    }

    public void recarga(int s){
        this.credito += s;
    }
    public void llamada(int minutos){
        if (this.credito > 0){
            this.credito -= 2 * minutos;

        }else{
            System.out.println("No se puede restar crédito! El crédito está en negativo.");
        }

    }
    public String getNum() {
        return num;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "TeléfonoMovil{" +
                "num='" + num + '\'' +
                ", credito=" + credito +
                '}';
    }
}
