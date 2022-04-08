package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangularAreaHistogram {

    public static int findLargest(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;

        int[] prevSmallest = NearestSmallestElement.findNearestPreviousSmallest(arr);
        int[] nextSmallest = NearestSmallestElement.findNearestNextSmallest(arr);

        int res = 0;
        for(int i = 0; i < n; i++){

            int curr = arr[i];
            curr += (i-prevSmallest[i]-1)*arr[i];
            curr += (nextSmallest[i]-i-1)*arr[i];

            System.out.println(i+","+curr+", prev "+prevSmallest[i]+", next "+nextSmallest[i] );
            res = Math.max(res,curr);
        }
        return res;
    }
}
