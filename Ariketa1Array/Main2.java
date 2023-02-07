package Ariketa1Array;
import java.util.Arrays;
public class Main2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Arrays.fill(array1, 10);
        int[] array2 = Arrays.copyOf(array1,array1.length);
        System.out.println(Arrays.toString(array2));
    }
}
