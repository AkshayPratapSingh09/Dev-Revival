import java.util.Arrays;

public class climbingStairsDp {

    public static void main(String[] args) {
        int a = 45;
        int[] dp = new int[a+1];
        Arrays.fill(dp,-1);
        long startTime = System.nanoTime();

        // System.out.println("The number of ways for "+a+" stairs is "+climbStairs(a));
        System.out.println("The number of ways for "+a+" stairs is "+climbStairsDp(a,dp));

        long endTime = System.nanoTime();

        System.out.println((endTime-startTime)/ 1000000 +" ms");
    }
        public static int climbStairs(int n) {
            if (n==0) return 1;
            if(n==1) return 1;
            int left = climbStairs(n-1);
            int right = climbStairs(n-2);
            return (left+right);
        }
        public static int climbStairsDp(int n, int dp[]) {
            if (n==0) return 1;
            if(n==1) return 1;
            int left = climbStairsDp(n-1,dp);
            int right = climbStairsDp(n-2,dp);
            if(dp[n] != -1){
                return dp[n];
            } else{
                dp[n] = left+right;
            }
            return dp[n];
        }
    
}
