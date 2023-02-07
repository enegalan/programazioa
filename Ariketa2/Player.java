package Ariketa2;

public class Player {
    public String name;
    public Dice dice;
    public static int totalplayers = 0;

    public Player(String izena, Dice dado) {
        totalplayers++;
        this.name = izena;
        this.dice = dado;
    }

    public void Try() {
         this.dice.play();
    }

    public double getDiceValue() {
        return dice.number;
    }

    public void show() {
        System.out.println("Jokalariaren izena:" + this.name);
        System.out.println("Dadoaren zenbakia:" + getDiceValue());
        System.out.println("------------------------");
    }

    public void showTotalPlayers() {
        System.out.println("Jokalari kopuru totala: " + totalplayers);
    }
}
