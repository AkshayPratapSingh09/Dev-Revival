import java.util.Arrays;

public class revereseNums {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        reverse(nums, 0, nums.length);
        // System.out.println(Arrays.toString(nums));
    };
    
    static void reverse(int[] nums, int i, int n){
        if (i>n/2){
            return;
        }
        
        int temp = nums[i];
        nums[i] = nums[n-i-1];
        nums[n-i-1] = temp;

        reverse(nums, i+1, n);
    }
}
