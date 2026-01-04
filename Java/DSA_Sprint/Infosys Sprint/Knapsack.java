public class Knapsack {
    public static void main(String[] args) {
        // int w = 4;
        // int w = 3;
        // int val[] = {1, 2, 3};
        // // int wt[] = {4, 5, 1};
        // int wt[] = {4, 5, 6};
        int w = 5;
        int val[] = {10, 40, 30, 50};
        int wt[] = {5, 4, 2, 3};
        int n = val.length;
        // int dp[][] = new int[n][n];
        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp.length; j++) {
        //     dp[i][j] = -1;
        // }
        // }
        int dp[] = new int[n];
        System.out.println(solve(w, val, wt, 0, 0, 0,dp));
    }

    public static int solve(int w, int[] val, int wt[], int currwt, int currval, int index, int dp[]){
        if(currwt > w)return 0;
        if(index >= wt.length) return currval;
        
        
        //pick Logic
        int pick = solve(w,val, wt, currwt+wt[index] , currval+val[index],index+1, dp);
        int noPick = solve(w,val, wt, currwt , currval,index+1,dp);
        dp[index] = Math.max(pick,noPick);
        return dp[index];

    }
}
