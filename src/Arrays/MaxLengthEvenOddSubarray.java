package Arrays;

public class MaxLengthEvenOddSubarray {

    public static int findMaxLengthEvenOddSubarray(int[] arr) {
        int maxLength = 1;
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if((arr[i]+arr[i-1])%2 == 1){
                count++;
                if(count > maxLength){
                    maxLength = count;
                }
            } else{
                count = 1;
            }
            
        }
        return maxLength;
    }
}
