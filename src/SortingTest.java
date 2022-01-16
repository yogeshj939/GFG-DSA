import Sorting.*;

import java.util.Arrays;

public class SortingTest {

    private static int[] arr= {20,35,42,13,9,65,38,10,87,50,30};
    private static int[] arr2 = {2,5,8,11,3,6,9,13};
    private static int[] sortedArr1 = {10,20,30,40,50,60,90,90,90};
    private static int[] sortedArr2 = {10,10,15,17,20,24,34,76,80,83,90,90};
    private static int[] sortedTwoHalves = {10,20,30,40,50,60,15,17,20,24,34,76,80,83,90};
    private static int[] negAndPosArray = {10,30,-24,-21,50,-30,-11,76};
    private static int[] binaryArray = {1,0,0,0,1,1,0,1,0,0,1,0,1,0};
    private static int[] arrOf0s1sAnd2s = {1,0,0,2,1,0,1,2,2,2,1,0,0,1,0,1,2};
    private static MergeOverlappingIntervals.Interval[] intervalArr;
    private static int[] arrival = {600,700,900};
    private static int[] departure = {730,800,1000};


    public static void main(String[] args) {
        /*
        System.out.println(Arrays.toString((new BubbleSort()).sort(arr)));

        System.out.println(Arrays.toString((new SelectionSort()).selectionSortNaive(arr)));
        System.out.println(Arrays.toString((new SelectionSort()).selectionSortSpaceOptimized(arr)));

        System.out.println(Arrays.toString((new InsertionSort()).insertionSort(arr)));
        System.out.println(Arrays.toString((new InsertionSort()).insertionSortBetterLookingCode(arr)));

        System.out.println(Arrays.toString((new MergeSort()).mergeTwoSortedArrays(sortedArr1,sortedArr2)));
        (new MergeSort()).merge(sortedTwoHalves,0,5,14);
        System.out.println(Arrays.toString(sortedTwoHalves));
        (new MergeSort()).mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        System.out.println((new IntersectionAndUnion()).intersection(sortedArr1,sortedArr2));
        System.out.println((new IntersectionAndUnion()).union(sortedArr1,sortedArr2));

        System.out.println(InversionsInArray.countInversions(arr,0,arr.length-1));

        System.out.println(QuickSort.naivePartition(arr,0,arr.length-1,1));
        System.out.println(QuickSort.lomutoPartition(arr,0,arr.length-1));
        System.out.println(QuickSort.hoarePartition(arr,0,arr.length-1));
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        QuickSort.hoareQuickSort(arr,0,arr.length-1);
        System.out.println("After Sorting : "+Arrays.toString(arr));

        System.out.println(KthSmallestElement.findKthSmallestElement(arr,0,arr.length-1,arr.length+1));

        System.out.println(ChocolateDistribution.findMin(arr,3));

        SegregateTwoTypesOfElements.segregateNegativeAndPositive(negAndPosArray);
        System.out.println(Arrays.toString(negAndPosArray));
        SegregateTwoTypesOfElements.segregateEvenAndOdd(arr);
        System.out.println(Arrays.toString(arr));
        SegregateTwoTypesOfElements.sortBinaryArray(binaryArray);
        System.out.println(Arrays.toString(binaryArray));

        SortThreeTypesOfElements.sortOs1sAnd2sEfficient(arrOf0s1sAnd2s);
        System.out.println(Arrays.toString(arrOf0s1sAnd2s));

        System.out.println(MinimumDifference.minDiffInArray(arr));

        initIntervalArr();
        System.out.println(Arrays.toString(intervalArr));
        MergeOverlappingIntervals.mergeIntervals(intervalArr);

         */

        System.out.println(MeetingMaximumGuests.maxGuest(arrival,departure));

    }

    public static void initIntervalArr(){
        int[] arr1 = {2,5,8,11,3,6,9,13};
        int[] arr2 = {5,9,10,14,4,7,10,14};
        intervalArr = new MergeOverlappingIntervals.Interval[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            intervalArr[i] = new MergeOverlappingIntervals.Interval(arr1[i],arr2[i]);
        }
    }
}
