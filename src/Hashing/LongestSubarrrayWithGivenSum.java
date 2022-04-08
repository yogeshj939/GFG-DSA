package Hashing;

import java.util.HashMap;

public class LongestSubarrrayWithGivenSum {

    public static int findLongestSubarrayWithGivenSum(int[] arr, int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        int curSum = 0;
        int longest = -1;
        for(int i = 0; i < arr.length;i++){
            curSum += arr[i];
            if(curSum == sum){
                longest = i+1;
            }
            if(!map.containsKey(curSum)){
                map.put(curSum,i);
            }
            if(map.containsKey(curSum - sum)){
                longest = Math.max(longest, i - map.get(curSum-sum));
            }

        }
        System.out.println(map.toString());
        return longest;
    }
}
