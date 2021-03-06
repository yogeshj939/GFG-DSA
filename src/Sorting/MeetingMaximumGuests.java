package Sorting;

import java.util.Arrays;

public class MeetingMaximumGuests {


    public static int maxGuest(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1,j=0, curr = 1, res = 1;
        int n = arrival.length;
        while(i < n && j < n){
            if(arrival[i] < departure[j]) {
                curr++;
                i++;
            }
            else {
                j++;
                curr--;
            }
            res = Math.max(curr,res);
        }
        return res;
    }
}
