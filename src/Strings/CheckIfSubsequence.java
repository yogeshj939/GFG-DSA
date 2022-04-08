package Strings;

public class CheckIfSubsequence {

    public static boolean isSubSeq(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int j = 0;
        for(int i = 0; i < m && j < n; i++){
            if(str1.charAt(i) == str2.charAt(j)){
                j++;
            }
        }
        return j==n;
    }

    //Recursive
    public static boolean isSubSeqRec(String str1, String str2, int n, int m){
        if(m==0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return isSubSeqRec(str1,str2,n-1,m-1);
        }else {
            return isSubSeqRec(str1,str2,n-1,m);
        }
    }
}
