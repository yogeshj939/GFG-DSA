package Sorting;

public class KthSmallestElement {

    //Using QuickSort partition function sort only the necessary part of the array.
    public static int findKthSmallestElement(int[] arr, int low, int high, int k){
        while(low <= high){
            int pivot = QuickSort.lomutoPartition(arr,low,high);
            if(pivot == k-1) return arr[pivot];
            else if(k-1 < pivot) high = pivot-1;
            else if(k-1 > pivot) low = pivot+1;
        }
        return -1;
    }
}
