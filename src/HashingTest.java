import Hashing.*;

public class HashingTest {

    private static int[] arr = new int[]{4,2,1,2,4,3,1,1,1,1,10,9,12,5,3};
    private static Integer[] integerArr = new Integer[]{4,2,1,8,10,9,12,5,3};
    private static int[] arr1 = new int[]{1,0,1,1,0,0,1};
    private static int[] arr2 = new int[]{0,1,0,0,1,0,0};
    private static Integer[] arrayWith0Sum = new Integer[]{10,10,-10,10,34,56,32};
    private static Integer[] arr3 = new Integer[]{10,3,-2,-7,-4,5,3,4,1};
    private static int[] binaryArray = new int[]{1,0,1,1,1,0,0,0,0,1,1};

    public static void main(String[] args) {
        /*
        System.out.println(DistinctElementsInArr.countDistinct(arr));

        FrequencyOfElements.findFrequenciesOfElements(arr);

        System.out.println(IntersectionOfArray.findCountOfIntersectingNaive(arr1,arr2));
        System.out.println(IntersectionOfArray.findCountOfIntersectingEfficcient1(arr1,arr2));
        System.out.println(IntersectionOfArray.findCountOfIntersectingEfficcient2(arr1,arr2));

        System.out.println(UnionOfArray.findUnionCount(arr1,arr2));

        System.out.println(PairWithGivenSum.findPair(arr,27));

        System.out.println(SubArrayWithSum.isSubArrayWith0Sum(arrayWith0Sum));
        System.out.println(SubArrayWithSum.isSubarrayWithGivenSum(arrayWith0Sum,20));

        System.out.println(LongestSubarrrayWithGivenSum.findLongestSubarrayWithGivenSum(arr3,13));

        System.out.println(LongestSubarrayWithEqual0sAnd1s.findLongestSubarrayWithEqual0sAnd1sNaive(binaryArray));
        System.out.println(LongestSubarrayWithEqual0sAnd1s.findLongestSubarrayWithEqual0sAnd1s(binaryArray));

        System.out.println(LongestCommonSpanWithSameSum.findLongestCommonSpanWithSameSumNaive(arr1,arr2));
        System.out.println(LongestCommonSpanWithSameSum.findLongestCommonSpanWithSameSum(arr1,arr2));

        System.out.println(LongestConsecutiveSubsequence.findLongestConsecutiveSubSeqNaive(arr));
        System.out.println(LongestConsecutiveSubsequence.findLongestConsecutiveSubSeq(integerArr));
         */

        DistinctElementsInEveryWindow.printCountOfDistinctInEachWindow(arr,4);
    }
}
