package Arrays;

public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,0,1,0,1,1};
        findMinimumConsecutiveFlips(arr);
    }

    public static void findMinimumConsecutiveFlips(int[] arr){
        int count0 = 0;
        int count1 = 0;
        if(arr[0] == 0){
            count0 = 1;
        } else{
            count1 = 1;
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0 && arr[i-1]!=0){
                count0 += 1;
            }
            if(arr[i] == 1 && arr[i-1]!=1){
                count1 += 1;
            }
        }
//        if(count0>)
    }
}
