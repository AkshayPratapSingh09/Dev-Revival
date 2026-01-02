public class HouseRobber {
    public static void main(String[] args) {
        // int[] nums = {2,7,9,3,1};
        int[] nums = {1,2,3,1};
        System.out.println(solve(nums));
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
}
