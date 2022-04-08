package Searching;

public class SearchInSortedRotatedArray {
    public static void main(String[] args){
        int arr[] = {100,200,300,400,500,10,20,30,40,50,60};
        int low = 0;
        int high = arr.length-1;
        System.out.println(findPos(arr,20,low,high));
    }

    public static int findPos(int[] arr, int num, int low, int high) {
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            } else if(arr[mid] > arr[low]){
                if(num >= arr[low] && num < arr[mid]){
                    high = mid-1;
                } else{
                    low = mid+1;
                }
            } else{
                if(num > arr[mid] && num <= arr[high]){
                    low = mid+1;
                } else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
