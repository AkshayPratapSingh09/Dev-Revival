public class HouseRobber {
    public static void main(String[] args) {
        // int[]nums = {1,2,3,1};
        int[]nums = {2,7,9,3,1};
        int n= nums.length;

        if (n==1){
             System.out.println(nums[0]);
        }
        int i=0;
        int j=1;
        int sum1 = 0;
        int sum2 = 0;
        while(i<n){
            System.out.println("Sum 1 added "+ nums[i]);
            sum1 += nums[i];
            if((i+1)<n){
                sum2 += nums[i+1];
                System.out.println("Sum 2 added "+ nums[i+1]);
            }

            i+=2;
        }

System.out.println(Math.max(sum1,sum2));
    }
}
