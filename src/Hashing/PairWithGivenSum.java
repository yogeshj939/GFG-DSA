package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean findPair(Integer[] arr, int sum){
        HashSet<Integer> set = new HashSet<>();
        for(Integer ele : arr){
            if(set.contains(sum-ele)){
                return true;
            }else {
                set.add(ele);
            }
        }
        return false;
    }
}
