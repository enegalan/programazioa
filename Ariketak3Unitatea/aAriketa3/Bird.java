package Ariketak3Unitatea.aAriketa3;

public class Bird {
    private int age;
    private static int bird;
    private sex sexua;
    public enum sex{
        M, F
    }
    public Bird(int age, sex sex1){
        this.sexua = sex1;
        this.age = age;
        this.bird++;
    }
    public int getBirds(){
        return bird;
    }

    public void whoAmI(){
        System.out.println("Adina: " + this.age);
        System.out.println("Sexua: " + this.sexua);
    }

}
