package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArray {

    public static int findUnionCount(Integer[] arr1, Integer[] arr2){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr1));
        for(Integer ele:arr2){
            set.add(ele);
        }
        return set.size();
    }
}
