package interview_programm;

import java.util.Stack;

public class OpeningClosingBrackets {

    public static boolean isValid(String input){
        Stack<Character> stack = new Stack();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String input = "[{}{()({})}]";
        System.out.println(isValid(input));
    }
}
