package Arrays;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-5,-3};
        System.out.println("MaxCircularSum = "+findMaxCircularSubarraySum(arr));
    }

    public static int findMaxCircularSubarraySum(int[] arr){
        int n = arr.length, max_sum = arr[0], min_sum = arr[0], sum = arr[0];
        int[] max_arr = new int[n];
        int[] min_arr = new int[n];
        max_arr[0] = arr[0];
        min_arr[0] = arr[0];
        for(int i = 1; i < n; i++){
            max_arr[i] = Math.max(arr[i], arr[i]+max_arr[i-1]);
            if(max_arr[i] > max_sum){
                max_sum = max_arr[i];
            }
            sum+=arr[i];
            printArray(max_arr);
        }
        if(max_sum < 0){
            return max_sum;
        }
        for(int i = 1; i < n; i++){
            min_arr[i] = Math.min(arr[i], arr[i]+min_arr[i-1]);
            if(min_arr[i] < min_sum){
                min_sum = min_arr[i];
            }
            printArray(min_arr);
        }
        max_sum = Math.max(max_sum, sum-min_sum);
        return max_sum;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}
