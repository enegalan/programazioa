package Ariketa1Array;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sartu zenbat ikasle dituen klaseak:");
        int ikasleak = sc.nextInt();
        double total = 0;
        double[] notak = new double[ikasleak];
        for (int i = 0; i < ikasleak; i++){
            System.out.println("Sartu ikasle " + i + "en nota:");
            double nota = sc.nextDouble();
            notak[i] = nota;
            total = notak[i] + total;

        }
        double bb = total/ikasleak;
        System.out.println("Klasearen nota batazbestekoa: " + bb);
        for (int i = 0;i<ikasleak;i++){
            if(notak[i] >= bb){
                System.out.println(i + ". ikaslearen nota batazbestekoa baino handiagoa da.");
            }
        }
    }
}
