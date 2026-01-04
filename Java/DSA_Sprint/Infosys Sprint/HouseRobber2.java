public class HouseRobber2 {
    public static void main(String[] args) {
        
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int nums1[] = new int[n-1];
        int nums2[] = new int[n-1];

        for (int i=0;i<n-1;i++){
            nums1[i] = nums[i]; 
            nums2[i] = nums[i+1]; 
        }
        return Math.max(solver(nums1), solver(nums2));

    }

    public static int solver(int[] nums){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int prev2 = 0;
        int prev1 = nums[0];
        int ans = 0;
        
        for(int state = 2; state<n+1; state++){
            int pick = nums[state-1] + prev2;
            int noPick = 0 + prev1;
            ans = Math.max(pick,noPick);
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}
