package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int naivePartition(int[] arr,int low,int high, int pivot){
        int[] temp = new int[high-low+1];
        int index = 0;
        for(int i = low; i <= high; i++){
            if(arr[i] < arr[pivot]) temp[index++] = arr[i];
        }
        for(int i = low; i <= high; i++){
            if(arr[i] == arr[pivot]) temp[index++] = arr[i];
        }
        int res = low + index - 1;
        for(int i = low; i <= high; i++){
            if(arr[i] > arr[pivot]) temp[index++] = arr[i];
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp[i-low];
        }
        System.out.println(Arrays.toString(arr));
        return res;
    }

    public static int lomutoPartition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j <= high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //{20,10,13,5,18,25,30,54}
    public static int hoarePartition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low-1, j = high+1;
        while (true){
            do{
                i++;
            }while (arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j) {
                return j;
            }
            swap(arr,i,j);
        }
    }

    public static void lomutoQuickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = lomutoPartition(arr,low,high);
            lomutoQuickSort(arr,low,pivot-1);
            lomutoQuickSort(arr,pivot+1,high);
        }
    }

    public static void hoareQuickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = hoarePartition(arr,low,high);
            hoareQuickSort(arr,low,pivot);
            hoareQuickSort(arr,pivot+1,high);
        }
    }
}
