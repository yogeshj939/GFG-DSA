package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    //Sort the array and find the length of longest consecutive subsequence
    //Time Complexity : O(nlog(n))
    public static int findLongestConsecutiveSubSeqNaive(int[] arr){
        int longest = 1;
        Arrays.sort(arr);
        int max = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]+1) {
                max+=1;
                longest = Math.max(longest,max);
            } else {
                max = 1;
            }
        }
        return longest;
    }


    //Efficient approach using hashing
    //Time Complexity O(n)
    public static int findLongestConsecutiveSubSeq(Integer[] arr){
        HashSet<Integer> set = new HashSet(Arrays.asList(arr));

        int longest = 0;
        for(Integer ele:set){
            if(!set.contains(ele-1)){
                int curMax = 1;
                while(set.contains(ele+1)){
                    ele = ele+1;
                    curMax++;
                }
                longest = Math.max(longest,curMax);
            }
        }
        return longest;
    }
}
