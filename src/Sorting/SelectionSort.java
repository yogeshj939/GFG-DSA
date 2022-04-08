package Sorting;

public class SelectionSort {

    public int[] selectionSortNaive(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int minIndex = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }
        return temp;
    }

    public int[] selectionSortSpaceOptimized(int[] arr){
        int n = arr.length;
        int minIndex = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
