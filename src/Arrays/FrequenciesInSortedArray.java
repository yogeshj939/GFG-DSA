package Arrays;

public class FrequenciesInSortedArray{

    public static void findFrequenciesInSortedArray(int[] arr){
        int ele = arr[0];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=ele){
                ele = arr[i];
                System.out.println(arr[i-1]+","+count);
                count = 0;
            }
            count++;
        }
        System.out.println(arr[arr.length-1]+","+count);
    }
}