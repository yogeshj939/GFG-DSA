package Hashing;

import java.util.HashMap;

public class LongestCommonSpanWithSameSum {

    public static int findLongestCommonSpanWithSameSumNaive(int[] arr1,int[] arr2){
        int longest = 0;

        for(int i = 0; i < arr1.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = i; j < arr1.length; j++){
                sum1 += arr1[j];
                sum2 += arr2[j];
                if(sum1 == sum2){
                    longest = Math.max(longest,j-i+1);
                }
            }
        }
        return longest;
    }

    public static int findLongestCommonSpanWithSameSum(int[] arr1,int[] arr2){
        int[] temp = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            temp[i] = arr1[i] - arr2[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int longest = 0;
        int curSum = 0;
        for(int i = 0; i < temp.length; i++){
            curSum += temp[i];
            if(curSum == 0){
                longest = Math.max(longest,i+1);
                map.put(curSum,i);
            }else if(map.containsKey(curSum)){
                longest = Math.max(longest,i-map.get(curSum));
            } else {
                map.put(curSum,i);
            }
        }
        return longest;
    }
}
