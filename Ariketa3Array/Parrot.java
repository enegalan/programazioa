package Ariketa3Array;

public class Parrot extends Bird {
    private region region;
    private String color;
    public enum region{
        N,S,E,W
    }
    public Parrot(int age, sex sex3, region region1, String color1) {
        super(age, sex3);
        this.region = region1;
        this.color = color1;
    }
    public void setRegion(region region1){
        this.region = region1;
    }
    public void whereAreYouFrom(){
        switch (this.region){
            case N:
                System.out.println("North");
                break;
            case S:
                System.out.println("South");
                break;
            case E:
                System.out.println("East");
                break;
            case W:
                System.out.println("Weast");
                break;
        }
    }
    @Override
    public void sing(){ // DUDAS
        System.out.println("My name is: " + this.getData() + ". Pio-pio cute parrot");
    }
}
