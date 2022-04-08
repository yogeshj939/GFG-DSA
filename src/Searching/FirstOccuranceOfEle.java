package Searching;

/**
 * FirstOccuranceOfEle
 */
public class FirstOccuranceOfEle {

    private static int badVersion = 1702766719;

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,10,10,10,10,20,20,20,20,30,30,30};
        int x = 1;
//        System.out.println(findFirstOccuranceOfEle(arr, x));
        System.out.println(firstBadVersion(2126753390));
    }

    public static int findFirstOccuranceOfEle(int[] arr, int x) {
        int low = 1;
        int high = arr.length-1;
        int mid;
        int index = -1;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == x){
                index = mid;
            }
            if(arr[mid] < x){
                low = mid+1;
            } else if(arr[mid] >= x){
                high = mid-1;
            }
        }
        return index;
    }

    public static int firstBadVersion(int n){
        int low = 0;
        int high = n;
        int index = -1;
        while(low <= high){
            int mid = (int)(low+high)/2;
            System.out.println(mid);
//            if(mid == 1702766719){
//                System.out.println("In the bad version");
//                break;
//            }
            if(isBadVersion(mid)){
                index = mid;
            }
            if(!isBadVersion(mid)){
                low = mid+1;
            } else if(isBadVersion(mid)){
                high = mid-1;
            }
        }
        return index;
    }

    public static boolean isBadVersion(int n){
        if(n >= badVersion){
            return true;
        }
        return false;
    }
}