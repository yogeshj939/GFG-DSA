package Sorting;

import java.util.ArrayList;

public class IntersectionAndUnion {

    public ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> intersectionArray = new ArrayList<Integer>();
        while(i < n1 && j < n2){
            if(i>0 && arr1[i] == arr1[i-1]){
                i++; continue;
            }
            if(arr1[i] < arr2[j]) i++;
            else if(arr1[i] > arr2[j]) j++;
            else if(arr1[i] == arr2[j]){
                intersectionArray.add(arr1[i]);
                i++; j++;
            }
        }
        return intersectionArray;
    }

    public ArrayList<Integer> union(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> unionList = new ArrayList<Integer>();
        while(i < n1 && j < n2){
            if(i > 0 && arr1[i] == arr1[i-1]){i++; continue;}
            if(j > 0 && arr2[j] == arr2[j-1]){j++; continue;}
            if(arr1[i] < arr2[j]) unionList.add(arr1[i++]);
            else if(arr1[i] > arr2[j]) unionList.add(arr2[j++]);
            else if(arr1[i] == arr2[j]) {unionList.add(arr1[i]); i++; j++;}
        }
        while(i < n1){
            if(arr1[i]!=arr1[i-1])
                unionList.add(arr1[i++]);
            else i++;
        }
        while (j < n2) {
            if(arr2[j] != arr2[j-1])
                unionList.add(arr2[j++]);
            else j++;
        }
        return unionList;
    }
}
