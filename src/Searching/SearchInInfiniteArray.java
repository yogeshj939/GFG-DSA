package Searching;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        System.out.println(findPos(arr,12));
    }

    public static int findPos(int[] arr, int num) {
        if(arr[0] == num) return 0;
        int low = 0;
        int mid;
        int high = 1;
        while(arr[high] <= num){
            high = high*2;
            if(arr[high] == num) return high;
        }
        low = high/2;
        System.out.println(low+","+high);
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            } else if(arr[mid] < num){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }
}
