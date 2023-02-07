package Ariketa4Array.Ariketa4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UnevenMatrix um1 = new UnevenMatrix();
        Float[] matriz = new Float[]{1f,3f,9f,27f,729f};
        um1.loadRow(matriz,0);

        Float[] matriz2 = new Float[5];
        for (int i = 0; i < matriz2.length; i++){
            matriz2[i] = (float) Math.floor(Math.random()*35+14);
            um1.loadRow(matriz2,1);
        }

        Float[] matriz3 = new Float[7];
        int gradua = 0;
        for (int i = 0; i < matriz3.length; i++){
            matriz3[i] = (float) Math.cos(gradua);
            gradua+=45;
        }
        um1.loadRow(matriz3,2);

        Float[] lehenak = new Float[20];
        int kont = 2;
        boolean primo = false;
        int num = 1;
        int aux = 0;
        while(primo == false && kont != num){
            if (num % kont == 0){
                primo = true;
                lehenak[aux] = (float)num;
                kont++;
            }
            aux++;
        }
        um1.displayMatrix();



    }
}
