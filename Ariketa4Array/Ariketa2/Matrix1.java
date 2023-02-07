package Ariketa4Array.Ariketa2;

import java.util.Scanner;

public class Matrix1 {
    private int[][] matriz;
    private static int NR = 10; // capacidad física máx
    private static int NC = 2; // Tamaño matriz

    public Matrix1(){
        this.matriz = new int[NC][NC];
    }
    public Matrix1(int filas, int columnas){
        this.matriz = new int[filas][columnas];
    }
    public void loadByRows(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length;i++){

            for (int j = 0; j < matriz[i].length;j++){
                System.out.println("Sartu matrizaren zenbakiak: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public void loadByColumns(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[i].length;j++){
                System.out.println("Sartu matrizaren zenbakiak: ");
                matriz[j][i] =  sc.nextInt();
            }
        }
    }
    public void display(){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void reverseRows(){
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length/2;j++){
                int temp = matriz[i][j];
                matriz[i][j] = matriz[i][matriz[i].length - 1 - j];
                matriz[i][matriz[i].length - 1 - j] = temp;
            }
        }
    }
    public boolean swapRows(int fila1, int fila2){
        if(fila1<=matriz.length && fila2<=matriz.length) {
            int[] temp = matriz[fila1-1];
            matriz[fila1-1] = matriz[fila2-1];
            matriz[fila2-1] = temp;
            return true;
        }
        return false;
    }
    public boolean swapColumns(int columna1, int columna2){
        if(columna1>=1 && columna2>=1 && columna1<=matriz[0].length && columna2<=matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                int temp = matriz[i][columna1-1];
                matriz[i][columna1-1] = matriz[i][columna2-1];
                matriz[i][columna2-1] = temp;
            }
            return true;
        }
        return false;
    }
    public int[] greatestAvgRow(){
        int[] maxRow = new int[matriz.length];
        double maxAvg = 0;
        for (int i = 0; i < matriz.length;i++){
            double sum = 0;
            for (int j = 0; j<matriz[i].length;j++){
                sum = matriz[i][j] + sum;
            }
            double avg = sum / matriz[i].length;
            if (avg > maxAvg){
                maxAvg = avg;
                maxRow = matriz[i];
            }
        }
        return maxRow;
    }
    public int[] negativos() {
        int countNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    countNegativos++;
                }
            }
        }
        int[] negativos = new int[countNegativos];
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    negativos[index] = matriz[i][j];
                    index++;
                }
            }
        }
        return negativos;
    }
}
