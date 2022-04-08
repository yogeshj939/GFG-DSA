package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctElementsInArr {

    public static int countDistinct(Integer[] arr){
        return (new HashSet<>(Arrays.asList(arr))).size();
    }
}
