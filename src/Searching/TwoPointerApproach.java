package Searching;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8,9,11,12,20,30};
        findPair(arr,0,arr.length-1,21);
        findTriplet(arr,50);
        findPythagoreanTriplet(arr);
    }

    //Find a pair with sum equal to the given number
    public static boolean findPair(int[] arr,int low,int high, int x) {
        while(low!=high){
            if((arr[low]+arr[high]) == x){
                int[] ans = {arr[low], arr[high]};
                System.out.print("Pair : ("+arr[low]+","+arr[high]);
                return true;
            }
            else if((arr[low]+arr[high]) < x) low++;
            else if((arr[low]+arr[high]) > x) high--;
        }
        return false;
    }

    //Find if there is triplet with given sum
    public static void findTriplet(int[] arr, int x) {
        for(int i = 0; i < arr.length-1; i++){
            if(findPair(arr,i+1,arr.length-1,x-arr[i])){
                System.out.println(","+arr[i]+")");
                return;
            }               
        }
        System.out.println("No triplet with given sum");
    }

    //Find if there is a triplet such that a^2 + b^2 = c^2;
    public static boolean findPythagoreanTriplet(int arr[]) {
        System.out.println("Triplet : (");
        for(int i = arr.length-1; i > 0 ; i--){
            System.out.println(arr[i]);
            if(isPairForPythoreanTriplet(arr,0,i-1,(int)Math.pow(arr[i], 2))){
                System.out.println(","+arr[i]);
                return true;
            }
        }
        return false;
    }

    public static boolean isPairForPythoreanTriplet(int arr[], int low, int high, double x) {
        while(low != high){
            System.out.println(Math.pow(arr[low], 2)+","+Math.pow(arr[high], 2)+","+x);
            if((Math.pow(arr[low], 2) + Math.pow(arr[high], 2)) == x){
                System.out.println(arr[low]+","+arr[high]+")");
                return true;
            } else if((Math.pow(arr[low], 2) + Math.pow(arr[high], 2)) > x){
                high--;
            } else{
                low++;
            }
        }
        return false;
    }
}
