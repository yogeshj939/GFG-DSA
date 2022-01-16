package Matrix;

import java.util.Arrays;

public class MedianInRowWiseSortedMatrix {

    //Assumption:
    // - odd number of elements
    // - unique elements
    public static int findMedian(int[][] mat){
        int r = mat.length;
        int c = mat[0].length, midPos = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < r; i++){
            min = Math.min(min,mat[i][0]);
            max = Math.max(max,mat[i][c-1]);
        }
        int medianPos = (r*c + 1)/2;
        while (min <= max){
            int mid = (min+max)/2;
            for(int i = 0; i < r; i++){
                int pos = Arrays.binarySearch(mat[i],mid)+1;
                midPos += Math.abs(pos);
            }
            if(midPos < medianPos)
                min = mid+1;
            else
                max = mid;
        }
        return min;
    }
}
