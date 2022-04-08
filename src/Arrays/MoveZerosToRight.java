package Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int arr[] = {10,20,0,0,30,25,0,5,0,7};
        moveZerosToRight(arr);
        for(int number:arr){
            System.out.print(number+",");
        }
    }

    public static void moveZerosToRight(int arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                swap(arr,i,count);
                count++;
            }
        }
    }

    public static void swap(int[] arr,int i,int count){
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }
}
