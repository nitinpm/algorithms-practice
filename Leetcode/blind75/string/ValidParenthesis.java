package Leetcode.blind75.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {

        HashMap<Character, Character> openCloseMap = new HashMap<>();
        openCloseMap.put(')', '(');
        openCloseMap.put('}', '{');
        openCloseMap.put(']', '[');

        Stack<Character> parenthesisStack = new Stack<>();

        for(char item : s.toCharArray()){
            if(!parenthesisStack.isEmpty() && openCloseMap.get(item) == parenthesisStack.peek()){
                parenthesisStack.pop();
            } else{
                parenthesisStack.push(item);
            }
        }


        return parenthesisStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()(){}"));
    }
}
