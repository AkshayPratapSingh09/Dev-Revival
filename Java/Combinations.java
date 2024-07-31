import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 2;
        List<List<Integer>> ans = new ArrayList<>();
        combine(0, arr, new ArrayList(), ans,k);
        // System.out.println(ans);
    }

    static void combine(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans, int k){
        if (curr.size() == k){
        ans.add(new ArrayList(curr));
        }

        for(int i = index; i < nums.length; i++){
            curr.add(nums[i]);
            System.out.println("This time index:"+index+" i:"+i);
            System.out.println("Curr is: "+curr);
            combine(i+1, nums, curr, ans,k);
            curr.remove(curr.size()-1);
            System.out.println("Curr after removal: "+curr);
        }
    }
    
}