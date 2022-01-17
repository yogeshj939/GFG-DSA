package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArray {

    //Naive Solution
    public static int findCountOfIntersectingNaive(Integer[] arr1,Integer[] arr2){
        int res = 0;
        for(int i = 0; i < arr1.length; i++){
            boolean flag = false;

            for(int j = 0; j < i; j++){
                if(arr1[j] == arr1[i]) {
                    flag = true;
                    break;
                }
            }
            if(flag == true) continue;

            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    /*
    Efficient Solution 2
    Time Complexity : Theta(m+n)
    Space Complexity : O(m+n)
     */
    public static int findCountOfIntersectingEfficcient1(Integer[] arr1, Integer[] arr2){
        int res = 0;
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));
        for(Integer ele:set1){
            if(set2.contains(ele)) res++;
        }
        return res;
    }

    /*
    Efficient Solution 2
    Time Complexity : Theta(m+n)
    Space Complexity : O(m)
     */
    public static int findCountOfIntersectingEfficcient2(Integer[] arr1, Integer[] arr2){
        int res = 0;
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        for(Integer ele: arr2){
            if(set1.contains(ele)){
                res++;
                set1.remove(ele);
            }
        }
        return res;
    }
}
