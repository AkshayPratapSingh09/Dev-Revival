import java.util.Stack;

public class MakeValidParanthesis {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(MakeValid(s));
    }

    public static int MakeValid(String s){
        int n = s.length();
        // if(n%2 != 0)return -1;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
         char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || stack.peek() == ')'){
                    stack.push(ch);
                }else{
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
}
