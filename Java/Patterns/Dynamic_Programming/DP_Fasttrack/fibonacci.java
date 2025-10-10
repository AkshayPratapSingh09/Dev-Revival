public class fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciFormula(40));
    }

    public static int fib(int n){
        if(n<=1) return n;

        return fib(n-1)+fib(n-2);
    }

    public static int fibonacciFormula(int n) {

        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        
        return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }
}