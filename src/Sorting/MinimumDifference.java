package Sorting;

import java.util.Arrays;

public class MinimumDifference {

    public static int minDiffInArray(int[] arr){
        int n = arr.length;
        int i = 1;
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while(i<n){
            res = Math.min(res,arr[i] - arr[i-1]);
            i++;
        }
        return res;
    }
}
