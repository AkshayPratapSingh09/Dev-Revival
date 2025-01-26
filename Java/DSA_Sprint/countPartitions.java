import java.util.Arrays;

public class countPartitions {
    public static void main(String[] args) {
        int[]nums = {10,10,3,7,6};
        System.out.println(solve(nums));


    }
    public static int solve(int[] nums){
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = sum + nums[i];
            sum += nums[i];
        }
        int count =0;
        for (int i = 1; i < arr.length; i++) {
            if( ((arr[i-1]) - (arr[nums.length-1] - arr[i-1]))%2 == 0 ){
count+=1;
            }
        }

        System.out.println(Arrays.toString(arr));
        
        return count;

    }
}
