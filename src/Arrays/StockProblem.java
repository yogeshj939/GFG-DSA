package Arrays;

public class StockProblem {

    public static void main(String[] args) {
        int a[] = {1,5,3,1,2,8};
        int maxProfit = maximizeProfit(a);
        System.out.println(maxProfit);
    }

    // Time Complexity : O(n)
    public static int maximizeProfit(int[] a) {
        int maxProfit = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i+1]>a[i]){
                maxProfit += a[i+1]-a[i];
            }
        }
        return maxProfit;
    }
    
}
