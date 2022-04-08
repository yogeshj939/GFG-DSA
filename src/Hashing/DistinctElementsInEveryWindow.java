package Hashing;

import java.util.HashMap;

public class DistinctElementsInEveryWindow {

    public static void printCountOfDistinctInEachWindow(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map.size());
        for(int i = k; i < arr.length;i++){
            if(map.get(arr[i-k]) == 1)
                map.remove(arr[i-k]);
            else
                map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
            System.out.println(map.size());
        }
    }
}
