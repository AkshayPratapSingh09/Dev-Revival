import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum3 {

    static Set<List<Integer>> set = new HashSet<>();
    public static void main(String[] args) {
        int numbers[] = {-1,0,1,2,-1,-4};

        Arrays.sort(numbers);
        for(int i=0; i<numbers.length-2;i++){
            twoSum(numbers, i+1,-numbers[i]);
        }
        List<List<Integer>> res = new ArrayList<>(set);
        System.out.println(res);
    }

    public static void twoSum(int[] nums, int left,int target){
        int n = nums.length;
        int right = n-1;

        while(left<right){
            if(nums[left] + nums[right] > target){
                right--;
                continue;
            } else if (nums[left]+ nums[right] < target) {
                left++;
                continue;
            }  
            
            set.add(Arrays.asList(-target,nums[left++],nums[right--]));
        }

        while(left<right && nums[left] == nums[left-1]){
            left++;
        }
        while(left<right && nums[right] == nums[right+1]){
            right++;
        }
    }
}
