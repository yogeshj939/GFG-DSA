package Recursion;

public class Permutation{

    public static int res = 0;

    public static void permute(String s, int i){
        if(i == (s.length()-1)){
            System.out.println(s);
            res += 1;
            return;
        }
        for(int j = i; j < s.length(); j++){
            s = swap(s,i,j);
            permute(s,i+1);
            s = swap(s,i,j);
        }
    }

    public static String swap(String s, int i, int j) {
        char[] str = s.toCharArray();
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        s = String.valueOf(str);
        return s;
    }

    public static void main(String[] args) {
        permute("ABCDE",0);
        System.out.println(res);
    }
}