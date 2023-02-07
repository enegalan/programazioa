package Ariketak3Unitatea.Ariketa4;

public class Start {
       public static void main(String[] args){
           Tweety tweety1 = new Tweety(2, 1.2, Bird.sex.F,34);
           Tweety tweety2 = new Tweety(5, 4.2, Bird.sex.M,12);
           Tweety tweety3 = new Tweety(8, 2.1, Bird.sex.F,54);
           tweety1.whoAmI();
           tweety2.whoAmI();
           tweety3.whoAmI();
           tweety1.setData("AAA");
           Parrot parrot1 = new Parrot(5, Bird.sex.F, Parrot.region.W,"red");
           parrot1.sing();
           tweety1.sing();
           tweety2.sing();
           tweety3.sing();
       }

}
