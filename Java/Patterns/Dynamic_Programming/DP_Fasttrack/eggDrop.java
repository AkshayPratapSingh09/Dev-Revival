import java.util.Arrays;

public record eggDrop() {
    public static void main(String[] args) {
        int n = 2;
        int k = 36;
        int[][] dp = new int[n+1][k+1];
        for(int i=0; i<=n;i++) Arrays.fill(dp[i],-1);

        // for(int[] i: dp){
        //     System.out.println(Arrays.toString(i));
        // }

        System.out.println(solve(n,k, dp));

    }

    public static int solve(int n, int k, int[][] dp){
        System.out.println("Solving for "+n+" and "+k);

        if(n==0) return dp[n][k] = 0;
        if(n==1) return dp[n][k] = k;
        if(k==0 || k==1) return dp[n][k] = k;

        int res;
        int min = Integer.MAX_VALUE;

        if(dp[n][k]!= -1) return dp[n][k];

        for(int x=1; x<=k; x++){
            int left;
            int right;

            if(dp[n-1][k-1] != -1){
                left = dp[n-1][k-1];
            } else{
                dp[n-1][k-1] = solve(n-1,k-1, dp);
                left = dp[n-1][k-1];
            }
            if(dp[n][k-x] != -1){
                right = dp[n][k-x];
            } else{
                dp[n][k-x] = solve(n,k-x, dp);
                right = dp[n][k-x];
            }


            res = Math.max(left , right);

            // if(res < min){
            //     min = res;
            // }
            min = Math.min(min, res);
        }
        return dp[n][k] = min+1;
    }
}
