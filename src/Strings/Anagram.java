package Strings;

public class Anagram {

    //Efficient
    public static boolean isAnagram(String str1, String str2){
        char[] countArr = new char[256];
        if(str1.length() != str2.length()) return false;
        for(int i = 0; i < str1.length(); i++){
            countArr[str1.charAt(i)]++;
            countArr[str2.charAt(i)]--;
        }

        for(int i = 0; i < countArr.length; i++){
            if(countArr[i] != 0) return false;
        }

        return true;
    }

    //Naive Solution
    public static boolean isAnagramNaive(String str1, String str2){
        /*
        Step 1 : Sort both the Strings
        Step 2 : Compare both the strings after sorting. If same: anagram, else not an anagram
         */
        return false;
    }
}
