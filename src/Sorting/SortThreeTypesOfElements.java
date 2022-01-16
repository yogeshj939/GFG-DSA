package Sorting;

public class SortThreeTypesOfElements {

    public static void sortOs1sAnd2s(int[] arr){
        int low = 0, high = arr.length-1;
        int i = low-1, j = high+1;
        while(true){
            do{
                i++;
            }while (arr[i] == 0);
            do{
                j--;
            }while (arr[j] != 0);
            if(i>=j) break;
            swap(arr,i,j);
        }
        //Now 0s are in place
        System.out.println("("+i+","+j+")");

        j = high+1;
        while(true){
            do{
                i++;
            }while (arr[i] == 1);
            do{
                j--;
            }while (arr[j] != 1);
            if (i>=j) break;
            swap(arr,i,j);
        }
        //Now 1s are in place

    }

    //Dutch national flag algorithm
    public static void sortOs1sAnd2sEfficient(int[] arr){
        int low = 0, high = arr.length-1, mid = low;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
