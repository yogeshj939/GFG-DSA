import Hashing.*;

import java.util.Arrays;

public class HashingTest {

    private static Integer[] arr = new Integer[]{11,16,43,76,23,98,32,12,10,7,49,44,35,11,23,76,43};
    private static Integer[] arr1 = new Integer[]{10,20,30,10,40,50};
    private static Integer[] arr2 = new Integer[]{15,10,35,20,45,23};

    public static void main(String[] args) {
        /*
        System.out.println(DistinctElementsInArr.countDistinct(arr));

        FrequencyOfElements.findFrequenciesOfElements(arr);

        System.out.println(IntersectionOfArray.findCountOfIntersectingNaive(arr1,arr2));
        System.out.println(IntersectionOfArray.findCountOfIntersectingEfficcient1(arr1,arr2));
        System.out.println(IntersectionOfArray.findCountOfIntersectingEfficcient2(arr1,arr2));

        System.out.println(UnionOfArray.findUnionCount(arr1,arr2));
         */

        System.out.println(PairWithGivenSum.findPair(arr,27));
    }
}
