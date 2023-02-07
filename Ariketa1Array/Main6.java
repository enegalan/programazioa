package Ariketa1Array;

public class Main6 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        int par = 0;
        for (int i = 0;i< pares.length;i++){
            par = par + 2;
            pares[i] = par;
            System.out.println(pares[i]);
        }

    }
}
