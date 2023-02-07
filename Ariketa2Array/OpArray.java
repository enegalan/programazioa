package Ariketa2Array;

import java.util.Arrays;
import java.util.Scanner;

public class OpArray {
    int[] array;
    public OpArray(int zenb){
        this.array = new int[zenb];
    }
    public void cargaArray(){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(n != 0){
            System.out.println("Sartu zenbakia: ");
            n = sc.nextInt();
            int index = 0;
            this.array[index] = n;
            index++;
        }
    }
    public void mostrar(){
        System.out.println(Arrays.toString(this.array));
    }
    public void reemplazo(int num){
        Scanner sc = new Scanner(System.in);
        int kont = 0;
        for (int i = 0; i < this.array.length;i++){
            if (this.array[i] == num){
                System.out.println("Zein zenbakirekin ordezkatu nahi duzu?");
                int z = sc.nextInt();
                this.array[i] = num;
                kont++;
            }
        }
        System.out.println(kont + "zenbaki ordezkatu dira.");
    }
    @Override
    public String toString(){
        String text = "";
        for (int i = 0; i < array.length;i++){
            text = array[i] + text;
        }
        return text;
    }
    public int indexPrime(){
        for (int i = 0; i < array.length;i++){
            if(array[i] % 3 != 0 && array[i] % 2 != 0){
                return array[i];
            }
        }
        return 0;
    }
    public boolean isIndexPrime(int index){
        if(array[index] % 2 != 0 && array[index] % 3 != 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        OpArray array1 = new OpArray(5);
        OpArray array2 = new OpArray(5);
        array1.cargaArray();
        array1.toString();
    }

}
