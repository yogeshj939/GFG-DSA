package Matrix;

public class BoundaryTraversal {

    public static void printBoundaryTraversal(int[][] arr){
        int row = arr[0].length;
        int col = arr.length;

        if(row == 1){
            for(int i = 0; i < col; i++){
                System.out.print(arr[0][i]+" ");
            }
        } else if(col == 0){
            for(int i = 0; i < row; i++){
                System.out.print(arr[i][0]+" ");
            }
        } else{
            for(int i = 0; i < col; i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i = 1; i < row; i++){
                System.out.print(arr[i][col-1]+" ");
            }
            for(int i = col-2; i >= 0; i--){
                System.out.print(arr[row-1][i]+" ");
            }
            for(int i = row-2; i > 0; i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}
