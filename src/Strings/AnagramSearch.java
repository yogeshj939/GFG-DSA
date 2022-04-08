package Strings;

import java.util.Arrays;

public class AnagramSearch {

    public static boolean isAnagramPresent(String str, String pat){
        int[] cs = new int[256];
        int[] cp = new int[256];

        int n = str.length();
        int m = pat.length();

        for(int i = 0; i < m; i++){
            cs[str.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }

        for(int i = m; i < n; i++){
            boolean isAnagram = true;
            for(int j = 0; j < 256; j++){
                if(cs[j] != cp[j])
                    isAnagram = false;
            }
            if(isAnagram) {
                System.out.println(i-m);
                return true;
            }
            else {
                cs[str.charAt(i)]++;
                cs[str.charAt(i-m)]--;
            }
        }
        return false;
    }
}
