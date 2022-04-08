package Hashing;

import java.util.HashSet;

public class SubArrayWithSum {

    public static boolean isSubArraySum0Naive(Integer[] arr){
        int curSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                curSum += arr[j];
                if(curSum == 0){
                    return true;
                }
            }
            curSum = 0;
        }
        return false;
    }

    public static boolean isSubArrayWith0Sum(Integer[] arr){
        int curSum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];
            if(set.contains(curSum) || curSum == 0){
                System.out.println(arr[i]);
                return true;
            }
            set.add(curSum);
        }
        return false;
    }

    public static boolean isSubarrayWithGivenSum(Integer[] arr, int sum){
        int prefixSum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(prefixSum == sum || set.contains(prefixSum-sum)){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}
