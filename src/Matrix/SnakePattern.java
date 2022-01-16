package Matrix;

import java.util.Arrays;

public class SnakePattern {

    public static void printSnakePattern(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j]+ " ");
                }
            } else {
                for(int j = arr[i].length-1; j>= 0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
