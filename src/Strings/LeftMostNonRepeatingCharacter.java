package Strings;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {

    private static int CHAR = 256;

    public static int findLeftMostNonRepeatingCharacter(String str){
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex,-1);
        for(int i = 0; i < str.length(); i++){
            if(fIndex[str.charAt(i)] == -1){
                fIndex[str.charAt(i)] = i;
            } else {
                fIndex[str.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < CHAR; i++){
            if(fIndex[i] > 0)
                res = Math.min(res,fIndex[i]);
        }

        return (res == Integer.MAX_VALUE)? -1:res;
    }
}
