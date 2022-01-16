package Matrix;

import java.util.Arrays;

public class MatrixRotation {

    //Naive. Time Complexity : Theta(n^2), Space Complexity : Theta(n^2)  { n is number of rows/column }
    public static void rotateAntiClockwiseNaive(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] temp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                temp[i][j] = arr[j][n-i-1];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = temp[i][j];
            }
        }
    }

    //Efficient. Time Complexity : Theta(n^2), Space Complexity : Theta(1)
    public static void rotateAntiClockwiseEfficient(int[][] arr){
        int n = arr.length;

        //Transpose
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

//        System.out.println("Transpose Matrix");
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//        System.out.println();

        //Reverse columns
        for (int i = 0; i < n; i++) {
            int low = 0, high = n-1;
            while (low < high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            }
        }
    }
}
