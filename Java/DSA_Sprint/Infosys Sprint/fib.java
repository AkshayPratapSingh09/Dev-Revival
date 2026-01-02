public class fib {

    public static void main(String args[]){
        System.out.println(fib(4));
    }

    public static int fib(int n) {
     if(n==0) return 1;

    int[] dp = new int[n+1];
    dp[0] = 0;
    dp[1] = 1;
    int ans = 1;

    for (int i=2; i<=n;i++){
        ans = dp[i-1]+dp[i-2];
        System.out.println(ans +" "+dp[i-1]+" "+ dp[i-2]);
        dp[i] = ans;
    }
     return ans;   
    }
}


