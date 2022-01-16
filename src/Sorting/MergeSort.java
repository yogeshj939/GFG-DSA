package Sorting;

public class MergeSort {

    public int[] mergeTwoSortedArrays(int arr1[],int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int[] finalArr = new int[m+n];
        int i = 0, j= 0,k=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]) finalArr[k++] = arr1[i++];
            else finalArr[k++] = arr2[j++];
        }
        while(i < m){
            finalArr[k++]=arr1[i++];
        }
        while(j < n){
            finalArr[k++]=arr2[j++];
        }
        return finalArr;
    }

    public void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1, n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    //Time complexity = Theta(n*log(n))
    //Space complexity = Theta(n)
    public void mergeSort(int[] arr, int left, int right){
        if(right > left){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

}
