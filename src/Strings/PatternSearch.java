package Strings;

public class PatternSearch {

    //Returns start index of the pattern
    public static void findPatternNaive(String str, String pat){
        int m = pat.length();
        for(int i = 0; i <= str.length()-pat.length(); i++){
            int j = i;
            boolean flag = true;
            while(j < (i+m)){
                if(str.charAt(j) != pat.charAt(j-i)) {
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag)
                System.out.println(i);
        }
    }

    //When the pattern is unique. better than naive on average
    public static void findPatternNaiveUniquePat(String str, String pat){
        int m = pat.length();
        for(int i = 0; i <= str.length()-m;){
            int j = i;
            boolean flag = true;
            while(j < i+m){
                if(str.charAt(j) != pat.charAt(j-i)){
                    flag = false;
                    j++;
                    break;
                }
                j++;
            }
            if(flag)
                System.out.println(i);
            i = j;
        }
    }
}
