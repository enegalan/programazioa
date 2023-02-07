package Ariketak3Unitatea.Ariketa2;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable{
    private float baseSalary;
    public BasePlusCommissionEmployee(int grosssales, int commissionrate, float basesalary){
        super(grosssales, commissionrate);
        this.baseSalary = basesalary;
        if (basesalary < 0){
            this.baseSalary = 0;
        }
    }

    @Override
    float earning(){
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
