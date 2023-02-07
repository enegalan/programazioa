package Ariketak3Unitatea.Ariketa2;

public class HourlyEmployee extends Employee implements Payable{
    private int wagehour;
    private int hours;
    public HourlyEmployee(int wagehour, int hours){
        this.wagehour = wagehour;
        this.hours = hours;
        if (this.wagehour < 0 ){
            this.wagehour = 0;
        }
        if(this.hours < 0) {
            this.hours = hours;
        }
        }
    @Override
    float earning(){
        if (hours > 40){
            return (float)(this.wagehour * 1.5);
        }
        return (float)wagehour;
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
