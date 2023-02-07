package Ariketa1Array;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,7,2,3,9,10,4,6,8};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
