import Matrix.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixTest {

    private static int[][] arr = {  {1,2,3,4,5},
                                    {6,7,8,9,10},
                                    {11,12,13,14,15},
                                    {16,17,18,19,20},
                                    {21,22,23,24,25}};

    private static int[][] oneDimArray = {{1,2,3,4,5}};

    public static void main(String[] args) {
        /*
        SnakePattern.printSnakePattern(arr);

        BoundaryTraversal.printBoundaryTraversal(arr);

        Transpose.transposeMatrix(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        MatrixRotation.rotateAntiClockwiseNaive(arr);
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        MatrixRotation.rotateAntiClockwiseEfficient(arr);
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        SpiralMatrix.printSpiralMatrix(arr);

         */

        SortedMatrixSearch.findElement(arr,18);


    }
}
