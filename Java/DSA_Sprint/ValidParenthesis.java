import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
        // HashMap<Character,Character> hash = new HashMap<>();

        // for (int i = 0; i < 3; i++) {
            
        // }
        // hash.put(')', '(');
        // hash.put(']', '[');
        // hash.put('}', '{');
        // System.out.println(hash);

        // LinkedList<Character> Stack = new LinkedList<>();

        
        // for(char c : s.toCharArray()){
        //     // System.out.println(Stack.getLast());
        //     if (Stack.size() > 0 &&  (hash.get(c) == Stack.getLast())) {
        //         Stack.pop();
        //         // System.out.println("Entered here");
        //     } else{
        //         Stack.add(c);
        //     }
        // }
        // // System.out.println("Stack last "+ Stack);
    }

    public static boolean isValid(String s){
        int n = s.length();

        if(n%2 !=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if(ch =='(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if(ch==')' && top !='('){
                    return false;
                } else if(ch == ']' && top != '['){
                    return false;
                } else if(ch == '}' && top != '{'){
                    return false;
                } else{
                    stack.pop();
                }
                
            }
        }
        
        return (stack.size()==0);
    }
}
