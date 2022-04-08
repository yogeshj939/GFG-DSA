package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParanthesis {

    public static boolean isBalanced(String str){
        Boolean isBalanced = true;
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < str.length(); i++){
            Character x = str.charAt(i);
            //If char is open bracket, push it to stack
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
            } else{
                //If ele is closing bracket and stack is empty, it is not balanced.
                if(stack.isEmpty()){
                    return false;
                } else if(isMatching(x,stack.peek())){
                    //If current ele is closing bracket of stack top, pop the stack.
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //To check if current and top ele of stack is opening and closing of same type
    public static Boolean isMatching(Character a, Character b){
        return ((a == '(' && b == ')') ||
                (a == '[' && b == ']') ||
                (a == '{' && b == '}'));
    }
}
