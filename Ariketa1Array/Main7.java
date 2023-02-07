package Ariketa1Array;

public class Main7 {
    public static void main(String[] args) {
        int[] vectores1 = new int[]{12,56,135,123466,123,73,24,3,67438,124,64,3,38};
        int[] vectores2 = new int[vectores1.length];
        int index = 0;
        for (int i = 0; i < vectores1.length;i++){
            if (vectores1[i] % 2 == 0 && vectores1[i] > 25){

                vectores2[index] = vectores1[i];
                index++;
            }
        }
        for (int i = 0; i< vectores2.length;i++){
            System.out.println(vectores2[i]);
        }
    }
}
