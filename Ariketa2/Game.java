package Ariketa2;
public class Game {
    public static void main(String[] args){
        //StringContainer test1 = new StringContainer("Hallo World");
        //StringContainer test2 = new StringContainer("Hello World");

        //if (test1.isEqualTo(test2)){
        //    System.out.println("Bi kate berdinak dira");
        //}
        //else{
        //    System.out.println("Bi kate ezberdinak dira");
        //}
        //test1.shiftLeft(3);
        //test1.shiftRight(4);
        //test1.Rotate(2,'R');
        //test1.encoding(3);
        //System.out.println("Kate kodifikatua: "+ test1.codificar(3));
        //StringContainer string1 = new StringContainer("aa bb ccc");
        //StringContainer string2 = new StringContainer("xx yyy");
        //test1.mixWords(string1, string2);
        Dice dado1 = new Dice();
        Dice dado2 = new Dice();

        Player player1 = new Player("Eneko", dado1);
        Player player2 = new Player("Bittor", dado2);
        player1.dice.play();
        player2.dice.play();
        double p1_dice = 0;
        double p2_dice = 0;
        int p1_second = 0;
        int p2_second = 0;
        for (int i = 1;i<=6;i++){
            player1.Try();
            player2.Try();

            p1_dice = player1.getDiceValue() + p1_dice;
            p2_dice = player2.getDiceValue() + p2_dice;

            player1.show();
            player2.show();
            if (player1.getDiceValue() == 6){

                p1_second++;
            }
            if (player2.getDiceValue() == 6){

                p2_second++;
            }
        }

        if (p1_dice > p2_dice){
            System.out.println("Lehen jokalaria irabazi du!");
        }else {
            System.out.println("Bigarren jokalaria irabazi du!");
        }
        if(p1_second > p2_second){
            System.out.println("Bigarren saria lehen jokalariarentzat da");
        }
        else{
            System.out.println("Bigarren saria bigarren jokalariarentzat da");

        }

        player2.showTotalPlayers();

    }
}
