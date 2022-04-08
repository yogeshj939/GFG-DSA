package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] revArr = reverseArray(arr);
        for(int number: revArr){
            System.out.println(number);
        }
    }

    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int i = 0, j =n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++; j--;
        }
        return arr;
    }
}
