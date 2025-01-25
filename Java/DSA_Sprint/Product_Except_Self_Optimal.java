import java.util.*;

public class Product_Except_Self_Optimal {
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        Arrays.fill(suffix, 1);
        Arrays.fill(prefix, 1);
        System.out.println(Arrays.toString(prefix));
        
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}
