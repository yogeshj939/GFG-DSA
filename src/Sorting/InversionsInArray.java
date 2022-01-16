package Sorting;

import java.util.Arrays;

public class InversionsInArray {

    public static int countInversions(int[] arr, int low, int high){
        int res = 0;
        if(high > low){
            int mid = low + (high-low)/2;
            res += countInversions(arr,low,mid);
            res += countInversions(arr,mid+1,high);
            res += countAndMerge(arr,low,mid,high);
        }
        return res;
    }

    public static int countAndMerge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < n1; i++){
            left[i] = arr[low+i];
        }
        for(int i = 0; i < n2; i++){
            right[i] = arr[mid+i+1];
        }
        int res = 0, i = 0, j = 0, k = low;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                res += n1-i;
            }
        }
        while(i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
        return res;
    }
}
