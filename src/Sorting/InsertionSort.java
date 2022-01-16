package Sorting;

public class InsertionSort {

    //My Initial thought code
    public int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int correctIndex = i;
            if(arr[i] < arr[i-1]){
                int temp = arr[i];
                for(int j = 0; j < i; j++){
                    if(arr[i] < arr[j]){
                        correctIndex = j;
                        break;
                    }
                }
                for(int k = i; k > correctIndex; k--){
                    arr[k] = arr[k-1];
                }
                arr[correctIndex] = temp;
            }
        }
        return arr;
    }

    //GFG code
    public int[] insertionSortBetterLookingCode(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }
}
