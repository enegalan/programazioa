package Ariketak3Unitatea.Ariketa2;

public class CommissionEmployee extends Employee {
    private float grosssales;
    private float commissionrate;
    public CommissionEmployee(float grosssales, float commissionrate){
        this.grosssales = grosssales;
        this.commissionrate = commissionrate;

        if (this.commissionrate < 0){
            this.commissionrate = 0;
        }
        if(this.commissionrate < 0 && this.commissionrate > 0){
            this.commissionrate = 0;
        }

    }

    @Override
    float earning(){
        return this.commissionrate * grosssales;
    }
    @Override
    public String toString(){
        return super.toString();
    }

}
