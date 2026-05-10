public class trial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
        System.out.println(fac(n));
        System.out.println(bottomUpFib(n));

    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static int fac(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fac(n - 1);
    }

    public static int bottomUpFib(int n) {
        if (n == 0 || n == 1)
            return 1;

        int prev = 1;
        int current = 1;
        int ans = 0;

        for (int state = 2; state <= n; state++) {
            ans = current + prev;
            prev = current;
            current = ans;
        }

        return ans;
    }
}
