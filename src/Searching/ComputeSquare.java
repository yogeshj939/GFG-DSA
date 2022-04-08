package Searching;

public class ComputeSquare {
    public static void main(String[] args) {
        int num = 2147395599;
        System.out.println(square(num));
    }

    public static int square(int num) {
        int low = 1;
        int high = num;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            long msq = (long)mid*mid;
            if(msq == num){
                return mid;
            } else if(msq > num){
                high = mid-1;
            } else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }
}
