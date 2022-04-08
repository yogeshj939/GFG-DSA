package Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        //Equilibrium point
        int[] arr = {3,4,8,-9,20,6};
        System.out.println(findEquilibriumPoint(arr));

        //maximum appearing element in given ranges
        int[] l = {1,2,3,4,5};
        int[] r = {3,7,7,10,7};
        System.out.println(findMAxAppearingElement(l, r));

        //if array can be divided in 3 parts with equal sum
        int[] array = {5,1,1,1,4,2,4,3};
        System.out.println(divideArrayIntoThreePartsOfEqualSum(array));
    }

    //Given an array of integers, Find equilibrium point of the array. if not return -1.
    //Equilibrium point is point where sum of left part of the array = sum of right part of the array.
    public static int findEquilibriumPoint(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int l_sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(l_sum == sum-arr[i]) return arr[i];
            l_sum += arr[i];
            sum -= arr[i];
        }
        return -1;
    }
    
    //Given n ranges, Find the maximum appearing element in those ranges.
    //Consider max value of range can be 1000
    public static int findMAxAppearingElement(int l[], int r[]) {
        int[] arr = new int[1000];
        int maxValue = 0;
        int maxOccurance = -1;
        for(int i = 0; i < l.length; i++){
            arr[l[i]] = 1;
            arr[r[i]+1] = -1;
            if(r[i] > maxValue) maxValue = r[i];
        }
        for(int i = 1; i < maxValue; i++){
            arr[i] += arr[i-1];
            if(arr[i] > maxOccurance) maxOccurance = arr[i];
        }
        return maxOccurance;
    }

    //Check if a given array can be divided into three parts with equal sum
    public static boolean divideArrayIntoThreePartsOfEqualSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int subArraySum = 0;
        int countOfSubarray = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        for(int i = 0; i < n; i++){
            subArraySum += arr[i];
            if(subArraySum == sum/3){
                countOfSubarray+=1;
                if(countOfSubarray == 3) return true;
                subArraySum = 0;
            }
        }
        return false;
    }
}
