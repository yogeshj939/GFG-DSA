package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "(" + start +
                    ", " + end +
                    ')';
        }
    }

    public static void mergeIntervals(Interval[] arr){
        Arrays.sort(arr,new MyComparator());
        int[][] arr2 = new int[2][2];
        Arrays.sort(arr2);
        System.out.println("Sorted Intervals : "+Arrays.toString(arr));
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i].start <= arr[res].end){
                int start = Math.min(arr[res].start, arr[i].start);
                int end = Math.max(arr[res].end, arr[i].end);
                arr[res] = new Interval(start,end);
            } else {
                res++;
                arr[res] = arr[i];
            }
        }
        for(int i = 0; i <= res; i++){
            System.out.println(arr[i]);
        }
    }

    public static class MyComparator implements Comparator<Interval>{

        @Override
        public int compare(Interval o1, Interval o2) {
            return Integer.compare(o1.start, o2.start);
        }
    }

    /*
    Naive method O(n^2)
    public static void mergeIntervals(Interval[] arr){
        ArrayList<Interval> ansList = new ArrayList<Interval>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                String maxStartIndex;
                if(checkOverlap(arr[i],arr[j])){
                    int start = Math.min(arr[i].start,arr[j].start);
                    int end = Math.max(arr[i].end, arr[j].end);
                    ansList.add(new Interval(start,end));
                } else {
                    ansList.add(arr[j]);
                }
            }
            arr = ansList.toArray(new Interval[0]);
        }
    }

    public static boolean checkOverlap(Interval first, Interval second){
        if((first.start > second.start && first.start < second.end) ||
                (second.start > first.start && second.start < first.end)) return true;
        return false;
    }
    */



}
