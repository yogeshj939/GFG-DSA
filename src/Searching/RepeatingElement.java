package Searching;

public class  RepeatingElement {

    /*
        Question : Find an element which is repeated in the array
        Constraints : 
            - Array size : n >= 2
            - Only one element repeats (any number of times)
            - All the elements from 0 to max(arr) are present

            Therefore 0 <= max(arr) <= n-2
    */
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,3,3};
        System.out.println(findRepeatingElement(arr));
    }

    /*
        TIme Complexity : O(n)
        Space Complexity : O(n)
    */
    public static int findRepeatingElement(int[] arr) {
        boolean[] visited = new boolean[arr.length-2];
        for(int i = 0; i < arr.length; i++){
            if(visited[arr[i]]){
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }

    /*
        Time complexity : O(n)
        Space Complexity : O(1)
        No change to original array

        Onch churu artha aaglilla. Should revisit
    */
    public static int findRepeatingElementEfficient(int[] arr) {
        return -1;
    }
}
