package Sorting;

public class SegregateTwoTypesOfElements {

    public static void segregateNegativeAndPositive(int[] arr){
        int low = 0, high = arr.length-1;
        int i = low-1;
        for(int j = low; j <= high; j++){
            if(arr[j]<0){
                i++;
                swap(arr,i,j);
            }
        }
    }

    public static void segregateEvenAndOdd(int[] arr){
        int low = 0, high = arr.length-1;
        int i = low-1;
        for(int j = low; j <= high; j++){
            if(arr[j]%2 == 0){
                i++;
                swap(arr,i,j);
            }
        }
    }

    public static void sortBinaryArray(int[] arr){
        int i = -1, j = arr.length;
        while(true){
            do{
                i++;
            }while (arr[i] == 0);
            do{
                j--;
            }while (arr[j] == 1);
            if(i>=j) return;
            swap(arr,i,j);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
