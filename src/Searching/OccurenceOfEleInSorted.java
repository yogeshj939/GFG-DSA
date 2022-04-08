public class OccurenceOfEleInSorted {

    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,20,20,20,20,20,30,40,50};
        int x = 20;
        System.out.println(findOccurence(arr,x));
    }

    public static int findOccurence(int[] arr, int x) {
        int firstOccurence = firstOccurence(arr, x);
        int lastOccurence = lastOccurence(arr, x);
        if(firstOccurence != -1 && lastOccurence != -1){
            return lastOccurence-firstOccurence+1;
        }
        return -1;
    }

    public static int lastOccurence(int[] arr, int x) {
        int low = 0; 
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] < x){
                low = mid+1;
            } else if(arr[mid] > x){
                high = mid-1;
            } else 
            {
                if(mid == 0 || arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }

    public static int firstOccurence(int[] arr, int x) {
        int low = 0; 
        int high = arr.length-1;
        int mid=-1;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] < x){
                low = mid+1;
            } else if(arr[mid] > x){
                high = mid-1;
            } else {
                if(mid == 0 || arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    
}
