package Arrays;

//Find subarray with Max sum and print the max sum.
public class MaxSubarraySum {

    //Define a seperate array which stores the MaxSum at that position.
    //Use maxSum of previous element to calculate maxSum of current position
    public static int findMaxSubarraySum(int[] arr) {
        int[] maxArr = new int[arr.length];
        maxArr[0] = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            maxArr[i] = Math.max(arr[i], arr[i]+maxArr[i-1]);
            if(maxArr[i] > maxSum) maxSum = maxArr[i];
        }
        return maxSum;
    }
    
}
