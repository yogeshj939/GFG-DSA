package Strings;

public class ReverseWordsInString {

    //Theta(n) auxilary space
    public static String reverseWords(String str){
        String[] stringArray = str.split(" ");
        str = "";
        for(int i = stringArray.length-1; i > 0; i--){
            str += stringArray[i];
            str += " ";
        }
        str = str.concat(stringArray[0]);
        return str;
    }

}
