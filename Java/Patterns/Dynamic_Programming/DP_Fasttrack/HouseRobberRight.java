import java.util.*;

public class HouseRobberRight {
    public static void main(String[] args) {
         int[]nums = {1,2,3,1};
        //  int[]nums = {2,7,9,3,1};
        int n= nums.length;

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

         System.out.println(solve(nums, n-1,dp));
        

    }

    public static int solve(int[] nums, int index,int[] dp){
        if(index==0) return nums[0];
        if(index==-1) return 0;

        if(dp[index]!= -1) return dp[index];

        int pick = nums[index] + solve(nums, index-2, dp);
        int noPick = 0 + solve(nums, index-1, dp);
        
        return dp[index] = Math.max(pick, noPick);
    }
}
