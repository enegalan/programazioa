package Ariketak3Unitatea.Ariketa2;

public class SalariedEmployee extends Employee implements Payable {
    private double weeklysalary;
    public SalariedEmployee(double weeklysalary){
        this.weeklysalary = weeklysalary;
        if (this.weeklysalary < 0){
            this.weeklysalary = 0;
        }
    }
    @Override
    float earning() {
        return 0;
    }
    @Override
    public String toString(){
        return super.toString();
    }


    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
