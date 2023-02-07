package Ariketak5Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu n zenbakia: ");
        int n = sc.nextInt();

        int kont = 1;
        for (int i = 0; i <= 10; i++){
            if (n % kont == 0){
                arrayList.add(kont);
            }
            kont++;
        }

        show(arrayList);
        System.out.println();
        arrayList.removeAll(arrayList);

        aleatorio(arrayList);
        show(arrayList);
        System.out.println();

        arrayList.removeAll(arrayList);

       int cont = 0;
       while (cont != 20){
           int r = (int) (Math.random() * (20- - 20) - 20);
           if (!arrayList.contains(r)){
               arrayList.add(cont,r);
               cont++;
           }
       }
        show(arrayList);
    }
    public static void show(List<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
    public static void aleatorio(List<Integer> arrayList){
        for (int i = 0; i <= 20; i++){
            arrayList.add(i, (int) (Math.random() * (100- - 100) - 100));
        }
    }
}
