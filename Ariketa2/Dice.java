package Ariketa2;

public class Dice {
    public int number;
    public int tries;

    public Dice(){}
    public int getTries(){
        return tries;
    }
    public int play(){
        tries++;
        number = (int)(Math.random() * 6 + 1) ;
        return number;
    }
    public void show(){
        System.out.println("Dadoaren zenbakia: " + number);
        System.out.println("Intentoak: " + number);
    }
}
