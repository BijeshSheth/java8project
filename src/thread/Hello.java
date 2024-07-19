package thread;

import java.util.Arrays;
import java.util.Stack;

//{}()[]
// ()
// ({})
// ({)}
// [{}{()({})}] // [ = 5 , { = 6, ( = 7   } = 8
// ASC
// Check the every expression count
class Test{


}

public class Hello{
   public static boolean isValid(String input){

       Stack<Character> stack = new Stack<>();

       for (char c : input.toCharArray()) {
           switch (c) {
               case '(':
               case '{':
               case '[':
                   stack.push(c);
                   break;
               case ')':
                   if (stack.isEmpty() || stack.pop() != '(') return false;
                   break;
               case '}':
                   if (stack.isEmpty() || stack.pop() != '{') return false;
                   break;
               case ']':
                   if (stack.isEmpty() || stack.pop() != '[') return false;
                   break;
           }
       }

       return stack.isEmpty();
    }
    public static void main(String[] args) {

        String input = "[{}{()({})}]";

       // System.out.println(Arrays.stream(input.split("")).findFirst().get()));

        System.out.println(isValid(input));

    }
}
