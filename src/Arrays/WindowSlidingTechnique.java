package Arrays;

public class WindowSlidingTechnique {
    public static void main(String[] args) {
        int[] arr = {44,4,20,3,10,5};
        System.out.println(isSubSum(arr, 33));
        nBonacci(10, 3);
    }

    //Given unsorted array of non-negative integers. Find if there is subarray with given sum.
    public static boolean isSubSum(int[] arr, int sum){
        int n = arr.length;
        int start = 0;
        int curr_sum = arr[0];
        for(int i = 1; i < n; i++){
            if(curr_sum == sum){
                return true;
            }
            if(i < n){
                curr_sum += arr[i];
            }
            while(curr_sum > sum && start < i-1){
                curr_sum -= arr[start];
                start++;
            }
        }
        return (curr_sum == sum);
    }

    //Print First M N-bonacci number (current nummber is sum of previous n numbers)
    public static void nBonacci(int n, int m){
        int[] arr = new int[n];
        arr[m-1] = 1;
        arr[m] = 1;
        int sum = 1;
        for(int i = m+1; i < n; i++){
            sum = sum + arr[i-1] - arr[i-m-1];
            arr[i] = sum;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Print the count of distinct elements in every window of size k
    public static void countOfDistinctInEveryEveryWindow() {
        //TODO when studying hashset
    }
}
