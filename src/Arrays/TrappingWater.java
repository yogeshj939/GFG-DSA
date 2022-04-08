package Arrays;

public class TrappingWater {
    public static void main(String[] args) {
        int[] blockArray = {2,0,4,3,0,2,0,1};
        int trappedWater = getWaterEfficient(blockArray);
        System.out.println(trappedWater);
    }

    // Time Complexity : O(n^2) or Theta(n)
    public static int getWaterNaive(int[] arr) {
        int res = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            int lmax = arr[i];
            for(int j = 0; j < i; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j = i; j < n; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res = res + (Math.min(lmax, rmax)-arr[i]);
        }
        return res;
    }

    /*  Time Complexity : O(n) or Theta(n)
        Idea : Find left Max and right max of eaach element in array. Then Find minimum of lmax and rmax and substract it by ith element,
        you will get the water trapped at each position
    */
    public static int getWaterEfficient(int[] arr) {
        int res = 0, n = arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = arr[0];
        for(int i = 1; i < n; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        rmax[n-1] = arr[n-1];
        for(int i = n-2; i > 0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        // printArrays(lmax,rmax);
        for(int i = 1; i < n-1; i++){
            res += Math.min(lmax[i],rmax[i])-arr[i];
        }
        return res;
    }

}
