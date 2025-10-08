import java.util.*;

public class stackImplementation {

    public static void main(String[] args) {
        Stack<Integer> has = new Stack<>();

        has.push(10);
        has.push(20);
        has.push(30);
        has.push(19);

        System.out.println(has);
        System.out.println("Peek for the has is "+has.peek());
        System.out.println(has.pop());
        System.out.println("after popping");
        System.out.println(has);
        System.out.println("Size of stack = "+has.size());
    }
}