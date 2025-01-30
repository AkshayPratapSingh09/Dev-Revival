import java.util.Stack;

public class countReversal {
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(anotherSolve(s));
    }

    public static int solve(String s) {
        int n = s.length();
        if(n%2 != 0) return -1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch=='{'){
                stack.push(ch);
            } else{
                if(stack.isEmpty() || stack.peek() == '}'){
                    stack.push(ch);
                } else{
                    stack.pop();
                }
            }
        }

        int ans = 0;
        int open =0; 
        int close =0; 
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if(top == '{'){
                open++;
            }else close++;
        }
        ans = (int) (Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }

    public static int anotherSolve(String s) {
        int n = s.length();
        if(n%2 != 0) return -1;
        
        
        
        int ans = 0;
        int open =0; 
        int close =0; 
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch=='{'){
                open++;
            } else{
                if(open <= 0){
                    close++;
                } else{
                    open--;
                }
            }
        }

    
        ans = (int) (Math.ceil(open/2.0) + Math.ceil(close/2.0));
        return ans;
    }

}
