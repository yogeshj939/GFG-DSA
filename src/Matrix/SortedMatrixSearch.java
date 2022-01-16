package Matrix;

public class SortedMatrixSearch {

    //Matrix is Sorted row-wise and column-wise
    public static void findElement(int[][] mat, int target){
        int n = mat.length;
        int i = 0, j = n-1;
        while((i < n && i >=0) && j < n){
            if(mat[i][j] == target){
                System.out.println(target+" found at mat["+i+"]["+j+"]");
                return;
            }else if(target < mat[i][j]){
                j--;
            } else {
                i++;
            }
        }
        System.out.println(target+" not found");
    }
}
