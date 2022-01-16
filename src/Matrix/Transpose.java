package Matrix;

public class Transpose {

    //Auxilary Space O(1)
    public static void transposeMatrix(int[][] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
