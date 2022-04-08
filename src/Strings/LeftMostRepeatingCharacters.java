package Strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacters {

    private static int CHAR = 256;

    //two times traversal
    public static int findLeftMostRepeatingChar(String str){
        int[] charArray = new int[CHAR];
        for(int i = 0; i < str.length(); i++){
            charArray[str.charAt(i)]++;
        }

        for(int i = 0; i < str.length(); i++){
            if(charArray[str.charAt(i)] > 1)
                return str.charAt(i);
        }
        return -1;
    }


    //Single traversal of the array
    public static int findLeftMostRepeatingCharEfficient1(String str){

        int[] fIndex = new int[CHAR];
        int res = Integer.MAX_VALUE;
        Arrays.fill(fIndex,-1);
        for(int i = 0; i < str.length(); i++){
            int fI = fIndex[str.charAt(i)];
            if(fI == -1){
                fIndex[str.charAt(i)] = i;
            } else{
                res = Math.min(res,fI);
            }
        }
        return (res == Integer.MAX_VALUE)? -1:res;
    }

    //traversal from right
    public static int findLeftMostRepeatingCharEfficient2(String str){
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for(int i = str.length()-1; i >= 0 ; i--){
            if(visited[str.charAt(i)]){
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
}
