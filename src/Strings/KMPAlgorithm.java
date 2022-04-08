package Strings;

public class KMPAlgorithm {

    //Explanation : https://www.youtube.com/watch?v=4jY57Ehc14Y

    //O(n) time complexity KMP algorithm
    public static int[] computeLPS(String str){
        int[] lps = new int[str.length()];
        int len = 0, i = 1;
        lps[0] = 0;
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(len)){
                //assign current lps value as previous length + 1.
                lps[i] = len+1;
                len += 1;
                i += 1;
            } else {
                if(len != 0){
                    //Assign length to previous longest matching prefix suffix
                    len = lps[len-1];
                } else {
                    //if len == 0, assign lps value as 0 (no matches)
                    lps[i] = 0;
                    i += 1;
                }
            }
        }
        return lps;
    }

    public static int findMatch(String str, String pat){
        int i = 0, j = 0;
        int m = pat.length();
        int[] lps = computeLPS(pat);
        while(i < str.length()){
            if(str.charAt(i) == pat.charAt(j)){
                i+=1;
                j+=1;
            }
            else{
                if(j != 0)
                    //If not matched, move j index to previously matched length
                    j = lps[j-1];
                else
                    i += 1;
            }
            if(j == m)
                return i-j;
        }
        return -1;
    }

    //Naive. O(n^3) including the above function
    public static int[] fillLPS(String str){
        int[] lps = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            lps[i] = longestProperPrefixSuffixNaive(str,i+1);
        }
        return lps;
    }

    public static int longestProperPrefixSuffixNaive(String str, int n){

        for(int len = n-1; len > 0; len--){
            boolean flag = true;
            for(int i = 0; i < len; i++){
                if(str.charAt(i) != str.charAt(n-len+i))
                    flag = false;
            }
            if(flag)
                return len;
        }
        return 0;
    }
}
