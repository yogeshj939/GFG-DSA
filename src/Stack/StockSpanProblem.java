package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanProblem {

    public static int[] findStockSpan(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[arr.length];
        ans[0] = 1;
        stack.push(0);

        for(int i = 1; i < arr.length; i++){

            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? i+1 : i - stack.peek();
            stack.push(i);
        }

        return ans;
    }
}
