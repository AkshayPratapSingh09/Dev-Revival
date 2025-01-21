import java.util.Arrays;

public class fibonacciDp {

    public static void main(String[] args) {
        int n = 45;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        long startTime = System.nanoTime();

    
        // System.out.println(Arrays.toString(dp));
        // System.out.println("The "+n+" th fib is "+findFib(n));
        // System.out.println("The "+n+" th fib is "+findFibDp(n,dp));
        System.out.println("The "+n+" th fib is "+mostOptimalFib(n));

        long endTime = System.nanoTime();

        System.out.println((endTime-startTime)/ 1000000 +" ms");

        
    }

    public static int findFib(int n){
        if(n<=1){
            return n;
        }

        return findFib(n-1)+findFib(n-2);
    }
    public static int findFibDp(int n, int dp[]){
        if(n<=1){
            return n;
        }
        if (dp[n]!=-1){
            return dp[n];
        }

        dp[n] = findFibDp(n-1,dp)+findFibDp(n-2,dp);
        return findFibDp(n-1,dp)+findFibDp(n-2,dp);
    }


    public static int mostOptimalFib(int n){
        int prev = 1;
        int prev2nd = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = prev + prev2nd;
            prev2nd = prev;
            prev = ans;
        }
        return ans;
    }


}
