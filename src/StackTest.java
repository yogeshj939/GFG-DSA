import Stack.LargestRectangularAreaHistogram;
import Stack.NearestGreaterElement;
import Stack.NearestSmallestElement;
import Stack.StockSpanProblem;

import java.util.Arrays;

public class StackTest {

    public static void main(String[] args) {

        int[] arr1 = new int[]{60,10,20,40,35,38,50,70,65};

        int[] arr2 = new int[]{6,2,5,4,1,5,6};

        /*
        System.out.println(Arrays.toString(StockSpanProblem.findStockSpan(arr1)));

        System.out.println(Arrays.toString(NearestGreaterElement.findNearestPreviousGreater(arr1)));

        System.out.println(Arrays.toString(NearestGreaterElement.findNearestNextGreater(arr1)));
         */

        System.out.println(Arrays.toString(NearestSmallestElement.findNearestNextSmallest(arr1)));

        System.out.println(Arrays.toString(NearestSmallestElement.findNearestPreviousSmallest(arr1)));

        System.out.println(LargestRectangularAreaHistogram.findLargest(arr2));
    }
}
