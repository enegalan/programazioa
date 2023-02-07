package Ariketak3Unitatea.aAriketa3;

public class Tweety extends Canary{
    private int movies;
    public Tweety(int age, double size, sex sex2, int movies) {
        super(age, size, sex2);
        this.movies = movies;
    }

    public static void main(String[] args){
        Tweety tweety1 = new Tweety(2, 1.5, sex.F, 5);
        Parrot parrot1 = new Parrot(5, sex.M, Parrot.region.W, "gorria");
        tweety1.whoAmI();
        parrot1.whoAmI();
        tweety1.height();
        parrot1.whereAreYouFrom();

        tweety1.setSize(3);
        tweety1.height();

        parrot1.setRegion(Parrot.region.N);


        System.out.println("Txori instantziak: " + parrot1.getBirds());
    }
}
