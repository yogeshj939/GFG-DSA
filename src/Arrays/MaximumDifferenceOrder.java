package Arrays;

public class MaximumDifferenceOrder{
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        findMaxDifferenceRightGreater(arr);
    }

    public static void findMaxDifferenceRightGreater(int[] arr) {
        int res = arr[1]-arr[0], minVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            res = Math.max(res, arr[i]-minVal);
            minVal = Math.min(arr[i], minVal);
        }
        System.out.println(res);
    }
}