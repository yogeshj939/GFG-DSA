package Searching;

public class CountOnesInSortedBinary {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(countOnes(arr));
    }

    public static int countOnes(int[] arr) {
        int low = 0;
        int high = arr.length;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == 0){
                low = mid+1;
            } else{
                if(mid == 0 || arr[mid-1] == 0){
                    return arr.length - mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
    
}
