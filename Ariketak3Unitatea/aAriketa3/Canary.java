package Ariketak3Unitatea.aAriketa3;

public class Canary extends Bird {
    private int age;
    private double size;

    public Canary(int age, double size, sex sex2){
        super(age, sex2);
        this.size = size;
    }
    public Canary(int age,sex sex2){
        super(age, sex2);
    }

    public void setSize(double size){
        this.size = size;
    }
    public void height(){
        if(size > 30){
            System.out.println("High");
        }
        if(size >= 15 && size <= 30){
            System.out.println("Middle");
        }
        else{
            System.out.println("Little");
        }
    }
}
