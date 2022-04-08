package Strings;

public class LexicographicRank {

    private static int CHAR = 256;

    public static int findLexicographicRank(String str){
        int n = str.length();
        int rank = 0;
        int mul = fact(n);
        int[] count = new int[CHAR];

        for(int i = 0; i < n; i++){
            count[str.charAt(i)] += 1;
        }
        for(int i = 1; i < CHAR; i++){
            count[i] += count[i-1];
        }

        for(int i = 0; i < n-1; i++){
            mul = mul/(n-i);
            rank += count[str.charAt(i)-1]*mul;
            for(int j = str.charAt(i); j < CHAR; j++){
                count[j]--;
            }
        }
        return rank+1;
    }

    public static int fact(int n){
        int fact = 1;

        for(int i = n; i > 0; i--){
            fact = fact * i;
        }
        return fact;
    }
}
