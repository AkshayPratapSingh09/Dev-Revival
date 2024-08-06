public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    static int fib(int n){
        if (n<=1){
            return n;
        }
        int first = fib(n-1);
        int last = fib(n-2);
        return first+last;
    }
}
