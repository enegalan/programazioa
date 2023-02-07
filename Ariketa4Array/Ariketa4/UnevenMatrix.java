package Ariketa4Array.Ariketa4;

import java.util.Random;

public class UnevenMatrix {
    private Float[][] nums;

    public UnevenMatrix(){
           this.nums= new Float[4][];
    }
    public void loadRow(Float[] row, int pos){
        this.nums[pos] = row;
    }
    public void displayRow(int pos){
        for (int i = 0; i < nums[pos].length;i++){
            System.out.print(nums[pos][i]);
        }
    }
    public void displayMatrix(){
        for (int i = 0; i < nums.length;i++){
            for (int j = 0; j < nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
