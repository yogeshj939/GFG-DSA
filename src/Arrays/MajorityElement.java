package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {6,8,4,8,8};
        System.out.println(findMajorityElement(arr));
    }

    //Moore's voting algorithm to find Majority Element
    public static int findMajorityElement(int[] arr){
        int n = arr.length;
        int res = 0;
        int count = 1;

        //This Part is to find the eligible candidate
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[res]){
                count+=1;
            } else{
                count-=1;
            }
            if(count == 0){
                res = i;
                count = 1;
            }
        }

        //This part is to check if eligible candidate is majority element.
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[res]){
                count+=1;
            }
        }
        if(count <= n/2){
            return -1;
        }

        return arr[res];
    }
}
