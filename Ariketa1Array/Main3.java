package Ariketa1Array;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        if(Arrays.equals(array1, array2)){
            System.out.println("Berdinak dira.");
        }
        else {
            System.out.println("Ez dira berdinak.");
        }
    }
}
