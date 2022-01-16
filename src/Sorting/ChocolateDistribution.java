package Sorting;

import java.util.Arrays;

/*
Given an array of n integers where each value represents the number of chocolates in a packet.
Each packet can have a variable number of chocolates.
There are m students, the task is to distribute chocolate packets such that:

1. Each student gets one packet.
2. The difference between the number of chocolates in the packet with maximum chocolates
   and packet with minimum chocolates given to the students is minimum.
 */
public class ChocolateDistribution {

    public static int findMin(int[] arr, int m){
        int n = arr.length;
        if(m > n) return -1;
        Arrays.sort(arr);
        int res = arr[m-1]-arr[0];
        for(int i = 1; i <= n-m; i++){
            res = Math.min(res,arr[m+i-1]-arr[i]);
        }
        return res;
    }
}
