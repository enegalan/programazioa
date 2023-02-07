package Ariketa3Array;

public abstract class Bird {
    private int age;
    private static int bird;
    private sex sexua;
    PersonalData names;
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
    public PersonalData getData(){
        return this.names;
    }
    public void setData(String namess){
        this.names.setBirdName(namess);
    }
    public void sing(){};

}
