public class HouseRobber {
    public static void main(String[] args) {
        // int[] nums = {2,7,9,3,1};
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int solve(int[] nums){
        
        int n = nums.length;
        int even = 0;
        int odd = 0;
        for(int i=0; i < n/2 ;i++){
        System.out.println("Adding "+nums[(2*i)+1]+" as odd");
        System.out.println("Adding "+nums[(2*i)]+" as even");
        odd += nums[(2*i)+1];
        even += nums[2*i];
    }
    if(n%2 !=0){
            System.out.println("Adding "+nums[n-1]+" as odd");
            even +=nums[n-1];
        }
        System.out.println(odd + " "+ even);
        return 0;
    }

    public static int rob(int[] nums){
        int n = nums.length;
        return recur(nums, n-1);
    }

    public static int recur(int nums[], int index){
        //base case
        if(index==0)return nums[0];

        if(index==-1)return 0;

        //Logic for Pick and No Pick
        int pick = nums[index]+ recur(nums, index-2);
        int noPick = 0+ recur(nums,index-1);
        return Math.max(pick,noPick);
    }
}
