package Hashing;

import java.util.HashMap;

public class FrequencyOfElements {

    public static void findFrequenciesOfElements(Integer[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(Integer ele:arr){
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        System.out.println(freq);
    }
}
