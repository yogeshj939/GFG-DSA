package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class NearestSmallestElement {

    //Finds element smallest than current element nearest towards left part of the array.
    public static int[] findNearestPreviousSmallest(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[arr.length];

        ans[0] = -1;
        stack.push(0);

        for(int i = 1; i < arr.length; i++){
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            //pushing n-index as there is no smallest element to left
            ans[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);
        }

        return ans;
    }

    //Finds element smallest than current element nearest towards right part of the array.
    public static int[] findNearestNextSmallest(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        int[] ans = new int[n];
        stack.push(n-1);
        ans[n-1] = n;

        for(int i = n-2; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            //pushing n-index as there is no smallest element to right.
            ans[i] = stack.isEmpty()? n : stack.peek();
            stack.push(i);
        }

        return ans;
    }
}
