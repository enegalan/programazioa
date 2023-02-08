package Ejercicios1Secuencias.Ariketa3;

public class Empleado {
    private String nombre;



    private double salario;


    private TeléfonoMovil tel;
    public Empleado(String nombre, double salario, TeléfonoMovil tel){
        this.nombre = nombre;
        this.salario = salario;
        this.tel = tel;
    }

    public void trabajo(){
        this.salario = this.salario + 10;
        this.tel.llamada(15);
    }
    public void trabajo(int g, int m){
        this.salario = this.salario + g;
        this.tel.llamada(m);
    }
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    public TeléfonoMovil getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", tel=" + tel +
                '}';
    }
}
