package Searching;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {10,9,25,3,4,6,7,5};
        System.out.println(arr[getAPeak(arr)]);
    }

    /*
    The idea is based on the technique of Binary Search to check if the middle element is the peak element or not. 
    If the middle element is not the peak element, then check if the element on the right side is greater than the middle element then there is always a peak element on the right side. 
    If the element on the left side is greater than the middle element then there is always a peak element on the left side.
    */
    public static int getAPeak(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length-1 || arr[mid] >= arr[mid+1])){
                return mid;
            }
            if(mid > 0 && arr[mid-1] > arr[mid]){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return -1;
    }
}
