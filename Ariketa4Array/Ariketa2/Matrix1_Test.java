package Ariketa4Array.Ariketa2;

import java.util.Scanner;

public class Matrix1_Test {
    public static void main(String[] args) {
        Matrix1 matrix = new Matrix1();
        matrix.loadByRows();
        matrix.display();
        if (matrix.swapRows(1, 2)){
            System.out.println("Operazioa ondo joan da.");
        }
        else{
            System.out.println("Operazioa ez da egin.");
        }
        matrix.display();
        if (matrix.swapColumns(1, 2)){
            System.out.println("Operazioa ondo joan da.");
        }
        else{
            System.out.println("Operazioa ez da egin.");
        }
        matrix.display();

        System.out.println("Ze 1. zenbaki nahi duzu?");
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        System.out.println("Ze 2. zenbaki nahi duzu?");
        int l2 = sc.nextInt();
        matrix.swapRows(l1,l2);
        matrix.display();

        matrix.swapColumns(l1,l2);
        matrix.display();

        matrix.negativos();



        Matrix1[] matrices = new Matrix1[4];
        for (int i = 0; i < matrices.length;i++){
            System.out.println("Sartu filak:");
            int fila = sc.nextInt();
            System.out.println("Sartu kolumnak:");
            int kol = sc.nextInt();
            matrices[i] = new Matrix1(fila,kol);
            matrices[i].display();
            if (kol >= 5){
                matrices[i].reverseRows();
                matrices[i].display();
            }
        }
    }}
