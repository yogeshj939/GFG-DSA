package Searching;

public class FindMedian {
    public static void main(String[] args) {
        int[] a1 = {10,20,30,40,50};
        int[] a2 = {5,15,25,30,35,55,65,75,85};
        //merged = {5,10,15,20,25,30,35,40,50,55,65,75,85};
        System.out.println(findMedianEfficient(a1,a2));
    }

    //Assuming a1 is always the smallest array
    //Time Complexity : O(logN). Uses binary search.
    //
    public static int findMedianEfficient(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int low = 0;
        int high = n1-1;
        while(low <= high){
            int i1 = (low+high)/2;
            int i2 = (n1+n2+1)/2 - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1-1];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2-1];
            System.out.println(i1+","+i2);
            System.out.println(min1+","+min2+","+max1+","+max2);
            if(max2 <= min1){
                System.out.println(Math.max(max1, max2)+" + "+Math.min(min1, min2)+" = "+ (Math.max(max1, max2) + Math.min(min1, min2)));
                return (Math.max(max1, max2) + Math.min(min1, min2))/2;
            } else if(max2 > min1){
                low = i1+1;
            } else{
                high = i1-1;
            }
        }
        return -1;
    }
}
