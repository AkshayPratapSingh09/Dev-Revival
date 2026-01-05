public class Kadane {
    public static void main(String[] args) {
        
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {5,4,-1,7,8};
        int currSum = 0;
        int maxSum = 0;

        for(int i=0; i<nums.length;i++){
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);

            if(currSum<0){
                currSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}
