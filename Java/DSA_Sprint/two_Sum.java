import java.util.*;

public class two_Sum {
    public static void main(String[] args) {
        // int[] nums = {2,7,11,15};
        // int target = 9;
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0; i<nums.length; i++){
        if(hash.containsKey(target- nums[i])){
            return new int[]{i,hash.get(target- nums[i])};
        }

        hash.put(nums[i],i);
        }

        return new int[] {0,0};
    }
}
