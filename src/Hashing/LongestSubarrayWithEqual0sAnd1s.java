package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithEqual0sAnd1s {

    public static int findLongestSubarrayWithEqual0sAnd1sNaive(int[] arr){
        int longest = 0;
        for(int i = 0; i < arr.length; i++){
            int count0 = 0;
            int count1 = 0;
            for(int j = i; j < arr.length; j++){
                count0 += arr[j] == 0? 1:0;
                count1 += arr[j] == 1? 1:0;

                if(count0 == count1){
                    longest = Math.max(longest,count0+count1);
                }
            }

        }
        return longest;
    }

    public static int findLongestSubarrayWithEqual0sAnd1s(int[] arr){

        //Replace 0s with 1s
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) arr[i] = -1;
        }
        System.out.println(Arrays.toString(arr));
        //Now Apply longest subarray with given sum and provide sum as 0
        return LongestSubarrrayWithGivenSum.findLongestSubarrayWithGivenSum(arr,0);
    }
}
